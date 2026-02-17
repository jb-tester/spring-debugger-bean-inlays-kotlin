package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nonambiguous")
class ControllerWithNonAmbiguousCtorInjection(
    private val noProfilesService: NoProfilesService,
    private val myConfProp: MyConfProp,
    private val myDataRepoCtorInjection: MyDataRepoCtorInjection,
    private val myDataRepository: MyDataRepository?
) {
    @GetMapping
    fun extra(): String {
        return "properties: prop1 = " + myConfProp.prop1 + ", prop2 = " + myConfProp.prop2 + ", service: " + noProfilesService.id
    }

    @GetMapping("/data")
    fun data(): MutableList<String?>? {
        return myDataRepoCtorInjection.data
    }
}

package com.mytests.spring.springdebuggerbeaninlayskotlin

import com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting.ConditionalService
import com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection.MyConfProp
import com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection.NoProfilesService
import com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting.Bean1
import com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting.MyService
import com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting.Bean2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aaa")
class DifferentInjectionsFieldController {
    @Autowired
    private val myConfProp: MyConfProp? = null

    @Autowired
    private val myService: MyService? = null

    @Autowired
    private val bean1: Bean1? = null

    @Autowired
    private val bean2: Bean2? = null

    @Autowired
    private val noProfilesService: NoProfilesService? = null

    @Autowired
    private val conditionalService: ConditionalService? = null


    @GetMapping("/")
    fun testPropertiesAndServices(): String {
        var results =
            "Properties: prop1 = " + myConfProp!!.prop1 + ", prop2 = " + myConfProp.prop2 + ", condition = " + myConfProp.condition + "\n"
        results += "Profile-specific Service: " + myService!!.id + "\n"
        results += "Profile-specific Beans: " + bean1!!.id + "\n"
        results += "Non-profile beans: " + bean2!!.id + "\n"
        results += "Non-profile service: " + noProfilesService!!.id + "\n"
        results += "Conditional service: " + conditionalService!!.id
        return results
    }
}

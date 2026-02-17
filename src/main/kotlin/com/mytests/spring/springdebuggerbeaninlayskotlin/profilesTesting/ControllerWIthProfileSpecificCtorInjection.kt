package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/profiles")
class ControllerWIthProfileSpecificCtorInjection(
    private val myService: MyService,
    private val bean1: Bean1
) {
    @GetMapping("/")
    fun testPropertiesAndServices(): String {
        var results = "Profile-specific Service: " + myService.id + "\n"
        results += "Profile-specific Beans: " + bean1.id
        return results
    }
}

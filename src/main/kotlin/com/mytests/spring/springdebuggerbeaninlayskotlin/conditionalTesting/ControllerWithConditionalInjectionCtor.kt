package com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/conditional")
class ControllerWithConditionalInjectionCtor(
    
    private val bean3: Bean3,
    private val conditionalService: ConditionalService
) {
    @GetMapping
    fun testPropertiesAndServices(): String {
        var results = "Beans: " + bean3.id + "\n"
        results += "Conditional service: " + conditionalService.id
        return results
    }
}

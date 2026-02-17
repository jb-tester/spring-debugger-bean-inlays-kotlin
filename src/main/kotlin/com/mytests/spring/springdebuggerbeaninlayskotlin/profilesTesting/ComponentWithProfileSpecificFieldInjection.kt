package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ComponentWithProfileSpecificFieldInjection {
    @Autowired
    var myService: MyService? = null

    @Autowired
    var bean1: Bean1? = null
}

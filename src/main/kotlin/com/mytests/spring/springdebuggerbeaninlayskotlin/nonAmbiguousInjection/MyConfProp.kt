package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("foo.bar")
class MyConfProp {
    var prop1: String? = null
    var prop2: String? = null
    var condition: Int = 0
}

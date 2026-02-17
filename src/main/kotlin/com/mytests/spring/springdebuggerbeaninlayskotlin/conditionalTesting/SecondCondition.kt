package com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

@Service
@ConditionalOnProperty(name = ["foo.bar.condition"], havingValue = "2")
class SecondCondition(override val id: String? = "Conditional Service 2") : ConditionalService {

}
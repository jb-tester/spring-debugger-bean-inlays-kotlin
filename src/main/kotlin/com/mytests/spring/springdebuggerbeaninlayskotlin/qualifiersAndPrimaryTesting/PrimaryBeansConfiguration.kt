package com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class PrimaryBeansConfiguration {
    @Bean
    @Primary
    fun bean2Prim(): Bean2 {
        return Bean2("primary bean2")
    }

    @Bean
    fun bean2Sec(): Bean2 {
        return Bean2("secondary bean2")
    }
}

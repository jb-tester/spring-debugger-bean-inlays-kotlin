package com.mytests.spring.springdebuggerbeaninlayskotlin.conditionalTesting

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConditionalBeansConfiguration {
    @Bean
    @ConditionalOnProperty(name = ["foo.bar.condition"], havingValue = "1", matchIfMissing = true)
    fun bean31(): Bean3 {
        return Bean3("bean3_1")
    }

    @Bean
    @ConditionalOnProperty(name = ["foo.bar.condition"], havingValue = "2", matchIfMissing = false)
    fun bean32(): Bean3 {
        return Bean3("bean3_2")
    }

    @Bean
    @ConditionalOnProperty(name = ["foo.bar.condition"], havingValue = "3", matchIfMissing = false)
    fun bean33(): Bean3 {
        return Bean3("bean3_3")
    }
}

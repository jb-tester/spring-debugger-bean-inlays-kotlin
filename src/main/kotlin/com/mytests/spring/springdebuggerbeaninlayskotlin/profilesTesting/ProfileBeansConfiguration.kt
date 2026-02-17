package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class ProfileBeansConfiguration {
    @Bean
    @Profile("local")
    fun bean11(): Bean1 {
        return Bean1("local bean1")
    }

    @Bean
    @Profile("remote")
    fun bean12(): Bean1 {
        return Bean1("remote bean1")
    }

    @Bean
    @Profile("test")
    fun bean13(): Bean1 {
        return Bean1("test bean1")
    }
}

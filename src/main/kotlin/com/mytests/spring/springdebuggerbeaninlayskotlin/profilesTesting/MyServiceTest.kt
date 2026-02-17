package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("test")
@Service
class MyServiceTest(override val id: String? = "test") : MyService {

}

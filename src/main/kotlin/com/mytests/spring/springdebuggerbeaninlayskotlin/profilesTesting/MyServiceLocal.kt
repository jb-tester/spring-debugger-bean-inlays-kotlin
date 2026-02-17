package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("local")
@Service
class MyServiceLocal(override val id: String? = "local") : MyService {

}
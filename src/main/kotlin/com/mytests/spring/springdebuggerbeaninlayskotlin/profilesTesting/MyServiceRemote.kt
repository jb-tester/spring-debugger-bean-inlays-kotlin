package com.mytests.spring.springdebuggerbeaninlayskotlin.profilesTesting

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("remote")
@Service
class MyServiceRemote(override val id: String? = "remote") : MyService {

}

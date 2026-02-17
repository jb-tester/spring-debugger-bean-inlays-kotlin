package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import org.springframework.stereotype.Service

@Service
class NoProfilesService {
    val id: String
        get() = "always available service"
}

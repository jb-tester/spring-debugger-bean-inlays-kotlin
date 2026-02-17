package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@Component
class ComponentWithNonAmbiguousFieldInjection {
    @Autowired
    var environment: Environment? = null

    @Autowired
    private val myDataRepoFieldInjection: MyDataRepoFieldInjection? = null


    @Autowired
    private val noProfilesService: NoProfilesService? = null
}

package com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/qualified")
class ControllerWithQualifiedCtorInjection(
    private val bean2: Bean2,
    @Qualifier("bean2Sec")
    private val bean2Sec: Bean2,
    private val qualifiedServicePrimary: QualifiedService,
    @Qualifier("third")
    private val third: QualifiedService,
    private val secondQualifiedService: SecondQualifiedService
) {

    @GetMapping
    fun beansWithQualifiers(): String {
        return ("Service: by primary " + qualifiedServicePrimary.id + ", by @Qualifier: " + third.id + ", by specific type: " + secondQualifiedService.id + "\n"
                + "Beans: by primary:" + bean2.id + ", by @Qualifier: " + bean2Sec.id)
    }
}

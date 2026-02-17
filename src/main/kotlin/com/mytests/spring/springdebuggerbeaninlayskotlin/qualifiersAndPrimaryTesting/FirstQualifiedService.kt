package com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class FirstQualifiedService(override val id: String? = "QualifiedService_1") : QualifiedService {

}



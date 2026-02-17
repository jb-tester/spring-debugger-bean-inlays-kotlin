package com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting

import org.springframework.stereotype.Service

@Service
class SecondQualifiedService(override val id: String? = "QualifiedService_2") : QualifiedService {

}
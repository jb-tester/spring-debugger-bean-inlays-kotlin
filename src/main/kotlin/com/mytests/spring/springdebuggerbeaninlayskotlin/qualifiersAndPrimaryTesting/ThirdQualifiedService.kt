package com.mytests.spring.springdebuggerbeaninlayskotlin.qualifiersAndPrimaryTesting

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("third")
class ThirdQualifiedService(override val id: String? = "QualifiedService_3") : QualifiedService {

}
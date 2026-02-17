package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import org.springframework.data.repository.CrudRepository

interface MyDataRepository : CrudRepository<MyData, Int>

package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import jakarta.persistence.*

@Entity
@Table(name = "foo")
class MyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null

    var prop1: String? = null
    var prop2: String? = null
    var prop3: Int = 0

    constructor()

    constructor(prop1: String?, prop2: String?, prop3: Int) {
        this.prop1 = prop1
        this.prop2 = prop2
        this.prop3 = prop3
    }

    override fun toString(): String {
        return "MyData{" +
                "id=" + id +
                ", prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", prop3=" + prop3 +
                '}'
    }
}

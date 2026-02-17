package com.mytests.spring.springdebuggerbeaninlayskotlin.nonAmbiguousInjection

import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.function.Consumer


@Repository
class MyDataRepoCtorInjection(
    private val entityManager: EntityManager
) {
    val data: MutableList<String?>
        get() {
            val result: MutableList<String?> = ArrayList<String?>()
            val resultList: MutableList<MyData?> =
                entityManager.createNativeQuery<MyData?>("select * from foo", MyData::class.java).getResultList() as MutableList<MyData?>
            resultList.forEach(Consumer { data: MyData? -> result.add(data.toString()) })
            return result
        }

    @Transactional
    fun initDB() {
        entityManager.persist(MyData("aaa", "bbb", 20))
        entityManager.persist(MyData("ccc", "ddd", 30))
        entityManager.persist(MyData("eee", "fff", 40))
    }
}

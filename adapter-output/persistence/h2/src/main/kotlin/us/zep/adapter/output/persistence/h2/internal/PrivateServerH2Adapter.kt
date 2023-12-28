package us.zep.adapter.output.persistence.h2.internal

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import us.zep.application.port.input.CreatePrivateServerUseCase.CreatePrivateServerCommand
import us.zep.application.port.output.repository.CreatePrivateServerPort
import java.util.*

/**
 * adapter 에 jpa repository 연결하기
 */

@Repository
internal class PrivateServerH2Adapter @Autowired constructor(
        private val dslContext: JPAQueryFactory,
        private val privateServerRepository: PrivateServerRepository
) : CreatePrivateServerPort {
    override fun save(command: CreatePrivateServerCommand): UUID {
        return dslContext.

    }
}
package us.zep.adapter.output.persistence.h2.internal

import org.springframework.stereotype.Repository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface PrivateServerRepository: JpaRepository<PrivateServer, Long>

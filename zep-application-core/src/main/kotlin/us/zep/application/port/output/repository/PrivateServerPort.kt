package us.zep.application.port.output.repository

import us.zep.application.port.input.CreatePrivateServerUseCase.CreatePrivateServerCommand
import java.util.UUID

interface CreatePrivateServerPort {
    fun save(command: CreatePrivateServerCommand): UUID
}
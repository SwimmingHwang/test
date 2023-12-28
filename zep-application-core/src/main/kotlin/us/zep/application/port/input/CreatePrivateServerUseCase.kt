package us.zep.application.port.input

import java.util.UUID


interface CreatePrivateServerUseCase {

    fun CreatePrivateServer(createPrivateServerCommand: CreatePrivateServerCommand): UUID

    data class CreatePrivateServerCommand(
        val replicas: Int,
        val memory: Int,
        val core: Double
    )
    {

    }
}

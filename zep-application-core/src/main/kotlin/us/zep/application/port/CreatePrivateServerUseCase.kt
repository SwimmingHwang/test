package us.zep.application.port

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

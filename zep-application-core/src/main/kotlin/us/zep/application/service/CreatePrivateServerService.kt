package us.zep.application.service

import us.zep.application.port.input.CreatePrivateServerUseCase
import us.zep.application.port.input.CreatePrivateServerUseCase.CreatePrivateServerCommand
import us.zep.application.port.output.repository.CreatePrivateServerPort
import java.util.*
import javax.inject.Named
@Named
class CreatePrivateServerService (val createPrivateServerRepository: CreatePrivateServerPort) : CreatePrivateServerUseCase{
    override fun CreatePrivateServer(createPrivateServerCommand: CreatePrivateServerCommand): UUID {
        return createPrivateServerRepository.save(createPrivateServerCommand)
    }


}
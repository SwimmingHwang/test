package us.zep.adapter.input.rest.reactor

import org.springframework.http.ResponseEntity
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.valiktor.validate
import org.valiktor.functions.isIn
import us.zep.application.port.input.CreatePrivateServerUseCase
import us.zep.application.port.input.CreatePrivateServerUseCase.CreatePrivateServerCommand
import java.net.URI

@RestController
class PrivateServerController(
//        private val getPrivateServerUseCase: GetPrivateServerUseCase,
        private val createPrivateServerUseCase: CreatePrivateServerUseCase
) {

    @GetMapping("/api-admin/private-servers")
    fun createPrivateServer(response: ServerHttpResponse, @RequestBody form: CreatePrivateServerForm): ResponseEntity<Unit> {
        val privateServerId = createPrivateServerUseCase.CreatePrivateServer(
                CreatePrivateServerCommand(1, 4, 0.1))
        return ResponseEntity
                .created(URI.create("/private-servers$privateServerId"))
                .build()
    }

    data class CreatePrivateServerForm(var replicas: Int, val memory: Int, val core: Double){
        init {
            validate(this){
                validate(CreatePrivateServerForm::replicas).isIn(0, 1,2,3)
            }
        }
    }

}
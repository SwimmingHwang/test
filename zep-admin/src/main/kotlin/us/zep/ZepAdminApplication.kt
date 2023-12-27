package us.zep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZepAdminApplication

fun main(args: Array<String>) {
    runApplication<ZepAdminApplication>(*args)
}

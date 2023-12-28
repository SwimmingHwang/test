package us.zep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class ZepAdminApplication

fun main(args: Array<String>) {
    runApplication<ZepAdminApplication>(*args)
}

@Configuration
@ComponentScan
@Suppress("UnusedPrivateClass")
private class MainConfig
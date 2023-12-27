package us.zep.common

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZepCommonApplication

fun main(args: Array<String>) {
	runApplication<ZepCommonApplication>(*args)
}

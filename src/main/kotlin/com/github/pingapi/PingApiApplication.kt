package com.github.pingapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PingApiApplication

fun main(args: Array<String>) {
	runApplication<PingApiApplication>(*args)
}

package com.mein.restapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class RestapiApplication

fun main(args: Array<String>) {
    runApplication<RestapiApplication>(*args)
}
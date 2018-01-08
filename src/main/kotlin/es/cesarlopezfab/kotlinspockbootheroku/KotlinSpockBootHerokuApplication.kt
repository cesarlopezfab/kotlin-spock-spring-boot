package es.cesarlopezfab.kotlinspockbootheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinSpockBootHerokuApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpockBootHerokuApplication>(*args)
}

@RestController
class HelloWorldController() {

    @GetMapping("/")
    fun sayHi() = "Hello world"
}

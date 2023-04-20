package dev.tomrzepka.movies.http

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class MovieController {

    @GetMapping("/test")
    fun apiRoot(): String {
        return "Hello there"
    }
}
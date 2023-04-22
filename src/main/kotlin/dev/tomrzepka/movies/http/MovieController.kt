package dev.tomrzepka.movies.http

import dev.tomrzepka.movies.db.Movie
import dev.tomrzepka.movies.domain.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class MovieController(val movieService: MovieService) {

    @GetMapping("/movies")
    fun getAllMovies(): ResponseEntity<List<Movie>> {
        return ResponseEntity(movieService.allMovies(), HttpStatus.OK)
    }
}
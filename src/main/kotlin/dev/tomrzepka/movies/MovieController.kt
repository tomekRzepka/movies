package dev.tomrzepka.movies

import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1")
class MovieController(private val movieService: MovieService) {

    @GetMapping("/movies")
    fun getAllMovies(): ResponseEntity<List<Movie>> {
        return ResponseEntity(movieService.allMovies(), HttpStatus.OK)
    }

    @GetMapping("/{imdbId}")
    fun getSingleMovie(@PathVariable("imdbId") imdbId: String): ResponseEntity<Optional<Movie>> {
        return ResponseEntity(movieService.singleMovie(imdbId), HttpStatus.OK)
    }
}
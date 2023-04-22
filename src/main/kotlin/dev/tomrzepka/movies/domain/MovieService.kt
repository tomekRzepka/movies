package dev.tomrzepka.movies.domain

import dev.tomrzepka.movies.db.Movie
import dev.tomrzepka.movies.db.MovieRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class MovieService(val repository: MovieRepository) {

    fun allMovies(): List<Movie> {
        return repository.findAll()
    }
}
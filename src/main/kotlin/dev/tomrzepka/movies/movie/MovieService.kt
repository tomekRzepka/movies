package dev.tomrzepka.movies.movie

import dev.tomrzepka.movies.movie.Movie
import dev.tomrzepka.movies.movie.MovieRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.*

@Service
@RequiredArgsConstructor
class MovieService(private val repository: MovieRepository) {

    fun allMovies(): List<Movie> {
        return repository.findAll()
    }

    fun singleMovie(imdbId: String): Optional<Movie> {
        return repository.findMovieByImdbId(imdbId)
    }
}
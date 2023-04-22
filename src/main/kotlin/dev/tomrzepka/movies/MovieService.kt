package dev.tomrzepka.movies

import lombok.RequiredArgsConstructor
import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import java.util.*

@Service
@RequiredArgsConstructor
class MovieService(private val repository: MovieRepository) {

    fun allMovies(): List<Movie> {
        return repository.findAll()
    }

    fun singleMovie(objectId: ObjectId): Optional<Movie> {
        return repository.findById(objectId)
    }
}
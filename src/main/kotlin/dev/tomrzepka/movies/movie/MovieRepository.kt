package dev.tomrzepka.movies.movie

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface MovieRepository : MongoRepository<Movie, ObjectId> {
   fun  findMovieByImdbId(imdbId: String) : Optional<Movie>
}
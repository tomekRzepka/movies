package dev.tomrzepka.movies.db

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository : MongoRepository<Movie, ObjectId> {
}
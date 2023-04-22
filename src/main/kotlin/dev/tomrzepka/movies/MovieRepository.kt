package dev.tomrzepka.movies

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository : MongoRepository<Movie, ObjectId> {
}
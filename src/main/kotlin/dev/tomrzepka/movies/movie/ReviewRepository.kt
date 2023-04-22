package dev.tomrzepka.movies.movie

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ReviewRepository : MongoRepository<Review, ObjectId> {
}
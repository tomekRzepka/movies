package dev.tomrzepka.movies.movie

import lombok.RequiredArgsConstructor
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.data.mongodb.core.query.Update.update
import org.springframework.data.mongodb.core.query.isEqualTo
import org.springframework.data.mongodb.core.update
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class ReviewService(private val repository: ReviewRepository, private val mongoTemplate: MongoTemplate) {

    fun createReview(reviewBody: String, imdbId: String): Review {
        val review = repository.insert(Review(reviewBody))

        mongoTemplate.update<Movie>()
            .matching(where("imdbId").isEqualTo(imdbId))
            .apply(update("reviewsIds", review))
            .findAndModify()

        return review
    }
}
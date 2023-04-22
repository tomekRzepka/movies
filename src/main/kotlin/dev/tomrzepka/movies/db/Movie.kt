package dev.tomrzepka.movies.db

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference
import java.util.*

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Movie(
    @Id
    val id: ObjectId = ObjectId(),
    val imdbId: String = "",
    val title: String = "",
    val releaseDate: String = "",
    val trailerLink: String = "",
    val poster: String = "",
    val genres: List<String> = Collections.emptyList(),
    val backdrops: List<String> = Collections.emptyList(),
    @DocumentReference
    val reviewsIds: List<Review> = Collections.emptyList()
)
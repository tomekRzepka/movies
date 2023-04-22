package dev.tomrzepka.movies.movie

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Review(
    @Id
    val objectId: ObjectId = ObjectId(),
    var body: String = ""
) {
    constructor(body: String) : this() {
        this.body = body
    }
}

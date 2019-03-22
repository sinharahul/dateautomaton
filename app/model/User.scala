package model

import model.Review.Review

case class User(person: Person, location: Location, feature: Feature,
                image: Image, hobbies: List[Hobbies], matches: List[Match], reviews: List[Review.Value],
                chats: List[Chat]
               )

object User {

}

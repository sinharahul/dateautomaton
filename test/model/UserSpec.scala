package model

import org.scalatest._

class UserSpec extends FlatSpec with Matchers {
  "A User " should "have a name" in {
    val person: Person = new Person("user1")
    val user: User = new User
    user.person = person
    user.person.name should be("user1")
  }
  "A User" can " register" in {
    val user = User.register("r","pwd","r@gmail.com")
    user.isRegistered should be(true)
  }
}

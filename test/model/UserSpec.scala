package model
import org.scalatest._
class UserSpec extends FlatSpec with Matchers {
  "A User " should "have a name" in {
    val person:Person = new Person("user1")
    val user:User = new User
    user.person = person
    user.person.name should be ("user1")
  }
}

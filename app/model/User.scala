package model

import model.Review.Review

class User{
  var loginProfile: LoginProfile=_
  var person: Person=_
  var location: Location=_
  var feature: Feature=_
  var image: Image = _
  var hobbies: List[Hobbies]=_
  var matches: List[Match]=_
  var reviews: List[Review.Value]=_
  var chats: List[Chat]=_
}
case class LoginProfile(userId:String,password:String,email:String)
object User {

}

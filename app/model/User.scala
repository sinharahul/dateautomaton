package model

import model.Review.Review

class User{
  private var _loginProfile: LoginProfile=_
  private var _person: Person=_
  private var _location: Location=_
  private var _feature: Feature=_
  private var _image: Image = _
  private var _hobbies: List[Hobbies]=_
  private var _matches: List[Match]=_
  private var _reviews: List[Review.Value]=_
  private var _chats: List[Chat]=_

  def isRegistered = _loginProfile != null
  def person = _person
  def person_= (newValue: Person): Unit = _person=newValue

}
object User {
  def register(userName:String,password:String,email:String):User={
    val user = new User
    user._loginProfile = new LoginProfile(userName,password,email)
    user
  }
}

case class LoginProfile(userId:String,password:String,email:String)

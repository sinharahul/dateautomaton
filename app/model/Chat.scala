package model

case class Chat(userA:User,userB:User,messagesFromA:List[String],messagesFromB:List[String])

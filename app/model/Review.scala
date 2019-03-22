package model

/**
  * Review user with one lowest and five being the highest
  */
object Review extends Enumeration {
 type Review = Value
 val One,Two,Three,Four,Five = Value
}

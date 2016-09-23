package models

case class Todo(id: Option[Long] = None, name: String, isDone: Boolean = false)

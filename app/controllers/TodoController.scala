package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class TodoController @Inject() extends Controller {

  def index = Action {
    Ok
  }

  def save = Action {
    Ok
  }

  def update(id:Long) = Action {
    Ok
  }

  def destroy(id:Long) = Action {
    Ok
  }
}

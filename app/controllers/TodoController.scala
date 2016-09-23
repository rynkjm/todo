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

  def update = Action {
    Ok
  }

  def destroy = Action {
    Ok
  }

}

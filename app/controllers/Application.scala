package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("this is a message mofo"))
  }

  def basket = Action {
    Ok(views.html.basket("hello basket"))
  }

  def login = Action {
    Ok(views.html.login("login"))
  }

}
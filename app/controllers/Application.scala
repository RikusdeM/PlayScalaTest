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

  def userTest = Action{
    request => val body = request.body
      println(body)
      Ok
      //check if useremail and password exists in database, if not create
  }

  def auth(username:String,password:String) = Action {
    implicit params => Ok(views.html.content(params.body.asText.get,params.body.asText.get))
  }
}
package assets

import play.libs.Json

import scala.collection.mutable.ListBuffer

/**
 * Created by rikus on 5/6/15.
 */
class User(name:String, password:String,basket:Basket)

class Basket(val items:ListBuffer[Item])
object Basket {
  def apply () = {
    new Basket(ListBuffer.empty)
  }
  def addItem (basket:Basket,name:String): Unit = {
    basket.items += Item(name)
  }
  def listItems (basket:Basket) = {
    basket.items.foreach(itm => println(itm.itemName))
  }
}
class Item (val itemName:String,description:String,iconUrl:String)
object Item {
  def apply(name:String) = {
    new Item(name,"","")
  }
}

import assets.{Item, Basket, User}

import scala.collection.mutable.ListBuffer

/**
 * Created by rikus on 5/6/15.
 */

object tests extends App{
  println("es")
  val item1 = Item("item1")
  val item2 = Item("item2")
  val itemList = ListBuffer(item1,item2)
  //itemList.foreach(itm => println(itm.itemName))
  val basket1 = new Basket(itemList)
  Basket.addItem(basket1,"item3")
  //itemList.foreach(itm => println(itm.itemName))
  Basket.listItems(basket1)

}

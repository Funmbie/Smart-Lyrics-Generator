package com.Funmbie.view

import scala.io.StdIn

import com.Funmbie.model.AbstractLogicT


object Interface extends App with AbstractLogicT {

  val lengthStated             = StdIn.readLine("Define your length")

  try{
    val finalLength:Int        = lengthStated.toInt
    println(s"Lyrics($finalLength): ${finalCall(finalLength)}")
  }
  catch{
    case exception: Exception => println(s"Error: $exception")
  }

}
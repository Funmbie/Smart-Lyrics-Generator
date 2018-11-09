package com.Funmbie.model

trait AbstractLogicT extends StashT{
  var lastWord = ""
  var lyrics = ""

  def lastWordNull:Boolean                      = lastWord == ""
  def generateWord:String                       = stash(scala.util.Random.nextInt(stash.length))
  def checkValidity(gen_word:String):Boolean    = logicalSuccessor(lastWord) contains gen_word

  def callToAction(acceptedWord:String)   = {
    lyrics  += acceptedWord + " "
    lastWord = acceptedWord
  }

  def finalCall(wordCount:Int)            = {
    for (i<- 0 until wordCount)
      {
        val word = generateWord
        lastWordNull match{
          case true    => lyrics  += word + " "
                          lastWord = word

          case false   =>
            checkValidity(word) match{
            case true  => callToAction(word)

            case false => recursiveProtocol
          }
        }
      }

    lyrics + "."
  }

  def recursiveProtocol                   = {
    var isAccepted = false

    while(!isAccepted){
      val word = generateWord
      checkValidity(word) match{
        case false => //Word doesn't logically make sense

        case true     => callToAction(word)
          isAccepted  =  true
      }
    }
  }
}
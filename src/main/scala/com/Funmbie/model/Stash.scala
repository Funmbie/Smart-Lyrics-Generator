package com.Funmbie.model

trait StashT {
  val stash = List(
    "is","This","what","you","want","down","that","road","hide","burn","the","whole",
    "house","cool","hang","should","been","up","you're","we","maybe","I",
    "will","stay","away","think","got","one","help","pain","my","bones","blood","out"
  )

  val logicalSuccessor:Map[String,List[String]] = Map(
    "is" -> List("This","down","that","the","cool","up", "away","one","pain","my","bones","blood","out"),
    "This" -> List("is","road","burn","whole","house","cool","hang","will","one","help","pain","bones","blood"),
    "what" -> List("is","you","road","burn","the","whole","house","cool","should","you're","we","I","will","blood","bones","my"),
    "you" -> List("want","down","hide","burn","should","been","will","think","got","help"),
    "want" -> List("This","what","you","that","the","one","help","pain","my","out"),
    "that" -> List("is","what","you","road","whole","house","cool","hang","you're","we","maybe","I","got","one","help","pain","my","bones","blood"),
    "road" -> List("is","down","that","should","up","you're","we","I","will"),
    "hide" -> List("This","what","you","that","the","away","my","out"),
    "burn" -> List("This","you","down","that","the","my","out"),
    "the" -> List("road","burn","whole","house","one","help","pain","bones","blood"),
    "whole" -> List("you","road","house"),
    "house" -> List("is","down","that","the","should","up","you're","we","I","will"),
    "cool" -> List("is","down","burn","house","hang","one","out"),
    "hang" -> List("This","you","that","the","up","my","out"),
    "should" -> List("This","you","the","we","I","one","my"),
    "been" -> List("This","what","down","the","cool","up","away","my","out"),
    "up" -> List("This","that","the","my"),
    "down" -> List("This","that","the","we","I","one","my"),
    "you're" -> List("This","what","down","that","the","cool","up","away","one","my","out"),
    "we" -> List("want","hide","burn","hang","should","will","think","got","help"),
    "maybe" -> List("This","what","you","the","cool","up","you're","we","I","one","my"),
    "I" -> List("hide","burn","hang","should","will","think","got","help"),
    "will" -> List("This","what","you","that","hide","burn","the","hang","we","I","stay","think","help"),
    "stay" -> List("down","cool","up","away","out"),
    "away" -> List("you"),
    "think" -> List("This","what","that","the","we","I"),
    "got" -> List("This","what","you","down","that","the","cool","up","one","help","my","out"),
    "one" -> List("road","house","cool","will"),
    "help" -> List("is","This","you","the","will","my","out"),
    "pain" -> List("is","you","that","the","will","got"),
    "my" -> List("road","house","stay","help","pain","bones","blood"),
    "bones" -> List("you","that","should","you're","we","I","will"),
    "blood" -> List("is","you","the","house","should","you're","I","will"),
    "out" -> List("This","that","the","we","my")
  )
}

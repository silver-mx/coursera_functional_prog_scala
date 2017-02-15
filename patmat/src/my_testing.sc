object FirstWorkSheet {

  import patmat.Huffman._




  val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
  encode(t1)("ab".toList)

  println("YYA-" + makeOrderedLeafList(times("som".toList)))
  println("YYB-" + combine(makeOrderedLeafList(times("som".toList))))
  println("YYC-" + combine(combine(makeOrderedLeafList(times("som".toList)))))
  println("YYD- " + combine(combine(combine(makeOrderedLeafList(times("som".toList))))))
  println("YYE- " + singleton(combine(combine(combine(combine(makeOrderedLeafList(times("som".toList))))))))
  println("YYE- " + singleton(combine(combine(combine(combine(combine(makeOrderedLeafList(times("som".toList)))))))))
  //println("XX=" + createCodeTree("someText".toList))
}
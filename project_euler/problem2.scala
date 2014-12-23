//find nth value in fibonacci series, useful but not rel what we want

/* def fibonacci(n: Int) = {
	
	def go(n: Int, a: Int, b:Int) = n match {
	  case 0 => a
	  case _ => go(n-1, b, a+b)

	}

	return go(n,0,1)

} */


/* what we want is:
have an ordered list with  1&2 already loaded in
loop fibonacci generator, which adds a new value to the list, which is the value of the two previous entries.
stop adding to the list when the vaue about to be added is over 4 million
then sum the even values in the list. theres prolly a better way to do is, but start from here

/*
scala> val mainList = List(3, 2, 1)
mainList: List[Int] = List(3, 2, 1)

scala> val with4 =    4 :: mainList
with4: List[Int] = List(4, 3, 2, 1)

scala> val with4 =    4 :: mainList
with4: List[Int] = List(4, 3, 2, 1)

scala> with4(0)
res34: Int = 4

*/
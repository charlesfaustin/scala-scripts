// solution 1

(1 to 999).filter(x=>x%3==0 || x%5==0).sum
(1 to 999).filter(x=>x%3==0 || x%5==0).foldLeft(0){_+_}


// solution 2

def caseFilter(x: Int): Boolean = (x%3, x%5) match {
	case (0,0) => true
	case (0,_) => true
	case  (_,0) => true
	case _ => false
	}


(1 to 999).filter(caseFilter).foldLeft(0){_+_}
(1 to 999).filter(caseFilter).sum


// solution 3

def condFilter(x: Int):Boolean ={
  if (x%3==0 || x%5==0) true else false
}

(1 to 999).filter(condFilter).foldLeft(0){_+_}
(1 to 999).filter(condFilter).sum

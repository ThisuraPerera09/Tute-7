package Tute7

  object Q1 extends App  {
    val obj = new Rational(1,2)
    println(obj.neg)

  }

  class Rational(n:Int, d:Int) {
    //Rational class requires that the denominator is positive
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)
    //overriding to String
    override def toString(): String = numer + "/" + denom


}

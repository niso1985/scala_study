class Rational(n: Int, d: Int) {
	require(d != 0)
	private val g = gcd(n.abs, d.abs)
	val numer: Int = n / g
	val denom: Int = d / g
	def this(n: Int) = this(n, 1)
	override def toString = numer + "/" + denom
	def +(that: Rational): Rational =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom
		)
	def *(that: Rational): Rational =
		new Rational(numer * that.numer, denom * that.denom)
	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a else gcd(b, a % b)
}

val oneHalf = new Rational(1,2)
val twoThirds = new Rational(2,3)
println((oneHalf + twoThirds).toString)

println(new Rational(66, 42).toString)

val x = new Rational(1, 2)
val y = new Rational(2, 3)
println((x + y).toString)
println((x * y).toString)

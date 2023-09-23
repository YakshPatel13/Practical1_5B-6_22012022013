fun main() {
    println("\n22012022013 Yaksh Patel")
    print("Enter Number: ")
    var number = readLine()!!.toInt()
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}

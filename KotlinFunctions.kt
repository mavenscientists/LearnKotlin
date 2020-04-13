/**
 * Welcome to "Learn Kotlin in 1 Hour" - Team MAST
 * Youtube : www.youtube.com/TeamMAST
 */

fun main() {

    println("------Functions in Kotlin------")

    println(" Square of 2 is : ${square(2)}")

    println("${sayHello("Joe")}")

    println("${sayHello(name = "Phil")}")

    //NAmed Arguments
    println("${displayData(name = "Karan", age = 27, subject = "Computer Science")}")

    //Default arguments
    println("${displayData(name = "Karan", subject = "Computer Science")}")

    println("Sum of 1, 2, 3, 4 is : ${getSum(1, 2, 3, 4)}")

    var name = "Joe"
    name.greetHello()

    println("Sum of 10 and 20 is : ${sum(10, 20)}")

    myHigherOrderFunction("Adam", ::demo)
    myAnotherHigherOrderFunction("Karan", ::demo, ::demo)

}

fun square(x : Int) : Int = x * x

fun sayHello(name : String) = println("Hello $name")

fun displayData(name: String, age: Int = 12, subject: String) {
    println("Hi My name is $name and my age is $age and I study $subject")
}

/**
 * Calculate the sum of values
 */
fun getSum(vararg nums : Int) : Int {
    var sum = 0
    nums.forEach { it ->
        sum += it
    }
    return sum
}

// Extension Functions
fun String.greetHello() = println("Hello $this")

// Lambda Function
val sum = {num1: Int, num2: Int -> num1 + num2}

// Higher Order Functions - takes a function as another parameter
inline fun myHigherOrderFunction(name: String, myFunc: (String) -> Unit) {
    println("This is my Higher Order Function:")
    myFunc(name)
}

// Normal Function
fun demo(name: String) = println("Hello $name")

// Noinline modifier
inline fun myAnotherHigherOrderFunction(name: String, myFunc: (String) -> Unit, noinline myFunc1: (String) -> Unit) {
    println("This is my Higher Order Function:")
    myFunc(name)
    myFunc1(name)
}

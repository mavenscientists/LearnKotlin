package kotlinfunctions

/**
 * Course Contents
 *
 * 1. Functions
 * 2. Extension Functions
 * 3. Lambda Functions
 * 4. Higher Order Functions
 *
 * Subscribe  | LIKE | SHARE
 * Register for FREE Kotlin Course : https://forms.gle/yDsDA4ykD1qWDoZ49
 * Youtube Channel : https://youtube.com/TeamMAST
 */

fun main() {


    // When as an expression - Lecture 2 | Control Flow
    val day = when (getDay()) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> {
            "Invalid Day"
        }
    }

    println("Today is : $day")

    println("Square of 4 is ${square(num = 4)}")
    //Named Arguments
    println("Student Marks: ${printStudentMarks(
            maths = 99,
            name = "Vishal",
            science = 90,
            hindi = 89)}")

    println("Sum of 1, 2, 3, 4, 5 is : ${getSum(1, 2, 3, 4, 5)}")

    //Infix Notation
    println("My Sum of 1 and 2 is : ${1 myPlus 2}")
    println("My Sum of 1 and 2 is : ${1.myPlus(value = 2)}")


    println("Vishal".sayGoodMorning())
    println("Kapil".sayGoodMorning())

    println("Sum of 10 and 20 is : ${sum(10, 20)}")

    println("My Selected Names : $myResultNames")

    myHigherOrderFunc(data = "Date : 18 April", myFunc = ::printMyData)

    val sum = myFunc(20)
    println("Sum is : $sum")

}

//Single Expression Function
fun getDay(): Int = 6

fun square(num: Int): Int = num * num

//Default Arguments - provide a default value to function arguemnts..
fun printStudentMarks(name: String, maths: Int = 0, history: Int = 0, science: Int = 0, hindi: Int = 0) {
    println("Marks of $name are :")
    println("Maths : $maths")
    println("history : $history")
    println("science : $science")
    println("hindi : $hindi")
}

fun getSum(vararg nums: Int): Int {
    var sum = 0
    nums.forEach { num ->
        sum += num
    }
    return sum
}

// Java  - void
// Kotlin - Unit
fun myPrint(data: String): Unit {
    println(data)
}

// Infix notation
infix fun Int.myPlus(value: Int): Int {
    return this + value
}

// Extension Functions
fun String.sayGoodMorning() = "Good Morning $this"

fun Int.toThousandString(): String {
    return ""
}

// Date Type Conversions dd-MM-yyyy -> MMM, yyyy
// 09 09 2020 -> Sep, 2020

// convert 10000 -> 10,000

// Lambda Functions - A function with no name
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// a bunch of names -> select names of length 5 ->  Sort Alphabetically ->  to upper case -> print
val names = arrayOf("Kapil", "Vishal", "Karan", "John", "Zippinder", "Sunny")
val myResultNames = names.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() }
/*

val myResultNames = names.filter {
    return@filter it.length == 5
}.sortedBy {
    return@sortedBy it
}.map {
    it.toUpperCase()
}
*/

// Higher Order Functions
/**
 * A function which takes another function as a parameter or
 *  A function which return another function
 *
 *  that kind of function is called a higher order function.
 */

// higher order function
fun myHigherOrderFunc(data: String, myFunc: (String) -> Unit) {
    myFunc(data)
}


// Normal Function
fun printMyData(data: String)  {
    println("Data is : $data")
}

// A function which return another function
fun myFunc(num : Int) : (Int) -> Int = {num2 -> num2 + num }


// BE MAST AND KEEP ROCKING !!

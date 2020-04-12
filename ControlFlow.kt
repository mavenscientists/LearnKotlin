/**
 * Welcome to "Learn Kotlin in 1 Hour" - Team MAST
 * Youtube : www.youtube.com/TeamMAST
 */

fun main() {

    println("Learning Control Flow in Kotlin")

    val a = 10
    val b = 20
    var max = 0

    if(a > b) {
        max = a
    } else if(b > a) {
        max = b
    }
    println("Max of $a and $b is : $max")

    // Java - if is a statement
    // Kotlin - if is an expression.. it will return some value

    max = if(a > b) a else b
    println("Max of $a and $b is : $max")

    // When expression in Kotlin - Replacement of switch Statement  C, C++ , Java
    var x = 3
    when (x) {
        1 -> println("Value of X is 1")
        2 -> println("Value of X is 2")
        else -> {
            println("Value of X is not 1 or 2")
        }
    }

    x = 5
    when (x) {
        !in 1..5 -> println("Value of X is not in 1-5")
        in 5..10 -> println("Value of X is  in 5-10")
        else -> {
            println("Value of X is not in 1..10")
        }
    }

    // Loops in Kotlin
    println("For Loop---")
    for(i in 1..10) {
        println("I : $i")
    }

    println("For loop with Ranges: ")
    for(i in 6 downTo 0 step 2) {
        println("I : $i")
    }

    println("While Loop----")
    // While Loop
    var p = 1
    while (p <= 10) {
        println("P : $p")
        if(p == 5) break
        p++
    }

    println("Do While Loop ----")
    p = 1
    do {
        println("P : $p")
        p++
    }while (p <= 10)

     // KEEP ROCKING

}
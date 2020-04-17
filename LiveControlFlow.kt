/**
 *
 * Welcome to Live video Lecture - 2 of the course "Learn Kotlin with Team MAST"
 * Subscribe Now : https://www.youtube.com/TeamMAST
 *
 * Contents for Today
 * 1. if statement / expression
 * 2. When Expression
 * 3. For loop
 * 4. While loop
 * 5. Do while loop
 * 6. break statement
 * 7. continue statement
 *
 * Intellij IDE - Community Edition
 */

fun main() {

    println("Learning Control Flow in Kotlin")

    val num1 = 10
    val num2 = 20
    var max = num1
    // if as a statement
    if (num1 > num2) {
        max = num1
    } else {
        max = num2
    }
    println("Max is : $max")

    // Java - if is a statement.
    // Kotlin - if is an expression.

    // if as an expression- it is required to have an else branch.
    max = if (num1 > num2) num1 else num2

    println("Max is : $max")

    // When expression  - is a replacement of Switch operator from C type languages.
    val myChar = 'Z'

    // When - as a statement.
    when (myChar) {
        'A', 'E', 'I', 'O', 'U' -> {
            println("myChar is a Vowel")
        }
        else -> {
            println("myChar is a not Vowel")
        }
    }

    // When as an expression - it will return some value


    val x = 0
    when (x) {
        0 -> {
            println("X is 0")
        }
        1 -> {
            println("X is 1")
        }
    }

    // For loops
// Syntax :    for (item in Collection) { }
    for (x in 1..10) {
        println(" $x,")
    }

    /*
       Will not run/ Compilation erro  as String class does not have an interator..
       val array = "A".."Z" // Integer Array
       for(x in array) {
           print(" $x,")
       }
   */

    val myArray = arrayOf(1, 2, 3, "ABC", "XYZ")
    println("MyArray : ")
    for (x in myArray.indices) {
        print("${myArray[x]}, ")
    }

    //.While loop
    var y = 0
    while (y <= 10) {
        println("Y : $y")
        y++
    }

    y = 10
    println("Do while ")
    do {
        println("Y : $y")
        y--
    } while (y >= 0)

    // For .. Ranges
    println("For Ranges ...")
    for (i in 0 until 10) { // 0 1 2 .. 9
        println("I : $i")
    }

    // Adavtanges of Kotlin - Kotlin is null safe - Null safety feature

    var number: Int? = 10
    // .. operations
    number = null
    println("Number : $number")

    // break..
    for (x in 1..10) {
        if (x == 7) {
            break
        }
        println("X : $x")
    }

    //Continue
    println("Continue Sattement--")
    for (x in 1..10) {
        if (x == 7) {
            continue
        }
        println("X : $x")
    }

//    int array = {1, 2, 3,}
    val array: Array<Int> = arrayOf(1, 2, 3)

    // different way of declaring array - other than arrayOf
    val squareArray = Array(10) { i -> i * i } // declaration
    squareArray[0] = 1
    for (x in squareArray.indices) { // 1, 2, 3
        println("New way of declaring array : ${squareArray[x]}")
    }

    val stringArray = arrayListOf("ABC", "XYZ", "C")
    println("Printing values of String using a for loop:")
    for (x in stringArray) {
        print("$x, ")
    }

    val day = 4
    when (day) {
        1 -> System.out.println("Monday")
        2 -> System.out.println("Tuesday")
        3 -> System.out.println("Wednesday")
        4 -> System.out.println("Thursday")
        5 -> System.out.println("Friday")
        6 -> System.out.println("Saturday")
        7 -> System.out.println("Sunday")
        else -> { println("input not valid")
        }
    }
    // STAY SAFE
    // BE MAST AND KEEP ROCKING !! SUBSCRIBE !! :)


}


/*
Switch Case - Java Code
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
 */


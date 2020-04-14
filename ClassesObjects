package oop

/**
 * Welcome to "Learn Kotlin in 1 Hour" - Team MAST
 * Youtube : www.youtube.com/TeamMAST
 */

fun main() {

    println("-----Classes and Objects in Kotlin-----")

    Person("Karan")
    Person(25, "Joe")

}

/**
 * By default the primary constructor will be public
 */
class Person (name: String) {

    var age: Int = 0

    init {
        println("The name of Person is $name and age is : $age")
    }

    constructor(age: Int, name: String) : this(name) {
        println("Secondary Constructor :")
        println("Name : $name")
        println("Age  : $age")
    }

}

// Data Classes
/**
 * Java  - POJO Classes
 * Kotlin - Data Class
 */

data class User (val name: String, val age: Int)

/**Visibility Modifiers
 * private - you can access this from only within the same class
 * protected - within the same class + subclasses as well.
 * internal - within the same class + the entire module
 * public - everywhere you can access the class.
 */


// BE MAST and KEEP ROCKING !!!

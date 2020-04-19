package oop

/**
 * Course Contents -- OOPs 1
 * 1. Classes and Objects
 * 2. Constructors
 * 3. Inheritance
 * 4. Visibility Modifiers
 * 5. Data Classes
 *
 * Youtube : www.youtube.com/TeamMAST
 * Subscribe | Like | Share only if this is helpful :)
 */

fun main() {

    println("Koltin Live Class - OOPs Concepts")

    Person("Kapil")
    println()
    Person(age = 27, name = "Karan")
    println()
    User("John").playPiano()

    println(Shape(name = "Rectangle", sides = 4).toString())


}

// All Kotlin classes are Public and final in nature

open class Person constructor(var name : String = "Person") {

    protected open var age: Int = 0

    init {
       // ..initialization stuff..
        println("Initializing, the name : $name and age : $age")
    }

    constructor(age: Int, name: String) : this(name) {
        println("Secondary Constructor Name : $name and age : $age")
    }

    open fun playPiano() {
        println("Person: Playing Piano")
    }

}

class User(name: String) : Person(name) {

    // Overriding a property
    override var age: Int = 0

    init {
        println("Init block of User")
    }

    override fun playPiano() {
        super.playPiano()
        println("User: Playing Piano")
    }

}

/**
 * Visibility Modifiers
 * 1. public - Access it everywhere
 * 2. protected - Nested Classes or Sub/ Child Classes
 * 3. internal - You can access it inside the module
 * 4. private - Only within the same class/ whatever scope.
 *
 */

// Data Classes similar to POJO classes in Java , but with a lot of functionality..
data class Shape (val name: String, val sides : Int)

//data class Employee(val name: String, val id : Int, val salary: Int)


// Employee POJO class to represent entity Employee
data class Employee(var name: String, var id: String, val salary: Double)

/**
 * getters()
 * setters()
 * toString()
 * hashcode()
 *
 */

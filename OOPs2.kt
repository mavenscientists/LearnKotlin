package oop

/**
 * Welcome to "Learn Kotlin in 1 Hour" - Team MAST
 * Youtube : www.youtube.com/TeamMAST
 */

fun main() {

    println("-----OOPs Concepts Part (ii) in Kotlin-----")

    Dog("Husky").getHeight()
    Dog("Husky").getName()

    Button("Login Button").onClick()
    Button("Sign up Button").onClick()

    Button("Sign up Button").onTouch()

    Color.BLUE

    val result = when (getDataFromInternet()) {
        is Result.Success -> println("Result is Success")
        is Result.Error -> println("Result is an Error")
        is Result.InProgress -> println("Result is in progress")
        is Result.NetworkError -> println("Result is Network Error")
    }


}

/**
 * By default all classes are final and public in nature
 * open keyword -
 * By default all methods are public and final in nature in Kotlin.
 *
 * //Abstract Class Rules.
 * 1.  only an abstract class can contain an abstract method.
 * 2. All the abstract methods must be overriden in the sub class.
 */

// Abstract Classes

abstract class Animal {

    open val height = 180
    abstract val name: String

    abstract fun getName() // we have to override this method in the sub class

    open fun getHeight() { //can override because it is declared as open.
        println("Animal: getHeight()")
    }
}

class Dog(override val name: String) : Animal() {


    override fun getName() {
        println("Name of the Dog : $name")
    }

    override fun getHeight() {
        super.getHeight()
        println("Height is $height")
    }

}


// Interfaces - are not a class
/**
 * Interfaces are kind of a listeners
 */
interface OnClickListener {

    fun onClick() {
        println("OnClickListener.onClick()")
    }

    fun onTouch()

}

class Button(val name: String) : OnClickListener {

    override fun onTouch() {
        println("The $name was Touched")
    }

    override fun onClick() {
        super.onClick()
        println("The $name was clicked.")
    }

}

// Sealed Classes - Extension to the Enums
/*
enum class Result {
    Success,
    Error
}
*/

enum class Color {
    RED,
    BLUE,
    GREEN
}

// Lets tryto understand what is the need of a sealed class.

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val error: String) : Result()
    data class InProgress(val progress: Int) : Result()
    data class NetworkError(val error: String) : Result()
}

fun getDataFromInternet(): Result {
    // .. body
    /**
     * 200 - Success
     * 400 - Network Error
     * 201 - In Progress
     */
    val resultCode = 400

    return if (resultCode == 200) {
        Result.Success("Success")
    } else if (resultCode == 201) {
        Result.InProgress(20)
    } else if (resultCode == 400) {
        Result.NetworkError("Network Error")
    } else {
        Result.Error("Error")
    }

}

// BE MAST AND KEEP  ROCKING !!!

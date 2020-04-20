package oop

/**
 * Course Contents -- OOPs 2
 * 1. Abstract Classes
 * 2. Interfaces
 * 3. Sealed Classes
 *
 * Youtube : www.YouTube.com/TeamMAST
 * Subscribe | Like | Share only if this is helpful :)
 */

fun main() {

    println("Koltin Live Class - OOPs Concepts Part 2")

    Dog().getHeight()
    Dog().getWeight()

    MyButton().onClick()
    MyButton().onTouch()

    val result = when (getDataFromAPI()) {
        is MyResult.Success -> {
            println("Successfully got data from API")
        }
        is MyResult.Error -> {
            println("Error while fetching data from API")
        }
        is MyResult.InProgress -> {
            println("Result is in  Progress")
        }
        is MyResult.OnHold -> {
            println("Result is in OnHold")
        }
    }

}
// All classes in Kotlin are public and final by default

abstract class Animal() {

    open var height = 0
    var weight: Int = 0

    open fun getHeight() {
        println("Height of Animal : $height")
    }

    abstract fun getWeight()

}

class Dog : Animal() {

    override var height: Int = 0

    override fun getHeight() {
        super.getHeight()
        println("Height of Dog : $height")
    }

    override fun getWeight() {
        println("Weight of Dog : $weight")
    }
}


// Interfaces - are not classes. and you cannot instantiate them
interface MyOnClickListener {

    var sensitivity: Int

    fun onTouch()

    fun onClick() {
        println("OnClicked()")
    }

}

class MyButton : MyOnClickListener {

    override var sensitivity: Int = 0

    override fun onTouch() {
        println("My button was Touched")
    }

    override fun onClick() {
        super.onClick()
        println("Button was clicked")
    }

}

// Sealed Classes - just and extension to Enums..
/**
 * Result -> Success, Error
 * Enums
 */
enum class MyColor {
    RED,
    BLUE,
    GREEN
}


sealed class MyResult {
    data class Success(val data: String) : MyResult()
    data class InProgress(val completed: Int) : MyResult()
    data class OnHold(val holdReason: String) : MyResult()
    data class Error(val err: Exception) : MyResult()
}

/**
 * result Code
 * 200 - Success
 * 201 - InProgress
 * 202 - OnHold
 * otherwise - Error
 */
fun getDataFromAPI(): MyResult {

    // ... network operation
    val resultCode = 202

    return when (resultCode) {
        200 -> {
            MyResult.Success("some json value")
        }
        201 -> {
            MyResult.InProgress(20)
        }
        202 -> {
            MyResult.OnHold("not a priority")
        }
        else -> {
            MyResult.Error(err = Exception())
        }
    }


}

// BE MAST AND KEEP ROCKING !!!


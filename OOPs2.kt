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

    fun getWeight() {} //cannot override .. we had a choice

    val result = when(getDataFromInternet()) {
        is Result.Success -> println("Result is OK")
        is Result.Error -> println("Result is Error")
        is Result.InProgress -> println("Result is in Progress")
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

// Sealed Classes - Extension to the Enum class
/*enum class Result {
    Success()
    Error
}*/

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val error: String) : Result()
    data class InProgress(val progess: Int) : Result()
}


fun getDataFromInternet() : Result {

    //... logic

    val resultCode = 100
    return if(resultCode == 200) {
        Result.Success("Data Download Success")
    }
    else if(resultCode == 100) {
        val progress = 20
        Result.InProgress(progress)
    }
    else {
        Result.Error("Network Exception")
    }
}

// BE MAST AND KEEP ROCKING !!


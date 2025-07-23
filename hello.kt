abstract class Animal {
    abstract fun Eating()

    fun sleep() {
        println("Sleeping")
    }
}

class Dog : Animal() {
    override fun Eating() {
        println("Eat")
    }
}

fun main(args: Array<String>) {
    val Dog1 = Dog()
    Dog1.Eating()
    Dog1.sleep()
}
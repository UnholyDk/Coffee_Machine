import java.util.*

fun stage2() {
    val scanner = Scanner(System.`in`)
    val cups:Int = scanner.nextInt()
    println("Write how many cups of coffee you will need: $cups")
    println("For $cups cups of coffee you will need:")
    println("${200 * cups} ml of water")
    println("${50 * cups} ml of milk")
    println("${15 * cups} g of coffee beans")
}

fun main() {
    stage2()
}
import java.util.*
import kotlin.math.min

fun maxCupsCoffee(data: List<Int>):Int {
    val countW = data[0] / 200
    val countM = data[1] / 50
    val countB = data[2] / 15
    return min(countW, min(countB, countM))
}

fun inputRead(): List<Int> {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has: ")
    val beans = scanner.nextInt()
    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()
    return listOf(water, milk, beans, cups)
}

fun hello() {
    val inputData = inputRead()
    val n = maxCupsCoffee(inputData)
    when {
        n == inputData[3] -> println("Yes, I can make that amount of coffee")
        inputData[3] < n -> println("Yes, I can make that amount of coffee (and even ${n - inputData[3]} more than that)")
        else -> println("No, I can make only $n cups of coffee")
    }
}

fun main() {
    hello()
}
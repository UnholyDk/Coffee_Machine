/*package machine

import java.util.Scanner
import kotlin.math.min

class CoffeeMachine(
    private var water: Int = 1200,
    var milk: Int = 540,
    var coffeeBeans: Int = 120,
    var disposableCups: Int = 9,
    var money: Int = 550)
{
    private val scanner = Scanner(System.`in`)
    fun printStatus() {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffeeBeans of coffee beans")
        println("$disposableCups of disposable cups")
        println("$money of money")
    }
    private fun buy(): Int {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        return scanner.nextInt()
    }
    private fun wantBuy(n: Int) {
        disposableCups -= 1
        when(n) {
            1 -> {
                water -= 250
                coffeeBeans -= 16
                money += 4
            }
            2 -> {
                water -= 350
                milk -= 75
                coffeeBeans -= 20
                money += 7
            }
            3 -> {
                water -= 200
                milk -= 100
                coffeeBeans -= 12
                money += 6
            }
        }
    }
    private fun fill() {
        print("Write how many ml of water do you want to add: ")
        water += scanner.nextInt();
        print("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt();
        print("Write how many grams of coffee beans do you want to add: ")
        coffeeBeans += scanner.nextInt();
        print("Write how many disposable cups of coffee do you want to add: ")
        disposableCups += scanner.nextInt();
    }
    private fun take() {
        println("I gave you \$$money")
        money = 0
    }
    fun whatWouldYouLike() {
        print("Write action (buy, fill, take): ")
        when(scanner.next()) {
            "buy" -> wantBuy(buy())
            "fill" -> fill()
            "take" -> take()
        }
    }

}

fun main() {
    val coffeeMachine = CoffeeMachine();
    coffeeMachine.printStatus()
    coffeeMachine.whatWouldYouLike()
    coffeeMachine.printStatus()
}*/

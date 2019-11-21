package machine

import java.util.Scanner

class CoffeeMachine(
    private var water: Int = 400,
    var milk: Int = 540,
    var coffeeBeans: Int = 120,
    var disposableCups: Int = 9,
    var money: Int = 550)
{
    private val scanner = Scanner(System.`in`)
    private fun printStatus(): Int {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffeeBeans of coffee beans")
        println("$disposableCups of disposable cups")
        println("$$money of money")
        println()
        return 1;
    }
    private fun buy(): String {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        return scanner.next()
    }
    private fun wantBuy(n: String): Int {
        var could = disposableCups - 1 >= 0
        var resource = ""
        when(n) {
            "1" -> {
                resource = when {
                    water - 250 < 0 -> "water"
                    coffeeBeans - 16 < 0 -> "coffee beans"
                    disposableCups - 1 < 0 -> "disposable cups"
                    else -> ""
                }
                could = could && (water - 250 >= 0) && (coffeeBeans - 16 >= 0)
                if (could) {
                    water -= 250
                    coffeeBeans -= 16
                    money += 4
                }
            }
            "2" -> {
                resource = when {
                    water - 350 < 0 -> "water"
                    milk - 75 < 0 -> "milk"
                    coffeeBeans - 20 < 0 -> "coffee beans"
                    disposableCups - 1 < 0 -> "disposable cups"
                    else -> ""
                }
                could = could && (water - 350 >= 0) && (coffeeBeans - 20 >= 0) && (milk - 75 >= 0)
                if (could) {
                    water -= 350
                    coffeeBeans -= 20
                    money += 7
                    milk -= 75
                }
            }
            "3" -> {
                resource = when {
                    water - 200 < 0 -> "water"
                    milk - 100 < 0 -> "milk"
                    coffeeBeans - 12 < 0 -> "coffee beans"
                    disposableCups - 1 < 0 -> "disposable cups"
                    else -> ""
                }
                could = could && (water - 200 >= 0) && (coffeeBeans - 12 >= 0) && (milk - 100 >= 0)
                if (could) {
                    water -= 200
                    coffeeBeans -= 12
                    money += 6
                    milk -= 100
                }
            }
            "back" -> return whatWouldYouLike()
        }
        if (could) disposableCups -= 1
        println(if (could) "I have enough resources, making you a coffee!" else "Sorry, not enough $resource!")
        println()
        return 1;
    }
    private fun fill(): Int {
        print("Write how many ml of water do you want to add: ")
        water += scanner.nextInt();
        print("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt();
        print("Write how many grams of coffee beans do you want to add: ")
        coffeeBeans += scanner.nextInt();
        print("Write how many disposable cups of coffee do you want to add: ")
        disposableCups += scanner.nextInt();
        println()
        return 1;
    }
    private fun take(): Int {
        println("I gave you \$$money")
        println()
        money = 0
        return 1;
    }
    fun whatWouldYouLike(): Int {
        print("Write action (buy, fill, take, remaining, exit): ")
        val action = scanner.next()
        if (action != "exit") println()
        return when(action) {
            "buy" -> wantBuy(buy())
            "fill" -> fill()
            "take" -> take()
            "remaining" -> printStatus()
            else -> -1
        }
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine();
    while (coffeeMachine.whatWouldYouLike() != -1);
}
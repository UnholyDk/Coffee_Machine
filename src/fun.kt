import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    val now = scanner.nextInt()
    while(now != 0) {
        sum += now
        scanner.nextInt()
    }
    println(sum)
}

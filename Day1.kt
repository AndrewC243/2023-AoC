import java.io.File

fun main() {
    val input = File("Day1.dat").readLines()
    var sum = 0
    for (line in input) {
        val digitString = line.filter { it.isDigit() }

        // I mistakenly assumed that one-digit numbers would remain as one digit before checking the examples

//        if (digitString.length == 1) {
//            sum += digitString.toInt()
//            println("Adding ${digitString.toInt()}")
//            continue
//        }

        // Since the first number is always in the 10s place and the second digit is in the ones place we can boil it
        // down to a simple expression
        sum += digitString.first().digitToInt() * 10 + digitString.last().digitToInt()
    }
    print(sum)
}
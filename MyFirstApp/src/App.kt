fun main() {
    var x = 1
    println("Before the loop. x = $x")
    while (x < 4) {
        println("In the loop. x = $x")
        x = x + 1
    }
    println("After the loop. x = $x")

    if (x < 4) {
        println("x is smaller than 4")
    } else {
        println("x is equal or bigger than 4")
    }
}
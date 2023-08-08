fun main(args: Array<String>) {
    var age = 18
    if (age < 18) {
        println("FALSE")
    } else {
        println("TRUE")
    }

    var x = 10
    var y = 20

    if (x > y || y > 50) {

        println("FALSE")
    } else {
        println("TRUE")

    }

    var marks = 100
    if (marks <= 40) {
        println("E")
    } else if (marks <= 50) {
        println("D")
    } else if (marks <= 60) {
        println("C")
    } else if (marks <= 70) {
        println("B")
    } else {
        println("A")
    }

    var bettingNumber = 0
    when (bettingNumber) {

        1 -> {
            println("You won a car")
        }

        2 -> {
            println("You won a horse")
        }

        3 -> {
            println("You won 3M")
        }

        4 -> {
            println("You lost")
        }

        else -> {
            println("Enter a number between 1-4 to bet")


        }
    }
}




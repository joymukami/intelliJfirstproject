fun main(args: Array<String>) {
    var marks =100

    var grade = if (marks <= 40) {
        "E"
    } else if (marks <= 50) {
        "D"
    } else if (marks <= 60) {
         "C"
    } else if (marks <= 70) {
         "B"
    } else {
         "A"
    }
    println(grade)

    var bettingNumber = 0
    when (bettingNumber) {

        1 -> {
            "You won a car"
        }

        2 -> {
            "You won a horse"
        }

        3 -> {
            "You won 3M"
        }

        4 -> {
            "You lost"
        }

        else -> {
            "Enter a number between 1-4 to bet"
        }
    }
    println(bettingNumber)
}
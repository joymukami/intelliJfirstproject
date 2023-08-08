fun main(args: Array<String>) {
    //While loop
    var counterOne = 0
    while (counterOne <= 5) {
        println(counterOne)
        counterOne++
    }
    //Do while loop

    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    } while (counterTwo <= 15)

    //For loop
    for (i in 20..25) {
        println(i)
    }
    for (j in 50 downTo 45) {
        println(j)
    }
    var names = arrayListOf("Eugene", "Ray", "Moses")

    //For each loop
    names.forEach {
     println(it)

    }
    //Repeat loop
    repeat(2){
       println("Hello there")

    }


}
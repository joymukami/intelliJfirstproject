fun main(args: Array<String>) {
    avg(10, 30.2)
    avg(10, 50.4, 50f)

}
fun avg(x:Int, y:Double){
    var answer = (x + y) / 2.0
    println("Average from avg1 is $answer")

}
fun avg(x:Int, y:Double, z:Float){
    var answer = (x + y + z) / 3.0
    println("Average from avg2 is $answer")
}
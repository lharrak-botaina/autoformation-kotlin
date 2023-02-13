package functions

fun main(){
    temp()
    // val isUnit = println("This is an expression")
    //println(isUnit)// The second println() prints the value of the first println() statement, that is, kotlin.Unit
}
fun temp(){
    val temperature =-1
    val isCold=if(temperature<10)"it's cold" else "it's warm"
    println(isCold)
}
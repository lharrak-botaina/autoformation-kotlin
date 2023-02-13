package functions

import java.util.*

fun main(){
    feedTheFish()
}
fun feedTheFish() {
    val day = randomDay()
   println(day)
}

fun randomDay():String {
    val week= arrayOf("Monday","tuesday","wednesday","thursday","friday","saturday","sunday")
    return week[Random().nextInt(week.size)]

}
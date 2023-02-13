package autoformation

fun main(){
var willExercice=false
    val bigNumber=1_000_000
    val smallNumber=2
    println("is big bigger=${bigNumber>smallNumber} ")
    if(firstOperand()|| secondOperand()){
        println("at least one operend is true ")
    }
    if(firstOperand()&& secondOperand()){
        println("both operend are true ")
    }
    println("will Exercice=${!willExercice}")
}
fun firstOperand():Boolean{
    println("firstOprend")
    return false
}
fun secondOperand():Boolean{
    println("secondOprend")
    return true;
}
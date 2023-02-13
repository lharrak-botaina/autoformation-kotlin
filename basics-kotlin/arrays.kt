fun main(){
list()
    changeList()
    array()
}

// list
fun list(){
    val school= listOf("botaina","adnane","nada")
    println(school)


}
// list that can be changed
fun changeList(){
    val myList = mutableListOf("tuna", "salmon", "shark")
    println("$myList")
    myList.remove("shark")
    println("$myList")

}
fun array(){
    val school = arrayListOf("shark", "salmon", "minnow")
    println(school)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
   
    val foo2 = numbers3 + numbers
    println(foo2[5])

}
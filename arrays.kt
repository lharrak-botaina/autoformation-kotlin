fun main(){
list()
    changeList()
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
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
}
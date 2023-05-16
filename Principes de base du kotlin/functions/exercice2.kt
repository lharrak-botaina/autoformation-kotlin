package functions

val products= mutableListOf("product 1","product 2")
fun main(){

    menu()
    val user = readln()
    when(user){
        "1"->{
            display()
        }
        "2"->{
            add()
            display()
        }
        "3"->{
            delete()
            display()
        }
    }
   /* if (user=="1"){
        display()
    }
    if (user=="2"){
       add()
        display()

    }
    if (user=="3"){
       delete()
        display()
    }
   */
}
fun display(){
for (element in products){
    println("-$element")
}

}
fun add(){
    println("enter un produits :")
    var add_item=readln().toString()

   products.add(add_item)

}
fun delete(){
    println("supprimer un produit")
    var deletedItem= readln().toString()

    products.remove(deletedItem)
}
fun menu(){
    val menu= listOf("1-afficher","2-ajouter","3-supprimer")
    println("entrer le nombre de fonction que vous voulez:$menu")


}
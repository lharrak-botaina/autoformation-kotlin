package autoformation.classes

interface IGestion {
    fun Ajouter()
    fun Supprimer()
    fun Afficher()
}

class GestionProduits():IGestion{

    val produits = mutableListOf<String>()
    override fun Afficher() {
        println("list des produits")
        println(produits)
    }

    override fun Ajouter() {
        println("ajouter un produit")
        var valueProduct:String= readln()!!.toString()
        produits.add(valueProduct)
    }

    override fun Supprimer() {
        println("supprimer un produit")
        var suppProduits:String= readln()!!.toString()
        produits.remove(suppProduits)
    }
}

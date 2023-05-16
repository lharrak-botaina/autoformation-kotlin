import autoformation.classes.GestionProduits
import functions.products

fun main (){
    while (true){
        println("1-afficher")
        println("2-ajouter")
        println("3-supprimer")
        println("nombre menu")
        var Menu:Int= readln().toInt()
        var produits =GestionProduits()
        when(Menu){
            1->{

                produits.Afficher()

            }
            2->{

                produits.Ajouter()
                produits.Afficher()
            }
            3->{

                produits.Supprimer()
                produits.Afficher()
            }
        }

    }
}
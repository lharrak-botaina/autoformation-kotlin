fun main(){
    // By default, variables cannot be null.
    //var rocks: Int = null
    //var marbles: Int? = null
    var age = 24
    if (age != null) {
        age = age.dec()
    }

    // writing it in kotlin way
    age?.dec()
        println("not null")


}
fun main(){

    val myFavouriteNumber = 13L

    // Solución 1
    println("Mi número favorito es $myFavouriteNumber")

    println("Sin embargo, ${myFavouriteNumber.toDouble()}...")
    println("ya no me gusta")

    // Solución 2
    print("Mi número favorito es ")
    println(myFavouriteNumber)

    print("Sin embargo,")
    print(myFavouriteNumber.toDouble())
    println("...")
    println("ya no me gusta")

    // Hay otras muchas combinacionaciones válidas. Sin embargo aquí se puede ver cómo unas son más optimas que otras.

    // También existe el caracter especial \n, que representa el salto de línea. Usándolo podríamos terminar el ejercicio en una sola línea
    println("Mi número favorito es $myFavouriteNumber\nSin embargo, ${myFavouriteNumber.toDouble()}...\nya no me gusta")

}
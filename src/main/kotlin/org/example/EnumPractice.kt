package org.example

data class Player1(var name:String="",
                  var country: PlayerCountry=PlayerCountry.India)
{


}
enum class PlayerCountry{
    India,
    Australia,
    England,
    Newzealand

}
fun main(){
val Pl1=Player1("Virat Kohli",PlayerCountry.England)
    println(Pl1);

}
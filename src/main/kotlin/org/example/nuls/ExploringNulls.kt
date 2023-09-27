package org.example.nuls
data class Movie(
        val id:Int?,
        val moviename:String
)
fun main(){
    var name:String? = null
    println("${name?.length}")//Safe call
    println("${name?.length?:0}")//Safe call && Elvis
    name = "Virat"
    println("$name")
    val movie=(saveMovie(null,"Inception"))
    println(movie.id!!)// non-null assertion pointing throws NullPointerException
    println(saveMovie(12,"Avengers Endgame"))

}
fun saveMovie(id: Int?,moviename: String):Movie{
    val movie =Movie(id,moviename)
    return movie
//    val movie2 =Movie(12,"Avengers Endgame")
}
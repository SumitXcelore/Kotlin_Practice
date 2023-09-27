package org.example

//object keyword used to make a class singleton
object Authenticate {
   fun authenticate(name:String, id:Int){
        println("My name is $name and my id is $id")
    }
}
class Cricket{
    companion object {fun batter(shot:String){
        println("My favrt shot is $shot")
    }}
}
fun main(){
    Authenticate.authenticate("Sumit",1812)// no need to create an object already an object created when marked object
   println( Cricket.batter("Cover Drive"))
}
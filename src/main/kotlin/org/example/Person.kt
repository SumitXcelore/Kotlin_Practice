package org.example
//example for primary constructor
class Person(var name:String="",var age:Int=0){

    fun hello(){
        println("I am that person")
    }


}
//example for secondary constructor
class Player(){
    var name:String=""
    var sport:String=""
            constructor(_name: String,_sport:String):this(){
                name=_name
                sport=_sport
            }
}
fun main(){
    //primary
    var p=Person()
    p.hello()
    p.name="Aman"
    println("My name is ${p.name} and I am ${p.age} year old")
    //Secondary
    val pl=Player("Virat Kohli","Cricket")
    pl.name="Rohit"
    println("My name is ${pl.name} and I play ${pl.sport}")
}


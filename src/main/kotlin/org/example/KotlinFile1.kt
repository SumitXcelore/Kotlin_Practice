package org.example

fun main(){
    var name:String
    name="Sumit Pandey"
    println("My name is:$name")


    var rank:Int =1
    val result= if(rank==2){
        "Winner"
    } else {
        "Loser"
    }
    println(result)


    var rankwhen=5
    val medal=when(rankwhen){
        1->"Gold"
        2->"Silver"
        3->"Bronze"
        else->"No medal"
    }
    println("Medal:$medal")
}
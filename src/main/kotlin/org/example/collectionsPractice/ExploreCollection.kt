package org.example.collectionsPractice

fun main(){
    val names=listOf("Ram","Shyam","Sita")
    println(names)
    val names1= mutableListOf("Virat","Rohit","Dhoni")
    names1.add("Sachin")
    println(names1)
    val names2 = mapOf(1 to 2, 2 to 4)
    println(names2)
    val names3 = mutableMapOf(1 to 2,2 to 4)
    names3.put(3,6)
    println(names3)
    names3.remove(3)
    println(names3)

}
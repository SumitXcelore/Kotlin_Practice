package org.example.collectionsPractice

fun main(){
    val list: MutableList<String?> = mutableListOf("Ram","Sita",null)
    list.add("Laxman")
    list.forEach { it-> println("$it->${it?.length}") }

    collection_nullability()
}

fun collection_nullability(){
var li:MutableList<String>? = null
   li= mutableListOf()
li.add("Ram")
    li.forEach { it-> println(it.length) }
}


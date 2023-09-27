package org.example.collectionsPractice

fun main(){
    val list= listOf(listOf(1,2,3), listOf(4,5,6))

    val result=list.map { outerList->outerList.map { it.toDouble() } }

    val result1=list.flatMap { outerList->outerList.map { it.toDouble() } }

    println(result)
    println(result1)
}
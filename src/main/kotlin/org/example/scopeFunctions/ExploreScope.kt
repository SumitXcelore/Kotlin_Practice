package org.example.scopeFunctions

import org.example.Player
import org.example.Player1
import org.example.PlayerCountry


fun main() {

    exploreApply()
    exploreAlso()
    exploreLet()
    exploreWith()
    exploreRun()
}

fun exploreRun() {

    var numbers : MutableList<Int>? = null
    val result = numbers.run {

        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run Result is : $result")

}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers){
        println("Size is ${numbers.size}")
        val list = numbers.plus(6)
        list.sum()
    }

    println("With Result is : $result")

}

fun exploreLet() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println(result)

    var name: String? = null
    name = "Virat Kohli"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result1)

}

fun exploreApply() {

    val courseCategory = ""

    val player1=Player1(
        "ABD"
    )
        .apply {
           country=PlayerCountry.Australia
        }

    println("player1 : $player1")
}

fun exploreAlso() {

    val playerCountry = ""

    val player1=Player1(

        "Joe Root",
    )
        .also {

           it.country = PlayerCountry.England
            println("Object is ready : $it")
        }

    println("player1 $player1")
}
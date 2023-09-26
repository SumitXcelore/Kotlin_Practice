package org.example

fun main() {
//    val range = 1..10
//    for (i in range) {
//        println(i)
//    }
//
//    val rangerev = 10 downTo 1
//    for (i in rangerev) {
//        println(i)
//    }
//
//    val rangeskip = 1..10
//    for (i in rangeskip step 2) {
//        println(i)
//    }

    for (i in 1..5){
        for (j in 1..5){
            println(i+j)
            if(j==3){
                break;
            }
        }
        println("inner loop ended")
        //println("i is:"+i)


    }
}
package org.example


// data keyword ads many properties such as for equalityCheck , toString, copy etc
data class Employee(val id:Int=0,var name:String="") {

}
fun main(){
    val e1= Employee(18,"Virat Kohli")
    println(e1)

    val e2= Employee(45,"Rohit Sharma")

    println(e1==e2)



    val e3=e1.copy(10,"Sachin Tendulkar")
    println(e3)


}
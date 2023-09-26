package org.example

open class User(val name:String){
 open fun login(){
    println("Logging In")
}
   open var isloggedIn:Boolean=true;
}
class Student(name: String):User(name)
{
    override var isloggedIn:Boolean=false;
override fun login(){
println("Login as student ")
}
}
class Professor(name: String):User(name){

    override fun login(){
        super.login()
        println("Login as professor ")
    }
}
fun main(){
    var s=Student("Sumit")
    var p=Professor("Virat")
    s.login()
    p.login()
    println(s.isloggedIn)
}
package org.example

import java.time.LocalDate


fun details(name:String="enter_name",age:Int=0,dob:LocalDate= LocalDate.now()):String{
    var multiline2 = """
        My name is:$name
        My age is:$age
        My dob is:$dob
        
    """.trimIndent()
    return multiline2

}
//fun main(){
//    println(details(age=22,dob=LocalDate.parse(("2001-10-10"))))
//}
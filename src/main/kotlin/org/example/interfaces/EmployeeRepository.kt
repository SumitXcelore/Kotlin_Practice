package org.example.interfaces

import org.example.Employee

interface EmployeeRepository {


    fun getById(i: Int): Employee
}
class ImplementingEmployeeRepo : EmployeeRepository{
    override fun getById(i: Int): Employee {
        return Employee(i,"Sachin")
    }

}
fun main(){
    val abc=ImplementingEmployeeRepo()
    println(abc.getById(10)) 
}
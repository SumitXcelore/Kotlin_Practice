package org.example.interfaces

interface A {
    fun doSomething(){
        println("I am from interface A")
    }
    fun doSomething2()
}
interface B{
    fun doSomething(){
        println("I am from interface B")
    }
}
class AB : A{
    override fun doSomething2() {
        println("I am second from interface A")
    }

}
class BA:A,B{
    override fun doSomething() {
        super <A>.doSomething()
        super<B>.doSomething()
    }

    override fun doSomething2() {
        println("I am second from interface A")
    }


}
fun main(){
    val ab=AB()
    ab.doSomething()
    ab.doSomething2()
    val ba=BA()
    ba.doSomething()
    ba.doSomething2()
}

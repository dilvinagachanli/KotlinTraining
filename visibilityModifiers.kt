package com.example.myapplication.KotlinTraining

//episode 78 - visibility modifiers - public - private- internal- protected
class visibilityModifiers {


    //if a member of a class is not specified then it is public by default

    //private modifier allows the element to be accessible only within the block in which properties fields etc. are declared

    //private declaration does not allow access outside the scope
    //private package can be accessible within that specific file


}
private class example{
    private val x= 1
    private fun doSomething(){
        //val x and fun doSomething are private. Example class is accessible from the same source file
        //val x and function are accessible within Example class.
    }
}


internal class Example{
    internal val x = 5
    internal fun getValue(){

    }  //internal modifier makes the field visible only inside the module in which it is implemented
    internal val y = 10
}

//because all Kotlin classes are final by default, to use inheritance we need to use "Open" keyword.
//protected: allows visibility to its class or subclass
//protected modifier cannot be declared at top level which means packages cannot be protected

open class Base {
    protected val i = 0 //we can use i but cannot override it
}
class Derived1: Base(){
    fun getValue(): Int{
        return i
    }
}

open class Base2 {
    protected open val b= 5 //because we used "protected open", we can use and override it this time
}
class Another: Base2(){
    fun getValue(): Int{
        return b
    }
    override val b = 10
}

///////////////////////////////////////////////////

open class ABC(){
    var a = 1 //public default
    private var b =2 //private to the ABC class
    protected open val c = 3 //visible to the ABC and Derived class
    internal val d = 4 //visible inside the same module eg. same file
    protected fun e() {}// visible to the ABC and Derived class
}

class Derived: ABC(){
    //a, c, d and e() of the ABC class are visible
    //b is not visible because it is private
    override val c = 8 //because c is protected we can override it

}
fun main (args: Array<String>){
    val abc = ABC()
    //abc.a and abc.d are visible
    //abc.b, abc.c and abc.e() are not visible
    //c is and e() are not visible because they are visible in the same class that they are declared or
    //derived (inherited) class if any
    val derived = Derived()
    //derived.c not visible
}

package com.example.myapplication.KotlinTraining


//lesson 79
class nestedInnerClass {
    //nested class: class which is created inside another class
    //by default static, members/member functions can be accessed without creating an object
    //outer class can access nested class members but not other way around
}

class OuterClass{
    private var name: String= "Mr X"
    class NestedClass{
        var description: String = "code inside nested"
        private var id: Int = 100
        fun foo (){
            //print ("name is $name") cannot access because name is a outer class member

            println("Id is $id")

        }
    }
    inner class InnerClass{
        var description2: String = "code inside inner class"
        private var id: Int = 100
        fun foo(){
            println("name is $name") //this time we can get name even when it is private because we use inner class
            println("id is $id")

        }
    }

}
fun main(args: Array<String>){
    println(OuterClass.NestedClass().description) //accessing property

    var obj = OuterClass.NestedClass() //object creation
    obj.foo() //access member function

}


//inner class: is a class which created inside another class with keyword "inner"
//inner class cannot be declared inside interfaces or non-inner nested classes
//the advantage of inner class over nested class is: it is able to access members of its outer class even it is private
//so, with nested class we can access nested class from outer class but not other way around, we can do other way around with inner keyword




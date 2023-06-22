package com.example.myapplication.KotlinTraining

//lesson 80
class Cast {

    //unsafe cast operator: as
    //when we have something in a specific type and want to cast it in another type
    //sometimes it is not possible to cast a variable and it throws an exception, this is called "unsafe cast"
    //unsafe cast is performed by infix "as"

}

fun main(args: Array<String>){
    val obj: Any? = null
    val str: String = obj as String
    println(str)   //this will throw an exception because:
    //we cannot cast a nullable string (String?) to non nullable string (String)
}
val obj: Any = 123
val str: String = obj as String //this will throw ClassCastException because:
//obj value is Any and it is an integer. we can't cast a string to a integer

val obj1: Any? = null
val str2: String? = obj1 as String? //works


       //safe cast operator: as?
//if casting is not possible, "as?" will return a null instead of throwing an ClassCastException exception
//this way it will not crash, it will return a null instead

val location: Any = "Kotlin"
val safeString: String? = location as? String
val safeInt: Int? = location as? Int
println(safeString)
println(safeInt)

//these will print Kotlin and null. location is a String so location as? Int will throw an exception
//because we used as? instead of as, it will just print null
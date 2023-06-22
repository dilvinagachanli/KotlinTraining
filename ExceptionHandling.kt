package com.example.myapplication.KotlinTraining

class ExceptionHandling{
    //keywords used in exception handling:

    //try: contains set of statements which might generate an exception it must be followed by either catch or finally or both.
    //catch: used to catch the exception thrown by try block.
    //finally: always execute whether exception handled or not.
    //throw: used o throw an exception explicitly


}
fun main(){
    val str = getNumber("10.5")

    println(str)


}fun getNumber(str: String): Int{
    return try{
        Integer.parseInt(str)

    }
    catch (e: ArithmeticException){
        0
    }//output will be 0

    //we can use multiple catch blocks
    //also we can do nested try blocks


}
fun main(args: Array<String>){
    validate(15)
    println()
}
fun validate(age: Int){
    if (age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")  //Output: Exception in thread "main" java.lang. ArithmeticException: under age

}

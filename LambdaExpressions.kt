package com.example.myapplication.KotlinTraining

class LambdaExpressions {

    //lesson 77


    //they allow us to write concise and short codes

    //is a function which has no name but it is not same as an anonymous function
    //lambda expressions and anonymous functions are "function literals". functions that are not declared but passed immediately as an expression
    //lambda is defined with curly breaches which takes variables as a parameter if any and a body of a function
    //body of a function is written after the variable followed by -> operator ie. lambda operator



    fun addNumber(a: Int, b: Int){
        val add= a+b
        println(add)



        val sum = {x: Int, y: Int -> println(x+y) } //same with the upperfunction
        sum(4,6)
    }


}
fun main(){
    val numbers = LambdaExpressions()
    numbers.addNumber(5,7)

}
package com.example.myapplication.KotlinTraining

class SetsandMaps {

    //lesson 73

    fun run(){
        val fruits = setOf("Orange", "Apple", "Grape", "Apple")
        //sets = type of collection that eliminates duplicate data.
        // elements are not sorted.
        print(fruits.size) //print will be 3 because Apple is written 2 times.

        print(fruits)
        print(fruits.toSortedSet()) //sorting alphabetically

        val newFruits = fruits.toMutableList() //making it mutable list
        newFruits.add("Watermelon")
        newFruits.add("Pear")
        print(newFruits)
        print(newFruits.elementAt(4)) //getting specific index element


        //map: type of collection that holds data in the form of a key value-pair
        //only one value for each key!

        val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
        //maps can be called "hashmap" or "dictionary" in other languages.
        //there can be other type of data for values

        print(daysOfWeek[2]) //getting key value NOT the index.

        for (key in daysOfWeek.keys)
            print("\n$key is to ${daysOfWeek[key]}")


        val fruitsMap = mapOf("Fav" to Fruit("Grape", 3.5), "Alright" to Fruit("Apple", 1.5))
        //values and keys can be everything. for the fruitMap, the key is string while prices are doubles.

        val newDaysOfWeek = daysOfWeek.toMutableMap()
        newDaysOfWeek[4] = "Thursday"
        newDaysOfWeek[5] = "Friday"


        print(newDaysOfWeek.toSortedMap())
    }data class Fruit (val name: String, val price:Double){

    }

}fun main(){
    val setsandMaps = SetsandMaps()
    setsandMaps.run()
}
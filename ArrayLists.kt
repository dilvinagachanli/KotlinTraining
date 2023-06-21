package com.example.myapplication.KotlinTraining

class ArrayLists {

    //lesson 74

    //arraylist: dynamic array which means size of it can be decreased or increased.
    //provides both read and write functionalities.
    //follows the sequence of insertion order.
    //non synchronized so it may contain duplicate elements (eg there can be more than one of one entry.)


    //important stuff about array list::::

    //ArrayList<E>(): create an empty arraylist
    //ArrayList(capacity: Int): create an ArrayList of specified capacity.
    //ArrayList(elements: Collection<E>): create an arraylist filled with elements of a collection

    //open fun add(element: E): Boolean = add the specific element into the collection.
    //open fun clear() = remove all elements from the collection
    //open fun get(index: Int): E = return the element at specified index in the list.
    //open fun remove(element: E): Boolean = remove a single instance of the specific element from collection




    fun run(){

        val arrayList = ArrayList<String>()
        arrayList.add("One")
        arrayList.add("Two")
        println("print the ArrayList")
        for (element in arrayList){
            println(element)
        }
    }
    fun arraylistCollections(){
        val arrayList: ArrayList<String> = ArrayList<String>(5) //limiting the amount of values that can be added
        val list: MutableList<String> = mutableListOf<String>() //creating a mutable list so we can expand it


        list.add("One")
        list.add("Two")

        arrayList.addAll(list)
        println(list)



    }
    fun filledElements(){
        val arrayList: ArrayList<String> = ArrayList<String>(5)
        val list: MutableList<String> = mutableListOf<String>()


        list.add("One")
        list.add("Two")

        arrayList.addAll(list)

        val itr = arrayList.iterator() //traversing the list

        while(itr.hasNext()){ //going through whole array if there is next element then print
            println(itr.next())
        }
        println("size of arrayList = "+arrayList.size) //getting the size of the list

        for (element in arrayList){ //printing all elemenents in the ArrayList
            println(element)

        }
        println(arrayList.get(1)) //getting "Two", in the 2nd index there is "Two"

    }

}
fun main(){
    val arrayL = ArrayLists()
    arrayL.run()
    arrayL.arraylistCollections()
    arrayL.filledElements()
}

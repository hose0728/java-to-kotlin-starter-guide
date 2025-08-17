package com.lannstark.lec03

fun main(){
    printAgeIfPerson(Person("hose",33))
}

fun printAgeIfPerson(obj: Any?){
    if(obj is Person){
        val person =  obj as? Person
        println(person?.age)
    }
}
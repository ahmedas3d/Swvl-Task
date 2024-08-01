package com.example.firstproject.kotlin

import java.util.Arrays

class MyApp {
}

fun main(){

    fun printInfo(name:String? = "ahmed",age:Int?){
        println("hello $name my age $age")
    }
    printInfo("ahmed",22)

    val mylambafun = {
        myValue:Int -> myValue*10
    }
    println(mylambafun(6))















//    val days = arrayOf("sat, sun, mon")
//    println(Arrays.toString(days))

//    val myList = mutableListOf("Ahmed , Asaad , Elsayed")
//    println(myList)
//    myList.add("Asaad")
//    println(myList)

//    repeat(2){
//        println("Ahmed")
//    }

//    for (i in 0 .. 1) {ة
//        if (i<4){
//            println("Yes")
//        }else{
//            println("No")
//        }
//    }

//    var x = 20
//    var y = 15
//    if (x<y){
//        println("x<y")
//    }else{
//        println("x>y")
//    }
//    val name = "ahmed"
//    val scoundName = "asaad"
//    println(name.length+scoundName.length)
//    println("Ahmed Asaad")

//    var x = 15
//    var y = 20
//
//    println("Sum of $x + $y = ${x+y}")

//    val i : Int = 6
//    val b : Byte = i.toByte() //casting
//
//    val x : Int = 15
//    val y : Double = x.toDouble()
//
//
//    val oneMillion = 1_000_000
//    println(oneMillion)
//    println(oneMillion*2)
//
//    println("""
//        Ahmed Asaad Elsayed
//""".trimIndent())
}
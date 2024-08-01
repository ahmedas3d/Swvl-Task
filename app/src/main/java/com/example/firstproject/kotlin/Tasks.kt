package com.example.firstproject.kotlin

import java.util.Arrays

class Tasks {
}

fun main(){
    // =======Task 1=======
    println("=======Task_1=======")
    val number = arrayOf(1,2,3,4,5)
    println(Arrays.toString(number))

    // =======Task 2=======
    println("=======Task_2=======")
    val name = mutableListOf("Ahmed","Asaad","Elasyed")
    name.remove("Ahmed")
    println(name)

    // =======Task 3=======
    println("=======Task_3=======")
    val letters = "abcde"
    println(letters.length)

    // =======Task 4=======
    println("=======Task_4=======")
    fun sortStringsAlphabetically(strings: Array<String>): Array<String> {
        return strings.sortedArray()
    }
        val array = arrayOf("banana", "apple", "kiwi", "cherry")
        val sortedArray = sortStringsAlphabetically(array)
        println(sortedArray.joinToString(", "))  // Output: apple, banana, cherry, kiwi

    // =======Task 5=======
    println("=======Task_5=======")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers) {
        println(i)
    }

    //=======Task_7======
    println("=========Task_7======")
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = nums.filter { it % 2 == 0 }
    println("Even numbers:")

    for (i in evenNumbers) {
        println(i)
    }

    // =======Task 9=======
    println("=======Task_9=======")
    fun toUppercaseList(strings: List<String>): List<String> {
        return strings.map { it.uppercase() }
    }
        val words = listOf("apple", "banana", "cherry")
        val uppercaseWords = toUppercaseList(words)
        println(uppercaseWords)

    // =======Task 10=======
    println("=======Task_10=======")
    fun squareEvenNumbers(numbers: List<Int>): List<Int> {
        return numbers.filter { it % 2 == 0 }
            .map { it * it }
    }
        val num = listOf(1, 2, 3, 4, 5, 6)
        val squaredEvenNumbers = squareEvenNumbers(num)
        println(squaredEvenNumbers)

    // =======Task 12=======
    println("=======Task_12=======")
    fun reverseLongWords(words: List<String>): List<String> {
        return words.filter { it.length > 3 }
            .map { it.reversed() }
    }
        val word = listOf("cat", "dog", "elephant", "fox", "giraffe")
        val reversedLongWords = reverseLongWords(word)
        println(reversedLongWords)


    // =======Task 11=======
    println("=======Task_11=======")
    data class Person(val name: String, val age: Int)
    fun namesOfPeopleOlderThan25(people: List<Person>): List<String> {
        return people.filter { it.age > 25 }
            .map { it.name }
    }
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 22),
        Person("Charlie", 28),
        Person("David", 24)
    )
    val names = namesOfPeopleOlderThan25(people)
    println(names)

    // =======Task 13=======
    println("=======Task_13=======")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // =======Task 14=======
    println("=======Task_14=======")
    fun messageBasedOnValue(value: Int): String {
        return when {
            value < 0 -> "The number is negative"
            value == 0 -> "The number is zero"
            value > 0 && value <= 10 -> "The number is between 1 and 10"
            value > 10 -> "The number is greater than 10"
            else -> "Unexpected value"
        }
    }
        println(messageBasedOnValue(-3))  // Output: The number is negative
        println(messageBasedOnValue(0))   // Output: The number is zero
        println(messageBasedOnValue(8))   // Output: The number is between 1 and 10
        println(messageBasedOnValue(18))  // Output: The number is greater than 10


    // =======Task 15=======
    println("=======Task_15=======")
    fun numbers(x: Int, y: Int): Int {
        return if (x > y) {
            x
        } else {
            y
        }
    }
        val x = 10
        val y = 5

        val greaterNumber = numbers(x, y)
        println("The greater number is: $greaterNumber")

    // =======Task 16=======
    println("=======Task_16=======")
    fun printCharacter(str: String) {
        for (i in str) {
            println(i)
        }
    }
    printCharacter("Ahmed")
}
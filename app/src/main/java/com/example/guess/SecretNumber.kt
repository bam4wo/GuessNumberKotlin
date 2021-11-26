package com.example.guess

import kotlin.random.Random

class SecretNumber {
    val secret : Int = Random.nextInt(50) + 1
    var count = 0

    fun vaildate (number : Int) : Int {
        count++
        return number - secret
    }
}

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.vaildate(2)} count: ${secretNumber.count}")
}
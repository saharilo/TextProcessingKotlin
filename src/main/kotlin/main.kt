package ru.netology

fun main () {
    val likes: Int = 5;
    val result = if (likes == 1) "человеку" else "людям"
    println("понравилось $likes $result.")
}
package com.example.demo

import java.util.*
import kotlin.random.Random

fun Random.nextString(): String {
    return UUID.randomUUID().toString()
}

fun Random.nextRecipe(): Recipe {
    return Recipe(
        name = Random.nextString()
    )
}
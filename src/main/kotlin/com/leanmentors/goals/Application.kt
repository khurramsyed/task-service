package com.leanmentors.goals

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("com.leanmentors.goals")
            .start()
}


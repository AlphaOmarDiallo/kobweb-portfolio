package com.alphaomardiallo.portofolio

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val name: String,
    val age: Int
)

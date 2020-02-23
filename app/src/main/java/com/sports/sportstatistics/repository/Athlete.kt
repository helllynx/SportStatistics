package com.sports.sportstatistics.repository

data class Athlete(
    val name: String,
    val age: Int,
    val height: Double? = 0.0,
    val weight: Double? = 0.0,
    val sportType: String? = null
)

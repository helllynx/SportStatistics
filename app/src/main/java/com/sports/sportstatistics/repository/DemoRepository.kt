package com.sports.sportstatistics.repository

object DemoRepository {

    private val list = mutableListOf<Athlete>()

    fun addAthlete(athlete: Athlete): Boolean = list.add(athlete)
    fun getAthleteByName(name: String) = list.find { name == it.name }

    fun getAll(): List<Athlete> = list
}

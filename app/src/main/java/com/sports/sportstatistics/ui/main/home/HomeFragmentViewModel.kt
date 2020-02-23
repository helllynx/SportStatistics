package com.sports.sportstatistics.ui.main.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.sports.sportstatistics.repository.Athlete
import com.sports.sportstatistics.repository.DemoRepository

class HomeFragmentViewModel(application: Application) : AndroidViewModel(application) {

    fun addAthlete(name: String, age: Int?, sportType: String?, height: Double?, weight: Double?) =
        DemoRepository.addAthlete(Athlete(name, age ?: 0, height, weight, sportType))
}

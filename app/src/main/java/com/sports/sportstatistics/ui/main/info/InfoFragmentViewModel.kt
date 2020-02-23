package com.sports.sportstatistics.ui.main.info

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.sports.sportstatistics.repository.DemoRepository

class InfoFragmentViewModel(application: Application) : AndroidViewModel(application) {

    fun getAthlets() = DemoRepository.getAll()
}

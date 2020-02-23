package com.sports.sportstatistics.ui.main.info

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sports.sportstatistics.R

class InfoFragment : Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val viewModel by viewModels<InfoFragmentViewModel>()

        view.findViewById<TextView>(R.id.fi_info_tv).text = viewModel.getAthlets().toString()
    }
}

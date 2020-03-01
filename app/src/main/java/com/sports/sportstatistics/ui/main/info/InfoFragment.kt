package com.sports.sportstatistics.ui.main.info

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sports.sportstatistics.R
import kotlinx.coroutines.launch

class InfoFragment : Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val viewModel by viewModels<InfoFragmentViewModel>()

        viewLifecycleOwner.lifecycleScope.launch {
            val content = viewModel.getAthlets()
                .map { "${it.name} ${it.sportType} ${it.age} ${it.height} ${it.weight}\n" }
                .reduce { acc, s -> acc + s }
            view.findViewById<TextView>(R.id.fi_info_tv).text = content
        }
    }
}

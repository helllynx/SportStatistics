package com.sports.sportstatistics.ui.second.start

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sports.sportstatistics.R

class StartDestFragment : Fragment(R.layout.fragment_start_dest) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.fsd_go_to_end_button).setOnClickListener {
            findNavController().navigate(R.id.action_startDestFragment_to_endDestFragment)
        }
    }
}

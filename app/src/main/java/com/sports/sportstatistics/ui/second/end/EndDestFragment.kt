package com.sports.sportstatistics.ui.second.end

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sports.sportstatistics.R

class EndDestFragment : Fragment(R.layout.fragment_end_dest) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.fed_go_back_button).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}

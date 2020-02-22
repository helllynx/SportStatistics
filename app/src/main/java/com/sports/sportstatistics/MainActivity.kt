package com.sports.sportstatistics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navigation = findViewById<BottomNavigationView>(R.id.am_navigation)
        val navController = findNavController(R.id.am_nav_host_fragment)

        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
//                    navController.navigate(R.id.action_global_home)
                    true
                }
                R.id.menu_info -> {
//                    navController.navigate(R.id.action_global_transactions)
                    true
                }
                R.id.menu_settings -> {
//                    navController.navigate(R.id.action_global_settings)
                    true
                }
                else -> false
            }
        }
    }
}

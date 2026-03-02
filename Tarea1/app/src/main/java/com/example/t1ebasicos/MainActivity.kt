package com.example.t1ebasicos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        bottomNavigationView = findViewById(R.id.bottom_navigation)
//
//        // Cargar el fragment inicial (por ejemplo, TextFieldsFragment)
//        if (savedInstanceState == null) {
//            loadFragment(frag1())
//            bottomNavigationView.selectedItemId = R.id.navigation_textfields
//        }
//
//        bottomNavigationView.setOnItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.navigation_textfields -> {
//                    loadFragment(frag1())
//                    true
//                }
//                R.id.navigation_buttons -> {
//                    loadFragment(frag2())
//                    true
//                }
//                R.id.navigation_selection -> {
//                    loadFragment(frag2())
//                    true
//                }
//                R.id.navigation_lists -> {
//                    loadFragment(frag2())
//                    true
//                }
//                R.id.navigation_info -> {
//                    loadFragment(frag2())
//                    true
//                }
//                else -> false
//            }
//        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
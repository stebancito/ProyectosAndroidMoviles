package com.example.t1ebasicos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        if (savedInstanceState == null) {
            loadFragment(Bienvenida())
            bottomNavigationView.selectedItemId = R.id.home
        }

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    loadFragment(Bienvenida())
                    true
                }
                R.id.navigation_textfields -> {
                    loadFragment(frag1())
                    true
                }
                R.id.navigation_buttons -> {
                    loadFragment(frag2())
                    true
                }
                R.id.navigation_selection -> {
                    loadFragment(frag3())
                    true
                }
                R.id.navigation_lists -> {
                    loadFragment(frag4())
                    true
                }
                R.id.navigation_info -> {
                    loadFragment(frag5())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
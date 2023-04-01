package com.mastercoding.hackathonapp.ui.fragments

import android.os.Bundle
import com.mastercoding.hackathonapp.R

class HomeFragment : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_fragment)
        setupBottomNavigationView()

    }
}
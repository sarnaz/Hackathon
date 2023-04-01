package com.mastercoding.hackathonapp.ui.fragments

import android.os.Bundle
import com.mastercoding.hackathonapp.R

class RecommendationFragment : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recommendation_fragment)
        setupBottomNavigationView()

    }
}
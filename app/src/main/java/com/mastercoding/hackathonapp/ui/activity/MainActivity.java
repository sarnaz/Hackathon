package com.mastercoding.hackathonapp.ui.activity;

import android.os.Bundle;
import com.mastercoding.hackathonapp.R;
import com.mastercoding.hackathonapp.ui.navigation.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBottomNavigationView();

    }
}
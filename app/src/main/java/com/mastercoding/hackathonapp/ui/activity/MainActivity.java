package com.mastercoding.hackathonapp.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.mastercoding.hackathonapp.R;
import com.mastercoding.hackathonapp.ui.fragments.HomeFragment;
import com.mastercoding.hackathonapp.ui.fragments.RecommendationFragment;
import com.mastercoding.hackathonapp.ui.fragments.ScannerFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring the Views I'm adding functionality to - Resul
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_item_1:
                        // Handle button 1 click
                        startActivity(new Intent(MainActivity.this, HomeFragment.class));
                        return true;

                    case R.id.menu_item_2:
                        // Handle button 2 click
                        startActivity(new Intent(MainActivity.this, RecommendationFragment.class));
                        return true;

                        case R.id.menu_item_3:
                        // Handle button 3 click
                        startActivity(new Intent(MainActivity.this, ScannerFragment.class));
                        return true;

                        default:
                        return false;
                }
            }
        });


    }
}
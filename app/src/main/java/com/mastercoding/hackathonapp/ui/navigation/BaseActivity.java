package com.mastercoding.hackathonapp.ui.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mastercoding.hackathonapp.ui.fragments.HomeFragment;
import com.mastercoding.hackathonapp.ui.fragments.RecommendationFragment;
import com.mastercoding.hackathonapp.R;
import com.mastercoding.hackathonapp.ui.fragments.ScannerFragment;

public class BaseActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            Class <?> activityClass;

            switch (id) {
                case R.id.menu_item_1:
                    activityClass = HomeFragment.class;

                    break;
                case R.id.menu_item_2:
                    activityClass = RecommendationFragment.class;
                    break;
                case R.id.menu_item_3:
                    activityClass = ScannerFragment.class;
                    break;
                default:
                    return false;
            }

            startActivity(new Intent(this, activityClass));
            return true;
        });
    }
}

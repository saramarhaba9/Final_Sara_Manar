package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class driver_home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    driverHomeFragment driverHomeFragment=new driverHomeFragment();
    driverProfileFragment driverProfileFragment=new driverProfileFragment();
    driverNotificationsFragment driverNotificationsFragment=new driverNotificationsFragment();
    driverComplaintsFragment driverComplaintsFragment= new driverComplaintsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_home);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,driverHomeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profileFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,driverProfileFragment).commit();

                        return true;
                    case R.id.homeFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,driverHomeFragment).commit();
                        return true;

                    case R.id.logoutFragment:
                        View logoutFragment=  findViewById(R.id.logoutFragment);
                        logoutFragment.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(driver_home.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        return true;

                    case R.id.notificationsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,driverNotificationsFragment).commit();
                        return true;
                    case R.id.complaintsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,driverComplaintsFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }

}
package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class admin_home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    adminHomeFragment adminHomeFragment=new adminHomeFragment();
    adminProfileFragment adminProfileFragment=new adminProfileFragment();
    adminNotificationsFragment adminNotificationsFragment=new adminNotificationsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,adminHomeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.adminProfileFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,adminProfileFragment).commit();
                        return true;
                    case R.id.adminHomeFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,adminHomeFragment).commit();
                        return true;

                    case R.id.adminlogoutFragment:

                        //getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,logoutFragment).commit();
                        View logoutFragment=  findViewById(R.id.adminlogoutFragment);
                        logoutFragment.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(admin_home.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        return true;

                    case R.id.adminNotificationsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,adminNotificationsFragment).commit();
                        return true;

                }
                return false;
            }
        });

    }
}
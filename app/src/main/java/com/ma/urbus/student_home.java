package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.ma.urbus.databinding.ActivityStudentHomeBinding;

//Bottom Navigation Bar
//https://www.youtube.com/watch?v=Bb8SgfI4Cm4
//https://www.youtube.com/watch?v=OV25x3a55pk

public class student_home extends AppCompatActivity {
     BottomNavigationView bottomNavigationView;
     homeFragment homeFragment=new homeFragment();
     profileFragment profileFragment=new profileFragment();
     notificationsFragment notificationsFragment=new notificationsFragment();
     complaintsFragment complaintsFragment=new complaintsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profileFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,profileFragment).commit();
                        return true;
                    case R.id.homeFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,homeFragment).commit();
                        return true;

                    case R.id.logoutFragment:

                        //getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,logoutFragment).commit();
                        View logoutFragment=  findViewById(R.id.logoutFragment);
                        logoutFragment.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent=new Intent(student_home.this,MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        return true;

                    case R.id.notificationsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,notificationsFragment).commit();
                        return true;
                    case R.id.complaintsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,complaintsFragment).commit();
                        return true;
                }
                return false;
            }
        });


    }

}
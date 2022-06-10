package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    private TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_map);


        //button 1
        b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_student_signup_activity();
            }
        });

        //button 2
        b2= (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_driver_signup_activity();
            }
        });
        //TextView 1
        tv1= (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_student_login_activity();
            }
        });

        //TextView 2
        tv2= (TextView) findViewById(R.id.tv2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_driver_login_activity();
            }
        });

        //TextView 3
        tv3= (TextView) findViewById(R.id.tv3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_admin_login_activity();
            }
        });
    }
    public void open_student_signup_activity(){
        Intent intent=new Intent(this,student_signup.class);
        startActivity(intent);
    }

    public void open_driver_signup_activity(){
        Intent intent=new Intent(this,driver_signup.class);
        startActivity(intent);
    }

    public void open_student_login_activity(){
        Intent intent=new Intent(this,student_login.class);
        startActivity(intent);
    }

    public void open_driver_login_activity(){
        Intent intent=new Intent(this,driver_login.class);
        startActivity(intent);
    }

    public void open_admin_login_activity(){
        Intent intent=new Intent(this,admin_login.class);
        startActivity(intent);
    }

}
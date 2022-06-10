package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class admin_login extends AppCompatActivity {
    private TextView tv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        //TextView 1
        tv1= (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_password_reset_activity();
            }
        });

        //button 1
        b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_admin_home_activity();
            }
        });
    }
    public void open_password_reset_activity(){
        Intent intent=new Intent(this,password_reset.class);
        startActivity(intent);
    }

    public void open_admin_home_activity(){
        Intent intent=new Intent(this,admin_home.class);
        startActivity(intent);
    }
}
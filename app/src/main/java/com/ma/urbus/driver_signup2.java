package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class driver_signup2 extends AppCompatActivity {
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_signup2);

        //button 1
        b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_driver_home_activity();
            }
        });
    }

    public void open_driver_home_activity(){
        Intent intent=new Intent(this, driver_home.class);
        startActivity(intent);
    }
}
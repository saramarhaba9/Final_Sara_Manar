package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class add_new_admin extends AppCompatActivity {

    private EditText editTextEmail ;
    private EditText editTextName;
    private EditText editTextPassword;
    private EditText editTextPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_admin);
        editTextName = findViewById(R.id.name);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById( R.id.password);


    }

    public void newAccount(View view) {
        SQLiteManger sqLiteManger = SQLiteManger.instanceOfDatabase(this);
//        if (editTextPassword != null && editTextName!= null && editTextEmail!=null)



    }
}
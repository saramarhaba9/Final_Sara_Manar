package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class student_login extends AppCompatActivity {
    private TextView tv1,tv2;
    private String username ;
    private String password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        //TextView 1
        tv1= (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_password_reset_activity();
            }
        });
        //TextView 2
        tv2= (TextView) findViewById(R.id.tv2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_student_signup_activity();
            }
        });
    }
    public void open_student_home_activity(){
        Intent intent=new Intent(this, student_home.class);
        startActivity(intent);

    }

    public void open_password_reset_activity(){
        Intent intent=new Intent(this,password_reset.class);
        startActivity(intent);
    }
    public void open_student_signup_activity(){
        Intent intent=new Intent(this,student_signup.class);
        startActivity(intent);
    }

    public void logIn(View view) {
        username = ((EditText)findViewById(R.id.email)).getText().toString();
        password = ((EditText)findViewById(R.id.password)).getText().toString();
        if (isEmpty(username) || isEmpty(password)) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Error !!!");
            alertDialog.setMessage("The fields can't be empty!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            SQLiteManger sqLiteManger = SQLiteManger.instanceOfDatabase(this);
            if(sqLiteManger.checkUsername(username, password,"student")) {
                sqLiteManger.emailSign = username;
                open_student_home_activity();

            }else{
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Error !!!");
                alertDialog.setMessage("You don't have any account!\nClick ok to go to sign Up" );
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                open_student_signup_activity();
                            }
                        });
                alertDialog.show();
            }
        }
    }

    private boolean isEmpty(String etText) {
        if (etText.trim().length() > 0)
            return false;
        return true;
    }
}



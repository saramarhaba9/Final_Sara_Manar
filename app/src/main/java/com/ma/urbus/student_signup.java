package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class student_signup extends AppCompatActivity {
    private String  editTextEmail;
    private String  editTextName;
    private String  editTextphoneNo;
    private String editTextUniversityNo;
    private String editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);



    }

    public void open_student_signup2_activity(){
        Intent intent=new Intent(this,student_signup2.class);
        startActivity(intent);
    }


    public void newAccount(View view) {
        editTextName = ((EditText)findViewById(R.id.name)).getText().toString();
        editTextEmail = ((EditText)findViewById(R.id.email)).getText().toString();
        editTextPassword = ((EditText)findViewById( R.id.password)).getText().toString();
        editTextUniversityNo = ((EditText)findViewById(R.id.sid)).getText().toString();
        editTextphoneNo =  ((EditText) findViewById(R.id.phone_number)).getText().toString();

        if (isEmpty(editTextPassword) || isEmpty(editTextName) || isEmpty(editTextEmail) || isEmpty(editTextphoneNo)) {
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
            user user = new user(editTextphoneNo,
                    editTextName,
                    editTextPassword,
                    editTextEmail,
                    editTextUniversityNo);
            sqLiteManger.addUserToDatabase(user);
            sqLiteManger.emailSign = editTextEmail;
            //signed In user info
            SQLiteManger.name_signin=editTextName;
            SQLiteManger.email_signin =editTextEmail;
            SQLiteManger.phoneNo_signin =editTextphoneNo;
            SQLiteManger.universityNo_signin=editTextUniversityNo;

            open_student_signup2_activity();
            finish();

        }
    }

    private boolean isEmpty(String etText) {
        if (etText.trim().length() > 0)
            return false;
        return true;
    }
}
package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

//DatePicker
//https://www.youtube.com/watch?v=sv0tqwKlPmM

public class edit_table extends AppCompatActivity {

    Spinner spinner;
    String [] days={"الأحد","الاثنين","الثلاثاء","الأربعاء","الخميس"};
    EditText dateFormat;
    DatePickerDialog.OnDateSetListener onDateSetListener;
    final Calendar calendar=Calendar.getInstance();
    int year=calendar.get(Calendar.YEAR);
    int month=calendar.get(Calendar.MONTH);
    int day=calendar.get(Calendar.DAY_OF_MONTH);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_table);

        // days
        spinner=findViewById(R.id.days);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(edit_table.this, android.R.layout.simple_list_item_1,days);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               // String value=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(edit_table.this,days[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // date
        dateFormat=findViewById(R.id.date_format);
        dateFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog= new DatePickerDialog(
                        edit_table.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        onDateSetListener, year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();

            }
        });
        onDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month+=1;
                String date=day +"/"+month +"/"+year;
                dateFormat.setText(date);
            }
        };
    }
}
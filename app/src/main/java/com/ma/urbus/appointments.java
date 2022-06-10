package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class appointments extends AppCompatActivity {
    ListView listviewe1,listviewm2,listviewm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments);

        //1
        listviewm1=(ListView)findViewById(R.id.listviewm1);
        List<String> list1=new ArrayList<String>();
        list1.add("student 1");
        list1.add("student 2");
        list1.add("student 3");
        list1.add("student 4");
        list1.add("student 5");


        ArrayAdapter arrayAdapter1=new ArrayAdapter(getApplicationContext(), R.layout.list_black_text ,R.id.list_content,list1);
        listviewm1.setAdapter(arrayAdapter1);

        //2
        listviewm2=(ListView)findViewById(R.id.listviewm2);
        List<String> list2=new ArrayList<String>();
        list2.add("student 1");
        list2.add("student 2");
        list2.add("student 3");
        list2.add("student 4");
        list2.add("student 5");

        ArrayAdapter arrayAdapter2=new ArrayAdapter(getApplicationContext(), R.layout.list_black_text ,R.id.list_content,list2);
        listviewm2.setAdapter(arrayAdapter2);

        //3
        listviewe1=(ListView)findViewById(R.id.listviewe1);
        List<String> list3=new ArrayList<String>();
        list3.add("student 1");
        list3.add("student 2");
        list3.add("student 3");
        list3.add("student 4");
        list3.add("student 5");

        ArrayAdapter arrayAdapter3=new ArrayAdapter(getApplicationContext(), R.layout.list_black_text ,R.id.list_content,list3);
        listviewe1.setAdapter(arrayAdapter3);
    }
}
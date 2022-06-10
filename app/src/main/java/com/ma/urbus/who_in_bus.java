package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class who_in_bus extends AppCompatActivity {
    ListView listview_who;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_in_bus);

        listview_who=(ListView)findViewById(R.id.listview_who);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("student 1");
        arrayList.add("student 2");
        arrayList.add("student 3");
        arrayList.add("student 4");
        arrayList.add("student 5");



        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listview_who.setAdapter(arrayAdapter);
    }
}
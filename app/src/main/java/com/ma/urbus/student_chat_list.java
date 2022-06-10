package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class student_chat_list extends AppCompatActivity {

    ListView listview_chats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_chat_list);

        listview_chats=(ListView)findViewById(R.id.listview_chats);
        List<String> list=new ArrayList<String>();
        list.add("student 1 , 0550000000");
        list.add("student 2 , 0550000000");
        list.add("student 3 , 0550000000");
        list.add("student 4 , 0550000000");
        list.add("student 5 , 0550000000");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listview_chats.setAdapter(arrayAdapter);
    }
}
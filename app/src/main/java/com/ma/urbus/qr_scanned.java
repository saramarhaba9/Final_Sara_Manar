package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//Create ListView in Android Studio
//https://www.youtube.com/watch?v=Mja5YoL9Jak

public class qr_scanned extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_scanned);

        listView=(ListView)findViewById(R.id.listviewqr);
        List<String> list=new ArrayList<String>();
        list.add("QR قامت الطالبة عزة البقمي بمسح");
        list.add("اكد سائق الباص محمد احمد ركوب الطالبة عزة البقمي ");
        list.add("QR قامت الطالبة ناهد علي بمسح");

        //ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


    }
}
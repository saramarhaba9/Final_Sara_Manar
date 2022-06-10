package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class drivers_rating extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_rating);

        listView=(ListView) findViewById(R.id.listviewdr);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("الطالبة سارة معاذ قامت بتقييم السائق علي بدر");
        arrayList.add(" الطالبة وعد قامت بتقييم سائق الباص عبدالعزيز صادق ");
        arrayList.add("الطالبة منال محمد قامت بتقييم سائق الباص حسن ");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
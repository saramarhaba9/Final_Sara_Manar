package com.ma.urbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class adminComplaints extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_complaints);

        listView=(ListView)findViewById(R.id.listviewC);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("السائق مجد حمدي قام برفع شكوى جديدة");
        arrayList.add("الطالبة مريم محمد قدمت اقتراح جديد ");
        arrayList.add("الطالبة سارة معاذ قامت برفع شكوى جديدة");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
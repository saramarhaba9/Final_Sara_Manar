package com.ma.urbus;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class driverHomeFragment extends Fragment {

    private ImageView table,conversations,who_in_bus,map_driver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_driver_home, container, false);

        //ImageView 1
        table= (ImageView) view.findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),table.class);
                startActivity(intent);
            }
        });

        //ImageView 2
        conversations= (ImageView) view.findViewById(R.id.conversations);
        conversations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),student_chat_list.class);
                startActivity(intent);
            }
        });

        //ImageView 3
        who_in_bus= (ImageView) view.findViewById(R.id.who_in_bus);
        who_in_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),who_in_bus.class);
                startActivity(intent);
            }
        });

        //ImageView 4  map
        map_driver= (ImageView) view.findViewById(R.id.map_driver);
        map_driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),maps.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
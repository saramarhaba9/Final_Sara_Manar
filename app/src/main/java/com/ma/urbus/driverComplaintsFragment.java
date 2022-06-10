package com.ma.urbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class driverComplaintsFragment extends Fragment {
    private EditText name,phone_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_driver_complaints, container, false);

        name=(EditText) view.findViewById(R.id.name);
        name.setText(SQLiteManger.name_signin);



        phone_number=(EditText) view.findViewById(R.id.phone_number);
        phone_number.setText(SQLiteManger.phoneNo_signin);




        return view;
    }
}
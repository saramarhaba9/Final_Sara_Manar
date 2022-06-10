package com.ma.urbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


public class profileFragment extends Fragment {

    private TextView name,sid,email,phone_number;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);

        name=(TextView) view.findViewById(R.id.name);
        name.setText(SQLiteManger.name_signin);

        sid=(TextView) view.findViewById(R.id.sid);
        sid.setText(SQLiteManger.universityNo_signin);

        email=(TextView) view.findViewById(R.id.email);
        email.setText(SQLiteManger.email_signin);

        phone_number=(TextView) view.findViewById(R.id.phone_number);
        phone_number.setText(SQLiteManger.phoneNo_signin);




        return view;


    }
}
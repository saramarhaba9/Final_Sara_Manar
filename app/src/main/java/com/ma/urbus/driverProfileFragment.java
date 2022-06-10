package com.ma.urbus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class driverProfileFragment extends Fragment {

    private TextView name,email,phone_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_driver_profile, container, false);
//        TextView name = (TextView) view.findViewById(R.id.name);
//        FrameLayout frameLayout= (FrameLayout) view.findViewById(R.id.lay);
//        email =(TextView) container.findViewById(R.id.email);
//        phoneNo = (TextView) container.findViewById(R.id.phone_number);
//        System.out.println("Name is " +name.getText());
//        ( (TextView) view.findViewById(R.id.name)).setText("sara");
//        frameLayout.replace(R.id.name,name).commit();

//        System.out.println("Name is " +name.getText());

        //        name.set
//        editInformation(container, inflater);
//        SQLiteManger sqLiteManger = SQLiteManger.instanceOfDatabase(container.getContext());
//        View view = inflater.inflate(R.layout.fragment_driver_profile, container, false);

//        ((TextView) view.findViewById(R.id.name)).setText("Sara");

        View view= inflater.inflate(R.layout.fragment_driver_profile, container, false);

        name=(TextView) view.findViewById(R.id.name);
        name.setText(SQLiteManger.name_signin);


        email=(TextView) view.findViewById(R.id.email);
        email.setText(SQLiteManger.email_signin);

        phone_number=(TextView) view.findViewById(R.id.phone_number);
        phone_number.setText(SQLiteManger.phoneNo_signin);




        return view;

    }

//    private void editInformation(ViewGroup container, LayoutInflater inflater) {
//        SQLiteManger sqLiteManger = SQLiteManger.instanceOfDatabase(container.getContext());
//
//        name.setText("Sara");//sqLiteManger.getSign(1)); // name 1
//        email.setText(sqLiteManger.getSign(3)); // email 3
//        phoneNo.setText(sqLiteManger.getSign(4)); // phoneNO 4
//
//    }


}
package com.ma.urbus;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class adminHomeFragment extends Fragment {

    private ImageView qr_code, add_new_admin,complaints,driver_rating;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_admin_home, container, false);


        //ImageView 1  QR code
        qr_code= (ImageView) view.findViewById(R.id.qr_code);
        qr_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),qr_scanned.class);
                view.getContext().startActivity(intent);

            }
        });

        //ImageView 2  add_new_admin
        add_new_admin= (ImageView) view.findViewById(R.id.add_new_admin);
        add_new_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),add_new_admin.class);
                startActivity(intent);
            }
        });

        //ImageView 3  complaints
        complaints= (ImageView) view.findViewById(R.id.complaints);
        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),adminComplaints.class);
                startActivity(intent);
            }
        });

        //ImageView 4  driver_rating
        driver_rating= (ImageView) view.findViewById(R.id.driver_rating);
        driver_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),drivers_rating.class);
                startActivity(intent);
            }
        });

        return view;
    }


    }


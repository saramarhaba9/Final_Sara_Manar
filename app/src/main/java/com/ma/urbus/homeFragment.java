package com.ma.urbus;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.nio.file.PathMatcher;

//Send Whatsapp message from App
//https://www.youtube.com/watch?v=vj9aY9b5hIg

// QR code
//https://www.youtube.com/watch?v=jzKaEA-6FIQ

public class homeFragment extends Fragment {
    private ImageView qr_code, edit_table,driver_conversation,driver_rating,map_student;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_home, container, false);

        //ImageView 1 open_rating_activity
        driver_rating= (ImageView) view.findViewById(R.id.driver_rating);
        driver_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),rating.class);
                startActivity(intent);
            }
        });

        //ImageView 2  edit_table
        edit_table= (ImageView) view.findViewById(R.id.edit_table);
        edit_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),edit_table.class);
                startActivity(intent);
            }
        });

        //ImageView 3  driver_conversation
        driver_conversation= (ImageView) view.findViewById(R.id.driver_conversation);
        String num="+966558122218";
        String text="مرحبا";
        driver_conversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean installed=isAppInstalled("com.whatsapp");
                if(installed){
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+num+"&text="+ text));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getActivity().getApplicationContext(), "Whatsapp is not installed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //ImageView 4  QR code
        qr_code= (ImageView) view.findViewById(R.id.qr_code);
        qr_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanear();
            }
        });

        //ImageView 5  map
        map_student= (ImageView) view.findViewById(R.id.map_student);
        map_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),maps.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public void scanear() {

        IntentIntegrator intent = IntentIntegrator.forSupportFragment(homeFragment.this);
        //IntentIntegrator intent = new IntentIntegrator(getActivity());
        intent.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        intent.setPrompt("ESCANEAR CODIGO");
        intent.setCameraId(0);
        intent.setBeepEnabled(false);
        intent.setBarcodeImageEnabled(false);
        intent.initiateScan();

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(getContext(), "لقد قمت بإلغائه", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "تم المسح بنجاح", Toast.LENGTH_SHORT).show();
                //etCodigo.setText(result.getContents().toString());
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

private boolean isAppInstalled(String s){
    PackageManager packageManager= getActivity().getPackageManager();
    boolean is_installed;
    try {
        packageManager.getPackageInfo(s,PackageManager.GET_ACTIVITIES);
        is_installed=true;
    } catch (PackageManager.NameNotFoundException e) {
        is_installed=false;
        e.printStackTrace();
    }
    return is_installed;
}
}
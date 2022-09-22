package com.example.piyushproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class postvacancy extends AppCompatActivity {

     ViewGroup tcontainer;
     EditText etxt;
     TextView txt;
     EditText e1txt;
     EditText e2txt;
     EditText e3txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postvacancy);

        tcontainer = findViewById(R.id.transitioncontainer);
        etxt = findViewById(R.id.timepost);
        e1txt = findViewById(R.id.datepost);
        e2txt = findViewById(R.id.eventpost);
        e3txt = findViewById(R.id.trainingpost);



        String[] category = new String[]{"Internship","Jobs","Events","Training"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                R.layout.drop_down,
                category
        );


        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.spinner1post);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            boolean visible;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(postvacancy.this,autoCompleteTextView.getText().toString(),Toast.LENGTH_SHORT).show();
                TransitionManager.beginDelayedTransition(tcontainer);
                visible = !visible;
                if(autoCompleteTextView.getText().toString().equals("Internship")){
                    etxt.setVisibility(View.VISIBLE);
                    e1txt.setVisibility(View.VISIBLE);
                    e2txt.setVisibility(View.GONE);
                    e3txt.setVisibility(View.GONE);

                }

               else if(autoCompleteTextView.getText().toString().equals("Events")){
                    e2txt.setVisibility(View.VISIBLE);
                    e3txt.setVisibility( View.GONE);
                    e1txt.setVisibility(View.GONE);
                    etxt.setVisibility(View.GONE);
                }

                else if(autoCompleteTextView.getText().toString().equals("Training")){
                    e1txt.setVisibility(View.VISIBLE);
                    e3txt.setVisibility(View.VISIBLE);
                    etxt.setVisibility(View.GONE);
                    e2txt.setVisibility(View.GONE);
                }
                else if(autoCompleteTextView.getText().toString().equals("Jobs")){
                    e3txt.setVisibility( View.GONE);
                    e2txt.setVisibility( View.GONE);
                    e1txt.setVisibility(View.GONE);
                    etxt.setVisibility(View.GONE);
                }

            }
        });

        String[] Degree = new String[]{"Any degree","B.tech","B.sc","M.sc","B.A","M.A","B.pharma","D.pharma","BCA","MCA","M.tech","BBA","BCA","B.Com",
                "BJMC","LLB","BBE","MBBS","BPLAN","BVSc","B.Arch.","BFA","BPA","BVA","BBM","BFA","BCS","BDS","B.Des","BFTech","BHM","BMS",
                "BFSc","BPT","BMLT","BOTH","BMRIT","B.Voc","BOPTM","BASLP","BMM","BLiBSc","B.Ed","BCom LLB Hons","BSL LLB","BA LLB (Hons)",
                "MHA","MSC","MJMC","MBA","MBE","LLM","MCA","M Plan","MVSc","M Arch","MLiBSc","M.COM","MDS","MFTech","ME","M.Ed","MHM","MFSC",
                "MPT","MCH","MPH","MPeD","MMLT","MPOTOM","MMC","MFA","MA/LLM","McLit","MSD","M.Des","MPhil","Ph.D"};

        Arrays.sort(Degree);
        ArrayAdapter<String> adapter1=new ArrayAdapter<>(
                this,
                R.layout.drop_down,
                Degree
        );

        AutoCompleteTextView ab = findViewById(R.id.spinner3post);
        ab.setAdapter(adapter1);

        ab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(postvacancy.this,ab.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
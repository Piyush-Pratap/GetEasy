package com.example.piyushproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class studentregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentregister);

       String[] type = new String[]{"B.tech","B.sc","M.sc","B.A","M.A","B.ED","B.pharma","D.pharma","BCA","MCA","M.tech"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                R.layout.drop_down,
                type
        );

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.spinner1student);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(studentregister.this,autoCompleteTextView.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        String[] branch = new String[]{"CSE","Mechanical","Electrical","Plastic Polymer","IT","Civil"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<>(
                this,
                R.layout.drop_down,
                branch
        );

        AutoCompleteTextView ab = findViewById(R.id.spinner2student);
        ab.setAdapter(adapter1);

        ab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(studentregister.this,ab.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
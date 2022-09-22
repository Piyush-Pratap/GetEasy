package com.example.piyushproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText Email,Password;
    MaterialButton Loginbtn, Studentbtn, Collegebtn, Combtn;
    TextView Forget;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Email = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        Loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        Studentbtn = (MaterialButton) findViewById(R.id.studentbtn);
        Collegebtn = (MaterialButton) findViewById(R.id.collegebtn);
        Combtn = (MaterialButton) findViewById(R.id.combtn);
        Forget = (TextView) findViewById(R.id.forget);










    }
}
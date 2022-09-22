package com.example.piyushproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recycler extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<RecyclerClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

     initData();
     initRecyclerView();

    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));
        userList.add(new RecyclerClass("Infosys","dsjfkdsfjs","12/33/2032","dhyfgdshj"));

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
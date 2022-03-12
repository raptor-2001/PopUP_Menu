package com.prathamyadav006.viewme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    List<ModelClass> userList;
    LinearLayoutManager linearManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdata();
        initRecycler();
    }

    private void initdata() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.tiget,"Tiger"));
        userList.add(new ModelClass(R.drawable.lion,"Lion"));
        userList.add(new ModelClass(R.drawable.eagle,"Eagle"));
        userList.add(new ModelClass(R.drawable.elephant,"Elephant"));
        userList.add(new ModelClass(R.drawable.monkey,"Monkey"));
        userList.add(new ModelClass(R.drawable.panda,"Panda"));
        userList.add(new ModelClass(R.drawable.parrot,"Parrot"));
        userList.add(new ModelClass(R.drawable.rabbit,"Rabbit"));
        userList.add(new ModelClass(R.drawable.wolf,"Wolf"));

    }

    @SuppressLint("NotifyDataSetChanged")
    private void initRecycler() {

        recyclerView = findViewById(R.id.recyclerView);
        linearManger = new LinearLayoutManager(this);
        linearManger.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearManger);
        adapter = new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
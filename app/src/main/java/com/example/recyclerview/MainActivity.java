package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataHolder> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        addData();
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        AdapterClass adapterClass=new AdapterClass(getApplicationContext(),arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterClass);
    }

    private void addData() {
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
        arrayList.add(new DataHolder("Hallo"));
    }
}
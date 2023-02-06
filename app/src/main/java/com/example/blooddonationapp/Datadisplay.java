package com.example.blooddonationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Datadisplay extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadisplay);
        recyclerView=findViewById(R.id.recycle);
        Adapter adapter=new Adapter();
        blood_databasehelper helper=blood_databasehelper.getDB(this);
        ArrayList<blood_database> allExpense= (ArrayList<blood_database>)helper.blood_databasedao().getAllExpense();
        adapter.update(allExpense);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
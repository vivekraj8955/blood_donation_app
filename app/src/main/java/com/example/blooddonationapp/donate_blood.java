package com.example.blooddonationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.DatabaseConfiguration;
import androidx.room.Insert;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class donate_blood extends AppCompatActivity {
EditText name,blood_groop,age,contact,address;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);
        name=findViewById(R.id.name);
        blood_groop=findViewById(R.id.bloodgroup);
        age=findViewById(R.id.age);
        contact=findViewById(R.id.contact);
        address=findViewById(R.id.address);
        button=findViewById(R.id.save);
        blood_databasehelper databasehelper= blood_databasehelper.getDB(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=name.getText().toString();
                String Blood_group=blood_groop.getText().toString();
                String Age=age.getText().toString();
                String Contact=contact.getText().toString();
                String Address=address.getText().toString();
                if(Name.length()==0|| Blood_group.length()==0||Age.length()==0||Contact.length()==0|| Address.length()==0)
                {
                    Toast.makeText(donate_blood.this, "Fill required detail", Toast.LENGTH_SHORT).show();
                }
                else {
                    databasehelper.blood_databasedao().addTx(new blood_database(Name, Blood_group, Address, Contact, Age));
                    Intent intent=new Intent(donate_blood.this,MainActivity.class);
                    Toast.makeText(donate_blood.this, "Successfullly data saved", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

            }
        });
    }

}
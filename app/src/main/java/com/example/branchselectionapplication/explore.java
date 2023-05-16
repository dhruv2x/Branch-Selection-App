package com.example.branchselectionapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class explore extends AppCompatActivity {
    String[] brancharray = {"Computer engineering","Information Technology","Electrical engineering","Information and communication Technology",
            "Bio Medical engineering",""};

    ArrayList<String> arr=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        ListView list_view=findViewById(R.id.list_view);
        //Logic

        arr.add("Computer engineering");
        arr.add("Information Technology");
        arr.add("Electrical engineering");
        arr.add("Bio Medical engineering");
        arr.add("Chemical engineering");
        arr.add("Elecronic engineering");
        arr.add("Mechanical engineering");
        arr.add("Automobile engineering");
        arr.add("ICT engineering");
        arr.add("Rubber engineering");
        arr.add("AI engineering");
        arr.add("ML engineering");
        arr.add("Plastic engineering");
        arr.add("Printing engineering");
        arr.add("Advanced mathemathical engineering");
        arr.add("Chemical engineering");
        arr.add("Elecronic engineering");
        arr.add("Mechanical engineering");
        arr.add("Automobile engineering");
        arr.add("ICT engineering");
        arr.add("Rubber engineering");
        arr.add("AI engineering");


        ArrayAdapter<String>adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arr);


        list_view.setAdapter(adapter);


    }
}
package com.example.coleco_collector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coleco_collector.logic.ColecoLibrary;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ColecoLibrary myLibrary = new ColecoLibrary();



    }




}
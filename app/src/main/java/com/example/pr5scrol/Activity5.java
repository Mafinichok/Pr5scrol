package com.example.pr5scrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Spinner spinnerName = findViewById(R.id.spinner);

        String[] products = getResources().getStringArray(R.array.secret);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,products);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerName.setAdapter(adapter);
    }
}
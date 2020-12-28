package com.example.projetandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ddp extends AppCompatActivity {
    Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ddp);
         spinner1 =(Spinner) findViewById(R.id.spinner_1);
        List<String> list = new ArrayList<String>();
        list.add("Attestation de presence");
        list.add("Attestation d'inscription");
        list.add("Carte Etudiant");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }
}
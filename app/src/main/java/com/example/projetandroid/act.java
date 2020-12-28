package com.example.projetandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class act extends AppCompatActivity {

    String Country[]={"india","Tunisia","Algeria"};
    ListView List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act);
        List=(ListView)findViewById(R.id.ListView_1);
        ArrayList<String> activite = new ArrayList<String>();
        activite.add("act1");
        activite.add("act2");
        activite.add("act3");
        ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,activite);
        List.setAdapter(a);
    }
}

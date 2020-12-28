package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class menu extends AppCompatActivity {
    Button rmdp,moncompte,ddp,act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        rmdp=(Button) findViewById(R.id.btn_rmdp);
        moncompte=(Button) findViewById(R.id.btn_compte);
        ddp=(Button) findViewById(R.id.btn_DDP);
        act=(Button) findViewById(R.id.btn_act);

        rmdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(menu.this, rmdp.class);
                startActivity(r);
            }
        });
        moncompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(menu.this, compte.class);
                startActivity(r);
            }
        });
        ddp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(menu.this, ddp.class);
                startActivity(r);
            }
        });
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(menu.this, act.class);
                startActivity(r);
            }
        });
    }


}

package com.example.projetandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class compte extends AppCompatActivity {
EditText nom,prenom,login,email,annee;
Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compte);
        nom=(EditText) findViewById(R.id.nom);
        prenom=(EditText) findViewById(R.id.prenom);
        login=(EditText) findViewById(R.id.login1);
        email=(EditText) findViewById(R.id.email);
        annee=(EditText) findViewById(R.id.annee);
        ok=(Button) findViewById(R.id.ookk);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.monnom=nom.getText().toString();
                MainActivity.monprenom=prenom.getText().toString();
                MainActivity.monlog=login.getText().toString();
                MainActivity.monemail=email.getText().toString();
                MainActivity.monannee=Integer.parseInt(annee.getText().toString());
            }
        });
    }
}

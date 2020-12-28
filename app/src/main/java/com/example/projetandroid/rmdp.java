package com.example.projetandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.projetandroid.MainActivity.monpwd;

public class rmdp extends AppCompatActivity {

    EditText ancien , nouveau , repeter;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rmdp);
        ancien=(EditText) findViewById(R.id.et_ancien);
        nouveau=(EditText) findViewById(R.id.nouveau);
        repeter=(EditText) findViewById(R.id.repeter);
        ok=(Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ancien.getText().toString().equals(monpwd) && nouveau.getText().toString().equals(repeter.getText().toString())) {
                    monpwd=nouveau.getText().toString();
                }
                else {
                    Toast.makeText(rmdp.this, "vérifier " , Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

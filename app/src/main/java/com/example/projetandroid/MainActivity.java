package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText log,pwd ;
    Button quit , ok ;
  static   String monlog="oussama";
  static String monpwd="polytechnique";
  static String monnom="chkir";
  static String monprenom="oussama";
  static String monemail="oussama@exemple.com";
  static int monannee=1996;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=(EditText) findViewById(R.id.et_login);
        pwd=(EditText) findViewById(R.id.et_passwd);
        quit=(Button) findViewById(R.id.btn_Q);
        ok=(Button) findViewById(R.id.btn_ok);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (log.getText().toString().equals(monlog)&& pwd.getText().toString().equals(monpwd) )
                {
                    Intent t = new Intent(MainActivity.this, menu.class);
                    startActivity(t);
                }
                else{
                    Toast.makeText(MainActivity.this, "login ou mot de passe incorrect " , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

package com.example.proyectofinal_tbd_abcc_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.cajaUser);
        password = findViewById(R.id.cajaPass);
    }


    public void abrirMenu(View v){
        Intent i = new Intent(this, Activity_menu.class);
        startActivity(i);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfil extends AppCompatActivity {

    private androidx.appcompat.widget.AppCompatButton deslogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        getSupportActionBar().hide();
        deslog();

        deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(perfil.this, FormLogin.class);
                startActivity(intent);
            }
        });
    }
    private void deslog(){
        deslogar = findViewById(R.id.deslogar);
    }

}
package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class quartos extends AppCompatActivity {

    private ImageView right_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartos);

        getSupportActionBar().hide();
        home();

        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, perfil.class);
                startActivity(intent);
            }
        });
    }

    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }
    }


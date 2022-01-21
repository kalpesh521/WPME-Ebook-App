package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class charcreristicssess extends AppCompatActivity {
    CardView partone;
    CardView parttwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charcreristicssess);
        partone = findViewById(R.id.sesone);
        parttwo = findViewById(R.id.sestwo);

        partone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(   charcreristicssess.this,PersonalityPDF.class));
            }
        });

        parttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(  charcreristicssess.this,PersonalityPDF.class));
            }
        });
    }
}
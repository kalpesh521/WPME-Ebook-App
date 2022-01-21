package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class phenomenonsess extends AppCompatActivity {
    CardView partone;
    CardView parttwo;
    CardView partthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phenomenonsess);
        partone = findViewById(R.id.sesone);
        parttwo = findViewById(R.id.sestwo);
        partthree = findViewById(R.id.sesthree);
        partone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(  phenomenonsess.this,PersonalityPDF.class));
            }
        });

        parttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( phenomenonsess.this,PersonalityPDF.class));
            }
        });

        partthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(  phenomenonsess.this,PersonalityPDF.class));
            }
        });
    }
}
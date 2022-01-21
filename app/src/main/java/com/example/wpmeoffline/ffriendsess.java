package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ffriendsess extends AppCompatActivity {
    CardView partone;
    CardView parttwo;
    CardView partthree;
    CardView partfour;
    CardView partfive;
    CardView partsix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffriendsess);
        partone = findViewById(R.id.sesone);
        parttwo = findViewById(R.id.sestwo);
        partthree = findViewById(R.id.sesthree);
        partfour = findViewById(R.id.sessionten);
        partfive = findViewById(R.id.sessiontw);
        partsix = findViewById(R.id.sessionth);
        partone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(  ffriendsess.this,PersonalityPDF.class));
            }
        });

        parttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( ffriendsess.this,PersonalityPDF.class));
            }
        });

        partthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(  ffriendsess.this,PersonalityPDF.class));
            }
        });
        partfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( ffriendsess.this,PersonalityPDF.class));
            }
        });
        partfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( ffriendsess.this,PersonalityPDF.class));
            }
        });
        partsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( ffriendsess.this,PersonalityPDF.class));
            }
        });

    }
}
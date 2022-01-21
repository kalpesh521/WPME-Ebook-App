package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryoneActivity extends AppCompatActivity {
    CardView personality;
    CardView doctor;
    CardView science;
    CardView practitioner;
    CardView liars;
    CardView testone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryone);
        personality = findViewById(R.id.sesone);
        doctor = findViewById(R.id.sestwo);
        liars = findViewById(R.id.liar);
        testone = findViewById(R.id.testthreee);
        science= findViewById(R.id.science);
        practitioner = findViewById(R.id.sesthree);

        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,persSession.class));
            }
        });
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,doctorsession.class));

            }
        });
        practitioner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,practitionersession.class));
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,sciencesession.class));
            }
        });
        liars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,liarsession.class));
            }
        });
        testone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategoryoneActivity.this,PersonalityPDF.class));
            }
        });
    }
}
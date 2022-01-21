package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categorythirdactivity extends AppCompatActivity {
    CardView personality;
    CardView doctor;
    CardView science;
    CardView comptestthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorythirdactivity);
        personality = findViewById(R.id.sesone);
        doctor = findViewById(R.id.sestwo);
        science= findViewById(R.id.sesthree);
        comptestthree= findViewById(R.id.testthreee);

        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(categorythirdactivity.this,phenomenonsess.class));
            }
        });
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(categorythirdactivity.this,whatsesss.class));

            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(categorythirdactivity.this,charcreristicssess.class));
            }
        });
        comptestthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(categorythirdactivity.this,PersonalityPDF.class));
            }
        });
    }
}
package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategorytwoActivity extends AppCompatActivity {
    CardView personality;
    CardView doctor;
    CardView science;
    CardView practitioner;
    CardView comptesttwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorytwo);
        personality = findViewById(R.id.action);
        doctor = findViewById(R.id.speechhabits);
        science= findViewById(R.id.friends);
        practitioner = findViewById(R.id.enemy);
        comptesttwo = findViewById(R.id.testthreee);

        personality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategorytwoActivity.this,actionsess.class));
            }
        });
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategorytwoActivity.this,speechhabitsess.class));

            }
        });
        practitioner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategorytwoActivity.this,enemysess.class));
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategorytwoActivity.this,ffriendsess.class));
            }
        });

         comptesttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(CategorytwoActivity.this,PersonalityPDF.class));
            }
        });


    }
}
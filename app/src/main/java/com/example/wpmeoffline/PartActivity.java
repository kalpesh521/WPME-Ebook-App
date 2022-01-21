package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartActivity extends AppCompatActivity {
    public CardView partone;
    public CardView parttwo;
    public CardView partthree;
    public CardView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        partone = findViewById(R.id.sesone);
        partone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(PartActivity.this,CategoryoneActivity.class));
            }
        });

        parttwo = findViewById(R.id.sestwo);
        parttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(PartActivity.this,CategorytwoActivity.class));
            }
        });
        partthree = findViewById(R.id.sesthree);
        partthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(PartActivity.this,categorythirdactivity.class));
            }
        });
        content = findViewById(R.id.contents);
        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(PartActivity.this,contentpdf.class));
            }
        });
    }

}
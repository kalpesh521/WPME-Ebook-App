package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pqfourtytwo extends AppCompatActivity {
    PDFView pdf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqfourtytwo);
        pdf = (PDFView) findViewById(R.id.pdf);
        pdf.fromAsset("personalityebook.pdf").load();
    }
}
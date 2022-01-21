package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pfthirty extends AppCompatActivity {
    PDFView pdf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfthirty);
        pdf = (PDFView) findViewById(R.id.pdf);
        pdf.fromAsset("personalityebook.pdf").load();
    }
}
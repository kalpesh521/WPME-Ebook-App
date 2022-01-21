package com.example.wpmeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class contentpdf extends AppCompatActivity {
    PDFView pdf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentpdf);
        pdf = (PDFView) findViewById(R.id.pdfc);
        pdf.fromAsset("content.pdf").load();
    }
}
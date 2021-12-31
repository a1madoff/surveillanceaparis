package com.example.alexmadoffparissurveillance;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        WebView surveillanceMap = findViewById(R.id.surveillancemap);
        surveillanceMap.getSettings().setJavaScriptEnabled(true);
        surveillanceMap.loadUrl("https://snazzymaps.com/embed/355900");
    }
}
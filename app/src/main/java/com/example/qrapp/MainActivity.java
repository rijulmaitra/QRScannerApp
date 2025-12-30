package com.example.qrapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qrapp.scanner.QRScannerActivity;
import com.example.qrapp.generator.QRGeneratorActivity;

public class MainActivity extends AppCompatActivity {

    Button btnScan, btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        btnGenerate = findViewById(R.id.btnGenerate);

        btnScan.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, QRScannerActivity.class));
        });

        btnGenerate.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, QRGeneratorActivity.class));
        });
    }
}

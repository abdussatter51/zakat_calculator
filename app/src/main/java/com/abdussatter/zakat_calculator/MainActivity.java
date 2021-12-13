package com.abdussatter.zakat_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView btnSItemBack, tvzCalculator, tvZWhat, tvZImportance, tvZPunishment, tvZAsset, tvZFree,
            tvZAccount, tvZFarad, tvZGive, tvZProhibited, tvZMasala, tvZOweMasala, tvZVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSItemBack = findViewById(R.id.tvSItemBack);
        tvzCalculator = findViewById(R.id.tvzCalculator);
        tvZWhat = findViewById(R.id.tvZWhat);
        tvZImportance = findViewById(R.id.tvZImportance);
        tvZPunishment = findViewById(R.id.tvZPunishment);
        tvZAsset = findViewById(R.id.tvZAsset);
        tvZFree = findViewById(R.id.tvZFree);
        tvZAccount = findViewById(R.id.tvZAccount);
        tvZFarad = findViewById(R.id.tvZFarad);
        tvZGive = findViewById(R.id.tvZGive);
        tvZProhibited = findViewById(R.id.tvZProhibited);
        tvZMasala = findViewById(R.id.tvZMasala);
        tvZOweMasala = findViewById(R.id.tvZOweMasala);
        tvZVideo = findViewById(R.id.tvZVideo);
        tvZVideo = findViewById(R.id.tvZVideo);

        //Go to Calculator Activity
        tvzCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calculatorIntent);
                Toast.makeText(MainActivity.this, "Welcome to Zakat Calculator!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
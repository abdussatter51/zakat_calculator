package com.abdussatter.zakat_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ZakatProhibitedActivity extends AppCompatActivity {
    TextView tvWhatZakatBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_prohibited);

        tvWhatZakatBack = findViewById(R.id.tvWhatZakatBack);
        tvWhatZakatBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(ZakatProhibitedActivity.this, MainActivity.class);
                startActivity(mainIntent);
                Toast.makeText(ZakatProhibitedActivity.this, "Successfully back to home page!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
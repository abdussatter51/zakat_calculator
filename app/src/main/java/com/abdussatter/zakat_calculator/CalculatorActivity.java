package com.abdussatter.zakat_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    EditText edNisabTK, edGoldTK, edSilverTK, edStoneTK, edCashTK, edInvestmentTK, edLandTK, edBusinessTK, edVarieties, edDebtTK;

    TextView tvSItemBack, tvNisabTK,tvZakat, tvZakatMessage, tvTotalAsset;

    Button btnNisabCalculate, btnCalculate;
    float nisabAmount = 41370;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //EditText
        edNisabTK = findViewById(R.id.edNisabTK);
        edGoldTK = findViewById(R.id.edGoldTK);
        edSilverTK = findViewById(R.id.edSilverTK);
        edStoneTK = findViewById(R.id.edStoneTK);
        edCashTK = findViewById(R.id.edCashTK);
        edInvestmentTK = findViewById(R.id.edInvestmentTK);
        edLandTK = findViewById(R.id.edLandTK);
        edBusinessTK = findViewById(R.id.edBusinessTK);
        edVarieties = findViewById(R.id.edVarieties);
        edDebtTK = findViewById(R.id.edDebtTK);
        //TextView
        tvSItemBack = findViewById(R.id.tvSItemBack);
        tvNisabTK = findViewById(R.id.tvNisabTK);
        tvZakat = findViewById(R.id.tvZakat);
        tvZakatMessage = findViewById(R.id.tvZakatMessage);
        tvTotalAsset = findViewById(R.id.tvTotalAsset);
        //Button
        btnNisabCalculate = findViewById(R.id.btnNisabCalculate);
        btnCalculate = findViewById(R.id.btnCalculate);

        //Back page button
        tvSItemBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(CalculatorActivity.this, MainActivity.class);
                startActivity(mainIntent);
                Toast.makeText(CalculatorActivity.this, "Successfully back to home page!", Toast.LENGTH_SHORT).show();
            }
        });

        //Nisab Calculate Button
        btnNisabCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nisabString = edNisabTK.getText().toString();
                if (nisabString.length()>0){
                    float nisabTK = Float.parseFloat(nisabString);
                    nisabTK = (float) (nisabTK * 52.5);
                    nisabAmount = nisabTK;
                    tvNisabTK.setText(""+nisabTK);
                }
                else {
                    edNisabTK.setError("Please input value");
                }
            }
        });

        //Zakat Calculate Button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String goldString = edGoldTK.getText().toString();
                String silverString = edSilverTK.getText().toString();
                String stoneString = edStoneTK.getText().toString();
                String cashString = edCashTK.getText().toString();
                String investmentString = edInvestmentTK.getText().toString();
                String landString = edLandTK.getText().toString();
                String businessString = edBusinessTK.getText().toString();
                String varietiesString = edVarieties.getText().toString();
                String debtString = edDebtTK.getText().toString();
                float goldTK = 0, sliverTk = 0, stoneTK = 0, cashTK = 0, investmentTK = 0, landTK = 0, businessTK = 0, varietiesTK = 0, debtTK = 0, totalAsset, zakatAmount;
                if (goldString.length()>0) {
                    goldTK = Float.parseFloat(goldString);
                }
                else {
                    goldTK = 0;
                }

                if (silverString.length()>0) {
                    sliverTk = Float.parseFloat(silverString);
                }
                else {
                    sliverTk = 0;
                }

                if (stoneString.length()>0) {
                    stoneTK = Float.parseFloat(stoneString);
                }
                else {
                    stoneTK = 0;
                }

                if (cashString.length()>0) {
                    cashTK = Float.parseFloat(cashString);
                }
                else {
                    cashTK = 0;
                }

                if (investmentString.length()>0) {
                    investmentTK = Float.parseFloat(investmentString);
                }
                else {
                    investmentTK = 0;
                }

                if (landString.length()>0) {
                    landTK = Float.parseFloat(landString);
                }
                else {
                    landTK = 0 ;
                }

                if (businessString.length()>0) {
                    businessTK = Float.parseFloat(businessString);
                }
                else {
                   businessTK = 0;
                }

                if (varietiesString.length()>0) {
                    varietiesTK = Float.parseFloat(varietiesString);
                }
                else {
                    varietiesTK = 0;
                }

                if (debtString.length()>0) {
                    debtTK = Float.parseFloat(debtString);
                }
                else {
                    debtTK = 0;
                }

                totalAsset = goldTK + sliverTk + stoneTK + cashTK + investmentTK + landTK + businessTK + varietiesTK - debtTK;
                zakatAmount = (float) (totalAsset * 0.025);
                tvTotalAsset.setText(""+totalAsset);
                if (totalAsset > nisabAmount){
                    tvZakat.setText(""+zakatAmount);
                }
                else {
                    tvZakatMessage.setText("আপনার উপর যাকাত ফরজ হয়নি।");
                    tvZakat.setText("0");
                }
            }
        });
    }
}
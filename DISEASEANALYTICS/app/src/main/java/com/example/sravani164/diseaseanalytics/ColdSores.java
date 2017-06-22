package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColdSores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_sores2);
    }
    public void Mcold(View v){
        Intent i=new Intent(this,ColdSores_Medicine.class);
        startActivity(i);
    }
}

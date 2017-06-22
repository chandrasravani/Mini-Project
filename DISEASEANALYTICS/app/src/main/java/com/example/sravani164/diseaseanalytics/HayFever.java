package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HayFever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hay_fever);
    }
    public void Mhay(View v){
        Intent i=new Intent(this,HayFever_Medicine.class);
        startActivity(i);

    }
}

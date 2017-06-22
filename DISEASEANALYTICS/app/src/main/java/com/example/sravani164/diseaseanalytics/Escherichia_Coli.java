package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Escherichia_Coli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escherichia__coli);
    }
    public void Mesc(View v){
        Intent i=new Intent(this,Escherichia_Coli_Medicine.class);
        startActivity(i);

    }
}

package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KidneyStones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_stones);
    }
    public void Mkid(View v){
        Intent i=new Intent(this,KidneyStones_Medicine.class);
        startActivity(i);
    }
}

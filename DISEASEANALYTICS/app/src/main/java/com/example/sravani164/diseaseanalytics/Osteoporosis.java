package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Osteoporosis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osteoporosis);
    }
    public void Most(View v){
        Intent i=new Intent(this,Osteoporosis_Medicine.class);
        startActivity(i);
    }
}

package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aids);
    }
    public void Maid(View v){
        Intent i=new Intent(this,Aids_Medicine.class);
        startActivity(i);

    }
}

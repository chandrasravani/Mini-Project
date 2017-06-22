package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void dis(View v){
        Intent i=new Intent(this,Disease.class);
        startActivity(i);

    }
    public void sym(View view){
        Intent i=new Intent(this,Symptoms.class);
         startActivity(i);
    }
    public void tip(View view2){
        Intent i=new Intent(this,Health_Tips.class);
        startActivity(i);

    }
}

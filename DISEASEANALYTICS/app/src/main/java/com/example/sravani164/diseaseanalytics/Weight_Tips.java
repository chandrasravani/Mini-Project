package com.example.sravani164.diseaseanalytics;


import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Weight_Tips extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight__tips);


    }

    public void loss(View v){
        Intent i=new Intent(this,Loss.class);
        startActivity(i);

    }

    public void gain(View view){
        Intent i=new Intent(this,Gain.class);
        startActivity(i);

    }

}

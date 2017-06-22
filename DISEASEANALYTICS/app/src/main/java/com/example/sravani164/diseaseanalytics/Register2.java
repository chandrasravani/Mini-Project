package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class Register2 extends AppCompatActivity {
    EditText e1,e2;
    String ht,wt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        e1=(EditText)findViewById(R.id.editText4);
        e2=(EditText)findViewById(R.id.editText3);
    }
    public void log(View v){
        ht=e1.getText().toString();
        wt=e2.getText().toString();
        if(TextUtils.isEmpty(ht)){
            Toast.makeText(this, "Enter height", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(wt)){
            Toast.makeText(this, "Enter weight", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
}

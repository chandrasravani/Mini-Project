package com.example.sravani164.diseaseanalytics;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity{
    EditText e1,e2;
    String name,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);


    }

    public void register( View v) {
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }

    public void login(View v){
        name=e1.getText().toString();
        pass=e2.getText().toString();
        if(TextUtils.isEmpty(name)){
            Toast.makeText(this, "Please enter Username", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        else{
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
    }

    public void forget(View v){
        Intent inte=new Intent(this,Forget.class);
        startActivity(inte);
    }
























}

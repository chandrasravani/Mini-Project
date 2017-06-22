package com.example.sravani164.diseaseanalytics;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText  pass, confirm,e1,e2;
    String password;
    String cpassword,Name,age;
    SQLiteDatabase sqlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.editText10);
        pass = (EditText) findViewById(R.id.pass);
        confirm = (EditText) findViewById(R.id.cpass);
        sqlt=openOrCreateDatabase("disease", Context.MODE_PRIVATE,null);
        sqlt.execSQL("create table if not exists user(uname varchar(50),pass varchar(20))");


    }

    public void next(View v) {
        Name=e1.getText().toString();
        age=e2.getText().toString();
        password = pass.getText().toString();
        cpassword = confirm.getText().toString();

        if(TextUtils.isEmpty(Name)){
            Toast.makeText(this, "Please Enter name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(age)){
            Toast.makeText(this, "Please Enter age", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(cpassword)){
            Toast.makeText(this, "Please Enter confirm password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (password.equals(cpassword)) {
            ContentValues values= new ContentValues();
            values.put("uname",Name);
            values.put("pwd",password);
            sqlt.insert("user",null,values);
            Toast.makeText(this, "welcome "+Name, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Register2.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Enter password again", Toast.LENGTH_SHORT).show();
        }
    }
}

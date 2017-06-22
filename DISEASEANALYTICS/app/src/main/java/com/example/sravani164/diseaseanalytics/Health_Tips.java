package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Health_Tips extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView l;
        String[] tips={"Food_Tips","Weight_Tips","Vitamin_Tips","Psychological_Tips"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health__tips);
        l=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tips);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView text=(TextView) view;

        String ls = tips[position];
        try {
            Class ourClass = Class.forName("com.example.sravani164.diseaseanalytics."+ls);
            Intent i = new Intent(this, ourClass);
            startActivity(i);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }



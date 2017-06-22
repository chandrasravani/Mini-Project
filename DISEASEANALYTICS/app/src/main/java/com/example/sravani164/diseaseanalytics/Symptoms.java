package com.example.sravani164.diseaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Symptoms extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView list;
    String[] Slist={
            "AbdominalPain",
            "Confusion","Cough",
            "Dizziness",
            "Fatigue",
            "Headache","HairLoss",
            "Infection","Itch",
            "Nausea",
            "ShortnessOfBreath","SoreThroat","Swelling",
            "Vomiting",
            "WeightGain"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        list=(ListView)findViewById(R.id.ls);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Slist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String ls = Slist[position];
        try {
            Class ourClass = Class.forName("com.example.sravani164.diseaseanalytics."+ls);
            Intent i = new Intent(this, ourClass);
            startActivity(i);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

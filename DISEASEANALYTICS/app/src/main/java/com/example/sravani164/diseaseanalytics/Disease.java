package com.example.sravani164.diseaseanalytics;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;



public class Disease extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView l;
    String[] Diseaselist={"Aids","Allergy","Asthma",
            "Cancer","ChickenPox","Cholera","Cold", "ColdSores", "CoronaryHeartDisease","Croup",
            "Dengue","Diabetes",
            "Escherichia_Coli",
            "Fever",
            "GallStones","Gastritis",
            "HayFever", "HeadLice","Hepatitis", "Hydrophobia","Hypertension",
            "Impetigo","Influenza",
            "Jaundice","KidneyStones",
            "Malaria","Mumps",
            "NasalPolyps","Norovirus",
            "Osteoporosis",
           "Piles","PinkEye",
            "Rubella",
            "Typhoid",
            "WhoopingCough"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        l=(ListView)findViewById(R.id.ds);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Diseaselist);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String ls = Diseaselist[position];
        try {
            Class ourClass = Class.forName("com.example.sravani164.diseaseanalytics."+ls);
            Intent i = new Intent(this, ourClass);
            startActivity(i);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

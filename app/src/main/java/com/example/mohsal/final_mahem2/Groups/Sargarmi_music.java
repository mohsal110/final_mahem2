package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Sargarmi_music extends AppCompatActivity implements View.OnClickListener {
Button piano,saz_badi,guitar,dram,violon,sonati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi_music);





        piano=(Button)findViewById(R.id.btn1);
        piano.setOnClickListener(this);
        saz_badi=(Button)findViewById(R.id.btn2);
        saz_badi.setOnClickListener(this);
        guitar=(Button)findViewById(R.id.btn3);
        guitar.setOnClickListener(this);
        dram=(Button)findViewById(R.id.btn4);
        dram.setOnClickListener(this);
        violon=(Button)findViewById(R.id.btn5);
        violon.setOnClickListener(this);
        sonati=(Button)findViewById(R.id.btn6);
        sonati.setOnClickListener(this);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

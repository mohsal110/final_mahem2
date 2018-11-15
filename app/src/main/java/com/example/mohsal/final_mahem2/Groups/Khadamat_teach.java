package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Khadamat_teach extends AppCompatActivity implements View.OnClickListener {
Button Language,school,software,art,sport,moshaver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat_teach);




        Language=(Button)findViewById(R.id.btn1);
        Language.setOnClickListener(this);
        school=(Button)findViewById(R.id.btn2);
        school.setOnClickListener(this);
        software=(Button)findViewById(R.id.btn3);
        software.setOnClickListener(this);
        art=(Button)findViewById(R.id.btn4);
        art.setOnClickListener(this);
        sport=(Button)findViewById(R.id.btn5);
        sport.setOnClickListener(this);
        moshaver=(Button)findViewById(R.id.btn6);
        moshaver.setOnClickListener(this);
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

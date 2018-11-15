package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Sargarmi_book extends AppCompatActivity implements View.OnClickListener {
Button teach,religion,history,literary,magazine,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi_book);





        teach=(Button)findViewById(R.id.btn1);
        teach.setOnClickListener(this);
        religion=(Button)findViewById(R.id.btn2);
        religion.setOnClickListener(this);
        history=(Button)findViewById(R.id.btn3);
        history.setOnClickListener(this);
        literary=(Button)findViewById(R.id.btn4);
        literary.setOnClickListener(this);
        magazine=(Button)findViewById(R.id.btn5);
        magazine.setOnClickListener(this);
        other=(Button)findViewById(R.id.btn6);
        other.setOnClickListener(this);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

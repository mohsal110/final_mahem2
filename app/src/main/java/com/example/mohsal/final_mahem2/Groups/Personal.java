package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Personal extends AppCompatActivity implements View.OnClickListener {
Button clothes,watch,health,child_clothes,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);





        clothes=(Button)findViewById(R.id.btn1);
        clothes.setOnClickListener(this);
        watch=(Button)findViewById(R.id.btn2);
        watch.setOnClickListener(this);
        health=(Button)findViewById(R.id.btn3);
        health.setOnClickListener(this);
        child_clothes=(Button)findViewById(R.id.btn4);
        child_clothes.setOnClickListener(this);
        other=(Button)findViewById(R.id.btn5);
        other.setOnClickListener(this);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Estekhdami extends AppCompatActivity implements View.OnClickListener {
Button fani,monshi,nurse,edari,teach,mali,seller,seraydar,resturan,kar_sakhteman,art,beauty,computer,haml,other;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estekhdami);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

      
        fani=(Button)findViewById(R.id.btn1);
        fani.setOnClickListener(this);
        monshi=(Button)findViewById(R.id.btn2);
        monshi.setOnClickListener(this);
        nurse=(Button)findViewById(R.id.btn3);
        nurse.setOnClickListener(this);
        edari=(Button)findViewById(R.id.btn4);
        edari.setOnClickListener(this);
        teach=(Button)findViewById(R.id.btn5);
        teach.setOnClickListener(this);
        mali=(Button)findViewById(R.id.btn6);
        mali.setOnClickListener(this);
        seller=(Button)findViewById(R.id.btn7);
        seller.setOnClickListener(this);
        seraydar=(Button)findViewById(R.id.btn8);
        seraydar.setOnClickListener(this);
        resturan=(Button)findViewById(R.id.btn9);
        resturan.setOnClickListener(this);
        kar_sakhteman=(Button)findViewById(R.id.btn10);
        kar_sakhteman.setOnClickListener(this);
        art=(Button)findViewById(R.id.btn11);
        art.setOnClickListener(this);
        beauty=(Button)findViewById(R.id.btn12);
        beauty.setOnClickListener(this);
        computer=(Button)findViewById(R.id.btn13);
        computer.setOnClickListener(this);
        haml=(Button)findViewById(R.id.btn14);
        haml.setOnClickListener(this);
        other=(Button)findViewById(R.id.btn15);
        other.setOnClickListener(this);


        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }

}



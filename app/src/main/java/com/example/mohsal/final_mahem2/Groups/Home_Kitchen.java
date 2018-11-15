package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Home_Kitchen extends AppCompatActivity implements View.OnClickListener{
Button freezer,gas,wash_cloth,food,wash_dish,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__kitchen);





        freezer=(Button)findViewById(R.id.btn1);
        freezer.setOnClickListener(this);
        gas=(Button)findViewById(R.id.btn2);
        gas.setOnClickListener(this);
        wash_cloth=(Button)findViewById(R.id.btn3);
        wash_cloth.setOnClickListener(this);
        food=(Button)findViewById(R.id.btn4);
        food.setOnClickListener(this);
        wash_dish=(Button)findViewById(R.id.btn5);
        wash_dish.setOnClickListener(this);
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

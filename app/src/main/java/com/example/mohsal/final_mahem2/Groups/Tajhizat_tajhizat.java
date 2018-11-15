package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Tajhizat_tajhizat extends AppCompatActivity implements View.OnClickListener{
Button shop,burbershop,office,industry,cofe,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajhizat_tajhizat);





        shop=(Button)findViewById(R.id.btn1);
        shop.setOnClickListener(this);
        burbershop=(Button)findViewById(R.id.btn2);
        burbershop.setOnClickListener(this);
        office=(Button)findViewById(R.id.btn3);
        office.setOnClickListener(this);
        industry=(Button)findViewById(R.id.btn4);
        industry.setOnClickListener(this);
        cofe=(Button)findViewById(R.id.btn5);
        cofe.setOnClickListener(this);
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

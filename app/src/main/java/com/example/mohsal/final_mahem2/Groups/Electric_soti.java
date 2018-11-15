package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Electric_soti extends AppCompatActivity implements View.OnClickListener{
Button camera,System_soti,TV,DVD,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_soti);





        camera=(Button)findViewById(R.id.btn1);
        camera.setOnClickListener(this);
        System_soti=(Button)findViewById(R.id.btn2);
        System_soti.setOnClickListener(this);
        TV=(Button)findViewById(R.id.btn3);
        TV.setOnClickListener(this);
        DVD=(Button)findViewById(R.id.btn4);
        DVD.setOnClickListener(this);
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

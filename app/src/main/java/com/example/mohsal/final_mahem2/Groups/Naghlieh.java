package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Naghlieh extends AppCompatActivity implements View.OnClickListener {
Button savari,sangin,motor,yadaki,keshavarzi,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naghlieh);





        savari=(Button)findViewById(R.id.btn1);
        savari.setOnClickListener(this);
        sangin=(Button)findViewById(R.id.btn2);
        sangin.setOnClickListener(this);
        motor=(Button)findViewById(R.id.btn3);
        motor.setOnClickListener(this);
        yadaki=(Button)findViewById(R.id.btn4);
        yadaki.setOnClickListener(this);
        keshavarzi=(Button)findViewById(R.id.btn5);
        keshavarzi.setOnClickListener(this);
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

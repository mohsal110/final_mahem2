package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Amlak_HomeSell extends AppCompatActivity implements View.OnClickListener {
Button aparteman,home,zamin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak__home_sell);



        aparteman=(Button)findViewById(R.id.btn1);
        aparteman.setOnClickListener(this);
        home=(Button)findViewById(R.id.btn2);
        home.setOnClickListener(this);
        zamin=(Button)findViewById(R.id.btn3);
        zamin.setOnClickListener(this);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }

}

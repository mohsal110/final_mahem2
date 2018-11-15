package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Electric_Tablet extends AppCompatActivity implements View.OnClickListener {
Button mobile,tablet,LavazemJanebi,simcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric__tablet);





        mobile=(Button)findViewById(R.id.btn1);
        mobile.setOnClickListener(this);
        tablet=(Button)findViewById(R.id.btn2);
        tablet.setOnClickListener(this);
        LavazemJanebi=(Button)findViewById(R.id.btn3);
        LavazemJanebi.setOnClickListener(this);
        simcard=(Button)findViewById(R.id.btn4);
        simcard.setOnClickListener(this);
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

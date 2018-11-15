package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Khadamat_computer extends AppCompatActivity implements View.OnClickListener {
Button web,net,pc,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat_computer);




        web=(Button)findViewById(R.id.btn1);
        web.setOnClickListener(this);
        net=(Button)findViewById(R.id.btn2);
        net.setOnClickListener(this);
        pc=(Button)findViewById(R.id.btn3);
        pc.setOnClickListener(this);
        mobile=(Button)findViewById(R.id.btn4);
        mobile.setOnClickListener(this);
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

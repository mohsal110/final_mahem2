package com.example.mohsal.final_mahem2.Groups;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Home_Design extends AppCompatActivity implements View.OnClickListener {
Button carpet,chair,lostr,commode,parde,bed,decor,TV_desk,fan,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__design);





        carpet=(Button)findViewById(R.id.btn1);
        carpet.setOnClickListener(this);
        chair=(Button)findViewById(R.id.btn2);
        chair.setOnClickListener(this);
        lostr=(Button)findViewById(R.id.btn3);
        lostr.setOnClickListener(this);
        commode=(Button)findViewById(R.id.btn4);
        commode.setOnClickListener(this);
        parde=(Button)findViewById(R.id.btn5);
        parde.setOnClickListener(this);
        bed=(Button)findViewById(R.id.btn6);
        bed.setOnClickListener(this);
        decor=(Button)findViewById(R.id.btn7);
        decor.setOnClickListener(this);
        TV_desk=(Button)findViewById(R.id.btn8);
        TV_desk.setOnClickListener(this);
        fan=(Button)findViewById(R.id.btn9);
        fan.setOnClickListener(this);
        other=(Button)findViewById(R.id.btn10);
        other.setOnClickListener(this);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onClick(View v) {

        Intent intent=new Intent(getBaseContext(), Ads.class);
        startActivity(intent);
    }
}

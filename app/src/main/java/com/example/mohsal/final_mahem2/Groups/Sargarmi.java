package com.example.mohsal.final_mahem2.Groups;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Sargarmi extends AppCompatActivity {
Button cycle,sport,travel,asbab_bazi,music,book,pet,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi);





        cycle=(Button)findViewById(R.id.btn1);
        sport=(Button)findViewById(R.id.btn2);
        travel=(Button)findViewById(R.id.btn3);
        asbab_bazi=(Button)findViewById(R.id.btn4);
        music=(Button)findViewById(R.id.btn5);
        book=(Button)findViewById(R.id.btn6);
        pet=(Button)findViewById(R.id.btn7);
        other=(Button)findViewById(R.id.btn8);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sargarmi.this,Sargarmi_music.class);
                startActivity(i);
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sargarmi.this,Sargarmi_book.class);
                startActivity(i);
            }
        });
        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        asbab_bazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
}

package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Amlak extends AppCompatActivity {
Button home_sell,home_rent,office_sell,office_rent,aghd,other;
TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak);

        init();


        home_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Amlak.this,Amlak_HomeSell.class);
                startActivity(i);
            }
        });

        home_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Amlak.this,Amlak_HomeRent.class);
                startActivity(i);
            }
        });
        office_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Amlak.this,Amlak_OfficeSell.class);
                startActivity(i);
            }
        });
        office_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Amlak.this,Amlak_OfficeRent.class);
                startActivity(i);
            }
        });

        aghd.setOnClickListener(new IntentClick("1"));

        other.setOnClickListener(new IntentClick("2"));

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }


    class IntentClick implements View.OnClickListener{
        private String Id;
      public IntentClick(String id)
        {
            Id=id;
        }
        @Override
        public void onClick(View view) {
            Intent i=new Intent(getBaseContext(),Ads.class);
            i.putExtra("id",Id);
            startActivity(i);
        }
    }

    private void init()
    {

        title=(TextView)findViewById(R.id.title);
        home_sell=(Button)findViewById(R.id.btn1);
        home_rent=(Button)findViewById(R.id.btn2);
        office_sell=(Button)findViewById(R.id.btn3);
        office_rent=(Button)findViewById(R.id.btn4);
        aghd=(Button)findViewById(R.id.btn5);
        other=(Button)findViewById(R.id.btn6);


    }
}

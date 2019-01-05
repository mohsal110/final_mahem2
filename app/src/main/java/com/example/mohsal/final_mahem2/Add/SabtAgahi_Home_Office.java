package com.example.mohsal.final_mahem2.Add;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mohsal.final_mahem2.R;

public class SabtAgahi_Home_Office extends AppCompatActivity {
Button home,office;
TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabt_agahi__home__office);

       init();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SabtAgahi_Home_Office.this,SabtAgahi_Amlak_Home.class);
                startActivity(i);
            }
        });

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SabtAgahi_Home_Office.this,SabtAgahi_Amlak_Office.class);
                startActivity(i);
            }
        });

    }
    private void init()
    {
        title=(TextView)findViewById(R.id.title) ;
        home=(Button)findViewById(R.id.btn1);
        office=(Button)findViewById(R.id.btn2);
    }
}

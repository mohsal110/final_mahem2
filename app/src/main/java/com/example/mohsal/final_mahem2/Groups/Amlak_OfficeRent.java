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

public class Amlak_OfficeRent extends AppCompatActivity  {
    Button shop,office,tejari;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak__office_rent);


        init();

        shop.setOnClickListener(new IntentClick("8"));
        office.setOnClickListener(new IntentClick("9"));
        tejari.setOnClickListener(new IntentClick("10"));



        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
    class IntentClick implements View.OnClickListener {
        private String Id;

        public IntentClick(String id) {
            Id = id;
        }

        @Override
        public void onClick(View view) {
            Intent i = new Intent(getBaseContext(), Ads.class);
            i.putExtra("id", Id);
            startActivity(i);
        }
    }

    private void init()
    {
        title=(TextView)findViewById(R.id.title);
        shop=(Button)findViewById(R.id.btn1);
        office=(Button)findViewById(R.id.btn2);
        tejari=(Button)findViewById(R.id.btn3);

    }
    }

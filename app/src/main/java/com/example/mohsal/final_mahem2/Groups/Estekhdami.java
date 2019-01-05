package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Estekhdami extends AppCompatActivity  {
Button fani,monshi,nurse,edari,teach,mali,seller,seraydar,resturan,kar_sakhteman,art,beauty,computer,haml,other;
    TextView title;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estekhdami);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        init();

        fani.setOnClickListener(new IntentClick("29"));
        monshi.setOnClickListener(new IntentClick("30"));
        nurse.setOnClickListener(new IntentClick("31"));
        edari.setOnClickListener(new IntentClick("32"));
        teach.setOnClickListener(new IntentClick("33"));
        mali.setOnClickListener(new IntentClick("34"));
        seller.setOnClickListener(new IntentClick("35"));
        seraydar.setOnClickListener(new IntentClick("36"));
        resturan.setOnClickListener(new IntentClick("37"));
        kar_sakhteman.setOnClickListener(new IntentClick("38"));
        art.setOnClickListener(new IntentClick("39"));
        beauty.setOnClickListener(new IntentClick("40"));
        computer.setOnClickListener(new IntentClick("41"));
        haml.setOnClickListener(new IntentClick("42"));
        other.setOnClickListener(new IntentClick("43"));


        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

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
    { title=(TextView)findViewById(R.id.title);
        fani=(Button)findViewById(R.id.btn1);
        monshi=(Button)findViewById(R.id.btn2);
        nurse=(Button)findViewById(R.id.btn3);
        edari=(Button)findViewById(R.id.btn4);
        teach=(Button)findViewById(R.id.btn5);
        mali=(Button)findViewById(R.id.btn6);
        seller=(Button)findViewById(R.id.btn7);
        seraydar=(Button)findViewById(R.id.btn8);
        resturan=(Button)findViewById(R.id.btn9);
        kar_sakhteman=(Button)findViewById(R.id.btn10);
        art=(Button)findViewById(R.id.btn11);
        beauty=(Button)findViewById(R.id.btn12);
        computer=(Button)findViewById(R.id.btn13);
        haml=(Button)findViewById(R.id.btn14);
        other=(Button)findViewById(R.id.btn15);


    }
}



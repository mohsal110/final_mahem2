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

public class Khadamat_teach extends AppCompatActivity  {
Button Language,school,software,art,sport,moshaver;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat_teach);


        init();

        Language.setOnClickListener(new IntentClick("75"));
        school.setOnClickListener(new IntentClick("76"));
        software.setOnClickListener(new IntentClick("77"));
        art.setOnClickListener(new IntentClick("78"));
        sport.setOnClickListener(new IntentClick("79"));
        moshaver.setOnClickListener(new IntentClick("80"));
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

    private void init(){
        title=(TextView)findViewById(R.id.title);
        Language=(Button)findViewById(R.id.btn1);
        school=(Button)findViewById(R.id.btn2);
        software=(Button)findViewById(R.id.btn3);
        art=(Button)findViewById(R.id.btn4);
        moshaver=(Button)findViewById(R.id.btn6);
        sport=(Button)findViewById(R.id.btn5);

    }
}

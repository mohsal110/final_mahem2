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

public class Sargarmi_book extends AppCompatActivity {
Button teach,religion,history,literary,magazine,other;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi_book);

        init();

        teach.setOnClickListener(new IntentClick("98"));
        religion.setOnClickListener(new IntentClick("99"));
        history.setOnClickListener(new IntentClick("100"));
        literary.setOnClickListener(new IntentClick("101"));
        magazine.setOnClickListener(new IntentClick("102"));
        other.setOnClickListener(new IntentClick("103"));

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
        teach=(Button)findViewById(R.id.btn1);
        religion=(Button)findViewById(R.id.btn2);
        history=(Button)findViewById(R.id.btn3);
        literary=(Button)findViewById(R.id.btn4);
        magazine=(Button)findViewById(R.id.btn5);
        other=(Button)findViewById(R.id.btn6);

    }
}

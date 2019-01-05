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

public class Amlak_HomeSell extends AppCompatActivity {
Button aparteman,home,zamin;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak__home_sell);

        init();

        aparteman.setOnClickListener(new IntentClick("3"));
        home.setOnClickListener(new IntentClick("4"));
        zamin.setOnClickListener(new IntentClick("5"));

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
        aparteman=(Button)findViewById(R.id.btn1);
        home=(Button)findViewById(R.id.btn2);
        zamin=(Button)findViewById(R.id.btn3);

    }

}

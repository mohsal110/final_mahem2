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

public class Personal extends AppCompatActivity {
Button clothes,watch,health,child_clothes,other;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        init();

        clothes.setOnClickListener(new IntentClick("87"));
        watch.setOnClickListener(new IntentClick("88"));
        health.setOnClickListener(new IntentClick("89"));
        child_clothes.setOnClickListener(new IntentClick("90"));
        other.setOnClickListener(new IntentClick("91"));

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
        clothes=(Button)findViewById(R.id.btn1);
        watch=(Button)findViewById(R.id.btn2);
        health=(Button)findViewById(R.id.btn3);
        child_clothes=(Button)findViewById(R.id.btn4);
        other=(Button)findViewById(R.id.btn5);

    }
}

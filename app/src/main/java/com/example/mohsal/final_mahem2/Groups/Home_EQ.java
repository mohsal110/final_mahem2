package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home_EQ extends AppCompatActivity {
Button kitchen,design;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__eq);

        init();

        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_EQ.this,Home_Kitchen.class);
                startActivity(i);
            }
        });

        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_EQ.this,Home_Design.class);
                startActivity(i);
            }
        });

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }


    private void init()
    {

        title=(TextView)findViewById(R.id.title);
        kitchen=(Button)findViewById(R.id.btn1);
        design=(Button)findViewById(R.id.btn2);

    }

}

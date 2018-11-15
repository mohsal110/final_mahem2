package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Electric extends AppCompatActivity {
Button tablet,net,soti,console,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);





        tablet=(Button)findViewById(R.id.btn1);
        net=(Button)findViewById(R.id.btn2);
        soti=(Button)findViewById(R.id.btn3);
        console=(Button)findViewById(R.id.btn4);
        other=(Button)findViewById(R.id.btn5);

        tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Electric.this,Electric_Tablet.class);
                startActivity(i);
            }
        });
        soti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Electric.this,Electric_soti.class);
                startActivity(i);
            }
        });
        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        console.setOnClickListener(new View.OnClickListener() {
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

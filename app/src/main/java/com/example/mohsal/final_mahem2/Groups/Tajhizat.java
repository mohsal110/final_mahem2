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

public class Tajhizat extends AppCompatActivity {
Button tajhizat,omde;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajhizat);


        init();


        tajhizat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Tajhizat.this,Tajhizat_tajhizat.class);
                startActivity(i);
            }
        });
        omde.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
          Intent i = new Intent(getBaseContext(), Ads.class);
          i.putExtra("id", "110");
          startActivity(i);
              }
                                });

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }


    private void init()
    {
        title=(TextView)findViewById(R.id.title);
        tajhizat=(Button)findViewById(R.id.btn1);
        omde=(Button)findViewById(R.id.btn2);

    }


}

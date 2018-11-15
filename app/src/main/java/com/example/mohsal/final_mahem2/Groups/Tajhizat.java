package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Tajhizat extends AppCompatActivity {
Button tajhizat,omde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajhizat);





        tajhizat=(Button)findViewById(R.id.btn1);
        omde=(Button)findViewById(R.id.btn2);

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
                                        Intent intent = new Intent(getBaseContext(), Ads.class);
                                        startActivity(intent);
                                    }
                                });

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
}

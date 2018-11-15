package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;

public class Khadamat extends AppCompatActivity {
Button pazirayi,beauty,clean,asbab_keshi,nurse,decor,repair,teach,computer,translate,maali,graphic,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat);




        pazirayi=(Button)findViewById(R.id.btn1);
        beauty=(Button)findViewById(R.id.btn2);
        clean=(Button)findViewById(R.id.btn3);
        asbab_keshi=(Button)findViewById(R.id.btn4);
        nurse=(Button)findViewById(R.id.btn5);
        decor=(Button)findViewById(R.id.btn6);
        repair=(Button)findViewById(R.id.btn7);
        teach=(Button)findViewById(R.id.btn8);
        computer=(Button)findViewById(R.id.btn9);
        translate=(Button)findViewById(R.id.btn10);
        maali=(Button)findViewById(R.id.btn11);
        graphic=(Button)findViewById(R.id.btn12);
        other=(Button)findViewById(R.id.btn13);

        teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Khadamat.this,Khadamat_teach.class);
                startActivity(i);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Khadamat.this,Khadamat_computer.class);
                startActivity(i);
            }
        });
        pazirayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        asbab_keshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        nurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });

       decor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });

        maali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), Ads.class);
                startActivity(intent);
            }
        });
        graphic.setOnClickListener(new View.OnClickListener() {
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

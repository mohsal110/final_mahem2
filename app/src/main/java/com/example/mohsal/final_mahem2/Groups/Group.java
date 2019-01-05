package com.example.mohsal.final_mahem2.Groups;

import android.content.Intent;
import com.example.mohsal.final_mahem2.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Group extends AppCompatActivity {
Button estekhdam,amlak,naghlie,electric,home,khadamat,tajhizat,sargarmi,personal;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);


        init();

        estekhdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Estekhdami.class);
                startActivity(i);
            }
        });
        amlak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Amlak.class);
                startActivity(i);
            }
        });
        naghlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Naghlieh.class);
                startActivity(i);
            }
        });

        electric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Electric.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Home_EQ.class);
                startActivity(i);
            }
        });
        khadamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Khadamat.class);
                startActivity(i);
            }
        });

        tajhizat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Tajhizat.class);
                startActivity(i);
            }
        });
        sargarmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Sargarmi.class);
                startActivity(i);
            }
        });

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Personal.class);
                startActivity(i);
            }
        });
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
private void init()
{
    title=(TextView)findViewById(R.id.title);
    estekhdam=(Button)findViewById(R.id.btn1);
    amlak=(Button)findViewById(R.id.btn2);
    naghlie=(Button)findViewById(R.id.btn3);
    electric=(Button)findViewById(R.id.btn4);
    home=(Button)findViewById(R.id.btn5);
    khadamat=(Button)findViewById(R.id.btn6);
    tajhizat=(Button)findViewById(R.id.btn7);
    sargarmi=(Button)findViewById(R.id.btn8);
    personal=(Button)findViewById(R.id.btn9);

}

}

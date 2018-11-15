package com.example.mohsal.final_mahem2.Groups;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;

public class Electric_Net extends AppCompatActivity {
Button laptop,Janebi,printer,modem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric__net);





        laptop=(Button)findViewById(R.id.btn1);
        Janebi=(Button)findViewById(R.id.btn2);
        printer=(Button)findViewById(R.id.btn3);
        modem=(Button)findViewById(R.id.btn4);
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }
}

package com.example.mohsal.final_mahem2.Groups;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;

public class Amlak_HomeRent extends AppCompatActivity {
    Button aparteman,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak__home_rent);





        aparteman=(Button)findViewById(R.id.btn1);
        home=(Button)findViewById(R.id.btn2);

        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();

    }
}

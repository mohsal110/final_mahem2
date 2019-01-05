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

public class Khadamat_computer extends AppCompatActivity {
Button web,net,pc,mobile;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat_computer);


        init();

        web.setOnClickListener(new IntentClick("71"));
        net.setOnClickListener(new IntentClick("72"));
        pc.setOnClickListener(new IntentClick("73"));
        mobile.setOnClickListener(new IntentClick("74"));

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
        web=(Button)findViewById(R.id.btn1);
        net=(Button)findViewById(R.id.btn2);
        pc=(Button)findViewById(R.id.btn3);
        mobile=(Button)findViewById(R.id.btn4);

    }
}

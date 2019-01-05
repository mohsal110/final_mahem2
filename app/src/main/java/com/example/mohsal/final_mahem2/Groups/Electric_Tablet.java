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

public class Electric_Tablet extends AppCompatActivity {
Button mobile,tablet,LavazemJanebi,simcard;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric__tablet);

        init();

        mobile.setOnClickListener(new IntentClick("25"));
        tablet.setOnClickListener(new IntentClick("26"));
        LavazemJanebi.setOnClickListener(new IntentClick("27"));
        simcard.setOnClickListener(new IntentClick("28"));

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
        mobile=(Button)findViewById(R.id.btn1);
        tablet=(Button)findViewById(R.id.btn2);
        LavazemJanebi=(Button)findViewById(R.id.btn3);
        simcard=(Button)findViewById(R.id.btn4);

    }
}

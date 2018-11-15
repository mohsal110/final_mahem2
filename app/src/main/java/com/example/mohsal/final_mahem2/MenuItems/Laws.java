package com.example.mohsal.final_mahem2.MenuItems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.Add.SabtAgahi;
import com.example.mohsal.final_mahem2.Groups.Group;
import com.example.mohsal.final_mahem2.OffFinder.Off;
import com.example.mohsal.final_mahem2.R;

public class Laws extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);

        map();

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();
    }


    public void map() {

        navigationBar=findViewById(R.id.rr);
        Home = (ImageView) navigationBar.findViewById(R.id.home);
        Add = (ImageView) navigationBar.findViewById(R.id.add);
        Menu = (ImageView) navigationBar.findViewById(R.id.menu_f);
        MenuLine = (ImageView) navigationBar.findViewById(R.id.menuLine_f);
        Search =(ImageView)navigationBar.findViewById(R.id.search_f);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), com.example.mohsal.final_mahem2.Search_Filter.Search.class);
                i.putExtra("title","جستجو");
                startActivity(i);
                finish();
            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), Menu1.class);
                startActivity(i);
                finish();
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), SabtAgahi.class);
                startActivity(i);
                finish();
            }
        });

        MenuLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), Group.class);
                startActivity(i);
                finish();
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), Off.class);
                startActivity(i);
                finish();
            }
        });

    }
}


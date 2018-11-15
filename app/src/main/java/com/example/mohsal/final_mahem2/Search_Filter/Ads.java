package com.example.mohsal.final_mahem2.Search_Filter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.Add.SabtAgahi;
import com.example.mohsal.final_mahem2.Groups.Group;
import com.example.mohsal.final_mahem2.MenuItems.Menu1;
import com.example.mohsal.final_mahem2.OffFinder.Off;
import com.example.mohsal.final_mahem2.R;

import java.util.ArrayList;
import java.util.List;

public class Ads extends AppCompatActivity {
    private View navigationBar;
    private ImageView Home,Add,Menu,MenuLine,Search;


    private RecyclerView recyclerView;
    List<Advertising> AdvList;
    private AdvAdapter adapter;
    private int counter=5;
    ImageView Filter;


    private ArrayList<String> title=new ArrayList<String>() {

    };
    private ArrayList<String> description=new ArrayList<String>() {

    };
    private ArrayList<String> time=new ArrayList<String>() {

    };
    private ArrayList<Integer> image=new ArrayList<Integer>() {

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);
        AdvList=new ArrayList<>();

        for(int i=0;i<counter;++i) {

            ///////fill these strings with network information
            title.add("استخدام");
            description.add("منشی");
            time.add("دیروز");
            image.add(R.drawable.two);

            ////////////////////////////////////////////
            recyclerView =  findViewById(R.id.RecyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            ///this line add search views to the list:
            AdvList.add(new Advertising(title.get(i), description.get(i), time.get(i), image.get(i)));
            adapter = new AdvAdapter(this, AdvList);
            recyclerView.setAdapter(adapter);
        }



        Filter=(ImageView)findViewById(R.id.filter);
        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ads.this,Filter_other.class);
                startActivity(i);

            }
        });

        map();

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();
    }


    public void map() {

        navigationBar=findViewById(R.id.rr);
        Home =  findViewById(R.id.home);
        Add =  findViewById(R.id.add);
        Menu =  findViewById(R.id.menu_f);
        MenuLine =  findViewById(R.id.menuLine_f);
        Search =findViewById(R.id.search_f);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), com.example.mohsal.final_mahem2.Search_Filter.Search.class);
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

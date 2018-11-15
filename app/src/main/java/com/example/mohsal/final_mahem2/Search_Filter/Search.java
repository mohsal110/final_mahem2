package com.example.mohsal.final_mahem2.Search_Filter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.Add.SabtAgahi;
import com.example.mohsal.final_mahem2.Groups.Group;
import com.example.mohsal.final_mahem2.MenuItems.Menu1;
import com.example.mohsal.final_mahem2.OffFinder.Off;
import com.example.mohsal.final_mahem2.R;

import java.util.ArrayList;
import java.util.List;



public class Search extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;
    ImageView Filter;

    RecyclerView recyclerView;
    List<Advertising> AdvList;
    AdvAdapter adapter;
    private int counter=3;


    private ArrayList<String> title=new ArrayList<String>() {

    };
    private ArrayList<String> description=new ArrayList<String>() {

    };
    private ArrayList<String> time=new ArrayList<String>() {

    };
    private ArrayList<Integer> image=new ArrayList<Integer>() {

    };



    private String activity_title;
    private TextView ActivityTitle;
    Intent title_intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ActivityTitle=findViewById(R.id.activity_title);
        title_intent=getIntent();
        activity_title=title_intent.getExtras().get("title").toString();
        if(activity_title!=null){

            ActivityTitle.setText(activity_title);
        }




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
                Intent i=new Intent(Search.this,Filter_other.class);
                startActivity(i);

            }
        });

        Toast.makeText(this, getLocalClassName().toString() + "\nMohadese Salem", Toast.LENGTH_LONG).show();
        map();
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
                Intent i = new Intent(getBaseContext(), Search.class);
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

            }
        });


    }
}

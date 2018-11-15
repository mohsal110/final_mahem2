package com.example.mohsal.final_mahem2.Search_Filter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mohsal.final_mahem2.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Management_Panel extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Advertising> AdvList;
    panelAdapter adapter;
    CircleImageView AccountImage;


    TextView paneltxt;
    FloatingActionButton fab;
    private int counter=3;


    private ArrayList<String> title=new ArrayList<String>() {

    };
    private ArrayList<String> description=new ArrayList<String>() {

    };
    private ArrayList<String> time=new ArrayList<String>() {

    };
    private ArrayList<Integer> ads_image=new ArrayList<Integer>() {

    };


    private ArrayList<String> chat_time=new ArrayList<String>() {

    };
    private int userImage;

    private String family_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management__panel);
        //fill this variables with information

        family_name="نوین فر";
        userImage=R.drawable.cameraa;



        AdvList=new ArrayList<>();

        for(int i=0;i<counter;++i) {

            ///////fill these strings with network information
            title.add("vvv");
            description.add("PPPPPPP");
            time.add("aaaaaaa");

            chat_time.add("eee");
            ads_image.add(R.drawable.two);


            ////////////////////////////////////////////
            recyclerView =  findViewById(R.id.RecyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            ///this line add search views to the list:
            AdvList.add(new Advertising(title.get(i), description.get(i), time.get(i), ads_image.get(i),family_name,chat_time.get(i),userImage));
            adapter = new panelAdapter(this, AdvList);
            recyclerView.setAdapter(adapter);
        }


        paneltxt=(TextView)findViewById(R.id.mp);
        paneltxt.setText(family_name+"پنل مدیریت");

        AccountImage=(CircleImageView)findViewById(R.id.AccoutImage);
        AccountImage.setImageResource(userImage);

        fab=(FloatingActionButton)findViewById(R.id.FAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

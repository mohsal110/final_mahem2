package com.example.mohsal.final_mahem2.MenuItems;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.Add.SabtAgahi;
import com.example.mohsal.final_mahem2.Groups.Group;
import com.example.mohsal.final_mahem2.JobBank.JobBankMenu;
import com.example.mohsal.final_mahem2.OffFinder.Off;
import com.example.mohsal.final_mahem2.R;
import com.example.mohsal.final_mahem2.Search_Filter.Ads;
import com.example.mohsal.final_mahem2.Search_Filter.Collections;
import com.example.mohsal.final_mahem2.Search_Filter.Management_Panel;

public class Menu1 extends AppCompatActivity {

    RelativeLayout JobBank,OffFinder,Register,Laws,ads,Estekhdami,MyAds,Share,Favorite,aboutUs,Setting,ContactUs;

    View navigationBar;
    ImageView Home, Add, Menu, MenuLine, Search;
    ImageView imgR;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        JobBank=findViewById(R.id.btn_bank);
        OffFinder=findViewById(R.id.btn_off);
        Register=findViewById(R.id.btn_register);
        Laws=findViewById(R.id.btn_law);
        ads=findViewById(R.id.btn_ads);
        Estekhdami=findViewById(R.id.btn_employment);
        MyAds=findViewById(R.id.btn_my_ads);
        Share=findViewById(R.id.btn_share);
        Favorite=findViewById(R.id.btn_favorite);
        aboutUs=findViewById(R.id.btn_about_us);
        Setting=findViewById(R.id.btn_setting);
        ContactUs=findViewById(R.id.btn_contact_us);

         imgR=(ImageView)findViewById(R.id.img_register);
         tv=(TextView)findViewById(R.id.TV1);


        Favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu1.this,Collections.class);
                startActivity(intent);
            }
        });
        Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "";
                String shareSub = "";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        JobBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,JobBankMenu.class);
                startActivity(i);
            }
        });

        OffFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,Off.class);
                startActivity(i);
            }
        });


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Menu1.this,Register.class);
                startActivity(i);

            }
        });


        Laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,Laws.class);
                startActivity(i);
            }
        });

        ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,Ads.class);
                startActivity(i);

            }
        });


        Estekhdami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,com.example.mohsal.final_mahem2.Search_Filter.Search.class);
                i.putExtra("title","استخدامی");
                startActivity(i);

            }
        });

        MyAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,Management_Panel.class);
                startActivity(i);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,AboutUs.class);
                startActivity(i);
            }
        });
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,Setting.class);
                startActivity(i);
            }
        });

        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu1.this,ContactUs.class);
                startActivity(i);
            }
        });





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

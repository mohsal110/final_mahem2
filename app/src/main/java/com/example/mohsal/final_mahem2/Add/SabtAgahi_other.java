package com.example.mohsal.final_mahem2.Add;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;

import java.util.ArrayList;

public class SabtAgahi_other extends AppCompatActivity {
    EditText Group,Title,Type,Gheimat,Tozihat,location;
    View TypeLayout,GheimatLayout;
    TextView Type_1,Type_2,Gh_1,Gh_2,Gh_3,Gh_4;
    CheckBox rules;
    ImageView cam1,cam2,cam3,cam4,cam5;
    Button send;
    Bitmap yourSelectedImage;
    PopupWindow Type_Layout,Gheimat_Layout;
    ArrayList<ImageView> Cameras;
    ImageView map_img;
    TextView title,select,fiveTimes;
    private String searchingLocation;
    int pic=0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabt_agahi_other);


        init();

        for(final ImageView item:Cameras)
        {item.setImageResource(R.drawable.icons88);
            item.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View view) {
                    pic=Cameras.indexOf(item);
                    pick();




                }
            });
        }

        Intent ii=getIntent();
       Group.setText(ii.getStringExtra("group"));

        Gheimat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                GheimatLayout = inflater.inflate(R.layout.gheimat_layout, null);
                Gheimat_Layout = new PopupWindow(GheimatLayout, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                Gheimat_Layout.showAsDropDown(view);
                Gheimat_map();

            }
        });



        Type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                TypeLayout=inflater.inflate(R.layout.type_layout,null);
                Type_Layout= new PopupWindow(TypeLayout, LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                Type_Layout.showAsDropDown(view);

              Type_map();

            }
        });


        map_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent=new Intent(Intent.ACTION_VIEW);
                searchingLocation="";
                mapIntent.setData(Uri.parse("geo:0,0?q="+searchingLocation));
                startActivity(mapIntent);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SabtAgahi_other__SEND(Group.getText().toString(),Title.getText().toString(),Type.getText().toString()
                        ,Gheimat.getText().toString(),Tozihat.getText().toString(),location.getText().toString());
                tt("ارسال شد.");
            }
        });

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();


    }

    public void tt(String s)
    {
        Toast.makeText(getBaseContext(),s,Toast.LENGTH_SHORT).show();
    }



    public void Type_map()
    {
        Type_1=(TextView)TypeLayout.findViewById(R.id.Tt1);
        Type_2=(TextView)TypeLayout.findViewById(R.id.Tt2);

        Type_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_1.getText().toString());
                Type_Layout.dismiss();
            }
        });

        Type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_2.getText().toString());
                Type_Layout.dismiss();
            }
        });


    }

    public  void Gheimat_map()
    {
        Gh_1=(TextView)GheimatLayout.findViewById(R.id.Tt1);
        Gh_2=(TextView)GheimatLayout.findViewById(R.id.Tt2);
        Gh_3=(TextView)GheimatLayout.findViewById(R.id.Tt3);
        Gh_4=(TextView)GheimatLayout.findViewById(R.id.Tt4);


        Gh_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_1.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_2.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_3.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_4.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

    }


    //pick picture...
    public void pick()
    {

        final int ID_THIS_ACTIVITY=30;
        Intent i = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        i.setType("image/*");
        final int ACTIVITY_SELECT_IMAGE = 1234;
        try {
            if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                    String[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
                    requestPermissions(permission, ID_THIS_ACTIVITY);
                } else {

                    startActivityForResult(i, ACTIVITY_SELECT_IMAGE);
                }
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case 1234:
                if (resultCode == RESULT_OK) {
                    Uri selectedImage = data.getData();
                    String[] filePathColumn = {MediaStore.Images.Media.DATA};

                    Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
                    cursor.moveToFirst();

                    int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                    String filePath = cursor.getString(columnIndex);

                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;

                    cursor.close();
                    yourSelectedImage = BitmapFactory.decodeFile(filePath, options);
                    Cameras.get(pic).setImageBitmap(yourSelectedImage);



                }
        }
    }



    private void init()
    {
        title=(TextView)findViewById(R.id.title) ;
        select=(TextView)findViewById(R.id.select) ;
        fiveTimes=(TextView)findViewById(R.id.fivetimes) ;
        Group=(EditText)findViewById(R.id.T1);
        Title=(EditText)findViewById(R.id.T2);
        Type=(EditText)findViewById(R.id.T3);
        Gheimat=(EditText)findViewById(R.id.T4);
        Tozihat=(EditText)findViewById(R.id.T5);
        location=(EditText)findViewById(R.id.T6);

        map_img=(ImageView)findViewById(R.id.map_img);

        send=(Button)findViewById(R.id.send);
        cam1=(ImageView)findViewById(R.id.c1);
        cam2=findViewById(R.id.c2);
        cam3=findViewById(R.id.c3);
        cam4=findViewById(R.id.c4);
        cam5=findViewById(R.id.c5);
        rules=(CheckBox)findViewById(R.id.rule);


        Cameras=new ArrayList<ImageView>(5);
        Cameras.add(cam1);
        Cameras.add(cam2);
        Cameras.add(cam3);
        Cameras.add(cam4);
        Cameras.add(cam5);

    }


    ///network
    void SabtAgahi_other__SEND(String Group,String Title,String Type,String Gheimat,String Tozihat,String location)
    {

    }

}

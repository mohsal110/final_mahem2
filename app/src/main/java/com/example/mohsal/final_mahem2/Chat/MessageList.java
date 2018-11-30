package com.example.mohsal.final_mahem2.Chat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohsal.final_mahem2.R;

import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MessageList extends AppCompatActivity {

    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;

    List<BaseMessage> messageList;

    String ph_number="";
    String formattedNumber = PhoneNumberUtils.formatNumber(ph_number, Locale.getDefault().getCountry());

    RelativeLayout SendMessage;
    ImageView back,ShareMedia,Call;
    CircleImageView ProfileImg;
    TextView Name;
    EditText MessageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);
        mMessageAdapter = new MessageListAdapter(this, messageList);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));

        SendMessage=(RelativeLayout)findViewById(R.id.SendBtn);
        SendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"sent", Toast.LENGTH_LONG).show();
            }
        });

        back=(ImageView)findViewById(R.id.flsh);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + formattedNumber));

                final int ID_THIS_ACTIVITY=10;
                if(Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.CALL_PHONE};
                        requestPermissions(permission, ID_THIS_ACTIVITY);
                    }
                    else{
                        startActivity(i);
                    }
                }
            }
        });
        }
    }


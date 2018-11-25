package com.example.mohsal.final_mahem2.OffFinder;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mohsal.final_mahem2.R;


@SuppressLint("ValidFragment")
public class Bottom_Sheet extends BottomSheetDialogFragment {

    TextView near;
    TextView group;
    TextView off;
    TextView map;
    Context context;
    FragmentManager fragmentManager;

    @SuppressLint("ValidFragment")
    public Bottom_Sheet(Context c) {
        this.context=c;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL,R.style.CustomBottomSheetTheme);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.near_me_bottom_sheet,container,false);


        near=view.findViewById(R.id.near);
        group=view.findViewById(R.id.group);
        off=view.findViewById(R.id.off);
        map=view.findViewById(R.id.map);


        near.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,Near_me.class);
                startActivity(i);
            }
        });

        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bottom_sheet_all bottom_sheet=new Bottom_sheet_all();
                bottom_sheet.show(getActivity().getSupportFragmentManager(),"");
                ImageView imageView=new ImageView(context);
                imageView.setImageResource(R.drawable.logo);
                RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.ALIGN_TOP,R.layout.all_takhfif_bottomsheet);
                imageView.setLayoutParams(params);
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bottom_Sheet_map bottom_sheet=new Bottom_Sheet_map();
                bottom_sheet.show(getActivity().getSupportFragmentManager(),"");
                ImageView imageView=new ImageView(context);
                imageView.setImageResource(R.drawable.logo);
                RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.ALIGN_TOP,R.layout.bottom_map);
                imageView.setLayoutParams(params);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(), com.example.mohsal.final_mahem2.OffFinder.map.class);
                startActivity(intent);
            }
        });
        return view;
    }

//    @SuppressLint("RestrictedApi")
//    @Override
//    public void setupDialog(Dialog dialog, int style) {
//        super.setupDialog(dialog, style);
//        View contentView=View.inflate(getContext(),R.layout.near_me_bottom_sheet,null);
//        dialog.setContentView(contentView);
//
//        CoordinatorLayout.LayoutParams params=(CoordinatorLayout.LayoutParams) ((View)contentView.getParent()
//        ).getLayoutParams();
//
//        CoordinatorLayout.Behavior behavior=params.getBehavior();
//        ((View) contentView.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));
//    }
}

package com.example.tshivam.customlayoutmanager;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.ABC> {


    private Context context;

    List<String> aa=new ArrayList<>();

    List<String> link=new ArrayList<>();

    public DisplayAdapter(Context context) {

        this.context=context;
        aa.add("aaa");
        link.add("https://cdn.dribbble.com/users/59947/screenshots/3864137/muti-1_1x.jpg");
        link.add("https://cdn.dribbble.com/users/2738/screenshots/3865015/once_upon_business_crads_1x.jpg");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        link.add("https://cdn.dribbble.com/users/2738/screenshots/3865015/once_upon_business_crads_1x.jpg");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        link.add("https://cdn.dribbble.com/users/2738/screenshots/3865015/once_upon_business_crads_1x.jpg");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("bbb");
        aa.add("ccc");
        aa.add("ddd");
        aa.add("eee");
        aa.add("fff");
        aa.add("ggg");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("hhh");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("iii");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("jjj");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("kkk");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("lll");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("mmm");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("nnn");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("ooo");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");
        aa.add("ppp");
        link.add("https://cdn.dribbble.com/users/418188/screenshots/3863957/creative_ux_design_illustration_tubik_1x.png");

    }

    @NonNull
    @Override
    public DisplayAdapter.ABC onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ABC(LayoutInflater.from(context).inflate(R.layout.item_display,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ABC abc, int i) {
        abc.tv1.setText(aa.get(i));

    }


    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return aa.size();
    }

    @Override
    public void onViewRecycled(@NonNull DisplayAdapter.ABC holder) {
        super.onViewRecycled(holder);
    }



    public class ABC extends RecyclerView.ViewHolder{


        TextView tv1;
        ImageView Iv1;


        public ABC(@NonNull View itemView) {


            super(itemView);

            tv1= itemView.findViewById(R.id.tv1);
            Iv1 = itemView.findViewById(R.id.Ivd);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, "num"+ getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }





}
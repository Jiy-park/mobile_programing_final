package com.example.viewpager2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Vector;

public class CustomDialog2 extends Dialog {
    private TextView txt_contents;
    Button tv;
    private Button shutdownClick;
    LinearLayout l;
    int tv_id = 0;
    Vector<SMS> sms;



    public CustomDialog2(@NonNull Context context, Vector<SMS> sms, ViewPager2 viewpager,ArrayList<String> imageList,ArrayList<String> dateList,ArrayList<String> input1, ArrayList<String> output) {

        super(context);
        setContentView(R.layout.dialog2);
        init(sms,imageList,dateList,input1, output, viewpager);
    }
    void init(Vector<SMS> sms, ArrayList<String> imageList, ArrayList<String> dateList, ArrayList<String> input1, ArrayList<String> output, ViewPager2 viewpager){

        create_tv(sms);
        shutdownClick = findViewById(R.id.btn_shutdown);

        shutdownClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int target = 0;

                for(int i=0; i<sms.size(); i++)
                {
                    target = finddate(sms.elementAt(i).getDate().substring(0,2),sms.elementAt(i).getDate().substring(3,5));


                    output.remove(target-1);
                    output.add(target-1, "지출 : "+sms.elementAt(i).getPrice());
                    //sms.remove(i);
                }

                viewpager.setAdapter(new MainActivity.PagerAdapter().setImageList(imageList,dateList,input1,output));
                viewpager.setCurrentItem(target-1,true);
                cancel();
            }
        });
    }

    public int finddate(String temp, String temp2)
    {
        int target =0;

        if(temp.equals("01"))
        {

        }
        else if(temp.equals("02"))
        {

        }
        else if(temp.equals("03"))
        {

        }
        else if(temp.equals("04"))
        {

        }
        else if(temp.equals("05"))
        {

        }
        else if(temp.equals("06"))
        {

        }else if(temp.equals("07"))
        {

        }else if(temp.equals("08"))
        {

        }else if(temp.equals("09"))
        {

        }else if(temp.equals("10"))
        {

        }else if(temp.equals("11"))
        {
            Log.d("month check", "");
            target += Integer.parseInt(temp2);

        }else if(temp.equals("12"))
        {
            Log.d("month check", ""+temp);
            target += Integer.parseInt(temp2);
            target += 30;
        }

        return  target;
    }


    public void create_tv(Vector<SMS> v){
        Button[] tv = new Button[v.size()];
        l = (LinearLayout) findViewById(R.id.main_layout_dialog);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, //width
                LinearLayout.LayoutParams.WRAP_CONTENT //height
        );
        Log.v("asd","dsadasdasdad11");
        for(int i = 0; i < v.size(); i++){
            tv[i] = new Button(this.getContext());
            tv[i].setLayoutParams(params);
            tv[i].setText("date : " + v.elementAt(i).getDate() + "price : " + v.elementAt(i).getPrice());
            tv[i].setTextSize(40);
            tv[i].setId(i);
            tv_id++;
            int num = i;
            tv[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button del_btn = (Button)findViewById(num);
                    l.removeView(del_btn);
                    Log.v("button test", "onClick: " + tv[num].getId());
                    v.remove(tv[num].getId());
                    Log.d("inner : " , ""+v.size());
                }
            });
            l.addView(tv[i]);

        }

    }
}
package com.example.viewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    private ArrayList<String> imageList = new ArrayList<>(
            Arrays.asList(
                    "a.png",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""




            )
    );

    private ArrayList<String> dateList = new ArrayList<>(
            Arrays.asList(
                    "2022/11/ 01",
                    "2022/11/ 02",
                    "2022/11/ 03",
                    "2022/11/ 04",
                    "2022/11/ 05",
                    "2022/11/ 06",
                    "2022/11/ 07",
                    "2022/11/ 08",
                    "2022/11/ 09",
                    "2022/11/ 10",
                    "2022/11/ 11",
                    "2022/11/ 12",
                    "2022/11/ 13",
                    "2022/11/ 14",
                    "2022/11/ 15",
                    "2022/11/ 16",
                    "2022/11/ 17",
                    "2022/11/ 18",
                    "2022/11/ 19",
                    "2022/11/ 20",
                    "2022/11/ 21",
                    "2022/11/ 22",
                    "2022/11/ 23",
                    "2022/11/ 24",
                    "2022/11/ 25",
                    "2022/11/ 26",
                    "2022/11/ 27",
                    "2022/11/ 28",
                    "2022/11/ 29",
                    "2022/11/ 30",
                    "2022/12/ 01",
                    "2022/12/ 02",
                    "2022/12/ 03",
                    "2022/12/ 04",
                    "2022/12/ 05",
                    "2022/12/ 06",
                    "2022/12/ 07",
                    "2022/12/ 08",
                    "2022/12/ 09",
                    "2022/12/ 10",
                    "2022/12/ 11",
                    "2022/12/ 12",
                    "2022/12/ 13",
                    "2022/12/ 14",
                    "2022/12/ 15",
                    "2022/12/ 16",
                    "2022/12/ 17",
                    "2022/12/ 18",
                    "2022/12/ 19",
                    "2022/12/ 20",
                    "2022/12/ 21",
                    "2022/12/ 22",
                    "2022/12/ 23",
                    "2022/12/ 24",
                    "2022/12/ 25",
                    "2022/12/ 26",
                    "2022/12/ 27",
                    "2022/12/ 28",
                    "2022/12/ 29",
                    "2022/12/ 30",
                    "2022/12/ 31"
            )
    );

    private ArrayList<String> input1 = new ArrayList<>(
            Arrays.asList(
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0",
                    "수입 : 0"

            )
    );

    private ArrayList<String> output = new ArrayList<>(
            Arrays.asList(
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "자출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0",
                    "지출 : 0"

            )
    );


    private ArrayList<String> smsdata= new ArrayList<>();

    public Vector<SMS> sms = new Vector<SMS>();



    private void requirePerms(){
        String[] permissions = {Manifest.permission.RECEIVE_SMS};
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);
        if(permissionCheck == PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, permissions, 1);
        }
    }

    private CustomDialog2 customDialog;

    private class ZoomInPageTransformer implements ViewPager2.PageTransformer {
        private static final float MIN_SCALE = 0.85f; // scale

        // sizes
        private float imageMargin = getResources().getDimensionPixelOffset(R.dimen.image_margin);
        private float imageSize = getResources().getDimensionPixelSize(R.dimen.image_size);
        private float screenWidth = getResources().getDisplayMetrics().widthPixels;
        private float offsetPx = screenWidth - imageMargin - imageSize;


        @Override
        public void transformPage(@NonNull View view, float position) {
            view.setTranslationX(position * -offsetPx);
            if( position < -1 ) return;
            if( position <= 1 )
            {
                // animation views
                float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position * getEase(Math.abs(position))));
                view.setScaleX(scaleFactor);
                view.setScaleY(scaleFactor);

            }
            else
            {
                // side views
                view.setScaleX(MIN_SCALE);
                view.setScaleY(MIN_SCALE);
            }
        }


        private float getEase(float position)
        {
            float sqt = position * position;
            return sqt / (2.0f * (sqt - position) + 1.0f);
        }
    }




    public static class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.ViewHolder> {

        private class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView today;
            TextView input_tx;
            TextView output;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                this.imageView = itemView.findViewById(R.id.imageView);
                this.today = itemView.findViewById(R.id.today);
                this.input_tx = itemView.findViewById(R.id.input_target);
                this.output = itemView.findViewById(R.id.tv2);

            }
        }

        private ArrayList<String> imageList;
        private ArrayList<String> dateList;
        private ArrayList<String> input1;
        private ArrayList<String> output;

        public PagerAdapter setImageList(ArrayList<String> imageList, ArrayList<String> dateList, ArrayList<String> input1, ArrayList<String> output) {
            this.imageList = imageList;
            this.dateList = dateList;
            this.input1 = input1;
            this.output = output;
            return this;
        }



        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            Context context = parent.getContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.list_item, parent, false);
            ViewHolder viewHolder =  new ViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            if( dateList == null ) return;
            holder.today.setText(dateList.get(position));

            Log.v("asd","" + input1.size() + "  " + dateList.size() + " " + imageList.size() + " " + output.size());
            if( input1 == null ) return;
            holder.input_tx.setText(input1.get(position));
            holder.output.setText(output.get(position));

        }

        @Override
        public int getItemCount() {
            return imageList.size();
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LayoutInflater inflater= getLayoutInflater();
        View v1 = inflater.inflate(R.layout.list_item,null);

        ViewPager2 viewpager = (ViewPager2) findViewById(R.id.viewPager);
        SeekBar seekBar =(SeekBar)findViewById(R.id.seekbar);
        Button topbtn = (Button)findViewById(R.id.topbtn);

        requirePerms();

        Intent passedIntent = getIntent();
        processIntent(passedIntent);


        topbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(smsdata.size() == 1)
                {
                    Toast.makeText(getApplicationContext(),"메시지 없다", Toast.LENGTH_LONG).show();
                    return;
                }

                else{
                    String temp = "";
                    temp = smsdata.get(smsdata.size()-1);

                    int first_price = 0;
                    int last_price = 0;
                    int date_check_f = 0;
                    int date_check_l = 0;
                    int [] month = {31,28, 31, 30 ,31, 30, 31,31,30,31, 30, 31};
                    int target = 0;
//
                    for(int i=0; i<temp.length(); i++)
                    {
                        if(temp.length() == 0)
                        {
                            break;
                        }
                        if(i== temp.length()-1)
                        {
                            break;
                        }

                        Log.d("inner : " , ""+temp.substring(i,i+1));
                        if(temp.substring(i,i+1).equals("호"))
                        {
                            Log.d("check", "");
                            first_price = i+1;
                        }

                        if(temp.substring(i,i+1).equals("원"))
                        {
                            last_price = i+1;

                        }

                        if(temp.substring(i,i+1).equals("/"))
                        {
                            date_check_f= i-2;
                            date_check_l = i+3;
                            break;
                        }

                    }

                    sms.add(new SMS(temp.substring(date_check_f,date_check_l),temp.substring(first_price,last_price)));

                    customDialog = new CustomDialog2(MainActivity.this, sms, viewpager,imageList, dateList, input1, output);


                    customDialog.show();

                    viewpager.setAdapter(new PagerAdapter().setImageList(imageList,dateList,input1,output));
                    viewpager.setCurrentItem(target,true);
                }
            }
        });



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                viewpager.setCurrentItem(i,true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        viewpager.setOffscreenPageLimit(30);
        viewpager.setPageTransformer(new ZoomInPageTransformer());
        viewpager.setAdapter(new PagerAdapter().setImageList(imageList,dateList,input1,output));


    }


    @Override
    protected void onNewIntent(Intent intent) {
        processIntent(intent);

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent) {

        if(intent != null){
            String sender = intent.getStringExtra("sender");
            String contents = intent.getStringExtra("contents");
            String receivedDate = intent.getStringExtra("receivedDate");


            smsdata.add(contents);


        }
    }
}
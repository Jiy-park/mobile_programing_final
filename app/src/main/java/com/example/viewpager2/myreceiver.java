package com.example.viewpager2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class myreceiver extends BroadcastReceiver {

    private static final String TAG = "SMSReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Bundle bundle = intent.getExtras();
        SmsMessage[] messages = parseSmsMessage(bundle);
        //intent.putExtra()

        if(messages.length > 0){
            String sender = messages[0].getOriginatingAddress();
            String content = messages[0].getMessageBody().toString();
            Date date = new Date(messages[0].getTimestampMillis());


            Intent myIntent = new Intent(context, MainActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                    Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            myIntent.putExtra("sender",sender);
            myIntent.putExtra("contents",content);

            context.startActivity(myIntent);
        }

    }


    private SmsMessage[] parseSmsMessage(Bundle bundle) {
        Object[] objs = (Object[]) bundle.get("pdus");
        SmsMessage[] messages = new SmsMessage[objs.length];

        for(int i=0; i<objs.length; i++) {
            messages[i] = SmsMessage.createFromPdu((byte[])objs[i]);
        }

        return messages;
    }
}
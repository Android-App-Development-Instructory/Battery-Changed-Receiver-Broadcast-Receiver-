package com.alaminkarno.batterychangedbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryCheck extends BroadcastReceiver {

    TextView textView;

    public BatteryCheck(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        int batteryPercentage = intent.getIntExtra("level",0);

        textView.setText(batteryPercentage+"%");

    }
}

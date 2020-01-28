package com.project.lokey;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.google.android.gms.location.GeofencingClient;

public class GeofenceBroadcastReceiver extends BroadcastReceiver{

    private GeofencingClient geofencingClient;

    public GeofenceBroadcastReceiver() {
    }


    @Override
    public void onReceive(Context context, Intent intent) {

    }
}

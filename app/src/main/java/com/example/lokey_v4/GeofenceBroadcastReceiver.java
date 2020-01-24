package com.example.lokey_v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.LocationServices;

import androidx.appcompat.app.AppCompatActivity;

public class GeofenceBroadcastReceiver extends BroadcastReceiver{

    private GeofencingClient geofencingClient;

    public GeofenceBroadcastReceiver() {
    }


    @Override
    public void onReceive(Context context, Intent intent) {

    }
}

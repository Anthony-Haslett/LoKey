package com.project.lokey;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

class Constants {

    //Location
    static final String GEOFENCE_ID = "University";

    static final float GEOFENCE_RADIUS_IN_METERS = 50;

    /**
     * Map for storing information about The unversity of salford.
     */
    static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<>();

    static {
        // Uni
        //

        AREA_LANDMARKS.put(GEOFENCE_ID, new LatLng(53.4864, -2.2734));
    }
}

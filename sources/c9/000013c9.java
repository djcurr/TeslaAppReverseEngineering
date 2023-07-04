package com.airbnb.android.react.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public class r {
    public static boolean a(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        LatLng center = latLngBounds.getCenter();
        double d11 = center.latitude;
        double d12 = center.longitude;
        LatLng latLng = latLngBounds.northeast;
        double d13 = latLng.latitude;
        LatLng latLng2 = latLngBounds.southwest;
        double d14 = d13 - latLng2.latitude;
        double d15 = latLng.longitude - latLng2.longitude;
        LatLng center2 = latLngBounds2.getCenter();
        double d16 = center2.latitude;
        double d17 = center2.longitude;
        LatLng latLng3 = latLngBounds2.northeast;
        double d18 = latLng3.latitude;
        LatLng latLng4 = latLngBounds2.southwest;
        double d19 = d18 - latLng4.latitude;
        double d21 = latLng3.longitude - latLng4.longitude;
        double b11 = b(latLngBounds, latLngBounds2);
        double c11 = c(latLngBounds, latLngBounds2);
        return d(d11, d16, b11) || d(d12, d17, c11) || d(d14, d19, b11) || d(d15, d21, c11);
    }

    private static double b(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.northeast.latitude - latLngBounds.southwest.latitude), Math.abs(latLngBounds2.northeast.latitude - latLngBounds2.southwest.latitude)) / 2560.0d;
    }

    private static double c(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.northeast.longitude - latLngBounds.southwest.longitude), Math.abs(latLngBounds2.northeast.longitude - latLngBounds2.southwest.longitude)) / 2560.0d;
    }

    private static boolean d(double d11, double d12, double d13) {
        return Math.abs(d11 - d12) > d13;
    }
}
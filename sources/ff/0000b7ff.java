package un;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class d {
    static double a(LatLng latLng, LatLng latLng2) {
        return b(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    private static double b(double d11, double d12, double d13, double d14) {
        return a.a(a.c(d11, d13, d12 - d14));
    }

    public static LatLng c(LatLng latLng, LatLng latLng2, double d11) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double a11 = a(latLng, latLng2);
        double sin = Math.sin(a11);
        if (sin < 1.0E-6d) {
            return latLng;
        }
        double sin2 = Math.sin((1.0d - d11) * a11) / sin;
        double sin3 = Math.sin(a11 * d11) / sin;
        double d12 = cos * sin2;
        double d13 = cos2 * sin3;
        double cos3 = (Math.cos(radians2) * d12) + (Math.cos(radians4) * d13);
        double sin4 = (d12 * Math.sin(radians2)) + (d13 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * sin3), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }
}
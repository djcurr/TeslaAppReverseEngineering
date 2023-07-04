package yx;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f59916b = b.class.getCanonicalName() + ".KEY";

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f59917a;

    public b(Context context) {
        this.f59917a = context.getSharedPreferences("LOCATION_STORE", 0);
    }

    private String b(String str, String str2) {
        return f59916b + "_" + str + "_" + str2;
    }

    public Location a(String str) {
        SharedPreferences sharedPreferences = this.f59917a;
        if (sharedPreferences != null && sharedPreferences.contains(b(str, "LATITUDE")) && this.f59917a.contains(b(str, "LONGITUDE"))) {
            Location location = new Location(this.f59917a.getString("PROVIDER", "LocationStore"));
            location.setLatitude(Double.longBitsToDouble(this.f59917a.getLong(b(str, "LATITUDE"), 0L)));
            location.setLongitude(Double.longBitsToDouble(this.f59917a.getLong(b(str, "LONGITUDE"), 0L)));
            location.setAccuracy(this.f59917a.getFloat(b(str, "ACCURACY"), BitmapDescriptorFactory.HUE_RED));
            location.setAltitude(Double.longBitsToDouble(this.f59917a.getLong(b(str, "ALTITUDE"), 0L)));
            location.setSpeed(this.f59917a.getFloat(b(str, "SPEED"), BitmapDescriptorFactory.HUE_RED));
            location.setTime(this.f59917a.getLong(b(str, "TIME"), 0L));
            location.setBearing(this.f59917a.getFloat(b(str, "BEARING"), BitmapDescriptorFactory.HUE_RED));
            return location;
        }
        return null;
    }

    public void c(String str, Location location) {
        SharedPreferences.Editor edit = this.f59917a.edit();
        edit.putString(b(str, "PROVIDER"), location.getProvider());
        edit.putLong(b(str, "LATITUDE"), Double.doubleToLongBits(location.getLatitude()));
        edit.putLong(b(str, "LONGITUDE"), Double.doubleToLongBits(location.getLongitude()));
        edit.putFloat(b(str, "ACCURACY"), location.getAccuracy());
        edit.putLong(b(str, "ALTITUDE"), Double.doubleToLongBits(location.getAltitude()));
        edit.putFloat(b(str, "SPEED"), location.getSpeed());
        edit.putLong(b(str, "TIME"), location.getTime());
        edit.putFloat(b(str, "BEARING"), location.getBearing());
        edit.apply();
    }
}
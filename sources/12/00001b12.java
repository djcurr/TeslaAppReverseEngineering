package com.github.reactnativecommunity.location;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import ezvcard.property.Kind;

/* loaded from: classes3.dex */
public class d implements com.github.reactnativecommunity.location.b {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f12979a;

    /* renamed from: c  reason: collision with root package name */
    private String f12981c;

    /* renamed from: b  reason: collision with root package name */
    private b f12980b = new b(null);

    /* renamed from: d  reason: collision with root package name */
    private final LocationListener f12982d = new a();

    /* loaded from: classes3.dex */
    class a implements LocationListener {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            d.this.g(location);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i11, Bundle bundle) {
            if (i11 == 0) {
                ReactApplicationContext reactApplicationContext = d.this.f12979a;
                e.b(reactApplicationContext, "Provider " + str + " is out of service.", "500");
            } else if (i11 == 1) {
                ReactApplicationContext reactApplicationContext2 = d.this.f12979a;
                e.b(reactApplicationContext2, "Provider " + str + " is temporarily unavailable.", "501");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f12984a;

        /* renamed from: b  reason: collision with root package name */
        private final float f12985b;

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) {
            float f11;
            boolean z11 = false;
            if (readableMap.hasKey("desiredAccuracy")) {
                if (readableMap.getType("desiredAccuracy") == ReadableType.Map) {
                    ReadableMap map = readableMap.getMap("desiredAccuracy");
                    if (map.hasKey("android")) {
                        if (map.getType("android") == ReadableType.String) {
                            String string = map.getString("android");
                            string.hashCode();
                            char c11 = 65535;
                            switch (string.hashCode()) {
                                case -1837176303:
                                    if (string.equals("lowPower")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 1008548027:
                                    if (string.equals("highAccuracy")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case 1781006582:
                                    if (string.equals("balancedPowerAccuracy")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 2096298948:
                                    if (string.equals("noPower")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                            }
                            switch (c11) {
                                case 0:
                                case 2:
                                case 3:
                                    break;
                                case 1:
                                    z11 = true;
                                    break;
                                default:
                                    e.b(reactApplicationContext, "desiredAccuracy.android was passed an unknown value: " + string, "401");
                                    break;
                            }
                        } else {
                            e.b(reactApplicationContext, "desiredAccuracy.android must be a string", "401");
                        }
                    }
                } else {
                    e.b(reactApplicationContext, "desiredAccuracy must be an object", "401");
                }
            }
            if (readableMap.hasKey("distanceFilter")) {
                if (readableMap.getType("distanceFilter") == ReadableType.Number) {
                    f11 = (float) readableMap.getDouble("distanceFilter");
                    return new b(z11, f11);
                }
                e.b(reactApplicationContext, "distanceFilter must be a number", "401");
            }
            f11 = 100.0f;
            return new b(z11, f11);
        }

        private b() {
            this.f12984a = false;
            this.f12985b = 100.0f;
        }

        private b(boolean z11, float f11) {
            this.f12984a = z11;
            this.f12985b = f11;
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this.f12979a = reactApplicationContext;
    }

    private String f(LocationManager locationManager, boolean z11) {
        String str = z11 ? "gps" : "network";
        if (locationManager.isProviderEnabled(str)) {
            return str;
        }
        String str2 = str.equals("gps") ? "network" : "gps";
        if (locationManager.isProviderEnabled(str2)) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Location location) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushMap(e.d(location));
        e.a(this.f12979a, "locationUpdated", createArray);
    }

    private void h() {
        try {
            LocationManager locationManager = (LocationManager) this.f12979a.getSystemService(Kind.LOCATION);
            if (locationManager != null) {
                String f11 = f(locationManager, this.f12980b.f12984a);
                if (f11 == null) {
                    e.b(this.f12979a, "There is no valid location provider available.", "503");
                    return;
                }
                if (!f11.equals(this.f12981c)) {
                    locationManager.removeUpdates(this.f12982d);
                    locationManager.requestLocationUpdates(f11, 1000L, this.f12980b.f12985b, this.f12982d);
                    Location lastKnownLocation = locationManager.getLastKnownLocation(f11);
                    if (lastKnownLocation != null) {
                        g(lastKnownLocation);
                    }
                }
                this.f12981c = f11;
                return;
            }
            e.b(this.f12979a, "No location manager is available.", "502");
        } catch (SecurityException e11) {
            ReactApplicationContext reactApplicationContext = this.f12979a;
            e.b(reactApplicationContext, "Attempted to start updating the location without location permissions. Detail: " + e11.getLocalizedMessage(), "403");
        }
    }

    @Override // com.github.reactnativecommunity.location.b
    public void a(Activity activity, ReadableMap readableMap, Promise promise) {
        this.f12980b = b.d(this.f12979a, readableMap);
        if (this.f12981c != null) {
            h();
        }
        promise.resolve(null);
    }

    @Override // com.github.reactnativecommunity.location.b
    public void b() {
        h();
    }

    @Override // com.github.reactnativecommunity.location.b
    public void c() {
        LocationManager locationManager = (LocationManager) this.f12979a.getSystemService(Kind.LOCATION);
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this.f12982d);
        this.f12981c = null;
    }
}
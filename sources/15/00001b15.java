package com.github.reactnativecommunity.location;

import android.location.Location;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.stripe.android.networking.FraudDetectionData;

/* loaded from: classes3.dex */
public class e {
    public static void a(ReactApplicationContext reactApplicationContext, String str, Object obj) {
        ((RCTNativeAppEventEmitter) reactApplicationContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, obj);
    }

    public static void b(ReactApplicationContext reactApplicationContext, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str);
        createMap.putString("type", str2);
        a(reactApplicationContext, "onWarning", createMap);
    }

    public static boolean c() {
        return true;
    }

    public static WritableMap d(Location location) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("latitude", location.getLatitude());
        createMap.putDouble("longitude", location.getLongitude());
        createMap.putDouble("accuracy", location.getAccuracy());
        createMap.putDouble("altitude", location.getAltitude());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            createMap.putDouble("altitudeAccuracy", location.getVerticalAccuracyMeters());
        } else {
            createMap.putDouble("altitudeAccuracy", 0.0d);
        }
        createMap.putDouble("course", location.getBearing());
        if (i11 >= 26) {
            createMap.putDouble("courseAccuracy", location.getBearingAccuracyDegrees());
        } else {
            createMap.putDouble("courseAccuracy", 0.0d);
        }
        createMap.putDouble("speed", location.getSpeed());
        if (i11 >= 26) {
            createMap.putDouble("speedAccuracy", location.getSpeedAccuracyMetersPerSecond());
        } else {
            createMap.putDouble("speedAccuracy", 0.0d);
        }
        createMap.putDouble(FraudDetectionData.KEY_TIMESTAMP, location.getTime());
        createMap.putBoolean("fromMockProvider", location.isFromMockProvider());
        return createMap;
    }
}
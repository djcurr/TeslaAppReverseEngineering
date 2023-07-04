package com.github.reactnativecommunity.location;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class c implements com.github.reactnativecommunity.location.b {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f12963a;

    /* renamed from: b  reason: collision with root package name */
    private final FusedLocationProviderClient f12964b;

    /* renamed from: c  reason: collision with root package name */
    private final SettingsClient f12965c;

    /* renamed from: d  reason: collision with root package name */
    private LocationRequest f12966d = new LocationRequest();

    /* renamed from: e  reason: collision with root package name */
    private boolean f12967e = false;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f12968f = null;

    /* renamed from: g  reason: collision with root package name */
    private ReadableMap f12969g = null;

    /* renamed from: h  reason: collision with root package name */
    private Promise f12970h = null;

    /* renamed from: i  reason: collision with root package name */
    private LocationCallback f12971i = new C0243c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements OnSuccessListener<LocationSettingsResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f12972a;

        a(Promise promise) {
            this.f12972a = promise;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
            c.this.k();
            this.f12972a.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements OnFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f12974a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f12975b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f12976c;

        b(Activity activity, ReadableMap readableMap, Promise promise) {
            this.f12974a = activity;
            this.f12975b = readableMap;
            this.f12976c = promise;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            if (exc instanceof ResolvableApiException) {
                try {
                    c.this.f12968f = new WeakReference(this.f12974a);
                    c.this.f12969g = this.f12975b;
                    c.this.f12970h = this.f12976c;
                    ((ResolvableApiException) exc).startResolutionForResult(this.f12974a, 1234);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            }
            this.f12976c.reject("500", "Error configuring react-native-location", exc);
        }
    }

    /* renamed from: com.github.reactnativecommunity.location.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0243c extends LocationCallback {
        C0243c() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            if (locationResult == null || !c.this.f12967e) {
                return;
            }
            WritableArray createArray = Arguments.createArray();
            for (Location location : locationResult.getLocations()) {
                createArray.pushMap(e.d(location));
            }
            e.a(c.this.f12963a, "locationUpdated", createArray);
        }
    }

    public c(Activity activity, ReactApplicationContext reactApplicationContext) {
        this.f12963a = reactApplicationContext;
        if (activity != null) {
            this.f12964b = LocationServices.getFusedLocationProviderClient(activity);
            this.f12965c = LocationServices.getSettingsClient(activity);
            return;
        }
        this.f12964b = LocationServices.getFusedLocationProviderClient(reactApplicationContext);
        this.f12965c = LocationServices.getSettingsClient(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f12967e) {
            int checkSelfPermission = androidx.core.content.b.checkSelfPermission(this.f12963a, "android.permission.ACCESS_FINE_LOCATION");
            int checkSelfPermission2 = androidx.core.content.b.checkSelfPermission(this.f12963a, "android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission != 0 && checkSelfPermission2 != 0) {
                e.b(this.f12963a, "Attempted to start updating the location without location permissions", "403");
                return;
            } else {
                this.f12964b.requestLocationUpdates(this.f12966d, this.f12971i, (Looper) null);
                return;
            }
        }
        this.f12964b.removeLocationUpdates(this.f12971i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    @Override // com.github.reactnativecommunity.location.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.app.Activity r8, com.facebook.react.bridge.ReadableMap r9, com.facebook.react.bridge.Promise r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.reactnativecommunity.location.c.a(android.app.Activity, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @Override // com.github.reactnativecommunity.location.b
    public void b() {
        this.f12967e = true;
        k();
    }

    @Override // com.github.reactnativecommunity.location.b
    public void c() {
        this.f12967e = false;
        k();
    }

    public void j(int i11, int i12, Intent intent) {
        WeakReference<Activity> weakReference;
        if (i11 != 1234) {
            return;
        }
        if (i12 == -1 && (weakReference = this.f12968f) != null && weakReference.get() != null && this.f12969g != null && this.f12970h != null) {
            a(this.f12968f.get(), this.f12969g, this.f12970h);
        } else {
            Promise promise = this.f12970h;
            if (promise != null) {
                promise.reject("500", "Error configuring react-native-location");
            }
        }
        this.f12968f = null;
        this.f12969g = null;
        this.f12970h = null;
    }
}
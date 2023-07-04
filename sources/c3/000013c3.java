package com.airbnb.android.react.maps;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public class o implements LocationSource {

    /* renamed from: a  reason: collision with root package name */
    private final FusedLocationProviderClient f9937a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationRequest f9938b;

    /* renamed from: c  reason: collision with root package name */
    private LocationCallback f9939c;

    /* loaded from: classes.dex */
    class a implements OnSuccessListener<Location> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationSource.OnLocationChangedListener f9940a;

        a(o oVar, LocationSource.OnLocationChangedListener onLocationChangedListener) {
            this.f9940a = onLocationChangedListener;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null) {
                this.f9940a.onLocationChanged(location);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends LocationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationSource.OnLocationChangedListener f9941a;

        b(o oVar, LocationSource.OnLocationChangedListener onLocationChangedListener) {
            this.f9941a = onLocationChangedListener;
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            for (Location location : locationResult.getLocations()) {
                this.f9941a.onLocationChanged(location);
            }
        }
    }

    public o(Context context) {
        this.f9937a = LocationServices.getFusedLocationProviderClient(context);
        LocationRequest create = LocationRequest.create();
        this.f9938b = create;
        create.setPriority(100);
        create.setInterval(5000L);
    }

    public void a(int i11) {
        this.f9938b.setFastestInterval(i11);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        try {
            this.f9937a.getLastLocation().addOnSuccessListener(new a(this, onLocationChangedListener));
            b bVar = new b(this, onLocationChangedListener);
            this.f9939c = bVar;
            this.f9937a.requestLocationUpdates(this.f9938b, bVar, Looper.myLooper());
        } catch (SecurityException e11) {
            e11.printStackTrace();
        }
    }

    public void b(int i11) {
        this.f9938b.setInterval(i11);
    }

    public void c(int i11) {
        this.f9938b.setPriority(i11);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void deactivate() {
        this.f9937a.removeLocationUpdates(this.f9939c);
    }
}
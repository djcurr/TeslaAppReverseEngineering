package io.nlopez.smartlocation.geofencing.providers;

import android.app.Activity;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationServices;
import cy.b;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class GeofencingGooglePlayServicesProvider implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ResultCallback<Status> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f31710i = GeofencingGooglePlayServicesProvider.class.getCanonicalName() + ".GEOFENCE_TRANSITION";

    /* renamed from: a  reason: collision with root package name */
    private final List<Geofence> f31711a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f31712b;

    /* renamed from: c  reason: collision with root package name */
    private GoogleApiClient f31713c;

    /* renamed from: d  reason: collision with root package name */
    private b f31714d;

    /* renamed from: e  reason: collision with root package name */
    private xx.a f31715e;

    /* renamed from: f  reason: collision with root package name */
    private Context f31716f;

    /* renamed from: g  reason: collision with root package name */
    private PendingIntent f31717g;

    /* renamed from: h  reason: collision with root package name */
    private final cy.a f31718h;

    /* loaded from: classes5.dex */
    public static class GeofencingService extends IntentService {
        public GeofencingService() {
            super(GeofencingService.class.getSimpleName());
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
            if (fromIntent == null || fromIntent.hasError()) {
                return;
            }
            int geofenceTransition = fromIntent.getGeofenceTransition();
            Intent intent2 = new Intent(GeofencingGooglePlayServicesProvider.f31710i);
            intent2.putExtra("transition", geofenceTransition);
            intent2.putExtra(Kind.LOCATION, fromIntent.getTriggeringLocation());
            ArrayList<String> arrayList = new ArrayList<>();
            for (Geofence geofence : fromIntent.getTriggeringGeofences()) {
                arrayList.add(geofence.getRequestId());
            }
            intent2.putStringArrayListExtra("geofences", arrayList);
            sendBroadcast(intent2);
        }
    }

    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (GeofencingGooglePlayServicesProvider.f31710i.equals(intent.getAction()) && intent.hasExtra("geofences")) {
                GeofencingGooglePlayServicesProvider.this.f31714d.b("Received geofencing event", new Object[0]);
                intent.getIntExtra("transition", -1);
                Iterator<String> it2 = intent.getStringArrayListExtra("geofences").iterator();
                if (it2.hasNext()) {
                    it2.next();
                    xx.a unused = GeofencingGooglePlayServicesProvider.this.f31715e;
                    throw null;
                }
            }
        }
    }

    public GeofencingGooglePlayServicesProvider() {
        this(null);
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: c */
    public void onResult(Status status) {
        if (status.isSuccess()) {
            this.f31714d.b("Geofencing update request successful", new Object[0]);
        } else if (status.hasResolution() && (this.f31716f instanceof Activity)) {
            this.f31714d.d("Unable to register, but we can solve this - will startActivityForResult expecting result code 10003 (if received, please try again)", new Object[0]);
            try {
                status.startResolutionForResult((Activity) this.f31716f, 10003);
            } catch (IntentSender.SendIntentException e11) {
                this.f31714d.e(e11, "problem with startResolutionForResult", new Object[0]);
            }
        } else {
            b bVar = this.f31714d;
            bVar.c("Registering failed: " + status.getStatusMessage(), new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        this.f31714d.b("onConnected", new Object[0]);
        if (this.f31713c.isConnected()) {
            if (this.f31711a.size() > 0) {
                if (androidx.core.content.b.checkSelfPermission(this.f31716f, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    return;
                }
                LocationServices.GeofencingApi.addGeofences(this.f31713c, this.f31711a, this.f31717g);
                this.f31711a.clear();
            }
            if (this.f31712b.size() > 0) {
                LocationServices.GeofencingApi.removeGeofences(this.f31713c, this.f31712b);
                this.f31712b.clear();
            }
        }
        cy.a aVar = this.f31718h;
        if (aVar != null) {
            aVar.onConnected(bundle);
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.f31714d.b("onConnectionFailed", new Object[0]);
        cy.a aVar = this.f31718h;
        if (aVar != null) {
            aVar.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i11) {
        b bVar = this.f31714d;
        bVar.b("onConnectionSuspended " + i11, new Object[0]);
        cy.a aVar = this.f31718h;
        if (aVar != null) {
            aVar.onConnectionSuspended(i11);
        }
    }

    public GeofencingGooglePlayServicesProvider(cy.a aVar) {
        this.f31711a = Collections.synchronizedList(new ArrayList());
        this.f31712b = Collections.synchronizedList(new ArrayList());
        new a();
        this.f31718h = aVar;
    }
}
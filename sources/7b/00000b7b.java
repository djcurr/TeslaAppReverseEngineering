package ay;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import cy.d;

/* loaded from: classes5.dex */
public class a implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, ResultCallback<Status>, ResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private GoogleApiClient f7097a;

    /* renamed from: b  reason: collision with root package name */
    private cy.b f7098b;

    /* renamed from: c  reason: collision with root package name */
    private tx.c f7099c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7100d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7101e;

    /* renamed from: f  reason: collision with root package name */
    private yx.b f7102f;

    /* renamed from: g  reason: collision with root package name */
    private LocationRequest f7103g;

    /* renamed from: h  reason: collision with root package name */
    private Context f7104h;

    /* renamed from: i  reason: collision with root package name */
    private cy.a f7105i;

    /* renamed from: j  reason: collision with root package name */
    private d f7106j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7107k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7108l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7109m;

    /* renamed from: n  reason: collision with root package name */
    private ResultCallback<LocationSettingsResult> f7110n;

    /* renamed from: ay.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0132a implements ResultCallback<LocationSettingsResult> {
        C0132a() {
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(LocationSettingsResult locationSettingsResult) {
            Status status = locationSettingsResult.getStatus();
            int statusCode = status.getStatusCode();
            if (statusCode == 0) {
                a.this.f7098b.b("All location settings are satisfied.", new Object[0]);
                a.this.f7108l = true;
                a aVar = a.this;
                aVar.l(aVar.f7103g);
            } else if (statusCode != 6) {
                if (statusCode != 8502) {
                    return;
                }
                a.this.f7098b.a("Location settings are inadequate, and cannot be fixed here. Dialog not created.", new Object[0]);
                a.this.m();
            } else {
                a.this.f7098b.d("Location settings are not satisfied. Show the user a dialog toupgrade location settings. You should hook into the Activity onActivityResult and call this provider onActivityResult method for continuing this call flow. ", new Object[0]);
                if (a.this.f7104h instanceof Activity) {
                    try {
                        status.startResolutionForResult((Activity) a.this.f7104h, 20001);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        a.this.f7098b.a("PendingIntent unable to execute request.", new Object[0]);
                        return;
                    }
                }
                a.this.f7098b.d("Provided context is not the context of an activity, therefore we cant launch the resolution activity.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7112a;

        static {
            int[] iArr = new int[zx.a.values().length];
            f7112a = iArr;
            try {
                iArr[zx.a.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7112a[zx.a.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7112a[zx.a.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7112a[zx.a.LOWEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a() {
        this.f7100d = false;
        this.f7101e = false;
        this.f7109m = true;
        this.f7110n = new C0132a();
        this.f7107k = false;
        this.f7108l = false;
    }

    private void i() {
        LocationServices.SettingsApi.checkLocationSettings(this.f7097a, new LocationSettingsRequest.Builder().setAlwaysShow(this.f7109m).addLocationRequest(this.f7103g).build()).setResultCallback(this.f7110n);
    }

    private LocationRequest j(zx.b bVar, boolean z11) {
        LocationRequest smallestDisplacement = LocationRequest.create().setFastestInterval(bVar.c()).setInterval(bVar.c()).setSmallestDisplacement(bVar.b());
        int i11 = b.f7112a[bVar.a().ordinal()];
        if (i11 == 1) {
            smallestDisplacement.setPriority(100);
        } else if (i11 == 2) {
            smallestDisplacement.setPriority(102);
        } else if (i11 == 3) {
            smallestDisplacement.setPriority(104);
        } else if (i11 == 4) {
            smallestDisplacement.setPriority(105);
        }
        if (z11) {
            smallestDisplacement.setNumUpdates(1);
        }
        return smallestDisplacement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(LocationRequest locationRequest) {
        if (this.f7107k && !this.f7108l) {
            this.f7098b.b("startUpdating wont be executed for now, as we have to test the location settings before", new Object[0]);
            i();
        } else if (this.f7097a.isConnected()) {
            if (androidx.core.content.b.checkSelfPermission(this.f7104h, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.b.checkSelfPermission(this.f7104h, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                this.f7098b.a("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
            } else {
                LocationServices.FusedLocationApi.requestLocationUpdates(this.f7097a, locationRequest, this, Looper.getMainLooper()).setResultCallback(this);
            }
        } else {
            this.f7098b.d("startUpdating executed without the GoogleApiClient being connected!!", new Object[0]);
        }
    }

    public void a(Context context, cy.b bVar) {
        this.f7098b = bVar;
        this.f7104h = context;
        this.f7102f = new yx.b(context);
        if (!this.f7100d) {
            GoogleApiClient build = new GoogleApiClient.Builder(context).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            this.f7097a = build;
            build.connect();
            return;
        }
        bVar.b("already started", new Object[0]);
    }

    public void b(tx.c cVar, zx.b bVar, boolean z11) {
        this.f7099c = cVar;
        if (cVar == null) {
            this.f7098b.b("Listener is null, you sure about this?", new Object[0]);
        }
        this.f7103g = j(bVar, z11);
        if (this.f7097a.isConnected()) {
            l(this.f7103g);
        } else if (this.f7101e) {
            this.f7100d = true;
            this.f7097a.connect();
            this.f7101e = false;
        } else {
            this.f7100d = true;
            this.f7098b.b("still not connected - scheduled start when connection is ok", new Object[0]);
        }
    }

    public Location c() {
        GoogleApiClient googleApiClient = this.f7097a;
        if (googleApiClient != null && googleApiClient.isConnected()) {
            if (androidx.core.content.b.checkSelfPermission(this.f7104h, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.b.checkSelfPermission(this.f7104h, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(this.f7097a);
            if (lastLocation != null) {
                return lastLocation;
            }
        }
        yx.b bVar = this.f7102f;
        if (bVar != null) {
            return bVar.a("GMS");
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: k */
    public void onResult(Status status) {
        if (status.isSuccess()) {
            this.f7098b.b("Locations update request successful", new Object[0]);
        } else if (status.hasResolution() && (this.f7104h instanceof Activity)) {
            this.f7098b.d("Unable to register, but we can solve this - will startActivityForResult. You should hook into the Activity onActivityResult and call this provider onActivityResult method for continuing this call flow.", new Object[0]);
            try {
                status.startResolutionForResult((Activity) this.f7104h, 10001);
            } catch (IntentSender.SendIntentException e11) {
                this.f7098b.e(e11, "problem with startResolutionForResult", new Object[0]);
            }
        } else {
            cy.b bVar = this.f7098b;
            bVar.c("Registering failed: " + status.getStatusMessage(), new Object[0]);
        }
    }

    public void m() {
        this.f7098b.b("stop", new Object[0]);
        if (this.f7097a.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(this.f7097a, this);
            this.f7097a.disconnect();
        }
        this.f7108l = false;
        this.f7100d = false;
        this.f7101e = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        this.f7098b.b("onConnected", new Object[0]);
        if (this.f7100d) {
            l(this.f7103g);
        }
        cy.a aVar = this.f7105i;
        if (aVar != null) {
            aVar.onConnected(bundle);
        }
        d dVar = this.f7106j;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        cy.b bVar = this.f7098b;
        bVar.b("onConnectionFailed " + connectionResult.toString(), new Object[0]);
        cy.a aVar = this.f7105i;
        if (aVar != null) {
            aVar.onConnectionFailed(connectionResult);
        }
        d dVar = this.f7106j;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i11) {
        cy.b bVar = this.f7098b;
        bVar.b("onConnectionSuspended " + i11, new Object[0]);
        cy.a aVar = this.f7105i;
        if (aVar != null) {
            aVar.onConnectionSuspended(i11);
        }
        d dVar = this.f7106j;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.google.android.gms.location.LocationListener
    public void onLocationChanged(Location location) {
        this.f7098b.b("onLocationChanged", location);
        tx.c cVar = this.f7099c;
        if (cVar != null) {
            cVar.a(location);
        }
        if (this.f7102f != null) {
            this.f7098b.b("Stored in SharedPreferences", new Object[0]);
            this.f7102f.c("GMS", location);
        }
    }

    public a(cy.a aVar) {
        this();
        this.f7105i = aVar;
    }
}
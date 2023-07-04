package io.nlopez.smartlocation.activity.providers;

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
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionApi;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import cy.b;

/* loaded from: classes5.dex */
public class ActivityGooglePlayServicesProvider implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ResultCallback<Status> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f31686i = ActivityGooglePlayServicesProvider.class.getCanonicalName() + ".DETECTED_ACTIVITY";

    /* renamed from: a  reason: collision with root package name */
    private GoogleApiClient f31687a;

    /* renamed from: b  reason: collision with root package name */
    private b f31688b;

    /* renamed from: c  reason: collision with root package name */
    private tx.a f31689c;

    /* renamed from: d  reason: collision with root package name */
    private Context f31690d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31691e;

    /* renamed from: f  reason: collision with root package name */
    private PendingIntent f31692f;

    /* renamed from: g  reason: collision with root package name */
    private ux.a f31693g;

    /* renamed from: h  reason: collision with root package name */
    private final cy.a f31694h;

    /* loaded from: classes5.dex */
    public static class ActivityRecognitionService extends IntentService {
        public ActivityRecognitionService() {
            super(ActivityRecognitionService.class.getSimpleName());
        }

        @Override // android.app.IntentService
        protected void onHandleIntent(Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                DetectedActivity mostProbableActivity = ActivityRecognitionResult.extractResult(intent).getMostProbableActivity();
                Intent intent2 = new Intent(ActivityGooglePlayServicesProvider.f31686i);
                intent2.putExtra("activity", mostProbableActivity);
                sendBroadcast(intent2);
            }
        }
    }

    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityGooglePlayServicesProvider.f31686i.equals(intent.getAction()) && intent.hasExtra("activity")) {
                ActivityGooglePlayServicesProvider.this.f31688b.b("sending new activity", new Object[0]);
                ActivityGooglePlayServicesProvider.this.d((DetectedActivity) intent.getParcelableExtra("activity"));
            }
        }
    }

    public ActivityGooglePlayServicesProvider() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DetectedActivity detectedActivity) {
        tx.a aVar = this.f31689c;
        if (aVar != null) {
            aVar.a(detectedActivity);
        }
    }

    private void f(ux.a aVar) {
        if (this.f31687a.isConnected()) {
            this.f31692f = PendingIntent.getService(this.f31690d, 0, new Intent(this.f31690d, ActivityRecognitionService.class), 134217728);
            ActivityRecognitionApi activityRecognitionApi = ActivityRecognition.ActivityRecognitionApi;
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: e */
    public void onResult(Status status) {
        if (status.isSuccess()) {
            this.f31688b.b("Activity update request successful", new Object[0]);
        } else if (status.hasResolution() && (this.f31690d instanceof Activity)) {
            this.f31688b.d("Unable to register, but we can solve this - will startActivityForResult expecting result code 10002 (if received, please try again)", new Object[0]);
            try {
                status.startResolutionForResult((Activity) this.f31690d, 10002);
            } catch (IntentSender.SendIntentException e11) {
                this.f31688b.e(e11, "problem with startResolutionForResult", new Object[0]);
            }
        } else {
            b bVar = this.f31688b;
            bVar.c("Registering failed: " + status.getStatusMessage(), new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        this.f31688b.b("onConnected", new Object[0]);
        if (this.f31691e) {
            f(this.f31693g);
        }
        cy.a aVar = this.f31694h;
        if (aVar != null) {
            aVar.onConnected(bundle);
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.f31688b.b("onConnectionFailed", new Object[0]);
        cy.a aVar = this.f31694h;
        if (aVar != null) {
            aVar.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i11) {
        b bVar = this.f31688b;
        bVar.b("onConnectionSuspended " + i11, new Object[0]);
        cy.a aVar = this.f31694h;
        if (aVar != null) {
            aVar.onConnectionSuspended(i11);
        }
    }

    public ActivityGooglePlayServicesProvider(cy.a aVar) {
        this.f31691e = false;
        new a();
        this.f31694h = aVar;
    }
}
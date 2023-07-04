package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzd extends zzf {
    private final int zza;
    private Activity zzb;

    public zzd(int i11, Activity activity) {
        this.zza = i11;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i11, Bundle bundle) {
        PendingIntent createPendingResult;
        if (i11 == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity == null || (createPendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e11) {
                Log.w("AddressClientImpl", "Exception settng pending result", e11);
                return;
            }
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.zzb), this.zza);
                return;
            } catch (IntentSender.SendIntentException e12) {
                Log.w("AddressClientImpl", "Exception starting pending intent", e12);
                return;
            }
        }
        try {
            PendingIntent createPendingResult2 = ((Activity) Preconditions.checkNotNull(this.zzb)).createPendingResult(this.zza, new Intent(), 1073741824);
            if (createPendingResult2 != null) {
                createPendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e13) {
            Log.w("AddressClientImpl", "Exception setting pending result", e13);
        }
    }
}
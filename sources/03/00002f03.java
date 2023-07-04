package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzfc {
    private final zza zza;

    /* loaded from: classes3.dex */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzfc(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    public final void zza(Context context, Intent intent) {
        zzft zzp = zzft.zzp(context, null, null);
        zzej zzay = zzp.zzay();
        if (intent == null) {
            zzay.zzk().zza("Receiver called with null intent");
            return;
        }
        zzp.zzaw();
        String action = intent.getAction();
        zzay.zzj().zzb("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzay.zzj().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzay.zzk().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}
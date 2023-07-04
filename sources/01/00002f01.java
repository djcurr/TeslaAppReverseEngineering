package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class zzfa implements ServiceConnection {
    final /* synthetic */ zzfb zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfa(zzfb zzfbVar, String str) {
        this.zza = zzfbVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaz().zzp(new zzez(this, zzb, this));
                return;
            } catch (RuntimeException e11) {
                this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e11);
                return;
            }
        }
        this.zza.zza.zzay().zzk().zza("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzay().zzj().zza("Install Referrer Service disconnected");
    }
}
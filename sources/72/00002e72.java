package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;
import j4.a;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzjs {
    private zzjt zza;

    private final zzjt zzd() {
        if (this.zza == null) {
            this.zza = new zzjt(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        zzd().zza(intent, i11, i12);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final void zza(Intent intent) {
        a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final void zzb(JobParameters jobParameters, boolean z11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final boolean zzc(int i11) {
        return stopSelfResult(i11);
    }
}
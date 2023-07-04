package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzc implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzdVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.zzc;
        i11 = zzdVar.zzc;
        if (i11 > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzdVar.zzd;
            if (bundle != null) {
                bundle3 = zzdVar.zzd;
                bundle2 = bundle3.getBundle(this.zzb);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i12 = this.zzc.zzc;
        if (i12 >= 2) {
            this.zza.onStart();
        }
        i13 = this.zzc.zzc;
        if (i13 >= 3) {
            this.zza.onResume();
        }
        i14 = this.zzc.zzc;
        if (i14 >= 4) {
            this.zza.onStop();
        }
        i15 = this.zzc.zzc;
        if (i15 >= 5) {
            this.zza.onDestroy();
        }
    }
}
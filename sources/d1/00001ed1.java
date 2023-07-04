package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzaa extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i11, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzd(zza, bundle);
        zzC(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i11, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i11, IBinder iBinder, zzj zzjVar) {
        throw null;
    }
}
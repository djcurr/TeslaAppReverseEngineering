package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzd extends zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel zzb = zzb(1, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        Parcel zzb = zzb(6, zza());
        boolean zzb2 = zzc.zzb(zzb);
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z11) {
        Parcel zza = zza();
        zzc.zza(zza, true);
        Parcel zzb = zzb(2, zza);
        boolean zzb2 = zzc.zzb(zzb);
        zzb.recycle();
        return zzb2;
    }
}
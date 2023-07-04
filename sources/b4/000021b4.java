package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* loaded from: classes3.dex */
public final class zzh extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void zzc(zzg zzgVar, UserAddressRequest userAddressRequest, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzc(zza, zzgVar);
        zzc.zzb(zza, userAddressRequest);
        zzc.zzb(zza, bundle);
        zzb(2, zza);
    }
}
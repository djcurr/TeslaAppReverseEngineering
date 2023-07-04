package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes3.dex */
public final class zzs extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void zzc(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzu zzuVar) {
        Parcel zza = zza();
        zzc.zzb(zza, createWalletObjectsRequest);
        zzc.zzb(zza, bundle);
        zzc.zzc(zza, zzuVar);
        zzb(6, zza);
    }

    public final void zzd(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, zzu zzuVar) {
        Parcel zza = zza();
        zzc.zzb(zza, paymentCardRecognitionIntentRequest);
        zzc.zzb(zza, bundle);
        zzc.zzc(zza, zzuVar);
        zzb(24, zza);
    }

    public final void zze(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzu zzuVar) {
        Parcel zza = zza();
        zzc.zzb(zza, isReadyToPayRequest);
        zzc.zzb(zza, bundle);
        zzc.zzc(zza, zzuVar);
        zzb(14, zza);
    }

    public final void zzf(PaymentDataRequest paymentDataRequest, Bundle bundle, zzu zzuVar) {
        Parcel zza = zza();
        zzc.zzb(zza, paymentDataRequest);
        zzc.zzb(zza, bundle);
        zzc.zzc(zza, zzuVar);
        zzb(19, zza);
    }
}
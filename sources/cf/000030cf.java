package com.google.android.gms.wallet.callback;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* loaded from: classes3.dex */
final class zze implements OnCompleteListener {
    private final OnCompleteListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(OnCompleteListener onCompleteListener) {
        this.zza = onCompleteListener;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: zza */
    public final synchronized void complete(PaymentAuthorizationResult paymentAuthorizationResult) {
        OnCompleteListener onCompleteListener = this.zza;
        zzj zza = CallbackOutput.zza();
        CallbackOutput callbackOutput = zza.zza;
        callbackOutput.zza = 1;
        callbackOutput.zzb = 1;
        byte[] serializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentAuthorizationResult);
        CallbackOutput callbackOutput2 = zza.zza;
        callbackOutput2.zzc = serializeToBytes;
        onCompleteListener.complete(callbackOutput2);
    }
}
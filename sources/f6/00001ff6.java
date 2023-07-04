package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class zzb extends zzc {
    final /* synthetic */ UserAddressRequest zza;
    final /* synthetic */ int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i11) {
        super(googleApiClient);
        this.zza = userAddressRequest;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.identity.zze zzeVar) {
        zzeVar.zzp(this.zza, this.zzb);
        setResult((zzb) Status.RESULT_SUCCESS);
    }
}
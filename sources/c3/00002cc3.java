package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* loaded from: classes3.dex */
final class zzae extends zzas {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzaf zzafVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        super(googleApiClient);
        this.zza = createWalletObjectsRequest;
        this.zzb = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: zza */
    public final void doExecute(zzac zzacVar) {
        zzacVar.zzp(this.zza, this.zzb);
        setResult((zzae) Status.RESULT_SUCCESS);
    }
}
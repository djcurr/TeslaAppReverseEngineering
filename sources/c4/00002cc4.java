package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* loaded from: classes3.dex */
public final class zzaf implements WalletObjects {
    @Override // com.google.android.gms.wallet.wobs.WalletObjects
    public final void createWalletObjects(GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        googleApiClient.enqueue(new zzae(this, googleApiClient, createWalletObjectsRequest, i11));
    }
}
package com.google.android.gms.location;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
public abstract class zzb extends BaseImplementation.ApiMethodImpl {
    public zzb(GoogleApiClient googleApiClient) {
        super(ActivityRecognition.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzb) ((Result) obj));
    }
}
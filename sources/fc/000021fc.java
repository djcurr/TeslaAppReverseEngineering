package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes3.dex */
final class zzs extends zzw {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ LocationListener zzb;
    final /* synthetic */ Looper zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = locationListener;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzC(zzbf.zzc(null, this.zza), ListenerHolders.createListenerHolder(this.zzb, zzbn.zza(this.zzc), LocationListener.class.getSimpleName()), new zzx(this));
    }
}
package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
final class zzl implements LocationSource.OnLocationChangedListener {
    final /* synthetic */ com.google.android.gms.maps.internal.zzaj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzs zzsVar, com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.zza.zzd(location);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
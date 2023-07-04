package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzt implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzaj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(TileOverlayOptions tileOverlayOptions) {
        zzaj zzajVar;
        this.zza = tileOverlayOptions;
        zzajVar = tileOverlayOptions.zza;
        this.zzb = zzajVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i11, int i12, int i13) {
        try {
            return this.zzb.zzb(i11, i12, i13);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
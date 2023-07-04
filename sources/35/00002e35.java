package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzai;

/* loaded from: classes3.dex */
final class zzu extends zzai {
    final /* synthetic */ TileProvider zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final Tile zzb(int i11, int i12, int i13) {
        return this.zza.getTile(i11, i12, i13);
    }
}
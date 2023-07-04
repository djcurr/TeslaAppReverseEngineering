package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes3.dex */
public final class zzah extends zza implements zzaj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final Tile zzb(int i11, int i12, int i13) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        Parcel zzH = zzH(1, zza);
        Tile tile = (Tile) zzc.zza(zzH, Tile.CREATOR);
        zzH.recycle();
        return tile;
    }
}
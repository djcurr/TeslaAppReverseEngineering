package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes3.dex */
public abstract class zzai extends zzb implements zzaj {
    public zzai() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static zzaj zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzah(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            Tile zzb = zzb(parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            zzc.zze(parcel2, zzb);
            return true;
        }
        return false;
    }
}
package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z11);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z11);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i11) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i11);
        Parcel zzB = zzB(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i11, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i11);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        Parcel zzB = zzB(8, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i11) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i11);
        Parcel zzB = zzB(4, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z11, long j11) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z11);
        zza.writeLong(j11);
        Parcel zzB = zzB(7, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
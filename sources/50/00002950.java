package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzj extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzf[] zze(IObjectWrapper iObjectWrapper, zzp zzpVar) {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zza(zza, zzpVar);
        Parcel zzb = zzb(1, zza);
        zzf[] zzfVarArr = (zzf[]) zzb.createTypedArray(zzf.CREATOR);
        zzb.recycle();
        return zzfVarArr;
    }

    public final zzf[] zzf(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i11, int i12, int i13, int i14, int i15, int i16, zzp zzpVar) {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zzb(zza, iObjectWrapper2);
        zzc.zzb(zza, iObjectWrapper3);
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        zza.writeInt(i14);
        zza.writeInt(i15);
        zza.writeInt(i16);
        zzc.zza(zza, zzpVar);
        Parcel zzb = zzb(4, zza);
        zzf[] zzfVarArr = (zzf[]) zzb.createTypedArray(zzf.CREATOR);
        zzb.recycle();
        return zzfVarArr;
    }
}
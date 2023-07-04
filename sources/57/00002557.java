package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzaf extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzq[] zze(IObjectWrapper iObjectWrapper, zzaj zzajVar) {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zza(zza, zzajVar);
        Parcel zzb = zzb(1, zza);
        zzq[] zzqVarArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqVarArr;
    }

    public final zzq[] zzf(IObjectWrapper iObjectWrapper, zzaj zzajVar) {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zza(zza, zzajVar);
        Parcel zzb = zzb(2, zza);
        zzq[] zzqVarArr = (zzq[]) zzb.createTypedArray(zzq.CREATOR);
        zzb.recycle();
        return zzqVarArr;
    }
}
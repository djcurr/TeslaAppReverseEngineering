package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzow extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzow(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final zzpg zzd(IObjectWrapper iObjectWrapper, zzou zzouVar) {
        Parcel zza = zza();
        zzc.zzc(zza, iObjectWrapper);
        zzc.zzb(zza, zzouVar);
        Parcel zzb = zzb(3, zza);
        zzpg zzpgVar = (zzpg) zzc.zza(zzb, zzpg.CREATOR);
        zzb.recycle();
        return zzpgVar;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzox extends zza implements zzoz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzox(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzoz
    public final zzow zzd(IObjectWrapper iObjectWrapper) {
        zzow zzowVar;
        Parcel zza = zza();
        zzc.zzc(zza, iObjectWrapper);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzowVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzowVar = queryLocalInterface instanceof zzow ? (zzow) queryLocalInterface : new zzow(readStrongBinder);
        }
        zzb.recycle();
        return zzowVar;
    }
}
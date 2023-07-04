package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzqc extends zza implements zzqe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzqe
    public final zzqb zzd(IObjectWrapper iObjectWrapper, zzpt zzptVar) {
        zzqb zzqbVar;
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzc.zza(zza, zzptVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzqbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzqbVar = queryLocalInterface instanceof zzqb ? (zzqb) queryLocalInterface : new zzqb(readStrongBinder);
        }
        zzb.recycle();
        return zzqbVar;
    }
}
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzg extends zzm<zzh> {
    private final zze zzbm;

    public zzg(Context context, zze zzeVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.zzbm = zzeVar;
        zzq();
    }

    public final Barcode[] zza(ByteBuffer byteBuffer, zzn zznVar) {
        if (isOperational()) {
            try {
                return zzq().zza(ObjectWrapper.wrap(byteBuffer), zznVar);
            } catch (RemoteException e11) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
                return new Barcode[0];
            }
        }
        return new Barcode[0];
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final void zzm() {
        if (isOperational()) {
            zzq().zzn();
        }
    }

    public final Barcode[] zza(Bitmap bitmap, zzn zznVar) {
        if (isOperational()) {
            try {
                return zzq().zzb(ObjectWrapper.wrap(bitmap), zznVar);
            } catch (RemoteException e11) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
                return new Barcode[0];
            }
        }
        return new Barcode[0];
    }

    @Override // com.google.android.gms.internal.vision.zzm
    protected final /* synthetic */ zzh zza(DynamiteModule dynamiteModule, Context context) {
        zzj zzkVar;
        IBinder instantiate = dynamiteModule.instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (instantiate == null) {
            zzkVar = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (queryLocalInterface instanceof zzj) {
                zzkVar = (zzj) queryLocalInterface;
            } else {
                zzkVar = new zzk(instantiate);
            }
        }
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zza(ObjectWrapper.wrap(context), this.zzbm);
    }
}
package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzk extends com.google.android.gms.internal.vision.zzb implements zzj {
    public zzk() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static zzj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof zzj) {
            return (zzj) queryLocalInterface;
        }
        return new zzl(iBinder);
    }

    @Override // com.google.android.gms.internal.vision.zzb
    protected final boolean dispatchTransaction(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzg newFaceDetector = newFaceDetector(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zze) com.google.android.gms.internal.vision.zzc.zza(parcel, zze.CREATOR));
            parcel2.writeNoException();
            com.google.android.gms.internal.vision.zzc.zza(parcel2, newFaceDetector);
            return true;
        }
        return false;
    }
}
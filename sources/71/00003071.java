package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzn;

/* loaded from: classes3.dex */
public abstract class zzh extends com.google.android.gms.internal.vision.zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.internal.vision.zzb
    protected final boolean dispatchTransaction(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            FaceParcel[] zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzn) com.google.android.gms.internal.vision.zzc.zza(parcel, zzn.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedArray(zzc, 1);
        } else if (i11 == 2) {
            boolean zzd = zzd(parcel.readInt());
            parcel2.writeNoException();
            com.google.android.gms.internal.vision.zzc.writeBoolean(parcel2, zzd);
        } else if (i11 != 3) {
            return false;
        } else {
            zzn();
            parcel2.writeNoException();
        }
        return true;
    }
}
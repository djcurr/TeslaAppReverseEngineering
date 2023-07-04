package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzn;

/* loaded from: classes3.dex */
public final class zzi extends com.google.android.gms.internal.vision.zza implements zzg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final FaceParcel[] zzc(IObjectWrapper iObjectWrapper, zzn zznVar) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzc.zza(obtainAndWriteInterfaceToken, zznVar);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        FaceParcel[] faceParcelArr = (FaceParcel[]) zza.createTypedArray(FaceParcel.CREATOR);
        zza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final boolean zzd(int i11) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i11);
        Parcel zza = zza(2, obtainAndWriteInterfaceToken);
        boolean zza2 = com.google.android.gms.internal.vision.zzc.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final void zzn() {
        zzb(3, obtainAndWriteInterfaceToken());
    }
}
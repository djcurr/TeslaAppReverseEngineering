package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzab extends zza implements zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    @Override // com.google.android.gms.internal.vision.zzaa
    public final zzae[] zza(IObjectWrapper iObjectWrapper, zzn zznVar, zzag zzagVar) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zznVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzagVar);
        Parcel zza = zza(3, obtainAndWriteInterfaceToken);
        zzae[] zzaeVarArr = (zzae[]) zza.createTypedArray(zzae.CREATOR);
        zza.recycle();
        return zzaeVarArr;
    }

    @Override // com.google.android.gms.internal.vision.zzaa
    public final void zzs() {
        zzb(2, obtainAndWriteInterfaceToken());
    }
}
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzdy extends com.google.android.gms.internal.measurement.zzbn implements zzdz {
    public zzdy() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                zzk((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzt((zzku) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzku.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzj((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zzl((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzs((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List zze = zze((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR), com.google.android.gms.internal.measurement.zzbo.zzf(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zze);
                return true;
            case 9:
                byte[] zzu = zzu((zzau) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzau.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zzu);
                return true;
            case 10:
                zzq(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String zzd = zzd((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzd);
                return true;
            case 12:
                zzn((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzo((zzab) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List zzh = zzh(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzf(parcel), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzh);
                return true;
            case 15:
                List zzi = zzi(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzf(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzi);
                return true;
            case 16:
                List zzf = zzf(parcel.readString(), parcel.readString(), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzf);
                return true;
            case 17:
                List zzg = zzg(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 18:
                zzm((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzr((Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, Bundle.CREATOR), (zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzp((zzp) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
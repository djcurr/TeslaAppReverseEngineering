package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class IndoorBuilding {
    private final com.google.android.gms.internal.maps.zzr zza;
    private final zze zzb;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzr zzrVar) {
        zze zzeVar = zze.zza;
        this.zza = (com.google.android.gms.internal.maps.zzr) Preconditions.checkNotNull(zzrVar, "delegate");
        this.zzb = (zze) Preconditions.checkNotNull(zzeVar, "shim");
    }

    public boolean equals(Object obj) {
        if (obj instanceof IndoorBuilding) {
            try {
                return this.zza.zzh(((IndoorBuilding) obj).zza);
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
        return false;
    }

    public int getActiveLevelIndex() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.zza.zze();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public List<IndoorLevel> getLevels() {
        try {
            List<IBinder> zzg = this.zza.zzg();
            ArrayList arrayList = new ArrayList(zzg.size());
            for (IBinder iBinder : zzg) {
                arrayList.add(new IndoorLevel(com.google.android.gms.internal.maps.zzt.zzb(iBinder)));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean isUnderground() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
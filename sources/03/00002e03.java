package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzu zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar);
    }

    public void activate() {
        try {
            this.zza.zzg();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof IndoorLevel) {
            try {
                return this.zza.zzh(((IndoorLevel) obj).zza);
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
        return false;
    }

    public String getName() {
        try {
            return this.zza.zze();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public String getShortName() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i11 == 2) {
            zzd(parcel.readInt(), parcel.createStringArray());
        } else if (i11 != 3) {
            return false;
        } else {
            zzc(parcel.readInt(), (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public abstract class zzfy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzfy zzb(int i11);

    abstract zzfz zzc();

    public abstract zzfy zzd(int i11);

    public final zzfz zze() {
        zzfz zzc = zzc();
        zzig.zzi(!zzc.zzb().isEmpty(), "Package name must not be empty.");
        return zzc;
    }
}
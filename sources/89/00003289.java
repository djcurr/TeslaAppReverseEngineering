package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzaie implements zzaif {
    private static final Object zza = new Object();
    private volatile zzaif zzb;
    private volatile Object zzc = zza;

    private zzaie(zzaif zzaifVar) {
        this.zzb = zzaifVar;
    }

    public static zzaif zza(zzaif zzaifVar) {
        return new zzaie(zzaifVar);
    }

    @Override // com.google.android.libraries.places.internal.zzaif
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            if (this.zzb == null) {
                return this.zzc;
            }
            zzca zzcaVar = new zzca();
            this.zzc = zzcaVar;
            this.zzb = null;
            return zzcaVar;
        }
        return obj;
    }
}
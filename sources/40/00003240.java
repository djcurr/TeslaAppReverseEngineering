package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public class zzafm {
    private static final zzaen zzb = zzaen.zza;
    protected volatile zzagg zza;
    private volatile zzaed zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzafm) {
            zzafm zzafmVar = (zzafm) obj;
            zzagg zzaggVar = this.zza;
            zzagg zzaggVar2 = zzafmVar.zza;
            if (zzaggVar == null && zzaggVar2 == null) {
                return zzb().equals(zzafmVar.zzb());
            }
            if (zzaggVar == null || zzaggVar2 == null) {
                if (zzaggVar != null) {
                    zzafmVar.zzc(zzaggVar.zzt());
                    return zzaggVar.equals(zzafmVar.zza);
                }
                zzc(zzaggVar2.zzt());
                return this.zza.equals(zzaggVar2);
            }
            return zzaggVar.equals(zzaggVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzaea) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzv();
        }
        return 0;
    }

    public final zzaed zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzaed.zzb;
            } else {
                this.zzc = this.zza.zzs();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzagg zzaggVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzaggVar;
                    this.zzc = zzaed.zzb;
                } catch (zzafj unused) {
                    this.zza = zzaggVar;
                    this.zzc = zzaed.zzb;
                }
            }
        }
    }
}
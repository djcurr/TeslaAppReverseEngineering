package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzf extends zze {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzft zzftVar) {
        super(zzftVar);
        this.zzs.zzD();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        if (!zze()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzs.zzB();
        this.zza = true;
    }

    public final void zzc() {
        if (!this.zza) {
            zzd();
            this.zzs.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void zzd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        return this.zza;
    }

    protected abstract boolean zzf();
}
package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzkh extends zzkg {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkh(zzkr zzkrVar) {
        super(zzkrVar);
        this.zzf.zzL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (!this.zza) {
            zzb();
            this.zzf.zzG();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzY() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
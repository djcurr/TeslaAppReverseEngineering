package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzge extends zzjv implements zzlh {
    private zzge() {
        super(zzgf.zze());
    }

    public final zzge zza(Iterable iterable) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzgf.zzh((zzgf) this.zza, iterable);
        return this;
    }

    public final zzge zzb(int i11) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzgf.zzg((zzgf) this.zza, i11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzge(zzff zzffVar) {
        super(zzgf.zze());
    }
}
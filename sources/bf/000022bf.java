package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfp extends zzjv implements zzlh {
    private zzfp() {
        super(zzfq.zzb());
    }

    public final zzfp zza(long j11) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfq.zzd((zzfq) this.zza, j11);
        return this;
    }

    public final zzfp zzb(String str) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfq.zzc((zzfq) this.zza, str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfp(zzff zzffVar) {
        super(zzfq.zzb());
    }
}
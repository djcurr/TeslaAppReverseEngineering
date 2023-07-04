package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzei extends zzjv implements zzlh {
    private zzei() {
        super(zzej.zzd());
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzej.zzi((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i11, zzel zzelVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzej.zzj((zzej) this.zza, i11, zzelVar);
        return this;
    }

    public final zzel zzd(int i11) {
        return ((zzej) this.zza).zze(i11);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzei(zzef zzefVar) {
        super(zzej.zzd());
    }
}
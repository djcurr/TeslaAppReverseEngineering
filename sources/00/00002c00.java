package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdt extends zzjn<zzdt> {
    private static volatile zzdt[] zzpx;
    public zzdk zzpy = null;
    public Integer zzpz = null;
    public zzdo zzqa = null;
    private zzdj zzqb = null;

    public zzdt() {
        this.zzadp = -1;
    }

    public static zzdt[] zzcd() {
        if (zzpx == null) {
            synchronized (zzjr.zzado) {
                if (zzpx == null) {
                    zzpx = new zzdt[0];
                }
            }
        }
        return zzpx;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        zzdk zzdkVar = this.zzpy;
        if (zzdkVar != null) {
            zzjlVar.zza(1, zzdkVar);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzjlVar.zze(2, num.intValue());
        }
        zzdo zzdoVar = this.zzqa;
        if (zzdoVar != null) {
            zzjlVar.zza(16, zzdoVar);
        }
        zzdj zzdjVar = this.zzqb;
        if (zzdjVar != null) {
            zzjlVar.zza(17, zzdjVar);
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        zzdk zzdkVar = this.zzpy;
        if (zzdkVar != null) {
            zzt += zzjl.zzb(1, zzdkVar);
        }
        Integer num = this.zzpz;
        if (num != null) {
            zzt += zzjl.zzi(2, num.intValue());
        }
        zzdo zzdoVar = this.zzqa;
        if (zzdoVar != null) {
            zzt += zzjl.zzb(16, zzdoVar);
        }
        zzdj zzdjVar = this.zzqb;
        return zzdjVar != null ? zzt + zzjl.zzb(17, zzdjVar) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                if (this.zzpy == null) {
                    this.zzpy = new zzdk();
                }
                zzjkVar.zza(this.zzpy);
            } else if (zzdq == 16) {
                this.zzpz = Integer.valueOf(zzjkVar.zzdt());
            } else if (zzdq == 130) {
                if (this.zzqa == null) {
                    this.zzqa = new zzdo();
                }
                zzjkVar.zza(this.zzqa);
            } else if (zzdq != 138) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                if (this.zzqb == null) {
                    this.zzqb = new zzdj();
                }
                zzjkVar.zza(this.zzqb);
            }
        }
    }
}
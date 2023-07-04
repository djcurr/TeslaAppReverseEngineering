package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzds extends zzjn<zzds> {
    private static volatile zzds[] zzpu;
    public Integer zzpv = null;
    public Integer zzpw = null;

    public zzds() {
        this.zzadp = -1;
    }

    public static zzds[] zzcc() {
        if (zzpu == null) {
            synchronized (zzjr.zzado) {
                if (zzpu == null) {
                    zzpu = new zzds[0];
                }
            }
        }
        return zzpu;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        Integer num = this.zzpv;
        if (num != null) {
            zzjlVar.zze(1, num.intValue());
        }
        Integer num2 = this.zzpw;
        if (num2 != null) {
            zzjlVar.zze(2, num2.intValue());
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzpv;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        Integer num2 = this.zzpw;
        return num2 != null ? zzt + zzjl.zzi(2, num2.intValue()) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                this.zzpv = Integer.valueOf(zzjkVar.zzdt());
            } else if (zzdq != 16) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzpw = Integer.valueOf(zzjkVar.zzdt());
            }
        }
    }
}
package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdo extends zzjn<zzdo> {
    public Float zzpc = null;
    public Float zzpd = null;
    public Float zzpe = null;
    public Float zzpf = null;
    public Float zzpg = null;
    public Float zzph = null;

    public zzdo() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        Float f11 = this.zzpc;
        if (f11 != null) {
            zzjlVar.zza(1, f11.floatValue());
        }
        Float f12 = this.zzpd;
        if (f12 != null) {
            zzjlVar.zza(2, f12.floatValue());
        }
        Float f13 = this.zzpe;
        if (f13 != null) {
            zzjlVar.zza(3, f13.floatValue());
        }
        Float f14 = this.zzpf;
        if (f14 != null) {
            zzjlVar.zza(4, f14.floatValue());
        }
        Float f15 = this.zzpg;
        if (f15 != null) {
            zzjlVar.zza(5, f15.floatValue());
        }
        Float f16 = this.zzph;
        if (f16 != null) {
            zzjlVar.zza(6, f16.floatValue());
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        Float f11 = this.zzpc;
        if (f11 != null) {
            f11.floatValue();
            zzt += zzjl.zzav(1) + 4;
        }
        Float f12 = this.zzpd;
        if (f12 != null) {
            f12.floatValue();
            zzt += zzjl.zzav(2) + 4;
        }
        Float f13 = this.zzpe;
        if (f13 != null) {
            f13.floatValue();
            zzt += zzjl.zzav(3) + 4;
        }
        Float f14 = this.zzpf;
        if (f14 != null) {
            f14.floatValue();
            zzt += zzjl.zzav(4) + 4;
        }
        Float f15 = this.zzpg;
        if (f15 != null) {
            f15.floatValue();
            zzt += zzjl.zzav(5) + 4;
        }
        Float f16 = this.zzph;
        if (f16 != null) {
            f16.floatValue();
            return zzt + zzjl.zzav(6) + 4;
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 13) {
                this.zzpc = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            } else if (zzdq == 21) {
                this.zzpd = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            } else if (zzdq == 29) {
                this.zzpe = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            } else if (zzdq == 37) {
                this.zzpf = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            } else if (zzdq == 45) {
                this.zzpg = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            } else if (zzdq != 53) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzph = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            }
        }
    }
}
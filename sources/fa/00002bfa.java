package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdn extends zzjn<zzdn> {
    public Integer zzow;
    public Integer zzox;
    public Integer zzoy;
    public Boolean zzoz = null;
    public Boolean zzpa = null;
    public Float zzpb = null;

    public zzdn() {
        this.zzadp = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.vision.zzjt
    /* renamed from: zzd */
    public final zzdn zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                int position = zzjkVar.getPosition();
                try {
                    int zzdt = zzjkVar.zzdt();
                    if (zzdt >= 0 && zzdt <= 3) {
                        this.zzow = Integer.valueOf(zzdt);
                    } else {
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append(zzdt);
                        sb2.append(" is not a valid enum Mode");
                        throw new IllegalArgumentException(sb2.toString());
                        break;
                    }
                } catch (IllegalArgumentException unused) {
                    zzjkVar.zzbt(position);
                    zza(zzjkVar, zzdq);
                }
            } else if (zzdq == 16) {
                int position2 = zzjkVar.getPosition();
                try {
                    int zzdt2 = zzjkVar.zzdt();
                    if (zzdt2 >= 0 && zzdt2 <= 3) {
                        this.zzox = Integer.valueOf(zzdt2);
                    } else {
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append(zzdt2);
                        sb3.append(" is not a valid enum Landmark");
                        throw new IllegalArgumentException(sb3.toString());
                        break;
                    }
                } catch (IllegalArgumentException unused2) {
                    zzjkVar.zzbt(position2);
                    zza(zzjkVar, zzdq);
                }
            } else if (zzdq == 24) {
                int position3 = zzjkVar.getPosition();
                try {
                    int zzdt3 = zzjkVar.zzdt();
                    if (zzdt3 >= 0 && zzdt3 <= 2) {
                        this.zzoy = Integer.valueOf(zzdt3);
                    } else {
                        StringBuilder sb4 = new StringBuilder(46);
                        sb4.append(zzdt3);
                        sb4.append(" is not a valid enum Classification");
                        throw new IllegalArgumentException(sb4.toString());
                        break;
                    }
                } catch (IllegalArgumentException unused3) {
                    zzjkVar.zzbt(position3);
                    zza(zzjkVar, zzdq);
                }
            } else if (zzdq == 32) {
                this.zzoz = Boolean.valueOf(zzjkVar.zzcu());
            } else if (zzdq == 40) {
                this.zzpa = Boolean.valueOf(zzjkVar.zzcu());
            } else if (zzdq != 53) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzpb = Float.valueOf(Float.intBitsToFloat(zzjkVar.zzdv()));
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        Integer num = this.zzow;
        if (num != null) {
            zzjlVar.zze(1, num.intValue());
        }
        Integer num2 = this.zzox;
        if (num2 != null) {
            zzjlVar.zze(2, num2.intValue());
        }
        Integer num3 = this.zzoy;
        if (num3 != null) {
            zzjlVar.zze(3, num3.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            zzjlVar.zzb(4, bool.booleanValue());
        }
        Boolean bool2 = this.zzpa;
        if (bool2 != null) {
            zzjlVar.zzb(5, bool2.booleanValue());
        }
        Float f11 = this.zzpb;
        if (f11 != null) {
            zzjlVar.zza(6, f11.floatValue());
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzow;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        Integer num2 = this.zzox;
        if (num2 != null) {
            zzt += zzjl.zzi(2, num2.intValue());
        }
        Integer num3 = this.zzoy;
        if (num3 != null) {
            zzt += zzjl.zzi(3, num3.intValue());
        }
        Boolean bool = this.zzoz;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(4) + 1;
        }
        Boolean bool2 = this.zzpa;
        if (bool2 != null) {
            bool2.booleanValue();
            zzt += zzjl.zzav(5) + 1;
        }
        Float f11 = this.zzpb;
        if (f11 != null) {
            f11.floatValue();
            return zzt + zzjl.zzav(6) + 4;
        }
        return zzt;
    }
}
package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdj extends zzjn<zzdj> {
    private String value = null;
    private Integer zzof;
    private Integer zzog;

    public zzdj() {
        this.zzadp = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.vision.zzjt
    /* renamed from: zzc */
    public final zzdj zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                int position = zzjkVar.getPosition();
                try {
                    this.zzof = Integer.valueOf(zzeb.zzx(zzjkVar.zzdt()));
                } catch (IllegalArgumentException unused) {
                    zzjkVar.zzbt(position);
                    zza(zzjkVar, zzdq);
                }
            } else if (zzdq == 16) {
                int position2 = zzjkVar.getPosition();
                try {
                    int zzdt = zzjkVar.zzdt();
                    if (zzdt > 0 && zzdt <= 12) {
                        this.zzog = Integer.valueOf(zzdt);
                    } else {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append(zzdt);
                        sb2.append(" is not a valid enum BarcodeValueFormat");
                        throw new IllegalArgumentException(sb2.toString());
                        break;
                    }
                } catch (IllegalArgumentException unused2) {
                    zzjkVar.zzbt(position2);
                    zza(zzjkVar, zzdq);
                }
            } else if (zzdq != 26) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.value = zzjkVar.readString();
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        Integer num = this.zzof;
        if (num != null) {
            zzjlVar.zze(1, num.intValue());
        }
        Integer num2 = this.zzog;
        if (num2 != null) {
            zzjlVar.zze(2, num2.intValue());
        }
        String str = this.value;
        if (str != null) {
            zzjlVar.zza(3, str);
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzof;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        Integer num2 = this.zzog;
        if (num2 != null) {
            zzt += zzjl.zzi(2, num2.intValue());
        }
        String str = this.value;
        return str != null ? zzt + zzjl.zzb(3, str) : zzt;
    }
}
package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdi extends zzjn<zzdi> {
    private int[] zzoe = zzjw.zzzb;

    public zzdi() {
        this.zzadp = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.vision.zzjt
    /* renamed from: zzb */
    public final zzdi zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                int zzb = zzjw.zzb(zzjkVar, 8);
                int[] iArr = new int[zzb];
                int i11 = 0;
                for (int i12 = 0; i12 < zzb; i12++) {
                    if (i12 != 0) {
                        zzjkVar.zzdq();
                    }
                    int position = zzjkVar.getPosition();
                    try {
                        iArr[i11] = zzeb.zzx(zzjkVar.zzdt());
                        i11++;
                    } catch (IllegalArgumentException unused) {
                        zzjkVar.zzbt(position);
                        zza(zzjkVar, zzdq);
                    }
                }
                if (i11 != 0) {
                    int[] iArr2 = this.zzoe;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i11 == zzb) {
                        this.zzoe = iArr;
                    } else {
                        int[] iArr3 = new int[length + i11];
                        if (length != 0) {
                            System.arraycopy(iArr2, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i11);
                        this.zzoe = iArr3;
                    }
                }
            } else if (zzdq != 10) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                int zzan = zzjkVar.zzan(zzjkVar.zzdt());
                int position2 = zzjkVar.getPosition();
                int i13 = 0;
                while (zzjkVar.zzhq() > 0) {
                    try {
                        zzeb.zzx(zzjkVar.zzdt());
                        i13++;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (i13 != 0) {
                    zzjkVar.zzbt(position2);
                    int[] iArr4 = this.zzoe;
                    int length2 = iArr4 == null ? 0 : iArr4.length;
                    int[] iArr5 = new int[i13 + length2];
                    if (length2 != 0) {
                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                    }
                    while (zzjkVar.zzhq() > 0) {
                        int position3 = zzjkVar.getPosition();
                        try {
                            iArr5[length2] = zzeb.zzx(zzjkVar.zzdt());
                            length2++;
                        } catch (IllegalArgumentException unused3) {
                            zzjkVar.zzbt(position3);
                            zza(zzjkVar, 8);
                        }
                    }
                    this.zzoe = iArr5;
                }
                zzjkVar.zzao(zzan);
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        int[] iArr = this.zzoe;
        if (iArr != null && iArr.length > 0) {
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.zzoe;
                if (i11 >= iArr2.length) {
                    break;
                }
                zzjlVar.zze(1, iArr2[i11]);
                i11++;
            }
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        int[] iArr = this.zzoe;
        if (iArr == null || iArr.length <= 0) {
            return zzt;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.zzoe;
            if (i11 < iArr2.length) {
                i12 += zzjl.zzaw(iArr2[i11]);
                i11++;
            } else {
                return zzt + i12 + (iArr2.length * 1);
            }
        }
    }
}
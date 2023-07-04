package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public final class zzgy extends zzfu<zzgy> implements Cloneable {
    private String[] zzbiw;
    private String[] zzbix;
    private int[] zzbiy;
    private long[] zzbiz;
    private long[] zzbja;

    public zzgy() {
        String[] strArr = zzgb.zzsc;
        this.zzbiw = strArr;
        this.zzbix = strArr;
        this.zzbiy = zzgb.zzrx;
        long[] jArr = zzgb.zzry;
        this.zzbiz = jArr;
        this.zzbja = jArr;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzgb */
    public final zzgy clone() {
        try {
            zzgy zzgyVar = (zzgy) super.clone();
            String[] strArr = this.zzbiw;
            if (strArr != null && strArr.length > 0) {
                zzgyVar.zzbiw = (String[]) strArr.clone();
            }
            String[] strArr2 = this.zzbix;
            if (strArr2 != null && strArr2.length > 0) {
                zzgyVar.zzbix = (String[]) strArr2.clone();
            }
            int[] iArr = this.zzbiy;
            if (iArr != null && iArr.length > 0) {
                zzgyVar.zzbiy = (int[]) iArr.clone();
            }
            long[] jArr = this.zzbiz;
            if (jArr != null && jArr.length > 0) {
                zzgyVar.zzbiz = (long[]) jArr.clone();
            }
            long[] jArr2 = this.zzbja;
            if (jArr2 != null && jArr2.length > 0) {
                zzgyVar.zzbja = (long[]) jArr2.clone();
            }
            return zzgyVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgy) {
            zzgy zzgyVar = (zzgy) obj;
            if (zzfy.equals(this.zzbiw, zzgyVar.zzbiw) && zzfy.equals(this.zzbix, zzgyVar.zzbix) && zzfy.equals(this.zzbiy, zzgyVar.zzbiy) && zzfy.equals(this.zzbiz, zzgyVar.zzbiz) && zzfy.equals(this.zzbja, zzgyVar.zzbja)) {
                zzfw zzfwVar = this.zzrj;
                if (zzfwVar == null || zzfwVar.isEmpty()) {
                    zzfw zzfwVar2 = zzgyVar.zzrj;
                    return zzfwVar2 == null || zzfwVar2.isEmpty();
                }
                return this.zzrj.equals(zzgyVar.zzrj);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((zzgy.class.getName().hashCode() + 527) * 31) + zzfy.hashCode(this.zzbiw)) * 31) + zzfy.hashCode(this.zzbix)) * 31) + zzfy.hashCode(this.zzbiy)) * 31) + zzfy.hashCode(this.zzbiz)) * 31) + zzfy.hashCode(this.zzbja)) * 31;
        zzfw zzfwVar = this.zzrj;
        return hashCode + ((zzfwVar == null || zzfwVar.isEmpty()) ? 0 : this.zzrj.hashCode());
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) {
        String[] strArr = this.zzbiw;
        int i11 = 0;
        if (strArr != null && strArr.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.zzbiw;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i12];
                if (str != null) {
                    zzfsVar.zza(1, str);
                }
                i12++;
            }
        }
        String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr4 = this.zzbix;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    zzfsVar.zza(2, str2);
                }
                i13++;
            }
        }
        int[] iArr = this.zzbiy;
        if (iArr != null && iArr.length > 0) {
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.zzbiy;
                if (i14 >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(3, iArr2[i14]);
                i14++;
            }
        }
        long[] jArr = this.zzbiz;
        if (jArr != null && jArr.length > 0) {
            int i15 = 0;
            while (true) {
                long[] jArr2 = this.zzbiz;
                if (i15 >= jArr2.length) {
                    break;
                }
                zzfsVar.zzi(4, jArr2[i15]);
                i15++;
            }
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.zzbja;
                if (i11 >= jArr4.length) {
                    break;
                }
                zzfsVar.zzi(5, jArr4[i11]);
                i11++;
            }
        }
        super.zza(zzfsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        long[] jArr;
        int[] iArr;
        int zzen = super.zzen();
        String[] strArr = this.zzbiw;
        int i11 = 0;
        if (strArr != null && strArr.length > 0) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.zzbiw;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i12];
                if (str != null) {
                    i14++;
                    i13 += zzfs.zzh(str);
                }
                i12++;
            }
            zzen = zzen + i13 + (i14 * 1);
        }
        String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr4 = this.zzbix;
                if (i15 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i15];
                if (str2 != null) {
                    i17++;
                    i16 += zzfs.zzh(str2);
                }
                i15++;
            }
            zzen = zzen + i16 + (i17 * 1);
        }
        int[] iArr2 = this.zzbiy;
        if (iArr2 != null && iArr2.length > 0) {
            int i18 = 0;
            int i19 = 0;
            while (true) {
                iArr = this.zzbiy;
                if (i18 >= iArr.length) {
                    break;
                }
                i19 += zzfs.zzs(iArr[i18]);
                i18++;
            }
            zzen = zzen + i19 + (iArr.length * 1);
        }
        long[] jArr2 = this.zzbiz;
        if (jArr2 != null && jArr2.length > 0) {
            int i21 = 0;
            int i22 = 0;
            while (true) {
                jArr = this.zzbiz;
                if (i21 >= jArr.length) {
                    break;
                }
                i22 += zzfs.zzo(jArr[i21]);
                i21++;
            }
            zzen = zzen + i22 + (jArr.length * 1);
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 == null || jArr3.length <= 0) {
            return zzen;
        }
        int i23 = 0;
        while (true) {
            long[] jArr4 = this.zzbja;
            if (i11 >= jArr4.length) {
                return zzen + i23 + (jArr4.length * 1);
            }
            i23 += zzfs.zzo(jArr4[i11]);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzgy zzeo() {
        return (zzgy) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final /* synthetic */ zzfz zzep() {
        return (zzgy) clone();
    }
}
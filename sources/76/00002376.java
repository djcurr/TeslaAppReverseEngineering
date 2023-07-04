package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmj(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzmj zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzmj zzd(zzmj zzmjVar, zzmj zzmjVar2) {
        int i11 = zzmjVar.zzb + zzmjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmjVar.zzc, i11);
        System.arraycopy(zzmjVar2.zzc, 0, copyOf, zzmjVar.zzb, zzmjVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmjVar.zzd, i11);
        System.arraycopy(zzmjVar2.zzd, 0, copyOf2, zzmjVar.zzb, zzmjVar2.zzb);
        return new zzmj(i11, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzmj zze() {
        return new zzmj(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzmj)) {
            zzmj zzmjVar = (zzmj) obj;
            int i11 = this.zzb;
            if (i11 == zzmjVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzmjVar.zzc;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzmjVar.zzd;
                        int i13 = this.zzb;
                        for (int i14 = 0; i14 < i13; i14++) {
                            if (objArr[i14].equals(objArr2[i14])) {
                            }
                        }
                        return true;
                    } else if (iArr[i12] != iArr2[i12]) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zzb;
        int i12 = (i11 + 527) * 31;
        int[] iArr = this.zzc;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.zzd;
        int i17 = this.zzb;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i11;
        int i12 = this.zze;
        if (i12 == -1) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.zzb; i14++) {
                int i15 = this.zzc[i14];
                int i16 = i15 >>> 3;
                int i17 = i15 & 7;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ((Long) this.zzd[i14]).longValue();
                        i11 = zzjg.zzA(i16 << 3) + 8;
                    } else if (i17 == 2) {
                        int zzA2 = zzjg.zzA(i16 << 3);
                        int zzd = ((zziy) this.zzd[i14]).zzd();
                        i13 += zzA2 + zzjg.zzA(zzd) + zzd;
                    } else if (i17 == 3) {
                        int zzz = zzjg.zzz(i16);
                        zzA = zzz + zzz;
                        zzB = ((zzmj) this.zzd[i14]).zza();
                    } else if (i17 == 5) {
                        ((Integer) this.zzd[i14]).intValue();
                        i11 = zzjg.zzA(i16 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkj.zza());
                    }
                    i13 += i11;
                } else {
                    long longValue = ((Long) this.zzd[i14]).longValue();
                    zzA = zzjg.zzA(i16 << 3);
                    zzB = zzjg.zzB(longValue);
                }
                i11 = zzA + zzB;
                i13 += i11;
            }
            this.zze = i13;
            return i13;
        }
        return i12;
    }

    public final int zzb() {
        int i11 = this.zze;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.zzb; i13++) {
                int i14 = this.zzc[i13];
                int zzA = zzjg.zzA(8);
                int zzd = ((zziy) this.zzd[i13]).zzd();
                i12 += zzA + zzA + zzjg.zzA(16) + zzjg.zzA(i14 >>> 3) + zzjg.zzA(24) + zzjg.zzA(zzd) + zzd;
            }
            this.zze = i12;
            return i12;
        }
        return i11;
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzli.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i11, Object obj) {
        if (this.zzf) {
            int i12 = this.zzb;
            int[] iArr = this.zzc;
            if (i12 == iArr.length) {
                int i13 = i12 + (i12 < 4 ? 8 : i12 >> 1);
                this.zzc = Arrays.copyOf(iArr, i13);
                this.zzd = Arrays.copyOf(this.zzd, i13);
            }
            int[] iArr2 = this.zzc;
            int i14 = this.zzb;
            iArr2[i14] = i11;
            this.zzd[i14] = obj;
            this.zzb = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzjh zzjhVar) {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    zzjhVar.zzt(i13, ((Long) obj).longValue());
                } else if (i14 == 1) {
                    zzjhVar.zzm(i13, ((Long) obj).longValue());
                } else if (i14 == 2) {
                    zzjhVar.zzd(i13, (zziy) obj);
                } else if (i14 == 3) {
                    zzjhVar.zzE(i13);
                    ((zzmj) obj).zzi(zzjhVar);
                    zzjhVar.zzh(i13);
                } else if (i14 == 5) {
                    zzjhVar.zzk(i13, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkj.zza());
                }
            }
        }
    }
}
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzip {
    private static final zzip zzaas = new zzip(0, new int[0], new Object[0], false);
    private int count;
    private int[] zzaat;
    private boolean zzrl;
    private int zzwk;
    private Object[] zzze;

    private zzip() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzip zza(zzip zzipVar, zzip zzipVar2) {
        int i11 = zzipVar.count + zzipVar2.count;
        int[] copyOf = Arrays.copyOf(zzipVar.zzaat, i11);
        System.arraycopy(zzipVar2.zzaat, 0, copyOf, zzipVar.count, zzipVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzipVar.zzze, i11);
        System.arraycopy(zzipVar2.zzze, 0, copyOf2, zzipVar.count, zzipVar2.count);
        return new zzip(i11, copyOf, copyOf2, true);
    }

    public static zzip zzhe() {
        return zzaas;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzip zzhf() {
        return new zzip();
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzip)) {
            zzip zzipVar = (zzip) obj;
            int i11 = this.count;
            if (i11 == zzipVar.count) {
                int[] iArr = this.zzaat;
                int[] iArr2 = zzipVar.zzaat;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        z11 = true;
                        break;
                    } else if (iArr[i12] != iArr2[i12]) {
                        z11 = false;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (z11) {
                    Object[] objArr = this.zzze;
                    Object[] objArr2 = zzipVar.zzze;
                    int i13 = this.count;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            z12 = true;
                            break;
                        } else if (!objArr[i14].equals(objArr2[i14])) {
                            z12 = false;
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (z12) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.count;
        int i12 = (i11 + 527) * 31;
        int[] iArr = this.zzaat;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.zzze;
        int i17 = this.count;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    public final void zzb(zzjj zzjjVar) {
        if (this.count == 0) {
            return;
        }
        if (zzjjVar.zzed() == zzfy.zzg.zzxi) {
            for (int i11 = 0; i11 < this.count; i11++) {
                zzb(this.zzaat[i11], this.zzze[i11], zzjjVar);
            }
            return;
        }
        for (int i12 = this.count - 1; i12 >= 0; i12--) {
            zzb(this.zzaat[i12], this.zzze[i12], zzjjVar);
        }
    }

    public final void zzci() {
        this.zzrl = false;
    }

    public final int zzeq() {
        int zze;
        int i11 = this.zzwk;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            int i14 = this.zzaat[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                zze = zzfe.zze(i15, ((Long) this.zzze[i13]).longValue());
            } else if (i16 == 1) {
                zze = zzfe.zzg(i15, ((Long) this.zzze[i13]).longValue());
            } else if (i16 == 2) {
                zze = zzfe.zzc(i15, (zzeo) this.zzze[i13]);
            } else if (i16 == 3) {
                zze = (zzfe.zzav(i15) << 1) + ((zzip) this.zzze[i13]).zzeq();
            } else if (i16 == 5) {
                zze = zzfe.zzl(i15, ((Integer) this.zzze[i13]).intValue());
            } else {
                throw new IllegalStateException(zzgf.zzfm());
            }
            i12 += zze;
        }
        this.zzwk = i12;
        return i12;
    }

    public final int zzhg() {
        int i11 = this.zzwk;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            i12 += zzfe.zzd(this.zzaat[i13] >>> 3, (zzeo) this.zzze[i13]);
        }
        this.zzwk = i12;
        return i12;
    }

    private zzip(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zzwk = -1;
        this.count = i11;
        this.zzaat = iArr;
        this.zzze = objArr;
        this.zzrl = z11;
    }

    private static void zzb(int i11, Object obj, zzjj zzjjVar) {
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            zzjjVar.zzi(i12, ((Long) obj).longValue());
        } else if (i13 == 1) {
            zzjjVar.zzc(i12, ((Long) obj).longValue());
        } else if (i13 == 2) {
            zzjjVar.zza(i12, (zzeo) obj);
        } else if (i13 != 3) {
            if (i13 == 5) {
                zzjjVar.zzh(i12, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzgf.zzfm());
        } else if (zzjjVar.zzed() == zzfy.zzg.zzxi) {
            zzjjVar.zzbe(i12);
            ((zzip) obj).zzb(zzjjVar);
            zzjjVar.zzbf(i12);
        } else {
            zzjjVar.zzbf(i12);
            ((zzip) obj).zzb(zzjjVar);
            zzjjVar.zzbe(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzjj zzjjVar) {
        if (zzjjVar.zzed() == zzfy.zzg.zzxj) {
            for (int i11 = this.count - 1; i11 >= 0; i11--) {
                zzjjVar.zza(this.zzaat[i11] >>> 3, this.zzze[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.count; i12++) {
            zzjjVar.zza(this.zzaat[i12] >>> 3, this.zzze[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.count; i12++) {
            zzhi.zza(sb2, i11, String.valueOf(this.zzaat[i12] >>> 3), this.zzze[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i11, Object obj) {
        if (this.zzrl) {
            int i12 = this.count;
            int[] iArr = this.zzaat;
            if (i12 == iArr.length) {
                int i13 = i12 + (i12 < 4 ? 8 : i12 >> 1);
                this.zzaat = Arrays.copyOf(iArr, i13);
                this.zzze = Arrays.copyOf(this.zzze, i13);
            }
            int[] iArr2 = this.zzaat;
            int i14 = this.count;
            iArr2[i14] = i11;
            this.zzze[i14] = obj;
            this.count = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
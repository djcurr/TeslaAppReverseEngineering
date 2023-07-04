package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzey {
    private static final zzey zzoz = new zzey(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private int[] zzpa;

    private zzey() {
        this(0, new int[8], new Object[8], true);
    }

    private zzey(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zzjq = -1;
        this.count = i11;
        this.zzpa = iArr;
        this.zzmj = objArr;
        this.zzfa = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzey zza(zzey zzeyVar, zzey zzeyVar2) {
        int i11 = zzeyVar.count + zzeyVar2.count;
        int[] copyOf = Arrays.copyOf(zzeyVar.zzpa, i11);
        System.arraycopy(zzeyVar2.zzpa, 0, copyOf, zzeyVar.count, zzeyVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzeyVar.zzmj, i11);
        System.arraycopy(zzeyVar2.zzmj, 0, copyOf2, zzeyVar.count, zzeyVar2.count);
        return new zzey(i11, copyOf, copyOf2, true);
    }

    private static void zzb(int i11, Object obj, zzfr zzfrVar) {
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            zzfrVar.zzi(i12, ((Long) obj).longValue());
        } else if (i13 == 1) {
            zzfrVar.zzc(i12, ((Long) obj).longValue());
        } else if (i13 == 2) {
            zzfrVar.zza(i12, (zzbb) obj);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new RuntimeException(zzco.zzbn());
            }
            zzfrVar.zzf(i12, ((Integer) obj).intValue());
        } else if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            zzfrVar.zzaa(i12);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzab(i12);
        } else {
            zzfrVar.zzab(i12);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzaa(i12);
        }
    }

    public static zzey zzea() {
        return zzoz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzey zzeb() {
        return new zzey();
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzey)) {
            zzey zzeyVar = (zzey) obj;
            int i11 = this.count;
            if (i11 == zzeyVar.count) {
                int[] iArr = this.zzpa;
                int[] iArr2 = zzeyVar.zzpa;
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
                    Object[] objArr = this.zzmj;
                    Object[] objArr2 = zzeyVar.zzmj;
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
        int[] iArr = this.zzpa;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.zzmj;
        int i17 = this.count;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfr zzfrVar) {
        if (zzfrVar.zzaj() == zzcg.zzg.zzkp) {
            for (int i11 = this.count - 1; i11 >= 0; i11--) {
                zzfrVar.zza(this.zzpa[i11] >>> 3, this.zzmj[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.count; i12++) {
            zzfrVar.zza(this.zzpa[i12] >>> 3, this.zzmj[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.count; i12++) {
            zzdr.zza(sb2, i11, String.valueOf(this.zzpa[i12] >>> 3), this.zzmj[i12]);
        }
    }

    public final int zzas() {
        int zze;
        int i11 = this.zzjq;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            int i14 = this.zzpa[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                zze = zzbn.zze(i15, ((Long) this.zzmj[i13]).longValue());
            } else if (i16 == 1) {
                zze = zzbn.zzg(i15, ((Long) this.zzmj[i13]).longValue());
            } else if (i16 == 2) {
                zze = zzbn.zzc(i15, (zzbb) this.zzmj[i13]);
            } else if (i16 == 3) {
                zze = (zzbn.zzr(i15) << 1) + ((zzey) this.zzmj[i13]).zzas();
            } else if (i16 != 5) {
                throw new IllegalStateException(zzco.zzbn());
            } else {
                zze = zzbn.zzj(i15, ((Integer) this.zzmj[i13]).intValue());
            }
            i12 += zze;
        }
        this.zzjq = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i11, Object obj) {
        if (!this.zzfa) {
            throw new UnsupportedOperationException();
        }
        int i12 = this.count;
        int[] iArr = this.zzpa;
        if (i12 == iArr.length) {
            int i13 = i12 + (i12 < 4 ? 8 : i12 >> 1);
            this.zzpa = Arrays.copyOf(iArr, i13);
            this.zzmj = Arrays.copyOf(this.zzmj, i13);
        }
        int[] iArr2 = this.zzpa;
        int i14 = this.count;
        iArr2[i14] = i11;
        this.zzmj[i14] = obj;
        this.count = i14 + 1;
    }

    public final void zzb(zzfr zzfrVar) {
        if (this.count == 0) {
            return;
        }
        if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            for (int i11 = 0; i11 < this.count; i11++) {
                zzb(this.zzpa[i11], this.zzmj[i11], zzfrVar);
            }
            return;
        }
        for (int i12 = this.count - 1; i12 >= 0; i12--) {
            zzb(this.zzpa[i12], this.zzmj[i12], zzfrVar);
        }
    }

    public final int zzec() {
        int i11 = this.zzjq;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            i12 += zzbn.zzd(this.zzpa[i13] >>> 3, (zzbb) this.zzmj[i13]);
        }
        this.zzjq = i12;
        return i12;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}
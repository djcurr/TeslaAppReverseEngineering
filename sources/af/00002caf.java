package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzjp implements Cloneable {
    private static final zzjq zzadi = new zzjq();
    private int mSize;
    private boolean zzadj;
    private int[] zzadk;
    private zzjq[] zzadl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjp() {
        this(10);
    }

    private static int idealIntArraySize(int i11) {
        int i12 = i11 << 2;
        int i13 = 4;
        while (true) {
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (i12 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        return i12 / 4;
    }

    private final int zzby(int i11) {
        int i12 = this.mSize - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = this.zzadk[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public final /* synthetic */ Object clone() {
        int i11 = this.mSize;
        zzjp zzjpVar = new zzjp(i11);
        System.arraycopy(this.zzadk, 0, zzjpVar.zzadk, 0, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            zzjq[] zzjqVarArr = this.zzadl;
            if (zzjqVarArr[i12] != null) {
                zzjpVar.zzadl[i12] = (zzjq) zzjqVarArr[i12].clone();
            }
        }
        zzjpVar.mSize = i11;
        return zzjpVar;
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjp) {
            zzjp zzjpVar = (zzjp) obj;
            int i11 = this.mSize;
            if (i11 != zzjpVar.mSize) {
                return false;
            }
            int[] iArr = this.zzadk;
            int[] iArr2 = zzjpVar.zzadk;
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
                zzjq[] zzjqVarArr = this.zzadl;
                zzjq[] zzjqVarArr2 = zzjpVar.zzadl;
                int i13 = this.mSize;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        z12 = true;
                        break;
                    } else if (!zzjqVarArr[i14].equals(zzjqVarArr2[i14])) {
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
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = 17;
        for (int i12 = 0; i12 < this.mSize; i12++) {
            i11 = (((i11 * 31) + this.zzadk[i12]) * 31) + this.zzadl[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.mSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i11, zzjq zzjqVar) {
        int zzby = zzby(i11);
        if (zzby >= 0) {
            this.zzadl[zzby] = zzjqVar;
            return;
        }
        int i12 = ~zzby;
        int i13 = this.mSize;
        if (i12 < i13) {
            zzjq[] zzjqVarArr = this.zzadl;
            if (zzjqVarArr[i12] == zzadi) {
                this.zzadk[i12] = i11;
                zzjqVarArr[i12] = zzjqVar;
                return;
            }
        }
        if (i13 >= this.zzadk.length) {
            int idealIntArraySize = idealIntArraySize(i13 + 1);
            int[] iArr = new int[idealIntArraySize];
            zzjq[] zzjqVarArr2 = new zzjq[idealIntArraySize];
            int[] iArr2 = this.zzadk;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzjq[] zzjqVarArr3 = this.zzadl;
            System.arraycopy(zzjqVarArr3, 0, zzjqVarArr2, 0, zzjqVarArr3.length);
            this.zzadk = iArr;
            this.zzadl = zzjqVarArr2;
        }
        int i14 = this.mSize;
        if (i14 - i12 != 0) {
            int[] iArr3 = this.zzadk;
            int i15 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i15, i14 - i12);
            zzjq[] zzjqVarArr4 = this.zzadl;
            System.arraycopy(zzjqVarArr4, i12, zzjqVarArr4, i15, this.mSize - i12);
        }
        this.zzadk[i12] = i11;
        this.zzadl[i12] = zzjqVar;
        this.mSize++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzjq zzbw(int i11) {
        int zzby = zzby(i11);
        if (zzby >= 0) {
            zzjq[] zzjqVarArr = this.zzadl;
            if (zzjqVarArr[zzby] == zzadi) {
                return null;
            }
            return zzjqVarArr[zzby];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzjq zzbx(int i11) {
        return this.zzadl[i11];
    }

    private zzjp(int i11) {
        this.zzadj = false;
        int idealIntArraySize = idealIntArraySize(i11);
        this.zzadk = new int[idealIntArraySize];
        this.zzadl = new zzjq[idealIntArraySize];
        this.mSize = 0;
    }
}
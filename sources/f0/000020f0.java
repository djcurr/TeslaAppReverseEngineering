package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public final class zzfw implements Cloneable {
    private static final zzfx zzrl = new zzfx();
    private int mSize;
    private boolean zzrm;
    private int[] zzrn;
    private zzfx[] zzro;

    zzfw() {
        this(10);
    }

    private zzfw(int i11) {
        this.zzrm = false;
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
        int i15 = i12 / 4;
        this.zzrn = new int[i15];
        this.zzro = new zzfx[i15];
        this.mSize = 0;
    }

    public final /* synthetic */ Object clone() {
        int i11 = this.mSize;
        zzfw zzfwVar = new zzfw(i11);
        System.arraycopy(this.zzrn, 0, zzfwVar.zzrn, 0, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            zzfx[] zzfxVarArr = this.zzro;
            if (zzfxVarArr[i12] != null) {
                zzfwVar.zzro[i12] = (zzfx) zzfxVarArr[i12].clone();
            }
        }
        zzfwVar.mSize = i11;
        return zzfwVar;
    }

    public final boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfw) {
            zzfw zzfwVar = (zzfw) obj;
            int i11 = this.mSize;
            if (i11 != zzfwVar.mSize) {
                return false;
            }
            int[] iArr = this.zzrn;
            int[] iArr2 = zzfwVar.zzrn;
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
                zzfx[] zzfxVarArr = this.zzro;
                zzfx[] zzfxVarArr2 = zzfwVar.zzro;
                int i13 = this.mSize;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        z12 = true;
                        break;
                    } else if (!zzfxVarArr[i14].equals(zzfxVarArr2[i14])) {
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
            i11 = (((i11 * 31) + this.zzrn[i12]) * 31) + this.zzro[i12].hashCode();
        }
        return i11;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.mSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfx zzaq(int i11) {
        return this.zzro[i11];
    }
}
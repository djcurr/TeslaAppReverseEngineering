package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfb extends zzez {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzsk;
    private int zzsl;
    private int zzsm;
    private int zzsn;
    private int zzso;

    private zzfb(byte[] bArr, int i11, int i12, boolean z11) {
        super();
        this.zzso = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i12 + i11;
        this.pos = i11;
        this.zzsm = i11;
        this.zzsk = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzdt() {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzdr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdt():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzdu() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdu():long");
    }

    private final int zzdv() {
        int i11 = this.pos;
        if (this.limit - i11 >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }
        throw zzgf.zzfh();
    }

    private final long zzdw() {
        int i11 = this.pos;
        if (this.limit - i11 >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i11 + 8;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }
        throw zzgf.zzfh();
    }

    private final void zzdx() {
        int i11 = this.limit + this.zzsl;
        this.limit = i11;
        int i12 = i11 - this.zzsm;
        int i13 = this.zzso;
        if (i12 > i13) {
            int i14 = i12 - i13;
            this.zzsl = i14;
            this.limit = i11 - i14;
            return;
        }
        this.zzsl = 0;
    }

    private final byte zzdy() {
        int i11 = this.pos;
        if (i11 != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i11 + 1;
            return bArr[i11];
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final double readDouble() {
        return Double.longBitsToDouble(zzdw());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final float readFloat() {
        return Float.intBitsToFloat(zzdv());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final String readString() {
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i11 = this.limit;
            int i12 = this.pos;
            if (zzdt <= i11 - i12) {
                String str = new String(this.buffer, i12, zzdt, zzga.UTF_8);
                this.pos += zzdt;
                return str;
            }
        }
        if (zzdt == 0) {
            return "";
        }
        if (zzdt < 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final <T extends zzhf> T zza(zzhq<T> zzhqVar, zzfk zzfkVar) {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            int zzan = zzan(zzdt);
            this.zzsf++;
            T zza = zzhqVar.zza(this, zzfkVar);
            zzak(0);
            this.zzsf--;
            zzao(zzan);
            return zza;
        }
        throw zzgf.zzfn();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzak(int i11) {
        if (this.zzsn != i11) {
            throw zzgf.zzfl();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzal(int i11) {
        int zzdq;
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i13 < 10) {
                    byte[] bArr = this.buffer;
                    int i14 = this.pos;
                    this.pos = i14 + 1;
                    if (bArr[i14] < 0) {
                        i13++;
                    }
                }
                throw zzgf.zzfj();
            }
            while (i13 < 10) {
                if (zzdy() < 0) {
                    i13++;
                }
            }
            throw zzgf.zzfj();
            return true;
        } else if (i12 == 1) {
            zzap(8);
            return true;
        } else if (i12 == 2) {
            zzap(zzdt());
            return true;
        } else if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 5) {
                    zzap(4);
                    return true;
                }
                throw zzgf.zzfm();
            }
            return false;
        } else {
            do {
                zzdq = zzdq();
                if (zzdq == 0) {
                    break;
                }
            } while (zzal(zzdq));
            zzak(((i11 >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzan(int i11) {
        if (i11 >= 0) {
            int zzds = i11 + zzds();
            int i12 = this.zzso;
            if (zzds <= i12) {
                this.zzso = zzds;
                zzdx();
                return i12;
            }
            throw zzgf.zzfh();
        }
        throw zzgf.zzfi();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzao(int i11) {
        this.zzso = i11;
        zzdx();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final void zzap(int i11) {
        if (i11 >= 0) {
            int i12 = this.limit;
            int i13 = this.pos;
            if (i11 <= i12 - i13) {
                this.pos = i13 + i11;
                return;
            }
        }
        if (i11 < 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzcm() {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcp() {
        return zzdu();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcq() {
        return zzdu();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcr() {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzcs() {
        return zzdw();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzct() {
        return zzdv();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final boolean zzcu() {
        return zzdu() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final String zzcv() {
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i11 = this.limit;
            int i12 = this.pos;
            if (zzdt <= i11 - i12) {
                String zzi = zziw.zzi(this.buffer, i12, zzdt);
                this.pos += zzdt;
                return zzi;
            }
        }
        if (zzdt == 0) {
            return "";
        }
        if (zzdt <= 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final zzeo zzcw() {
        byte[] bArr;
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i11 = this.limit;
            int i12 = this.pos;
            if (zzdt <= i11 - i12) {
                zzeo zzb = zzeo.zzb(this.buffer, i12, zzdt);
                this.pos += zzdt;
                return zzb;
            }
        }
        if (zzdt == 0) {
            return zzeo.zzrx;
        }
        if (zzdt > 0) {
            int i13 = this.limit;
            int i14 = this.pos;
            if (zzdt <= i13 - i14) {
                int i15 = zzdt + i14;
                this.pos = i15;
                bArr = Arrays.copyOfRange(this.buffer, i14, i15);
                return zzeo.zze(bArr);
            }
        }
        if (zzdt <= 0) {
            if (zzdt == 0) {
                bArr = zzga.zzxn;
                return zzeo.zze(bArr);
            }
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcx() {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcy() {
        return zzdt();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzcz() {
        return zzdv();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzda() {
        return zzdw();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzdb() {
        return zzez.zzaq(zzdt());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzdc() {
        return zzez.zzd(zzdu());
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzdq() {
        if (zzcm()) {
            this.zzsn = 0;
            return 0;
        }
        int zzdt = zzdt();
        this.zzsn = zzdt;
        if ((zzdt >>> 3) != 0) {
            return zzdt;
        }
        throw zzgf.zzfk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzez
    public final long zzdr() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte zzdy = zzdy();
            j11 |= (zzdy & Byte.MAX_VALUE) << i11;
            if ((zzdy & 128) == 0) {
                return j11;
            }
        }
        throw zzgf.zzfj();
    }

    @Override // com.google.android.gms.internal.vision.zzez
    public final int zzds() {
        return this.pos - this.zzsm;
    }
}
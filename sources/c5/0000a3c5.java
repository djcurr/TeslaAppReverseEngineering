package org.spongycastle.pqc.crypto.gmss.util;

import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;

    /* renamed from: w  reason: collision with root package name */
    private int f43774w;

    public WinternitzOTSVerify(Digest digest, int i11) {
        this.f43774w = i11;
        this.messDigestOTS = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i11;
        byte[] bArr3 = bArr2;
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        int i12 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr5 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr5, 0);
        int i13 = digestSize << 3;
        int i14 = this.f43774w;
        int i15 = ((i14 - 1) + i13) / i14;
        int log = getLog((i15 << i14) + 1);
        int i16 = this.f43774w;
        int i17 = ((((log + i16) - 1) / i16) + i15) * digestSize;
        if (i17 != bArr3.length) {
            return null;
        }
        byte[] bArr6 = new byte[i17];
        int i18 = 8;
        if (8 % i16 == 0) {
            int i19 = 8 / i16;
            int i21 = (1 << i16) - 1;
            byte[] bArr7 = new byte[digestSize];
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i22 < digestSize2) {
                while (i12 < i19) {
                    int i25 = bArr5[i22] & i21;
                    i23 += i25;
                    int i26 = digestSize2;
                    int i27 = i24 * digestSize;
                    int i28 = i19;
                    System.arraycopy(bArr3, i27, bArr7, 0, digestSize);
                    int i29 = i25;
                    while (i29 < i21) {
                        this.messDigestOTS.update(bArr7, 0, bArr7.length);
                        bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr7, 0);
                        i29++;
                        i23 = i23;
                        i17 = i17;
                    }
                    System.arraycopy(bArr7, 0, bArr6, i27, digestSize);
                    bArr5[i22] = (byte) (bArr5[i22] >>> this.f43774w);
                    i24++;
                    i12++;
                    digestSize2 = i26;
                    bArr3 = bArr2;
                    i19 = i28;
                }
                i22++;
                bArr3 = bArr2;
                i12 = 0;
            }
            i11 = i17;
            int i31 = (i15 << this.f43774w) - i23;
            int i32 = 0;
            while (i32 < log) {
                int i33 = i24 * digestSize;
                System.arraycopy(bArr2, i33, bArr7, 0, digestSize);
                for (int i34 = i31 & i21; i34 < i21; i34++) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                System.arraycopy(bArr7, 0, bArr6, i33, digestSize);
                int i35 = this.f43774w;
                i31 >>>= i35;
                i24++;
                i32 += i35;
            }
        } else {
            i11 = i17;
            if (i16 < 8) {
                int i36 = digestSize / i16;
                int i37 = (1 << i16) - 1;
                byte[] bArr8 = new byte[digestSize];
                int i38 = 0;
                int i39 = 0;
                int i41 = 0;
                int i42 = 0;
                while (i38 < i36) {
                    int i43 = 0;
                    long j11 = 0;
                    while (i43 < this.f43774w) {
                        j11 ^= (bArr5[i39] & 255) << (i43 << 3);
                        i39++;
                        i43++;
                        bArr8 = bArr8;
                    }
                    int i44 = 0;
                    while (i44 < i18) {
                        int i45 = i38;
                        int i46 = (int) (j11 & i37);
                        i41 += i46;
                        int i47 = i42 * digestSize;
                        System.arraycopy(bArr3, i47, bArr8, 0, digestSize);
                        while (i46 < i37) {
                            this.messDigestOTS.update(bArr8, 0, bArr8.length);
                            bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                            this.messDigestOTS.doFinal(bArr8, 0);
                            i46++;
                            i36 = i36;
                            i39 = i39;
                        }
                        System.arraycopy(bArr8, 0, bArr6, i47, digestSize);
                        j11 >>>= this.f43774w;
                        i42++;
                        i44++;
                        i38 = i45;
                        i18 = 8;
                    }
                    i38++;
                    i18 = 8;
                }
                byte[] bArr9 = bArr8;
                int i48 = digestSize % this.f43774w;
                long j12 = 0;
                for (int i49 = 0; i49 < i48; i49++) {
                    j12 ^= (bArr5[i39] & 255) << (i49 << 3);
                    i39++;
                }
                int i51 = i48 << 3;
                byte[] bArr10 = bArr9;
                int i52 = 0;
                while (i52 < i51) {
                    int i53 = (int) (j12 & i37);
                    i41 += i53;
                    int i54 = i42 * digestSize;
                    System.arraycopy(bArr3, i54, bArr10, 0, digestSize);
                    while (i53 < i37) {
                        this.messDigestOTS.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr10, 0);
                        i53++;
                    }
                    System.arraycopy(bArr10, 0, bArr6, i54, digestSize);
                    int i55 = this.f43774w;
                    j12 >>>= i55;
                    i42++;
                    i52 += i55;
                }
                int i56 = (i15 << this.f43774w) - i41;
                int i57 = 0;
                while (i57 < log) {
                    int i58 = i42 * digestSize;
                    System.arraycopy(bArr3, i58, bArr10, 0, digestSize);
                    for (int i59 = i56 & i37; i59 < i37; i59++) {
                        this.messDigestOTS.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr10, 0);
                    }
                    System.arraycopy(bArr10, 0, bArr6, i58, digestSize);
                    int i61 = this.f43774w;
                    i56 >>>= i61;
                    i42++;
                    i57 += i61;
                }
            } else if (i16 < 57) {
                int i62 = i13 - i16;
                int i63 = (1 << i16) - 1;
                byte[] bArr11 = new byte[digestSize];
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                while (i65 <= i62) {
                    int i67 = i65 >>> 3;
                    int i68 = i65 % 8;
                    int i69 = i65 + this.f43774w;
                    int i71 = 0;
                    long j13 = 0;
                    while (i67 < ((i69 + 7) >>> 3)) {
                        j13 ^= (bArr5[i67] & 255) << (i71 << 3);
                        i71++;
                        i67++;
                        i62 = i62;
                        log = log;
                        i15 = i15;
                    }
                    int i72 = i62;
                    int i73 = log;
                    int i74 = i15;
                    long j14 = i63;
                    long j15 = (j13 >>> i68) & j14;
                    int i75 = i69;
                    i66 = (int) (i66 + j15);
                    int i76 = i64 * digestSize;
                    System.arraycopy(bArr3, i76, bArr11, 0, digestSize);
                    while (j15 < j14) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                        j15++;
                        i75 = i75;
                        i66 = i66;
                    }
                    System.arraycopy(bArr11, 0, bArr6, i76, digestSize);
                    i64++;
                    i65 = i75;
                    i62 = i72;
                    log = i73;
                    i15 = i74;
                }
                int i77 = log;
                int i78 = i15;
                int i79 = i65 >>> 3;
                if (i79 < digestSize) {
                    int i81 = i65 % 8;
                    int i82 = 0;
                    long j16 = 0;
                    while (i79 < digestSize) {
                        j16 ^= (bArr5[i79] & 255) << (i82 << 3);
                        i82++;
                        i79++;
                    }
                    long j17 = i63;
                    long j18 = (j16 >>> i81) & j17;
                    i66 = (int) (i66 + j18);
                    int i83 = i64 * digestSize;
                    System.arraycopy(bArr3, i83, bArr11, 0, digestSize);
                    while (j18 < j17) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                        j18++;
                    }
                    System.arraycopy(bArr11, 0, bArr6, i83, digestSize);
                    i64++;
                }
                int i84 = (i78 << this.f43774w) - i66;
                int i85 = 0;
                while (i85 < i77) {
                    int i86 = i64 * digestSize;
                    System.arraycopy(bArr3, i86, bArr11, 0, digestSize);
                    for (long j19 = i84 & i63; j19 < i63; j19++) {
                        this.messDigestOTS.update(bArr11, 0, bArr11.length);
                        bArr11 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr11, 0);
                    }
                    System.arraycopy(bArr11, 0, bArr6, i86, digestSize);
                    int i87 = this.f43774w;
                    i84 >>>= i87;
                    i64++;
                    i85 += i87;
                }
            }
        }
        byte[] bArr12 = new byte[digestSize];
        this.messDigestOTS.update(bArr6, 0, i11);
        byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr13, 0);
        return bArr13;
    }

    public int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i11 = this.f43774w;
        int i12 = ((digestSize << 3) + (i11 - 1)) / i11;
        int log = getLog((i12 << i11) + 1);
        int i13 = this.f43774w;
        return digestSize * (i12 + (((log + i13) - 1) / i13));
    }
}
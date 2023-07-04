package org.spongycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* renamed from: w  reason: collision with root package name */
    private int f43775w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i11) {
        int digestSize;
        this.f43775w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d11 = i11;
        int ceil = (int) Math.ceil((digestSize << 3) / d11);
        this.messagesize = ceil;
        int log = getLog((ceil << i11) + 1);
        this.checksumsize = log;
        int ceil2 = this.messagesize + ((int) Math.ceil(log / d11));
        this.keysize = ceil2;
        this.privateKeyOTS = (byte[][]) Array.newInstance(byte.class, ceil2, this.mdsize);
        int i12 = this.mdsize;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        for (int i13 = 0; i13 < this.keysize; i13++) {
            this.privateKeyOTS[i13] = this.gmssRandom.nextSeed(bArr2);
        }
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i11 = this.keysize;
        int i12 = this.mdsize;
        int i13 = i11 * i12;
        byte[] bArr = new byte[i13];
        byte[] bArr2 = new byte[i12];
        int i14 = 1 << this.f43775w;
        for (int i15 = 0; i15 < this.keysize; i15++) {
            Digest digest = this.messDigestOTS;
            byte[][] bArr3 = this.privateKeyOTS;
            digest.update(bArr3[i15], 0, bArr3[i15].length);
            byte[] bArr4 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr4, 0);
            for (int i16 = 2; i16 < i14; i16++) {
                this.messDigestOTS.update(bArr4, 0, bArr4.length);
                bArr4 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr4, 0);
            }
            int i17 = this.mdsize;
            System.arraycopy(bArr4, 0, bArr, i17 * i15, i17);
        }
        this.messDigestOTS.update(bArr, 0, i13);
        byte[] bArr5 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr5, 0);
        return bArr5;
    }

    public byte[] getSignature(byte[] bArr) {
        int i11;
        int i12 = this.keysize;
        int i13 = this.mdsize;
        byte[] bArr2 = new byte[i12 * i13];
        byte[] bArr3 = new byte[i13];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i14 = this.f43775w;
        int i15 = 8;
        if (8 % i14 == 0) {
            int i16 = 8 / i14;
            int i17 = (1 << i14) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i18 = 0;
            int i19 = 0;
            for (int i21 = 0; i21 < digestSize; i21++) {
                for (int i22 = 0; i22 < i16; i22++) {
                    int i23 = bArr4[i21] & i17;
                    i18 += i23;
                    System.arraycopy(this.privateKeyOTS[i19], 0, bArr5, 0, this.mdsize);
                    while (i23 > 0) {
                        this.messDigestOTS.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr5, 0);
                        i23--;
                    }
                    int i24 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr2, i19 * i24, i24);
                    bArr4[i21] = (byte) (bArr4[i21] >>> this.f43775w);
                    i19++;
                }
            }
            int i25 = (this.messagesize << this.f43775w) - i18;
            int i26 = 0;
            while (i26 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i19], 0, bArr5, 0, this.mdsize);
                for (int i27 = i25 & i17; i27 > 0; i27--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i28 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr2, i19 * i28, i28);
                int i29 = this.f43775w;
                i25 >>>= i29;
                i19++;
                i26 += i29;
            }
        } else if (i14 < 8) {
            int i31 = this.mdsize;
            int i32 = i31 / i14;
            int i33 = (1 << i14) - 1;
            byte[] bArr6 = new byte[i31];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < i32) {
                long j11 = 0;
                for (int i38 = 0; i38 < this.f43775w; i38++) {
                    j11 ^= (bArr4[i35] & 255) << (i38 << 3);
                    i35++;
                }
                int i39 = 0;
                while (i39 < i15) {
                    int i41 = i32;
                    int i42 = (int) (j11 & i33);
                    i37 += i42;
                    System.arraycopy(this.privateKeyOTS[i36], 0, bArr6, 0, this.mdsize);
                    while (i42 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i42--;
                    }
                    int i43 = this.mdsize;
                    System.arraycopy(bArr6, 0, bArr2, i36 * i43, i43);
                    j11 >>>= this.f43775w;
                    i36++;
                    i39++;
                    i32 = i41;
                    i15 = 8;
                }
                i34++;
                i15 = 8;
            }
            int i44 = this.mdsize % this.f43775w;
            int i45 = 0;
            long j12 = 0;
            while (i45 < i44) {
                j12 ^= (bArr4[i35] & 255) << (i45 << 3);
                i35++;
                i45++;
                i44 = i44;
            }
            int i46 = i44 << 3;
            int i47 = 0;
            while (i47 < i46) {
                int i48 = (int) (i33 & j12);
                i37 += i48;
                System.arraycopy(this.privateKeyOTS[i36], 0, bArr6, 0, this.mdsize);
                while (i48 > 0) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                    i48--;
                }
                int i49 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i36 * i49, i49);
                int i51 = this.f43775w;
                j12 >>>= i51;
                i36++;
                i47 += i51;
            }
            int i52 = (this.messagesize << this.f43775w) - i37;
            int i53 = 0;
            while (i53 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i36], 0, bArr6, 0, this.mdsize);
                for (int i54 = i52 & i33; i54 > 0; i54--) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                int i55 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i36 * i55, i55);
                int i56 = this.f43775w;
                i52 >>>= i56;
                i36++;
                i53 += i56;
            }
        } else if (i14 < 57) {
            int i57 = this.mdsize;
            int i58 = (i57 << 3) - i14;
            int i59 = (1 << i14) - 1;
            byte[] bArr7 = new byte[i57];
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            while (i62 <= i58) {
                int i64 = i62 % 8;
                i62 += this.f43775w;
                int i65 = 0;
                long j13 = 0;
                for (int i66 = i62 >>> 3; i66 < ((i62 + 7) >>> 3); i66++) {
                    j13 ^= (bArr4[i66] & 255) << (i65 << 3);
                    i65++;
                }
                long j14 = (j13 >>> i64) & i59;
                i61 = (int) (i61 + j14);
                System.arraycopy(this.privateKeyOTS[i63], 0, bArr7, 0, this.mdsize);
                while (j14 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j14--;
                }
                int i67 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i63 * i67, i67);
                i63++;
            }
            int i68 = i62 >>> 3;
            if (i68 < this.mdsize) {
                int i69 = i62 % 8;
                int i71 = 0;
                long j15 = 0;
                while (true) {
                    i11 = this.mdsize;
                    if (i68 >= i11) {
                        break;
                    }
                    j15 ^= (bArr4[i68] & 255) << (i71 << 3);
                    i71++;
                    i68++;
                }
                long j16 = (j15 >>> i69) & i59;
                i61 = (int) (i61 + j16);
                System.arraycopy(this.privateKeyOTS[i63], 0, bArr7, 0, i11);
                while (j16 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j16--;
                }
                int i72 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i63 * i72, i72);
                i63++;
            }
            int i73 = (this.messagesize << this.f43775w) - i61;
            int i74 = i63;
            int i75 = 0;
            while (i75 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i74], 0, bArr7, 0, this.mdsize);
                for (long j17 = i73 & i59; j17 > 0; j17--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                int i76 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i74 * i76, i76);
                int i77 = this.f43775w;
                i73 >>>= i77;
                i74++;
                i75 += i77;
            }
        }
        return bArr2;
    }
}
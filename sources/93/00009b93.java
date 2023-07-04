package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] W1;
    private int[] inwords;
    private int xOff;

    static {
        int i11;
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            T[i12] = (2043430169 >>> (32 - i12)) | (2043430169 << i12);
            i12++;
        }
        for (i11 = 16; i11 < 64; i11++) {
            int i13 = i11 % 32;
            T[i11] = (2055708042 >>> (32 - i13)) | (2055708042 << i13);
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        reset();
    }

    private int FF0(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int FF1(int i11, int i12, int i13) {
        return (i11 & i13) | (i11 & i12) | (i12 & i13);
    }

    private int GG0(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int GG1(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int P0(int i11) {
        return (i11 ^ ((i11 << 9) | (i11 >>> 23))) ^ ((i11 << 17) | (i11 >>> 15));
    }

    private int P1(int i11) {
        return (i11 ^ ((i11 << 15) | (i11 >>> 17))) ^ ((i11 << 23) | (i11 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        Pack.intToBigEndian(this.V[0], bArr, i11 + 0);
        Pack.intToBigEndian(this.V[1], bArr, i11 + 4);
        Pack.intToBigEndian(this.V[2], bArr, i11 + 8);
        Pack.intToBigEndian(this.V[3], bArr, i11 + 12);
        Pack.intToBigEndian(this.V[4], bArr, i11 + 16);
        Pack.intToBigEndian(this.V[5], bArr, i11 + 20);
        Pack.intToBigEndian(this.V[6], bArr, i11 + 24);
        Pack.intToBigEndian(this.V[7], bArr, i11 + 28);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i11 = 0; i11 < 16; i11++) {
            this.W[i11] = this.inwords[i11];
        }
        for (int i12 = 16; i12 < 68; i12++) {
            int[] iArr = this.W;
            int i13 = iArr[i12 - 3];
            int i14 = iArr[i12 - 13];
            iArr[i12] = (P1(((i13 >>> 17) | (i13 << 15)) ^ (iArr[i12 - 16] ^ iArr[i12 - 9])) ^ ((i14 >>> 25) | (i14 << 7))) ^ this.W[i12 - 6];
        }
        for (int i15 = 0; i15 < 64; i15++) {
            int[] iArr2 = this.W1;
            int[] iArr3 = this.W;
            iArr2[i15] = iArr3[i15 + 4] ^ iArr3[i15];
        }
        int[] iArr4 = this.V;
        int i16 = iArr4[0];
        int i17 = iArr4[1];
        int i18 = iArr4[2];
        int i19 = iArr4[3];
        int i21 = iArr4[4];
        int i22 = iArr4[5];
        int i23 = iArr4[6];
        int i24 = iArr4[7];
        int i25 = 0;
        int i26 = i23;
        while (i25 < 16) {
            int i27 = (i16 << 12) | (i16 >>> 20);
            int i28 = i27 + i21 + T[i25];
            int i29 = (i28 << 7) | (i28 >>> 25);
            int FF0 = FF0(i16, i17, i18) + i19;
            int GG0 = GG0(i21, i22, i26) + i24 + i29 + this.W[i25];
            int i31 = (i17 << 9) | (i17 >>> 23);
            i25++;
            int i32 = i21;
            i21 = P0(GG0);
            i24 = i26;
            i26 = (i22 << 19) | (i22 >>> 13);
            i22 = i32;
            i17 = i16;
            i16 = FF0 + (i29 ^ i27) + this.W1[i25];
            i19 = i18;
            i18 = i31;
        }
        int i33 = i19;
        int i34 = i18;
        int i35 = i17;
        int i36 = i16;
        int i37 = 16;
        int i38 = i24;
        int i39 = i26;
        while (i37 < 64) {
            int i41 = (i36 << 12) | (i36 >>> 20);
            int i42 = i41 + i21 + T[i37];
            int i43 = (i42 << 7) | (i42 >>> 25);
            int FF1 = FF1(i36, i35, i34) + i33;
            int GG1 = GG1(i21, i22, i39) + i38 + i43 + this.W[i37];
            int i44 = (i35 >>> 23) | (i35 << 9);
            int i45 = (i22 << 19) | (i22 >>> 13);
            i37++;
            i22 = i21;
            i21 = P0(GG1);
            i38 = i39;
            i39 = i45;
            i35 = i36;
            i36 = FF1 + (i43 ^ i41) + this.W1[i37];
            i33 = i34;
            i34 = i44;
        }
        int[] iArr5 = this.V;
        iArr5[0] = iArr5[0] ^ i36;
        iArr5[1] = iArr5[1] ^ i35;
        iArr5[2] = iArr5[2] ^ i34;
        iArr5[3] = iArr5[3] ^ i33;
        iArr5[4] = iArr5[4] ^ i21;
        iArr5[5] = iArr5[5] ^ i22;
        iArr5[6] = i39 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i38;
        this.xOff = 0;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processLength(long j11) {
        int i11 = this.xOff;
        if (i11 > 14) {
            this.inwords[i11] = 0;
            this.xOff = i11 + 1;
            processBlock();
        }
        while (true) {
            int i12 = this.xOff;
            if (i12 < 14) {
                this.inwords[i12] = 0;
                this.xOff = i12 + 1;
            } else {
                int[] iArr = this.inwords;
                int i13 = i12 + 1;
                this.xOff = i13;
                iArr[i12] = (int) (j11 >>> 32);
                this.xOff = i13 + 1;
                iArr[i13] = (int) j11;
                return;
            }
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i13 + 1] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
        int[] iArr = this.inwords;
        int i15 = this.xOff;
        iArr[i15] = i14;
        int i16 = i15 + 1;
        this.xOff = i16;
        if (i16 >= 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        this.W1 = new int[64];
        copyIn(sM3Digest);
    }
}
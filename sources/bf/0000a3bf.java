package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;

    /* renamed from: ii  reason: collision with root package name */
    private int f43770ii;

    /* renamed from: k  reason: collision with root package name */
    private int f43771k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* renamed from: r  reason: collision with root package name */
    private int f43772r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* renamed from: w  reason: collision with root package name */
    private int f43773w;

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.f43770ii = iArr[2];
        this.f43772r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f43773w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i11 = this.f43773w;
        this.f43771k = (1 << i11) - 1;
        this.messagesize = (int) Math.ceil((digestSize << 3) / i11);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        this.test8 = ((bArr[4][1] & 255) << 8) | (bArr[4][0] & 255) | ((bArr[4][2] & 255) << 16) | ((bArr[4][3] & 255) << 24) | ((bArr[4][4] & 255) << 32) | ((bArr[4][5] & 255) << 40) | ((bArr[4][6] & 255) << 48) | ((bArr[4][7] & 255) << 56);
        this.big8 = (bArr[4][8] & 255) | ((bArr[4][9] & 255) << 8) | ((bArr[4][10] & 255) << 16) | ((bArr[4][11] & 255) << 24) | ((bArr[4][12] & 255) << 32) | ((bArr[4][13] & 255) << 40) | ((bArr[4][14] & 255) << 48) | ((bArr[4][15] & 255) << 56);
    }

    private void oneStep() {
        int i11 = this.f43773w;
        if (8 % i11 == 0) {
            int i12 = this.test;
            if (i12 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i13 = this.f43770ii;
                if (i13 < this.mdsize) {
                    byte[] bArr = this.hash;
                    this.test = bArr[i13] & this.f43771k;
                    bArr[i13] = (byte) (bArr[i13] >>> this.f43773w);
                } else {
                    int i14 = this.checksum;
                    this.test = this.f43771k & i14;
                    this.checksum = i14 >>> this.f43773w;
                }
            } else if (i12 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i15 = this.counter;
                int i16 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i15 * i16, i16);
                int i17 = this.counter + 1;
                this.counter = i17;
                if (i17 % (8 / this.f43773w) == 0) {
                    this.f43770ii++;
                }
            }
        } else if (i11 >= 8) {
            if (i11 < 57) {
                long j11 = this.test8;
                if (j11 == 0) {
                    this.big8 = 0L;
                    this.f43770ii = 0;
                    int i18 = this.f43772r;
                    int i19 = i18 % 8;
                    int i21 = i18 >>> 3;
                    int i22 = this.mdsize;
                    if (i21 < i22) {
                        if (i18 <= (i22 << 3) - i11) {
                            int i23 = i18 + i11;
                            this.f43772r = i23;
                            i22 = (i23 + 7) >>> 3;
                        } else {
                            this.f43772r = i18 + i11;
                        }
                        while (i21 < i22) {
                            long j12 = this.big8;
                            int i24 = this.f43770ii;
                            this.big8 = j12 ^ ((this.hash[i21] & 255) << (i24 << 3));
                            this.f43770ii = i24 + 1;
                            i21++;
                        }
                        long j13 = this.big8 >>> i19;
                        this.big8 = j13;
                        this.test8 = j13 & this.f43771k;
                    } else {
                        int i25 = this.checksum;
                        this.test8 = this.f43771k & i25;
                        this.checksum = i25 >>> i11;
                    }
                    this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                } else if (j11 > 0) {
                    Digest digest2 = this.messDigestOTS;
                    byte[] bArr6 = this.privateKeyOTS;
                    digest2.update(bArr6, 0, bArr6.length);
                    byte[] bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.privateKeyOTS = bArr7;
                    this.messDigestOTS.doFinal(bArr7, 0);
                    this.test8--;
                }
                if (this.test8 == 0) {
                    byte[] bArr8 = this.privateKeyOTS;
                    byte[] bArr9 = this.sign;
                    int i26 = this.counter;
                    int i27 = this.mdsize;
                    System.arraycopy(bArr8, 0, bArr9, i26 * i27, i27);
                    this.counter++;
                }
            }
        } else {
            int i28 = this.test;
            if (i28 == 0) {
                int i29 = this.counter;
                if (i29 % 8 == 0) {
                    int i31 = this.f43770ii;
                    int i32 = this.mdsize;
                    if (i31 < i32) {
                        this.big8 = 0L;
                        if (i29 < ((i32 / i11) << 3)) {
                            for (int i33 = 0; i33 < this.f43773w; i33++) {
                                long j14 = this.big8;
                                byte[] bArr10 = this.hash;
                                int i34 = this.f43770ii;
                                this.big8 = j14 ^ ((bArr10[i34] & 255) << (i33 << 3));
                                this.f43770ii = i34 + 1;
                            }
                        } else {
                            for (int i35 = 0; i35 < this.mdsize % this.f43773w; i35++) {
                                long j15 = this.big8;
                                byte[] bArr11 = this.hash;
                                int i36 = this.f43770ii;
                                this.big8 = j15 ^ ((bArr11[i36] & 255) << (i35 << 3));
                                this.f43770ii = i36 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.f43771k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i28 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i37 = this.counter;
                int i38 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i37 * i38, i38);
                this.big8 >>>= this.f43773w;
                this.counter++;
            }
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

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.f43770ii, this.f43772r, this.steps, this.keysize, this.height, this.f43773w, this.checksum};
    }

    public byte[] getStatLong() {
        long j11 = this.test8;
        long j12 = this.big8;
        return new byte[]{(byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) ((j11 >> 32) & 255), (byte) ((j11 >> 40) & 255), (byte) ((j11 >> 48) & 255), (byte) ((j11 >> 56) & 255), (byte) (j12 & 255), (byte) ((j12 >> 8) & 255), (byte) ((j12 >> 16) & 255), (byte) ((j12 >> 24) & 255), (byte) ((j12 >> 32) & 255), (byte) ((j12 >> 40) & 255), (byte) ((j12 >> 48) & 255), (byte) ((j12 >> 56) & 255)};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i11;
        int i12;
        int ceil;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i13 = this.mdsize;
        byte[] bArr4 = new byte[i13];
        System.arraycopy(this.hash, 0, bArr4, 0, i13);
        int log = getLog((this.messagesize << this.f43773w) + 1);
        int i14 = this.f43773w;
        int i15 = 8;
        if (8 % i14 == 0) {
            int i16 = 8 / i14;
            i11 = 0;
            for (int i17 = 0; i17 < this.mdsize; i17++) {
                for (int i18 = 0; i18 < i16; i18++) {
                    i11 += bArr4[i17] & this.f43771k;
                    bArr4[i17] = (byte) (bArr4[i17] >>> this.f43773w);
                }
            }
            int i19 = (this.messagesize << this.f43773w) - i11;
            this.checksum = i19;
            int i21 = 0;
            while (i21 < log) {
                i11 += this.f43771k & i19;
                int i22 = this.f43773w;
                i19 >>>= i22;
                i21 += i22;
            }
        } else if (i14 < 8) {
            int i23 = this.mdsize / i14;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i24 < i23) {
                long j11 = 0;
                for (int i27 = 0; i27 < this.f43773w; i27++) {
                    j11 ^= (bArr4[i25] & 255) << (i27 << 3);
                    i25++;
                }
                int i28 = 0;
                while (i28 < i15) {
                    i26 += (int) (this.f43771k & j11);
                    j11 >>>= this.f43773w;
                    i28++;
                    i23 = i23;
                    i15 = 8;
                }
                i24++;
                i15 = 8;
            }
            int i29 = this.mdsize % this.f43773w;
            long j12 = 0;
            for (int i31 = 0; i31 < i29; i31++) {
                j12 ^= (bArr4[i25] & 255) << (i31 << 3);
                i25++;
            }
            int i32 = i29 << 3;
            int i33 = 0;
            while (i33 < i32) {
                i26 += (int) (this.f43771k & j12);
                int i34 = this.f43773w;
                j12 >>>= i34;
                i33 += i34;
            }
            int i35 = (this.messagesize << this.f43773w) - i26;
            this.checksum = i35;
            int i36 = 0;
            i11 = i26;
            while (i36 < log) {
                i11 += this.f43771k & i35;
                int i37 = this.f43773w;
                i35 >>>= i37;
                i36 += i37;
            }
        } else if (i14 < 57) {
            int i38 = 0;
            int i39 = 0;
            while (true) {
                i12 = this.mdsize;
                int i41 = this.f43773w;
                if (i38 > (i12 << 3) - i41) {
                    break;
                }
                int i42 = i38 % 8;
                i38 += i41;
                int i43 = 0;
                long j13 = 0;
                for (int i44 = i38 >>> 3; i44 < ((i38 + 7) >>> 3); i44++) {
                    j13 ^= (bArr4[i44] & 255) << (i43 << 3);
                    i43++;
                }
                i39 = (int) (i39 + ((j13 >>> i42) & this.f43771k));
            }
            int i45 = i38 >>> 3;
            if (i45 < i12) {
                int i46 = i38 % 8;
                int i47 = 0;
                long j14 = 0;
                while (i45 < this.mdsize) {
                    j14 ^= (bArr4[i45] & 255) << (i47 << 3);
                    i47++;
                    i45++;
                }
                i39 = (int) (i39 + ((j14 >>> i46) & this.f43771k));
            }
            int i48 = (this.messagesize << this.f43773w) - i39;
            this.checksum = i48;
            int i49 = 0;
            i11 = i39;
            while (i49 < log) {
                i11 += this.f43771k & i48;
                int i51 = this.f43773w;
                i48 >>>= i51;
                i49 += i51;
            }
        } else {
            i11 = 0;
        }
        this.keysize = this.messagesize + ((int) Math.ceil(log / this.f43773w));
        this.steps = (int) Math.ceil((ceil + i11) / (1 << this.height));
        int i52 = this.keysize;
        int i53 = this.mdsize;
        this.sign = new byte[i52 * i53];
        this.counter = 0;
        this.test = 0;
        this.f43770ii = 0;
        this.test8 = 0L;
        this.f43772r = 0;
        this.privateKeyOTS = new byte[i53];
        byte[] bArr5 = new byte[i53];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i53);
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 9; i11++) {
            str = str + statInt[i11] + " ";
        }
        for (int i12 = 0; i12 < 5; i12++) {
            str = str + new String(Hex.encode(statByte[i12])) + " ";
        }
        return str;
    }

    public boolean updateSign() {
        for (int i11 = 0; i11 < this.steps; i11++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, int i11, int i12) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.f43773w = i11;
        this.height = i12;
        this.f43771k = (1 << i11) - 1;
        this.messagesize = (int) Math.ceil((digestSize << 3) / i11);
    }
}
package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class KeccakDigest implements ExtendedDigest {
    long[] C;
    protected int bitsAvailableForSqueezing;
    protected int bitsInQueue;
    long[] chiC;
    protected byte[] chunk;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected byte[] oneByte;
    protected int rate;
    protected boolean squeezing;
    protected byte[] state;
    long[] tempA;
    private static long[] KeccakRoundConstants = keccakInitializeRoundConstants();
    private static int[] KeccakRhoOffsets = keccakInitializeRhoOffsets();

    public KeccakDigest() {
        this(288);
    }

    private void KeccakAbsorb(byte[] bArr, byte[] bArr2, int i11) {
        keccakPermutationAfterXor(bArr, bArr2, i11);
    }

    private void KeccakExtract(byte[] bArr, byte[] bArr2, int i11) {
        System.arraycopy(bArr, 0, bArr2, 0, i11 * 8);
    }

    private void KeccakExtract1024bits(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    private static boolean LFSR86540(byte[] bArr) {
        boolean z11 = (bArr[0] & 1) != 0;
        if ((bArr[0] & 128) != 0) {
            bArr[0] = (byte) ((bArr[0] << 1) ^ 113);
        } else {
            bArr[0] = (byte) (bArr[0] << 1);
        }
        return z11;
    }

    private void absorbQueue() {
        KeccakAbsorb(this.state, this.dataQueue, this.rate / 8);
        this.bitsInQueue = 0;
    }

    private void chi(long[] jArr) {
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = 0;
            while (i12 < 5) {
                int i13 = i11 * 5;
                int i14 = i12 + 1;
                this.chiC[i12] = jArr[i12 + i13] ^ ((~jArr[(i14 % 5) + i13]) & jArr[((i12 + 2) % 5) + i13]);
                i12 = i14;
            }
            for (int i15 = 0; i15 < 5; i15++) {
                jArr[(i11 * 5) + i15] = this.chiC[i15];
            }
        }
    }

    private void clearDataQueueSection(int i11, int i12) {
        for (int i13 = i11; i13 != i11 + i12; i13++) {
            this.dataQueue[i13] = 0;
        }
    }

    private void fromBytesToWords(long[] jArr, byte[] bArr) {
        for (int i11 = 0; i11 < 25; i11++) {
            jArr[i11] = 0;
            int i12 = i11 * 8;
            for (int i13 = 0; i13 < 8; i13++) {
                jArr[i11] = jArr[i11] | ((bArr[i12 + i13] & 255) << (i13 * 8));
            }
        }
    }

    private void fromWordsToBytes(byte[] bArr, long[] jArr) {
        for (int i11 = 0; i11 < 25; i11++) {
            int i12 = i11 * 8;
            for (int i13 = 0; i13 < 8; i13++) {
                bArr[i12 + i13] = (byte) ((jArr[i11] >>> (i13 * 8)) & 255);
            }
        }
    }

    private void init(int i11) {
        if (i11 == 128) {
            initSponge(1344, 256);
        } else if (i11 == 224) {
            initSponge(1152, 448);
        } else if (i11 == 256) {
            initSponge(1088, 512);
        } else if (i11 == 288) {
            initSponge(1024, 576);
        } else if (i11 == 384) {
            initSponge(832, 768);
        } else if (i11 == 512) {
            initSponge(576, 1024);
        } else {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void initSponge(int i11, int i12) {
        if (i11 + i12 == 1600) {
            if (i11 > 0 && i11 < 1600 && i11 % 64 == 0) {
                this.rate = i11;
                Arrays.fill(this.state, (byte) 0);
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.bitsAvailableForSqueezing = 0;
                this.fixedOutputLength = i12 / 2;
                this.chunk = new byte[i11 / 8];
                this.oneByte = new byte[1];
                return;
            }
            throw new IllegalStateException("invalid rate value");
        }
        throw new IllegalStateException("rate + capacity != 1600");
    }

    private void iota(long[] jArr, int i11) {
        jArr[0] = jArr[0] ^ KeccakRoundConstants[i11];
    }

    private static int[] keccakInitializeRhoOffsets() {
        int[] iArr = new int[25];
        int i11 = 0;
        iArr[0] = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < 24) {
            int i14 = i11 + 1;
            iArr[(i12 % 5) + ((i13 % 5) * 5)] = (((i11 + 2) * i14) / 2) % 64;
            i13 = ((i12 * 2) + (i13 * 3)) % 5;
            i12 = ((i12 * 0) + (i13 * 1)) % 5;
            i11 = i14;
        }
        return iArr;
    }

    private static long[] keccakInitializeRoundConstants() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i11 = 0; i11 < 24; i11++) {
            jArr[i11] = 0;
            for (int i12 = 0; i12 < 7; i12++) {
                int i13 = (1 << i12) - 1;
                if (LFSR86540(bArr)) {
                    jArr[i11] = jArr[i11] ^ (1 << i13);
                }
            }
        }
        return jArr;
    }

    private void keccakPermutation(byte[] bArr) {
        long[] jArr = new long[bArr.length / 8];
        fromBytesToWords(jArr, bArr);
        keccakPermutationOnWords(jArr);
        fromWordsToBytes(bArr, jArr);
    }

    private void keccakPermutationAfterXor(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
        }
        keccakPermutation(bArr);
    }

    private void keccakPermutationOnWords(long[] jArr) {
        for (int i11 = 0; i11 < 24; i11++) {
            theta(jArr);
            rho(jArr);
            pi(jArr);
            chi(jArr);
            iota(jArr, i11);
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        int i11 = this.bitsInQueue;
        int i12 = i11 + 1;
        int i13 = this.rate;
        if (i12 == i13) {
            byte[] bArr = this.dataQueue;
            int i14 = i11 / 8;
            bArr[i14] = (byte) ((1 << (i11 % 8)) | bArr[i14]);
            absorbQueue();
            clearDataQueueSection(0, this.rate / 8);
        } else {
            clearDataQueueSection((i11 + 7) / 8, (i13 / 8) - ((i11 + 7) / 8));
            byte[] bArr2 = this.dataQueue;
            int i15 = this.bitsInQueue;
            int i16 = i15 / 8;
            bArr2[i16] = (byte) ((1 << (i15 % 8)) | bArr2[i16]);
        }
        byte[] bArr3 = this.dataQueue;
        int i17 = this.rate;
        int i18 = (i17 - 1) / 8;
        bArr3[i18] = (byte) ((1 << ((i17 - 1) % 8)) | bArr3[i18]);
        absorbQueue();
        int i19 = this.rate;
        if (i19 == 1024) {
            KeccakExtract1024bits(this.state, this.dataQueue);
            this.bitsAvailableForSqueezing = 1024;
        } else {
            KeccakExtract(this.state, this.dataQueue, i19 / 64);
            this.bitsAvailableForSqueezing = this.rate;
        }
        this.squeezing = true;
    }

    private void pi(long[] jArr) {
        long[] jArr2 = this.tempA;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        for (int i11 = 0; i11 < 5; i11++) {
            for (int i12 = 0; i12 < 5; i12++) {
                jArr[((((i11 * 2) + (i12 * 3)) % 5) * 5) + i12] = this.tempA[(i12 * 5) + i11];
            }
        }
    }

    private void rho(long[] jArr) {
        for (int i11 = 0; i11 < 5; i11++) {
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = (i12 * 5) + i11;
                int[] iArr = KeccakRhoOffsets;
                jArr[i13] = iArr[i13] != 0 ? (jArr[i13] << iArr[i13]) ^ (jArr[i13] >>> (64 - iArr[i13])) : jArr[i13];
            }
        }
    }

    private void theta(long[] jArr) {
        for (int i11 = 0; i11 < 5; i11++) {
            this.C[i11] = 0;
            for (int i12 = 0; i12 < 5; i12++) {
                long[] jArr2 = this.C;
                jArr2[i11] = jArr2[i11] ^ jArr[(i12 * 5) + i11];
            }
        }
        int i13 = 0;
        while (i13 < 5) {
            long[] jArr3 = this.C;
            int i14 = i13 + 1;
            int i15 = i14 % 5;
            long j11 = ((jArr3[i15] << 1) ^ (jArr3[i15] >>> 63)) ^ jArr3[(i13 + 4) % 5];
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = (i16 * 5) + i13;
                jArr[i17] = jArr[i17] ^ j11;
            }
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void absorb(byte[] bArr, int i11, long j11) {
        if (this.bitsInQueue % 8 == 0) {
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            long j12 = 0;
            while (j12 < j11) {
                int i12 = this.bitsInQueue;
                long j13 = 8;
                if (i12 == 0) {
                    int i13 = this.rate;
                    if (j11 >= i13 && j12 <= j11 - i13) {
                        long j14 = (j11 - j12) / i13;
                        long j15 = 0;
                        while (j15 < j14) {
                            byte[] bArr2 = this.chunk;
                            System.arraycopy(bArr, (int) (i11 + (j12 / j13) + (bArr2.length * j15)), bArr2, 0, bArr2.length);
                            byte[] bArr3 = this.state;
                            byte[] bArr4 = this.chunk;
                            KeccakAbsorb(bArr3, bArr4, bArr4.length);
                            j15++;
                            j13 = 8;
                        }
                        j12 += j14 * this.rate;
                    }
                }
                int i14 = (int) (j11 - j12);
                int i15 = i14 + i12;
                int i16 = this.rate;
                if (i15 > i16) {
                    i14 = i16 - i12;
                }
                int i17 = i14 % 8;
                int i18 = i14 - i17;
                System.arraycopy(bArr, ((int) (j12 / 8)) + i11, this.dataQueue, i12 / 8, i18 / 8);
                int i19 = this.bitsInQueue + i18;
                this.bitsInQueue = i19;
                j12 += i18;
                if (i19 == this.rate) {
                    absorbQueue();
                }
                if (i17 > 0) {
                    byte[] bArr5 = this.dataQueue;
                    int i21 = this.bitsInQueue;
                    bArr5[i21 / 8] = (byte) (((1 << i17) - 1) & bArr[((int) (j12 / 8)) + i11]);
                    this.bitsInQueue = i21 + i17;
                    j12 += i17;
                }
            }
            return;
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void squeeze(byte[] bArr, int i11, long j11) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j12 = 0;
        if (j11 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j12 < j11) {
            if (this.bitsAvailableForSqueezing == 0) {
                keccakPermutation(this.state);
                int i12 = this.rate;
                if (i12 == 1024) {
                    KeccakExtract1024bits(this.state, this.dataQueue);
                    this.bitsAvailableForSqueezing = 1024;
                } else {
                    KeccakExtract(this.state, this.dataQueue, i12 / 64);
                    this.bitsAvailableForSqueezing = this.rate;
                }
            }
            int i13 = this.bitsAvailableForSqueezing;
            long j13 = j11 - j12;
            int i14 = ((long) i13) > j13 ? (int) j13 : i13;
            System.arraycopy(this.dataQueue, (this.rate - i13) / 8, bArr, ((int) (j12 / 8)) + i11, i14 / 8);
            this.bitsAvailableForSqueezing -= i14;
            j12 += i14;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this.oneByte;
        bArr[0] = b11;
        absorb(bArr, 0, 8L);
    }

    public KeccakDigest(int i11) {
        this.state = new byte[200];
        this.dataQueue = new byte[192];
        this.C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        init(i11);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        absorb(bArr, i11, i12 * 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int doFinal(byte[] bArr, int i11, byte b11, int i12) {
        if (i12 > 0) {
            byte[] bArr2 = this.oneByte;
            bArr2[0] = b11;
            absorb(bArr2, 0, i12);
        }
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        byte[] bArr = new byte[200];
        this.state = bArr;
        this.dataQueue = new byte[192];
        this.C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        byte[] bArr2 = keccakDigest.state;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = keccakDigest.dataQueue;
        System.arraycopy(bArr3, 0, this.dataQueue, 0, bArr3.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        this.bitsAvailableForSqueezing = keccakDigest.bitsAvailableForSqueezing;
        this.chunk = Arrays.clone(keccakDigest.chunk);
        this.oneByte = Arrays.clone(keccakDigest.oneByte);
    }
}
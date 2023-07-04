package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    /* JADX INFO: Access modifiers changed from: protected */
    public LongDigest() {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.xBufOff = 0;
        reset();
    }

    private long Ch(long j11, long j12, long j13) {
        return ((~j11) & j13) ^ (j12 & j11);
    }

    private long Maj(long j11, long j12, long j13) {
        return ((j11 & j13) ^ (j11 & j12)) ^ (j12 & j13);
    }

    private long Sigma0(long j11) {
        return (j11 >>> 7) ^ (((j11 << 63) | (j11 >>> 1)) ^ ((j11 << 56) | (j11 >>> 8)));
    }

    private long Sigma1(long j11) {
        return (j11 >>> 6) ^ (((j11 << 45) | (j11 >>> 19)) ^ ((j11 << 3) | (j11 >>> 61)));
    }

    private long Sum0(long j11) {
        return ((j11 >>> 39) | (j11 << 25)) ^ (((j11 << 36) | (j11 >>> 28)) ^ ((j11 << 30) | (j11 >>> 34)));
    }

    private long Sum1(long j11) {
        return ((j11 >>> 41) | (j11 << 23)) ^ (((j11 << 50) | (j11 >>> 14)) ^ ((j11 << 46) | (j11 >>> 18)));
    }

    private void adjustByteCounts() {
        long j11 = this.byteCount1;
        if (j11 > 2305843009213693951L) {
            this.byteCount2 += j11 >>> 61;
            this.byteCount1 = j11 & 2305843009213693951L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.W;
        System.arraycopy(jArr, 0, this.W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public void finish() {
        adjustByteCounts();
        long j11 = this.byteCount1 << 3;
        long j12 = this.byteCount2;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processLength(j11, j12);
        processBlock();
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i11 = 0; i11 < this.wOff; i11++) {
            Pack.longToBigEndian(this.W[i11], bArr, (i11 * 8) + 96);
        }
    }

    protected void processBlock() {
        adjustByteCounts();
        for (int i11 = 16; i11 <= 79; i11++) {
            long[] jArr = this.W;
            long Sigma1 = Sigma1(jArr[i11 - 2]);
            long[] jArr2 = this.W;
            jArr[i11] = Sigma1 + jArr2[i11 - 7] + Sigma0(jArr2[i11 - 15]) + this.W[i11 - 16];
        }
        long j11 = this.H1;
        long j12 = this.H2;
        long j13 = this.H3;
        long j14 = this.H4;
        long j15 = this.H5;
        long j16 = this.H6;
        long j17 = this.H7;
        long j18 = j16;
        long j19 = j14;
        int i12 = 0;
        long j21 = j12;
        long j22 = j13;
        long j23 = j15;
        int i13 = 0;
        long j24 = this.H8;
        long j25 = j11;
        long j26 = j17;
        while (i13 < 10) {
            long j27 = j23;
            long[] jArr3 = K;
            int i14 = i12 + 1;
            long Sum1 = j24 + Sum1(j23) + Ch(j23, j18, j26) + jArr3[i12] + this.W[i12];
            long j28 = j19 + Sum1;
            long Sum0 = Sum1 + Sum0(j25) + Maj(j25, j21, j22);
            int i15 = i14 + 1;
            long Sum12 = j26 + Sum1(j28) + Ch(j28, j27, j18) + jArr3[i14] + this.W[i14];
            long j29 = j22 + Sum12;
            long Sum02 = Sum12 + Sum0(Sum0) + Maj(Sum0, j25, j21);
            int i16 = i15 + 1;
            long Sum13 = j18 + Sum1(j29) + Ch(j29, j28, j27) + jArr3[i15] + this.W[i15];
            long j31 = j21 + Sum13;
            long Sum03 = Sum13 + Sum0(Sum02) + Maj(Sum02, Sum0, j25);
            int i17 = i16 + 1;
            long Sum14 = j27 + Sum1(j31) + Ch(j31, j29, j28) + jArr3[i16] + this.W[i16];
            long j32 = j25 + Sum14;
            long Sum04 = Sum14 + Sum0(Sum03) + Maj(Sum03, Sum02, Sum0);
            int i18 = i17 + 1;
            long Sum15 = j28 + Sum1(j32) + Ch(j32, j31, j29) + jArr3[i17] + this.W[i17];
            long j33 = Sum0 + Sum15;
            long Sum05 = Sum15 + Sum0(Sum04) + Maj(Sum04, Sum03, Sum02);
            int i19 = i18 + 1;
            long Sum16 = j29 + Sum1(j33) + Ch(j33, j32, j31) + jArr3[i18] + this.W[i18];
            long j34 = Sum02 + Sum16;
            long Sum06 = Sum16 + Sum0(Sum05) + Maj(Sum05, Sum04, Sum03);
            j26 = j34;
            int i21 = i19 + 1;
            long Sum17 = j31 + Sum1(j34) + Ch(j34, j33, j32) + jArr3[i19] + this.W[i19];
            long j35 = Sum03 + Sum17;
            j18 = j35;
            j21 = Sum17 + Sum0(Sum06) + Maj(Sum06, Sum05, Sum04);
            long Sum18 = j32 + Sum1(j35) + Ch(j35, j26, j33) + jArr3[i21] + this.W[i21];
            long Sum07 = Sum18 + Sum0(j21) + Maj(j21, Sum06, Sum05);
            i13++;
            j23 = Sum04 + Sum18;
            j22 = Sum06;
            j24 = j33;
            j19 = Sum05;
            i12 = i21 + 1;
            j25 = Sum07;
        }
        this.H1 += j25;
        this.H2 += j21;
        this.H3 += j22;
        this.H4 += j19;
        this.H5 += j23;
        this.H6 += j18;
        this.H7 += j26;
        this.H8 += j24;
        this.wOff = 0;
        for (int i22 = 0; i22 < 16; i22++) {
            this.W[i22] = 0;
        }
    }

    protected void processLength(long j11, long j12) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.W;
        jArr[14] = j12;
        jArr[15] = j11;
    }

    protected void processWord(byte[] bArr, int i11) {
        this.W[this.wOff] = Pack.bigEndianToLong(bArr, i11);
        int i12 = this.wOff + 1;
        this.wOff = i12;
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i11 = 0;
        this.xBufOff = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 0;
            i12++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.W;
            if (i11 == jArr.length) {
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void restoreState(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = bigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, bigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i11 = 0; i11 < this.wOff; i11++) {
            this.W[i11] = Pack.bigEndianToLong(bArr, (i11 * 8) + 96);
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this.xBuf;
        int i11 = this.xBufOff;
        int i12 = i11 + 1;
        this.xBufOff = i12;
        bArr[i11] = b11;
        if (i12 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        copyIn(longDigest);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (this.xBufOff != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (i12 > this.xBuf.length) {
            processWord(bArr, i11);
            byte[] bArr2 = this.xBuf;
            i11 += bArr2.length;
            i12 -= bArr2.length;
            this.byteCount1 += bArr2.length;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }
}
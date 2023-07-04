package org.spongycastle.crypto.digests;

import androidx.recyclerview.widget.l;
import com.plaid.internal.d;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Memoable;

/* loaded from: classes4.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, 198, 232, 135, 184, 1, 79, 54, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 160, 107, 133, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 7, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 90, d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 51, 99, 2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 141, 61, 151, 0, 207, 43, 118, d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 214, 27, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 106, 80, 69, 243, 48, 239, 63, 85, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 234, 101, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 226, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 223, 126, 36, 59, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 206, 17, 143, 78, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 235, 60, d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 148, 247, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, 196, 3, 86, 68, 127, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 42, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 137, 20, 225, 22, 58, 105, 9, 112, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 208, 237, 204, 66, 152, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 40, 92, 248, 134};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    public WhirlpoolDigest() {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = SBOX[i11];
            int maskWithReductionPolynomial = maskWithReductionPolynomial(i12 << 1);
            int maskWithReductionPolynomial2 = maskWithReductionPolynomial(maskWithReductionPolynomial << 1);
            int i13 = maskWithReductionPolynomial2 ^ i12;
            int maskWithReductionPolynomial3 = maskWithReductionPolynomial(maskWithReductionPolynomial2 << 1);
            int i14 = maskWithReductionPolynomial3 ^ i12;
            C0[i11] = packIntoLong(i12, i12, maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3, i13, maskWithReductionPolynomial, i14);
            C1[i11] = packIntoLong(i14, i12, i12, maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3, i13, maskWithReductionPolynomial);
            C2[i11] = packIntoLong(maskWithReductionPolynomial, i14, i12, i12, maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3, i13);
            C3[i11] = packIntoLong(i13, maskWithReductionPolynomial, i14, i12, i12, maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3);
            C4[i11] = packIntoLong(maskWithReductionPolynomial3, i13, maskWithReductionPolynomial, i14, i12, i12, maskWithReductionPolynomial2, i12);
            C5[i11] = packIntoLong(i12, maskWithReductionPolynomial3, i13, maskWithReductionPolynomial, i14, i12, i12, maskWithReductionPolynomial2);
            C6[i11] = packIntoLong(maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3, i13, maskWithReductionPolynomial, i14, i12, i12);
            C7[i11] = packIntoLong(i12, maskWithReductionPolynomial2, i12, maskWithReductionPolynomial3, i13, maskWithReductionPolynomial, i14, i12);
        }
        this._rc[0] = 0;
        for (int i15 = 1; i15 <= 10; i15++) {
            int i16 = (i15 - 1) * 8;
            this._rc[i15] = (((((((C0[i16] & (-72057594037927936L)) ^ (C1[i16 + 1] & 71776119061217280L)) ^ (C2[i16 + 2] & 280375465082880L)) ^ (C3[i16 + 3] & 1095216660480L)) ^ (C4[i16 + 4] & 4278190080L)) ^ (C5[i16 + 5] & 16711680)) ^ (C6[i16 + 6] & 65280)) ^ (C7[i16 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i11) {
        return (bArr[i11 + 7] & 255) | ((bArr[i11 + 0] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    private void convertLongToByteArray(long j11, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            bArr[i11 + i12] = (byte) ((j11 >> (56 - (i12 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = (byte) (this._bitCount[i11] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i11 = this._bufferPos;
        int i12 = i11 + 1;
        this._bufferPos = i12;
        bArr[i11] = (byte) (bArr[i11] | 128);
        if (i12 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i11 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i12 = (sArr[length] & 255) + EIGHT[length] + i11;
            i11 = i12 >>> 8;
            sArr[length] = (short) (i12 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i11) {
        return ((long) i11) >= 256 ? i11 ^ REDUCTION_POLYNOMIAL : i11;
    }

    private long packIntoLong(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        return (((((((i12 << 48) ^ (i11 << 56)) ^ (i13 << 40)) ^ (i14 << 32)) ^ (i15 << 24)) ^ (i16 << 16)) ^ (i17 << 8)) ^ i18;
    }

    private void processFilledBuffer(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this._state.length; i12++) {
            this._block[i12] = bytesToLongFromBuffer(this._buffer, i12 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        for (int i12 = 0; i12 < 8; i12++) {
            convertLongToByteArray(this._hash[i12], bArr, (i12 * 8) + i11);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    protected void processBlock() {
        for (int i11 = 0; i11 < 8; i11++) {
            long[] jArr = this._state;
            long j11 = this._block[i11];
            long[] jArr2 = this._K;
            long j12 = this._hash[i11];
            jArr2[i11] = j12;
            jArr[i11] = j11 ^ j12;
        }
        int i12 = 1;
        while (i12 <= 10) {
            int i13 = 0;
            while (i13 < 8) {
                long[] jArr3 = this._L;
                jArr3[i13] = 0;
                long j13 = jArr3[i13];
                long[] jArr4 = C0;
                long[] jArr5 = this._K;
                jArr3[i13] = jArr4[((int) (jArr5[(i13 + 0) & 7] >>> 56)) & 255] ^ j13;
                jArr3[i13] = jArr3[i13] ^ C1[((int) (jArr5[(i13 - 1) & 7] >>> 48)) & 255];
                jArr3[i13] = jArr3[i13] ^ C2[((int) (jArr5[(i13 - 2) & 7] >>> 40)) & 255];
                jArr3[i13] = jArr3[i13] ^ C3[((int) (jArr5[(i13 - 3) & 7] >>> 32)) & 255];
                jArr3[i13] = jArr3[i13] ^ C4[((int) (jArr5[(i13 - 4) & 7] >>> 24)) & 255];
                jArr3[i13] = jArr3[i13] ^ C5[((int) (jArr5[(i13 - 5) & 7] >>> 16)) & 255];
                jArr3[i13] = jArr3[i13] ^ C6[((int) (jArr5[(i13 - 6) & 7] >>> 8)) & 255];
                jArr3[i13] = jArr3[i13] ^ C7[((int) jArr5[(i13 - 7) & 7]) & 255];
                i13++;
                i12 = i12;
            }
            int i14 = i12;
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i14];
            for (int i15 = 0; i15 < 8; i15++) {
                long[] jArr9 = this._L;
                jArr9[i15] = this._K[i15];
                long j14 = jArr9[i15];
                long[] jArr10 = C0;
                long[] jArr11 = this._state;
                jArr9[i15] = j14 ^ jArr10[((int) (jArr11[(i15 + 0) & 7] >>> 56)) & 255];
                jArr9[i15] = jArr9[i15] ^ C1[((int) (jArr11[(i15 - 1) & 7] >>> 48)) & 255];
                jArr9[i15] = jArr9[i15] ^ C2[((int) (jArr11[(i15 - 2) & 7] >>> 40)) & 255];
                jArr9[i15] = jArr9[i15] ^ C3[((int) (jArr11[(i15 - 3) & 7] >>> 32)) & 255];
                jArr9[i15] = jArr9[i15] ^ C4[((int) (jArr11[(i15 - 4) & 7] >>> 24)) & 255];
                jArr9[i15] = jArr9[i15] ^ C5[((int) (jArr11[(i15 - 5) & 7] >>> 16)) & 255];
                jArr9[i15] = jArr9[i15] ^ C6[((int) (jArr11[(i15 - 6) & 7] >>> 8)) & 255];
                jArr9[i15] = jArr9[i15] ^ C7[((int) jArr11[(i15 - 7) & 7]) & 255];
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
            i12 = i14 + 1;
        }
        for (int i16 = 0; i16 < 8; i16++) {
            long[] jArr14 = this._hash;
            jArr14[i16] = jArr14[i16] ^ (this._state[i16] ^ this._block[i16]);
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this._buffer;
        int i11 = this._bufferPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this._bufferPos = i12;
        if (i12 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }
}
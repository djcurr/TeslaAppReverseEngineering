package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class IndexGenerator {
    private int N;
    private BitString buf;

    /* renamed from: c  reason: collision with root package name */
    private int f43815c;
    private int hLen;
    private Digest hashAlg;
    private boolean initialized;
    private int minCallsR;
    private byte[] seed;
    private int totLen = 0;
    private int remLen = 0;
    private int counter = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexGenerator(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        this.seed = bArr;
        this.N = nTRUEncryptionParameters.N;
        this.f43815c = nTRUEncryptionParameters.f43822c;
        this.minCallsR = nTRUEncryptionParameters.minCallsR;
        Digest digest = nTRUEncryptionParameters.hashAlg;
        this.hashAlg = digest;
        this.hLen = digest.getDigestSize();
        this.initialized = false;
    }

    private void appendHash(BitString bitString, byte[] bArr) {
        Digest digest = this.hashAlg;
        byte[] bArr2 = this.seed;
        digest.update(bArr2, 0, bArr2.length);
        putInt(this.hashAlg, this.counter);
        this.hashAlg.doFinal(bArr, 0);
        bitString.appendBits(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] copyOf(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        if (i11 >= bArr.length) {
            i11 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    private void putInt(Digest digest, int i11) {
        digest.update((byte) (i11 >> 24));
        digest.update((byte) (i11 >> 16));
        digest.update((byte) (i11 >> 8));
        digest.update((byte) i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int nextIndex() {
        int leadingAsInt;
        int i11;
        int i12;
        int i13;
        if (!this.initialized) {
            this.buf = new BitString();
            byte[] bArr = new byte[this.hashAlg.getDigestSize()];
            while (true) {
                int i14 = this.counter;
                i13 = this.minCallsR;
                if (i14 >= i13) {
                    break;
                }
                appendHash(this.buf, bArr);
                this.counter++;
            }
            int i15 = i13 * 8 * this.hLen;
            this.totLen = i15;
            this.remLen = i15;
            this.initialized = true;
        }
        do {
            this.totLen += this.f43815c;
            BitString trailing = this.buf.getTrailing(this.remLen);
            int i16 = this.remLen;
            int i17 = this.f43815c;
            if (i16 < i17) {
                int i18 = i17 - i16;
                int i19 = this.counter;
                int i21 = this.hLen;
                int i22 = i19 + (((i18 + i21) - 1) / i21);
                byte[] bArr2 = new byte[this.hashAlg.getDigestSize()];
                while (this.counter < i22) {
                    appendHash(trailing, bArr2);
                    this.counter++;
                    int i23 = this.hLen;
                    if (i18 > i23 * 8) {
                        i18 -= i23 * 8;
                    }
                }
                this.remLen = (this.hLen * 8) - i18;
                BitString bitString = new BitString();
                this.buf = bitString;
                bitString.appendBits(bArr2);
            } else {
                this.remLen = i16 - i17;
            }
            leadingAsInt = trailing.getLeadingAsInt(this.f43815c);
            i11 = this.f43815c;
            i12 = this.N;
        } while (leadingAsInt >= (1 << i11) - ((1 << i11) % i12));
        return leadingAsInt % i12;
    }

    /* loaded from: classes4.dex */
    public static class BitString {
        byte[] bytes = new byte[4];
        int lastByteBits;
        int numBytes;

        void appendBits(byte[] bArr) {
            for (int i11 = 0; i11 != bArr.length; i11++) {
                appendBits(bArr[i11]);
            }
        }

        public byte[] getBytes() {
            return Arrays.clone(this.bytes);
        }

        public int getLeadingAsInt(int i11) {
            int i12 = (((this.numBytes - 1) * 8) + this.lastByteBits) - i11;
            int i13 = i12 / 8;
            int i14 = i12 % 8;
            int i15 = (this.bytes[i13] & 255) >>> i14;
            int i16 = 8 - i14;
            while (true) {
                i13++;
                if (i13 >= this.numBytes) {
                    return i15;
                }
                i15 |= (this.bytes[i13] & 255) << i16;
                i16 += 8;
            }
        }

        public BitString getTrailing(int i11) {
            int i12;
            BitString bitString = new BitString();
            int i13 = (i11 + 7) / 8;
            bitString.numBytes = i13;
            bitString.bytes = new byte[i13];
            int i14 = 0;
            while (true) {
                i12 = bitString.numBytes;
                if (i14 >= i12) {
                    break;
                }
                bitString.bytes[i14] = this.bytes[i14];
                i14++;
            }
            int i15 = i11 % 8;
            bitString.lastByteBits = i15;
            if (i15 == 0) {
                bitString.lastByteBits = 8;
            } else {
                int i16 = 32 - i15;
                byte[] bArr = bitString.bytes;
                bArr[i12 - 1] = (byte) ((bArr[i12 - 1] << i16) >>> i16);
            }
            return bitString;
        }

        public void appendBits(byte b11) {
            int i11 = this.numBytes;
            byte[] bArr = this.bytes;
            if (i11 == bArr.length) {
                this.bytes = IndexGenerator.copyOf(bArr, bArr.length * 2);
            }
            int i12 = this.numBytes;
            if (i12 == 0) {
                this.numBytes = 1;
                this.bytes[0] = b11;
                this.lastByteBits = 8;
                return;
            }
            int i13 = this.lastByteBits;
            if (i13 == 8) {
                byte[] bArr2 = this.bytes;
                this.numBytes = i12 + 1;
                bArr2[i12] = b11;
                return;
            }
            byte[] bArr3 = this.bytes;
            int i14 = i12 - 1;
            int i15 = b11 & 255;
            bArr3[i14] = (byte) ((i15 << i13) | bArr3[i14]);
            this.numBytes = i12 + 1;
            bArr3[i12] = (byte) (i15 >> (8 - i13));
        }
    }
}
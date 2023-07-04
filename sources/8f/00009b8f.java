package org.spongycastle.crypto.digests;

/* loaded from: classes4.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256);
    }

    private static int checkBitLength(int i11) {
        if (i11 == 224 || i11 == 256 || i11 == 384 || i11 == 512) {
            return i11;
        }
        throw new IllegalArgumentException("'bitLength' " + i11 + " not supported for SHA-3");
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        absorb(new byte[]{2}, 0, 2L);
        return super.doFinal(bArr, i11);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest(int i11) {
        super(checkBitLength(i11));
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i11, byte b11, int i12) {
        if (i12 >= 0 && i12 <= 7) {
            int i13 = (b11 & ((1 << i12) - 1)) | (2 << i12);
            int i14 = i12 + 2;
            if (i14 >= 8) {
                byte[] bArr2 = this.oneByte;
                bArr2[0] = (byte) i13;
                absorb(bArr2, 0, 8L);
                i14 -= 8;
                i13 >>>= 8;
            }
            return super.doFinal(bArr, i11, (byte) i13, i14);
        }
        throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
    }
}
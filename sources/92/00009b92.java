package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.Xof;

/* loaded from: classes4.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    private static int checkBitLength(int i11) {
        if (i11 == 128 || i11 == 256) {
            return i11;
        }
        throw new IllegalArgumentException("'bitLength' " + i11 + " not supported for SHAKE");
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        return doFinal(bArr, i11, getDigestSize());
    }

    @Override // org.spongycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i11, int i12) {
        if (!this.squeezing) {
            absorb(new byte[]{15}, 0, 4L);
        }
        squeeze(bArr, i11, i12 * 8);
        return i12;
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    public SHAKEDigest(int i11) {
        super(checkBitLength(i11));
    }

    @Override // org.spongycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i11, int i12) {
        int doOutput = doOutput(bArr, i11, i12);
        reset();
        return doOutput;
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i11, byte b11, int i12) {
        return doFinal(bArr, i11, getDigestSize(), b11, i12);
    }

    protected int doFinal(byte[] bArr, int i11, int i12, byte b11, int i13) {
        if (i13 >= 0 && i13 <= 7) {
            int i14 = (b11 & ((1 << i13) - 1)) | (15 << i13);
            int i15 = i13 + 4;
            if (i15 >= 8) {
                byte[] bArr2 = this.oneByte;
                bArr2[0] = (byte) i14;
                absorb(bArr2, 0, 8L);
                i15 -= 8;
                i14 >>>= 8;
            }
            if (i15 > 0) {
                byte[] bArr3 = this.oneByte;
                bArr3[0] = (byte) i14;
                absorb(bArr3, 0, i15);
            }
            squeeze(bArr, i11, i12 * 8);
            reset();
            return i12;
        }
        throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
    }
}
package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;

/* loaded from: classes4.dex */
public class ShortenedDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;
    private int length;

    public ShortenedDigest(ExtendedDigest extendedDigest, int i11) {
        if (extendedDigest != null) {
            if (i11 <= extendedDigest.getDigestSize()) {
                this.baseDigest = extendedDigest;
                this.length = i11;
                return;
            }
            throw new IllegalArgumentException("baseDigest output not large enough to support length");
        }
        throw new IllegalArgumentException("baseDigest must not be null");
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[this.baseDigest.getDigestSize()];
        this.baseDigest.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i11, this.length);
        return this.length;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName() + "(" + (this.length * 8) + ")";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.length;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.baseDigest.reset();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        this.baseDigest.update(b11);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        this.baseDigest.update(bArr, i11, i12);
    }
}
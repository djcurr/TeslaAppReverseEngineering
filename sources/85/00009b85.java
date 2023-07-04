package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;

/* loaded from: classes4.dex */
public class NonMemoableDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;

    public NonMemoableDigest(ExtendedDigest extendedDigest) {
        if (extendedDigest != null) {
            this.baseDigest = extendedDigest;
            return;
        }
        throw new IllegalArgumentException("baseDigest must not be null");
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        return this.baseDigest.doFinal(bArr, i11);
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.baseDigest.getDigestSize();
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
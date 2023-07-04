package org.spongycastle.jce.provider;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KDFParameters;

/* loaded from: classes4.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43660iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        if (bArr.length - i12 >= i11) {
            long j11 = i12 * 8;
            if (j11 > this.digest.getDigestSize() * 8 * 29) {
                new IllegalArgumentException("Output length to large");
            }
            int digestSize = (int) (j11 / this.digest.getDigestSize());
            int digestSize2 = this.digest.getDigestSize();
            byte[] bArr2 = new byte[digestSize2];
            for (int i13 = 1; i13 <= digestSize; i13++) {
                Digest digest = this.digest;
                byte[] bArr3 = this.shared;
                digest.update(bArr3, 0, bArr3.length);
                this.digest.update((byte) (i13 & 255));
                this.digest.update((byte) ((i13 >> 8) & 255));
                this.digest.update((byte) ((i13 >> 16) & 255));
                this.digest.update((byte) ((i13 >> 24) & 255));
                Digest digest2 = this.digest;
                byte[] bArr4 = this.f43660iv;
                digest2.update(bArr4, 0, bArr4.length);
                this.digest.doFinal(bArr2, 0);
                int i14 = i12 - i11;
                if (i14 > digestSize2) {
                    System.arraycopy(bArr2, 0, bArr, i11, digestSize2);
                    i11 += digestSize2;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i11, i14);
                }
            }
            this.digest.reset();
            return i12;
        }
        throw new DataLengthException("output buffer too small");
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f43660iv = kDFParameters.getIV();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
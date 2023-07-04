package org.spongycastle.cert.dane;

import java.io.OutputStream;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes5.dex */
public class TruncatingDigestCalculator implements DigestCalculator {
    private final DigestCalculator baseCalculator;
    private final int length;

    public TruncatingDigestCalculator(DigestCalculator digestCalculator) {
        this(digestCalculator, 28);
    }

    @Override // org.spongycastle.operator.DigestCalculator
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.baseCalculator.getAlgorithmIdentifier();
    }

    @Override // org.spongycastle.operator.DigestCalculator
    public byte[] getDigest() {
        int i11 = this.length;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.baseCalculator.getDigest(), 0, bArr, 0, i11);
        return bArr;
    }

    @Override // org.spongycastle.operator.DigestCalculator
    public OutputStream getOutputStream() {
        return this.baseCalculator.getOutputStream();
    }

    public TruncatingDigestCalculator(DigestCalculator digestCalculator, int i11) {
        this.baseCalculator = digestCalculator;
        this.length = i11;
    }
}
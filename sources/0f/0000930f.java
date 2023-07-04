package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e50.j;
import e50.n;
import i60.c;
import java.security.cert.CertificateEncodingException;

/* loaded from: classes5.dex */
class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;
    private final CertificateEncodingException exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateInternal(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(cVar, nVar, jVar, zArr, str, bArr);
        this.encoding = bArr2;
        this.exception = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException = this.exception;
        if (certificateEncodingException == null) {
            byte[] bArr = this.encoding;
            if (bArr != null) {
                return bArr;
            }
            throw new CertificateEncodingException();
        }
        throw certificateEncodingException;
    }
}
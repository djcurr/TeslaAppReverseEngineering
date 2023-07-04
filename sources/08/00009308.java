package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e50.o;
import i60.c;
import java.security.cert.CRLException;

/* loaded from: classes5.dex */
class X509CRLInternal extends X509CRLImpl {
    private final byte[] encoding;
    private final CRLException exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLInternal(c cVar, o oVar, String str, byte[] bArr, boolean z11, byte[] bArr2, CRLException cRLException) {
        super(cVar, oVar, str, bArr, z11);
        this.encoding = bArr2;
        this.exception = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        CRLException cRLException = this.exception;
        if (cRLException == null) {
            byte[] bArr = this.encoding;
            if (bArr != null) {
                return bArr;
            }
            throw new CRLException();
        }
        throw cRLException;
    }
}
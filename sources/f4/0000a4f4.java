package org.spongycastle.x509;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes4.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExtCertificateEncodingException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
package org.spongycastle.cert;

/* loaded from: classes5.dex */
public class CertException extends Exception {
    private Throwable cause;

    public CertException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CertException(String str) {
        super(str);
    }
}
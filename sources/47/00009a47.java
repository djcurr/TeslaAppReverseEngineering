package org.spongycastle.cert.ocsp;

/* loaded from: classes5.dex */
public class OCSPException extends Exception {
    private Throwable cause;

    public OCSPException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public OCSPException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
package org.spongycastle.cert.cmp;

/* loaded from: classes5.dex */
public class CMPException extends Exception {
    private Throwable cause;

    public CMPException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CMPException(String str) {
        super(str);
    }
}
package org.spongycastle.operator;

/* loaded from: classes4.dex */
public class RuntimeOperatorException extends RuntimeException {
    private Throwable cause;

    public RuntimeOperatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public RuntimeOperatorException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
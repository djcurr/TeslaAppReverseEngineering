package org.spongycastle.jce.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ExtIOException extends IOException implements ExtException {
    private Throwable cause;

    public ExtIOException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable, org.spongycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.cause;
    }
}
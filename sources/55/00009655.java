package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;

/* loaded from: classes5.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43189a;

    public ExtCertPathBuilderException(String str, Throwable th2) {
        super(str);
        this.f43189a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43189a;
    }
}
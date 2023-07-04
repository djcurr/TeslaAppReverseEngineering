package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* loaded from: classes5.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43190a;

    public ExtCertPathValidatorException(String str) {
        super(str);
    }

    public ExtCertPathValidatorException(String str, Throwable th2) {
        super(str);
        this.f43190a = th2;
    }

    public ExtCertPathValidatorException(String str, Throwable th2, CertPath certPath, int i11) {
        super(str, th2, certPath, i11);
        this.f43190a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43190a;
    }
}
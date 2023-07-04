package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

/* loaded from: classes5.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f43191a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43191a;
    }
}
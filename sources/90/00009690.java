package org.bouncycastle.jce.provider;

import e60.n;
import e60.o;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

/* loaded from: classes5.dex */
class WrappedRevocationChecker implements n {
    private final PKIXCertPathChecker checker;

    public WrappedRevocationChecker(PKIXCertPathChecker pKIXCertPathChecker) {
        this.checker = pKIXCertPathChecker;
    }

    @Override // e60.n
    public void check(Certificate certificate) {
        this.checker.check(certificate);
    }

    @Override // e60.n
    public void initialize(o oVar) {
        this.checker.init(false);
    }

    public void setParameter(String str, Object obj) {
    }
}
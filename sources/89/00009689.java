package org.bouncycastle.jce.provider;

import e60.n;
import e60.o;
import i60.c;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ProvCrlRevocationChecker implements n {
    private Date currentDate = null;
    private final c helper;
    private o params;

    public ProvCrlRevocationChecker(c cVar) {
        this.helper = cVar;
    }

    @Override // e60.n
    public void check(Certificate certificate) {
        try {
            o oVar = this.params;
            RFC3280CertPathUtilities.checkCRLs(oVar, oVar.c(), this.currentDate, this.params.e(), (X509Certificate) certificate, this.params.d(), this.params.f(), this.params.a().getCertificates(), this.helper);
        } catch (AnnotatedException e11) {
            throw new CertPathValidatorException(e11.getMessage(), e11.getCause() != null ? e11.getCause() : e11, this.params.a(), this.params.b());
        }
    }

    public void init(boolean z11) {
        if (z11) {
            throw new CertPathValidatorException("forward checking not supported");
        }
        this.params = null;
        this.currentDate = new Date();
    }

    @Override // e60.n
    public void initialize(o oVar) {
        this.params = oVar;
        this.currentDate = new Date();
    }

    public void setParameter(String str, Object obj) {
    }
}
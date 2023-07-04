package org.bouncycastle.jce.provider;

import e60.q;
import e60.s;
import i60.a;
import i60.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import v70.d;
import v70.g;
import v70.h;

/* loaded from: classes5.dex */
public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {
    private final c helper = new a();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        s sVar;
        boolean z11 = certPathParameters instanceof d;
        if (!z11 && !(certPathParameters instanceof s)) {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + d.class.getName() + " instance.");
        }
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Set hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        if (certPathParameters instanceof PKIXParameters) {
            s.b bVar = new s.b((PKIXParameters) certPathParameters);
            if (z11) {
                d dVar = (d) certPathParameters;
                bVar.s(dVar.h());
                bVar.t(dVar.g());
                hashSet = dVar.b();
                hashSet2 = dVar.d();
                hashSet3 = dVar.c();
            }
            sVar = bVar.o();
        } else {
            sVar = (s) certPathParameters;
        }
        s sVar2 = sVar;
        Date date = new Date();
        Date validityDate = CertPathValidatorUtilities.getValidityDate(sVar2, date);
        q s11 = sVar2.s();
        if (!(s11 instanceof g)) {
            throw new InvalidAlgorithmParameterException("TargetConstraints must be an instance of " + g.class.getName() + " for " + getClass().getName() + " class.");
        }
        h a11 = ((g) s11).a();
        CertPath processAttrCert1 = RFC3281CertPathUtilities.processAttrCert1(a11, sVar2);
        CertPathValidatorResult processAttrCert2 = RFC3281CertPathUtilities.processAttrCert2(certPath, sVar2);
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(0);
        RFC3281CertPathUtilities.processAttrCert3(x509Certificate, sVar2);
        RFC3281CertPathUtilities.processAttrCert4(x509Certificate, hashSet4);
        RFC3281CertPathUtilities.processAttrCert5(a11, validityDate);
        RFC3281CertPathUtilities.processAttrCert7(a11, certPath, processAttrCert1, sVar2, hashSet);
        RFC3281CertPathUtilities.additionalChecks(a11, hashSet2, hashSet3);
        RFC3281CertPathUtilities.checkCRLs(a11, sVar2, date, validityDate, x509Certificate, certPath.getCertificates(), this.helper);
        return processAttrCert2;
    }
}
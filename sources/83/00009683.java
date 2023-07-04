package org.bouncycastle.jce.provider;

import e50.b;
import e50.o0;
import e50.u;
import e60.r;
import e60.s;
import i60.a;
import i60.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import v70.d;

/* loaded from: classes5.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final c helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    public PKIXCertPathValidatorSpi(boolean z11) {
        this.helper = new a();
        this.isForCRLCheck = z11;
    }

    static void checkCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof f60.a) {
            RuntimeException runtimeException = null;
            try {
                if (((f60.a) x509Certificate).getTBSCertificateNative() != null) {
                    return;
                }
            } catch (RuntimeException e11) {
                runtimeException = e11;
            }
            throw new AnnotatedException("unable to process TBSCertificate", runtimeException);
        }
        try {
            o0.h(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e12) {
            throw new AnnotatedException(e12.getMessage());
        } catch (CertificateEncodingException e13) {
            throw new AnnotatedException("unable to process TBSCertificate", e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int, java.security.PublicKey] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        s sVar;
        int i11;
        List<? extends Certificate> list;
        c50.c ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        int i12;
        ArrayList[] arrayListArr;
        List list2;
        int i13;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            s.b bVar = new s.b((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof d) {
                d dVar = (d) certPathParameters;
                bVar.s(dVar.h());
                bVar.t(dVar.g());
            }
            sVar = bVar.o();
        } else if (certPathParameters instanceof r) {
            sVar = ((r) certPathParameters).a();
        } else if (!(certPathParameters instanceof s)) {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
        } else {
            sVar = (s) certPathParameters;
        }
        if (sVar.t() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(sVar, new Date());
        Set o11 = sVar.o();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), sVar.t(), sVar.r());
            if (findTrustAnchor == null) {
                i11 = 1;
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (AnnotatedException e11) {
                    e = e11;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - i11);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            s o12 = new s.b(sVar).r(findTrustAnchor).o();
            int i14 = size + 1;
            ArrayList[] arrayListArr2 = new ArrayList[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                arrayListArr2[i15] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add("2.5.29.32.0");
            arrayListArr2[0].add(new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false));
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i16 = o12.x() ? 0 : i14;
            int i17 = o12.w() ? 0 : i14;
            if (o12.y()) {
                i14 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca2 = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                try {
                    b algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    algorithmIdentifier.e();
                    algorithmIdentifier.i();
                    if (o12.s() == null || o12.s().match((Certificate) ((X509Certificate) certificates.get(0)))) {
                        List<PKIXCertPathChecker> l11 = o12.l();
                        for (PKIXCertPathChecker pKIXCertPathChecker : l11) {
                            pKIXCertPathChecker.init(false);
                        }
                        ProvCrlRevocationChecker provCrlRevocationChecker = o12.z() ? new ProvCrlRevocationChecker(this.helper) : null;
                        boolean z11 = true;
                        TrustAnchor trustAnchor = findTrustAnchor;
                        int i18 = size;
                        X509Certificate x509Certificate = null;
                        ?? r52 = i14;
                        int i19 = i17;
                        PKIXPolicyNode pKIXPolicyNode = r52;
                        int i21 = i16;
                        int size2 = certificates.size() - 1;
                        int i22 = i21;
                        int i23 = r52;
                        while (size2 >= 0) {
                            int i24 = size - size2;
                            int i25 = size;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            boolean z12 = size2 == certificates.size() + (-1) ? z11 : false;
                            try {
                                checkCertificate(x509Certificate2);
                                List<? extends Certificate> list3 = certificates;
                                int i26 = i22;
                                int i27 = size2;
                                Date date = validityDate;
                                Date date2 = validityDate;
                                int i28 = i23;
                                ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                                ProvCrlRevocationChecker provCrlRevocationChecker3 = provCrlRevocationChecker;
                                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                ?? r72 = cAPublicKey;
                                ArrayList[] arrayListArr3 = arrayListArr2;
                                boolean z13 = z12;
                                TrustAnchor trustAnchor2 = trustAnchor;
                                s sVar2 = o12;
                                c50.c cVar = ca2;
                                List list4 = l11;
                                boolean z14 = z11;
                                RFC3280CertPathUtilities.processCertA(certPath, o12, date, provCrlRevocationChecker2, i27, r72, z13, cVar, trustedCert);
                                RFC3280CertPathUtilities.processCertBC(certPath, i27, pKIXNameConstraintValidator2, this.isForCRLCheck);
                                PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i27, RFC3280CertPathUtilities.processCertD(certPath, i27, hashSet4, pKIXPolicyNode, arrayListArr3, r72, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath, i27, processCertE, i26);
                                if (cVar != i25) {
                                    if (x509Certificate2 == null || x509Certificate2.getVersion() != z14) {
                                        RFC3280CertPathUtilities.prepareNextCertA(certPath, i27);
                                        arrayListArr = arrayListArr3;
                                        PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i27, arrayListArr, processCertE, i28);
                                        RFC3280CertPathUtilities.prepareNextCertG(certPath, i27, pKIXNameConstraintValidator2);
                                        int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i27, i26);
                                        int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i27, i28);
                                        int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i27, r72);
                                        i13 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i27, prepareNextCertH1);
                                        i12 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i27, prepareNextCertH2);
                                        int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i27, prepareNextCertH3);
                                        RFC3280CertPathUtilities.prepareNextCertK(certPath, i27);
                                        i18 = RFC3280CertPathUtilities.prepareNextCertM(certPath, i27, RFC3280CertPathUtilities.prepareNextCertL(certPath, i27, i18));
                                        RFC3280CertPathUtilities.prepareNextCertN(certPath, i27);
                                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            hashSet2 = new HashSet(criticalExtensionOIDs);
                                            hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                            hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                            hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                            hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                            hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                            hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                        } else {
                                            hashSet2 = new HashSet();
                                        }
                                        list2 = list4;
                                        RFC3280CertPathUtilities.prepareNextCertO(certPath, i27, hashSet2, list2);
                                        c50.c subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                        try {
                                            PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i27, this.helper);
                                            b algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                            algorithmIdentifier2.e();
                                            algorithmIdentifier2.i();
                                            pKIXPolicyNode = prepareCertB;
                                            i19 = prepareNextCertJ;
                                            ca2 = subjectPrincipal;
                                            cAPublicKey = nextWorkingKey;
                                            trustedCert = x509Certificate2;
                                            arrayListArr2 = arrayListArr;
                                            l11 = list2;
                                            x509Certificate = x509Certificate2;
                                            z11 = z14;
                                            certificates = list3;
                                            validityDate = date2;
                                            o12 = sVar2;
                                            size = i25;
                                            i22 = i13;
                                            trustAnchor = trustAnchor2;
                                            i23 = i12;
                                            size2 = i27 - 1;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            provCrlRevocationChecker = provCrlRevocationChecker3;
                                        } catch (CertPathValidatorException e12) {
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e12, certPath, i27);
                                        }
                                    } else if (cVar != z14 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i27);
                                    }
                                }
                                i12 = i28;
                                int i29 = i18;
                                arrayListArr = arrayListArr3;
                                list2 = list4;
                                pKIXPolicyNode = processCertE;
                                i19 = i29;
                                i18 = i29;
                                i13 = i26;
                                arrayListArr2 = arrayListArr;
                                l11 = list2;
                                x509Certificate = x509Certificate2;
                                z11 = z14;
                                certificates = list3;
                                validityDate = date2;
                                o12 = sVar2;
                                size = i25;
                                i22 = i13;
                                trustAnchor = trustAnchor2;
                                i23 = i12;
                                size2 = i27 - 1;
                                pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                provCrlRevocationChecker = provCrlRevocationChecker3;
                            } catch (AnnotatedException e13) {
                                throw new CertPathValidatorException(e13.getMessage(), e13.getUnderlyingException(), certPath, size2);
                            }
                        }
                        TrustAnchor trustAnchor3 = trustAnchor;
                        s sVar3 = o12;
                        ArrayList[] arrayListArr4 = arrayListArr2;
                        List list5 = l11;
                        int i31 = size2;
                        int i32 = i31 + 1;
                        int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i32, RFC3280CertPathUtilities.wrapupCertA(i22, x509Certificate));
                        Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(u.f24796w.t());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath, i32, list5, hashSet);
                        PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, sVar3, o11, i32, arrayListArr4, pKIXPolicyNode, hashSet4);
                        if (wrapupCertB > 0 || wrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor3, wrapupCertG, x509Certificate.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i31);
                    }
                    throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                } catch (CertPathValidatorException e14) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e14, certPath, -1);
                }
            } catch (RuntimeException e15) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e15, certPath, -1);
            }
        } catch (AnnotatedException e16) {
            e = e16;
            i11 = 1;
            list = certificates;
        }
    }
}
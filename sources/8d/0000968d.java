package org.bouncycastle.jce.provider;

import e50.r0;
import e50.u;
import e60.q;
import e60.r;
import e60.s;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import v70.e;
import v70.h;
import v70.k;

/* loaded from: classes5.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = u.B.t();
    private static final String NO_REV_AVAIL = u.A.t();
    private static final String CRL_DISTRIBUTION_POINTS = u.f24791n.t();
    private static final String AUTHORITY_INFO_ACCESS = u.f24799z.t();

    RFC3281CertPathUtilities() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void additionalChecks(h hVar, Set set, Set set2) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (hVar.getAttributes(str) != null) {
                throw new CertPathValidatorException("Attribute certificate contains prohibited attribute: " + str + ".");
            }
        }
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            if (hVar.getAttributes(str2) == null) {
                throw new CertPathValidatorException("Attribute certificate does not contain necessary attribute: " + str2 + ".");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void checkCRL(e50.s r22, v70.h r23, e60.s r24, java.util.Date r25, java.util.Date r26, java.security.cert.X509Certificate r27, org.bouncycastle.jce.provider.CertStatus r28, org.bouncycastle.jce.provider.ReasonsMask r29, java.util.List r30, i60.c r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRL(e50.s, v70.h, e60.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, i60.c):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void checkCRLs(v70.h r20, e60.s r21, java.util.Date r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.util.List r25, i60.c r26) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(v70.h, e60.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.util.List, i60.c):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CertPath processAttrCert1(h hVar, s sVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (hVar.getHolder().d() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(hVar.getHolder().h());
            Principal[] d11 = hVar.getHolder().d();
            for (int i11 = 0; i11 < d11.length; i11++) {
                try {
                    if (d11[i11] instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) d11[i11]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new q.b(x509CertSelector).a(), sVar.m());
                } catch (IOException e11) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e11);
                } catch (AnnotatedException e12) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e12);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (hVar.getHolder().c() != null) {
            k kVar = new k();
            Principal[] c11 = hVar.getHolder().c();
            for (int i12 = 0; i12 < c11.length; i12++) {
                try {
                    if (c11[i12] instanceof X500Principal) {
                        kVar.setIssuer(((X500Principal) c11[i12]).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new q.b(kVar).a(), sVar.m());
                } catch (IOException e13) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e13);
                } catch (AnnotatedException e14) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e14);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        s.b bVar = new s.b(sVar);
        Iterator it2 = linkedHashSet.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResult = null;
        while (it2.hasNext()) {
            k kVar2 = new k();
            kVar2.setCertificate((X509Certificate) it2.next());
            bVar.q(new q.b(kVar2).a());
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new r.b(bVar.o()).e());
                } catch (InvalidAlgorithmParameterException e15) {
                    throw new RuntimeException(e15.getMessage());
                } catch (CertPathBuilderException e16) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e16);
                }
            } catch (NoSuchAlgorithmException e17) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e17);
            } catch (NoSuchProviderException e18) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e18);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResult.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CertPathValidatorResult processAttrCert2(CertPath certPath, s sVar) {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, sVar);
            } catch (InvalidAlgorithmParameterException e11) {
                throw new RuntimeException(e11.getMessage());
            } catch (CertPathValidatorException e12) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e12);
            }
        } catch (NoSuchAlgorithmException e13) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e13);
        } catch (NoSuchProviderException e14) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processAttrCert3(X509Certificate x509Certificate, s sVar) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && ((keyUsage.length <= 0 || !keyUsage[0]) && (keyUsage.length <= 1 || !keyUsage[1]))) {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        }
        if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processAttrCert4(X509Certificate x509Certificate, Set set) {
        Iterator it2 = set.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it2.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z11 = true;
            }
        }
        if (!z11) {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processAttrCert5(h hVar, Date date) {
        try {
            hVar.checkValidity(date);
        } catch (CertificateExpiredException e11) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e11);
        } catch (CertificateNotYetValidException e12) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processAttrCert7(h hVar, CertPath certPath, CertPath certPath2, s sVar, Set set) {
        Set<String> criticalExtensionOIDs = hVar.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                r0.e(CertPathValidatorUtilities.getExtensionValue(hVar, str));
            } catch (IllegalArgumentException e11) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e11);
            } catch (AnnotatedException e12) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e12);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).a(hVar, certPath, certPath2, criticalExtensionOIDs);
        }
        if (criticalExtensionOIDs.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
    }
}
package org.spongycastle.jce.provider;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.PKIXAttrCertChecker;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509CertStoreSelector;

/* loaded from: classes4.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = X509Extensions.TargetInformation.getId();
    private static final String NO_REV_AVAIL = X509Extensions.NoRevAvail.getId();
    private static final String CRL_DISTRIBUTION_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String AUTHORITY_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();

    RFC3281CertPathUtilities() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void additionalChecks(X509AttributeCertificate x509AttributeCertificate, Set set, Set set2) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (x509AttributeCertificate.getAttributes(str) != null) {
                throw new CertPathValidatorException("Attribute certificate contains prohibited attribute: " + str + ".");
            }
        }
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            if (x509AttributeCertificate.getAttributes(str2) == null) {
                throw new CertPathValidatorException("Attribute certificate does not contain necessary attribute: " + str2 + ".");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void checkCRL(org.spongycastle.asn1.x509.DistributionPoint r21, org.spongycastle.x509.X509AttributeCertificate r22, org.spongycastle.jcajce.PKIXExtendedParameters r23, java.util.Date r24, java.security.cert.X509Certificate r25, org.spongycastle.jce.provider.CertStatus r26, org.spongycastle.jce.provider.ReasonsMask r27, java.util.List r28, org.spongycastle.jcajce.util.JcaJceHelper r29) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3281CertPathUtilities.checkCRL(org.spongycastle.asn1.x509.DistributionPoint, org.spongycastle.x509.X509AttributeCertificate, org.spongycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.security.cert.X509Certificate, org.spongycastle.jce.provider.CertStatus, org.spongycastle.jce.provider.ReasonsMask, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void checkCRLs(org.spongycastle.x509.X509AttributeCertificate r18, org.spongycastle.jcajce.PKIXExtendedParameters r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.util.List r22, org.spongycastle.jcajce.util.JcaJceHelper r23) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(org.spongycastle.x509.X509AttributeCertificate, org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CertPath processAttrCert1(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) {
        HashSet<X509Certificate> hashSet = new HashSet();
        if (x509AttributeCertificate.getHolder().getIssuer() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(x509AttributeCertificate.getHolder().getSerialNumber());
            Principal[] issuer = x509AttributeCertificate.getHolder().getIssuer();
            for (int i11 = 0; i11 < issuer.length; i11++) {
                try {
                    if (issuer[i11] instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) issuer[i11]).getEncoded());
                    }
                    hashSet.addAll(CertPathValidatorUtilities.findCertificates(new PKIXCertStoreSelector.Builder(x509CertSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e11) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e11);
                } catch (AnnotatedException e12) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e12);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (x509AttributeCertificate.getHolder().getEntityNames() != null) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            Principal[] entityNames = x509AttributeCertificate.getHolder().getEntityNames();
            for (int i12 = 0; i12 < entityNames.length; i12++) {
                try {
                    if (entityNames[i12] instanceof X500Principal) {
                        x509CertStoreSelector.setIssuer(((X500Principal) entityNames[i12]).getEncoded());
                    }
                    hashSet.addAll(CertPathValidatorUtilities.findCertificates(new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e13) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e13);
                } catch (AnnotatedException e14) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e14);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResult = null;
        for (X509Certificate x509Certificate : hashSet) {
            X509CertStoreSelector x509CertStoreSelector2 = new X509CertStoreSelector();
            x509CertStoreSelector2.setCertificate(x509Certificate);
            builder.setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertStoreSelector2).build());
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new PKIXExtendedBuilderParameters.Builder(builder.build()).build());
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
    public static CertPathValidatorResult processAttrCert2(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters) {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, pKIXExtendedParameters);
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
    public static void processAttrCert3(X509Certificate x509Certificate, PKIXExtendedParameters pKIXExtendedParameters) {
        if (x509Certificate.getKeyUsage() != null && !x509Certificate.getKeyUsage()[0] && !x509Certificate.getKeyUsage()[1]) {
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
    public static void processAttrCert5(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) {
        try {
            x509AttributeCertificate.checkValidity(CertPathValidatorUtilities.getValidDate(pKIXExtendedParameters));
        } catch (CertificateExpiredException e11) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e11);
        } catch (CertificateNotYetValidException e12) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processAttrCert7(X509AttributeCertificate x509AttributeCertificate, CertPath certPath, CertPath certPath2, PKIXExtendedParameters pKIXExtendedParameters, Set set) {
        Set<String> criticalExtensionOIDs = x509AttributeCertificate.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                TargetInformation.getInstance(CertPathValidatorUtilities.getExtensionValue(x509AttributeCertificate, str));
            } catch (IllegalArgumentException e11) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e11);
            } catch (AnnotatedException e12) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e12);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((PKIXAttrCertChecker) it2.next()).check(x509AttributeCertificate, certPath, certPath2, criticalExtensionOIDs);
        }
        if (criticalExtensionOIDs.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
    }
}
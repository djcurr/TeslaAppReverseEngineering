package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.style.BCStyle;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.CRLDistPoint;
import org.spongycastle.asn1.x509.DistributionPoint;
import org.spongycastle.asn1.x509.DistributionPointName;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.NameConstraints;
import org.spongycastle.asn1.x509.PolicyInformation;
import org.spongycastle.jcajce.PKIXCRLStoreSelector;
import org.spongycastle.jcajce.PKIXCertStoreSelector;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    private static void checkCRL(DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) {
        int i11;
        ReasonsMask reasonsMask2;
        Date date2;
        Iterator it2;
        Set<String> criticalExtensionOIDs;
        ReasonsMask reasonsMask3 = reasonsMask;
        Date date3 = new Date(System.currentTimeMillis());
        if (date.getTime() <= date3.getTime()) {
            Iterator it3 = CertPathValidatorUtilities.getCompleteCRLs(distributionPoint, x509Certificate, date3, pKIXExtendedParameters).iterator();
            int i12 = 1;
            int i13 = 0;
            AnnotatedException e11 = null;
            while (it3.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                try {
                    X509CRL x509crl = (X509CRL) it3.next();
                    ReasonsMask processCRLD = processCRLD(x509crl, distributionPoint);
                    if (processCRLD.hasNewReasons(reasonsMask3)) {
                        date2 = date3;
                        it2 = it3;
                        AnnotatedException annotatedException = e11;
                        int i14 = i12;
                        try {
                            X509CRL processCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(pKIXExtendedParameters.getDate() != null ? pKIXExtendedParameters.getDate() : date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                            if (pKIXExtendedParameters.getValidityModel() != i14 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                                throw new AnnotatedException("No valid CRL for current time found.");
                                break;
                            }
                            processCRLB1(distributionPoint, x509Certificate, x509crl);
                            processCRLB2(distributionPoint, x509Certificate, x509crl);
                            processCRLC(processCRLH, x509crl, pKIXExtendedParameters);
                            processCRLI(date, processCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                            processCRLJ(date, x509crl, x509Certificate, certStatus);
                            if (certStatus.getCertStatus() == 8) {
                                certStatus.setCertStatus(11);
                            }
                            reasonsMask2 = reasonsMask;
                            i11 = i14;
                            try {
                                reasonsMask2.addReasons(processCRLD);
                                Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs2 != null) {
                                    HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                                    hashSet.remove(Extension.issuingDistributionPoint.getId());
                                    hashSet.remove(Extension.deltaCRLIndicator.getId());
                                    if (!hashSet.isEmpty()) {
                                        throw new AnnotatedException("CRL contains unsupported critical extensions.");
                                    }
                                }
                                if (processCRLH != null && (criticalExtensionOIDs = processCRLH.getCriticalExtensionOIDs()) != null) {
                                    HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                                    hashSet2.remove(Extension.issuingDistributionPoint.getId());
                                    hashSet2.remove(Extension.deltaCRLIndicator.getId());
                                    if (!hashSet2.isEmpty()) {
                                        throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                                    }
                                }
                                reasonsMask3 = reasonsMask2;
                                i12 = i11;
                                i13 = i12;
                                date3 = date2;
                                it3 = it2;
                                e11 = annotatedException;
                            } catch (AnnotatedException e12) {
                                e11 = e12;
                                reasonsMask3 = reasonsMask2;
                                i12 = i11;
                                date3 = date2;
                                it3 = it2;
                            }
                        } catch (AnnotatedException e13) {
                            e11 = e13;
                            reasonsMask2 = reasonsMask;
                            i11 = i14;
                        }
                    } else {
                        continue;
                    }
                } catch (AnnotatedException e14) {
                    e11 = e14;
                    i11 = i12;
                    reasonsMask2 = reasonsMask3;
                    date2 = date3;
                    it2 = it3;
                }
            }
            AnnotatedException annotatedException2 = e11;
            if (i13 == 0) {
                throw annotatedException2;
            }
            return;
        }
        throw new AnnotatedException("Validation time is in future.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static void checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters r20, java.security.cert.X509Certificate r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.PublicKey r24, java.util.List r25, org.spongycastle.jcajce.util.JcaJceHelper r26) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.spongycastle.jcajce.PKIXExtendedParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.spongycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
        r7 = ((org.spongycastle.asn1.ASN1Sequence) org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r7.hasMoreElements() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
        r9 = org.spongycastle.asn1.x509.PolicyInformation.getInstance(r7.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
        if ("2.5.29.32.0".equals(r9.getPolicyIdentifier().getId()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r5 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r9.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0105, code lost:
        throw new org.spongycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r4.getCriticalExtensionOIDs() == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
        r12 = r4.getCriticalExtensionOIDs().contains(org.spongycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
        r9 = (org.spongycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
        if ("2.5.29.32.0".equals(r9.getValidPolicy()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
        r8 = new org.spongycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r3, (java.util.Set) r13.get(r11), r9, r10, r11, r12);
        r9.addChild(r8);
        r21[r3].add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        throw new org.spongycastle.jce.exception.ExtCertPathValidatorException("Certificate policies extension could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.spongycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r19, int r20, java.util.List[] r21, org.spongycastle.jce.provider.PKIXPolicyNode r22, int r23) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.spongycastle.jce.provider.PKIXPolicyNode, int):org.spongycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertA(CertPath certPath, int i11) {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i12 = 0; i12 < aSN1Sequence.size(); i12++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i12));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if (!"2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                            if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                                throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certPath, i11);
                            }
                        } else {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i11);
                        }
                    } catch (Exception e11) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e11, certPath, i11);
                    }
                }
            }
        } catch (AnnotatedException e12) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e12, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertG(CertPath certPath, int i11, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = aSN1Sequence != null ? NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e11) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e11, certPath, i11);
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i12 = 0; i12 != excludedSubtrees.length; i12++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i12]);
                        } catch (Exception e12) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e12, certPath, i11);
                        }
                    }
                }
            }
        } catch (Exception e13) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e13, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH1(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH2(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertH3(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        r3 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r3 >= r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L48
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L47
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3e
            org.spongycastle.asn1.ASN1TaggedObject r1 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3e
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r2 != 0) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3e
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            int r3 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3e
            if (r3 >= r5) goto L47
            return r3
        L3e:
            r5 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L47:
            return r5
        L48:
            r5 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        r4 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, false).getValue().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r4 >= r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.spongycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Primitive r0 = org.spongycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L49
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L48
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3f
            org.spongycastle.asn1.ASN1TaggedObject r1 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3f
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3f
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3f
            java.math.BigInteger r0 = r0.getValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            int r4 = r0.intValue()     // Catch: java.lang.IllegalArgumentException -> L3f
            if (r4 >= r6) goto L48
            return r4
        L3f:
            r6 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L48:
            return r6
        L49:
            r6 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertJ(CertPath certPath, int i11, int i12) {
        int intValue;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (intValue = aSN1Integer.getValue().intValue()) >= i12) ? i12 : intValue;
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e11, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertK(CertPath certPath, int i11) {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            if (basicConstraints != null) {
                if (!basicConstraints.isCA()) {
                    throw new CertPathValidatorException("Not a CA certificate");
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e11, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertL(CertPath certPath, int i11, int i12) {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11))) {
            return i12;
        }
        if (i12 > 0) {
            return i12 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertM(CertPath certPath, int i11, int i12) {
        BigInteger pathLenConstraint;
        int intValue;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            return (basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (intValue = pathLenConstraint.intValue()) >= i12) ? i12 : intValue;
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e11, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertN(CertPath certPath, int i11) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i11)).getKeyUsage();
        if (keyUsage != null && !keyUsage[5]) {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertO(CertPath certPath, int i11, Set set, List list) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i11);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ((PKIXCertPathChecker) it2.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e11) {
                throw new CertPathValidatorException(e11.getMessage(), e11.getCause(), certPath, i11);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i11);
    }

    protected static Set processCRLA1i(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) {
        HashSet hashSet = new HashSet();
        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
            try {
                String str = FRESHEST_CRL;
                CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, str));
                if (cRLDistPoint == null) {
                    try {
                        cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    } catch (AnnotatedException e11) {
                        throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", e11);
                    }
                }
                if (cRLDistPoint != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(pKIXExtendedParameters.getCRLStores());
                    try {
                        arrayList.addAll(CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()));
                        try {
                            hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), arrayList));
                        } catch (AnnotatedException e12) {
                            throw new AnnotatedException("Exception obtaining delta CRLs.", e12);
                        }
                    } catch (AnnotatedException e13) {
                        throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", e13);
                    }
                }
            } catch (AnnotatedException e14) {
                throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", e14);
            }
        }
        return hashSet;
    }

    protected static Set[] processCRLA1ii(Date date, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, X509CRL x509crl) {
        HashSet hashSet = new HashSet();
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(x509Certificate);
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCRLStoreSelector<? extends CRL> build = new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build();
            if (pKIXExtendedParameters.getDate() != null) {
                date = pKIXExtendedParameters.getDate();
            }
            Set findCRLs = CRL_UTIL.findCRLs(build, date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                try {
                    hashSet.addAll(CertPathValidatorUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()));
                } catch (AnnotatedException e11) {
                    throw new AnnotatedException("Exception obtaining delta CRLs.", e11);
                }
            }
            return new Set[]{findCRLs, hashSet};
        } catch (IOException e12) {
            throw new AnnotatedException("Cannot extract issuer from CRL." + e12, e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        int i11 = 0;
        boolean z11 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                int i12 = 0;
                while (i11 < names.length) {
                    if (names[i11].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i11].getName().toASN1Primitive().getEncoded(), encoded)) {
                                i12 = 1;
                            }
                        } catch (IOException e11) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e11);
                        }
                    }
                    i11++;
                }
                if (i12 != 0 && !z11) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (i12 == 0) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                i11 = i12;
            } else if (PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                i11 = 1;
            }
            if (i11 == 0) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e12) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e12.getMessage(), e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        GeneralName[] generalNameArr;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    boolean z11 = false;
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e11) {
                            throw new AnnotatedException("Could not read CRL issuer.", e11);
                        }
                    }
                    if (distributionPoint.getDistributionPoint() != null) {
                        DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                        GeneralName[] names = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                        if (distributionPoint3.getType() == 1) {
                            if (distributionPoint.getCRLIssuer() != null) {
                                generalNameArr = distributionPoint.getCRLIssuer().getNames();
                            } else {
                                generalNameArr = new GeneralName[1];
                                try {
                                    generalNameArr[0] = new GeneralName(X500Name.getInstance(PrincipalUtils.getEncodedIssuerPrincipal(obj).getEncoded()));
                                } catch (Exception e12) {
                                    throw new AnnotatedException("Could not read certificate issuer.", e12);
                                }
                            }
                            names = generalNameArr;
                            for (int i11 = 0; i11 < names.length; i11++) {
                                Enumeration objects2 = ASN1Sequence.getInstance(names[i11].getName().toASN1Primitive()).getObjects();
                                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                                while (objects2.hasMoreElements()) {
                                    aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                                }
                                aSN1EncodableVector2.add(distributionPoint3.getName());
                                names[i11] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                            }
                        }
                        if (names != null) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= names.length) {
                                    break;
                                } else if (arrayList.contains(names[i12])) {
                                    z11 = true;
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        if (!z11) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else if (distributionPoint.getCRLIssuer() != null) {
                        GeneralName[] names2 = distributionPoint.getCRLIssuer().getNames();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= names2.length) {
                                break;
                            } else if (arrayList.contains(names2[i13])) {
                                z11 = true;
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (!z11) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else {
                        throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                    }
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e13) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e13);
                }
            }
        } catch (Exception e14) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) {
        if (x509crl == null) {
            return;
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    try {
                        IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                        boolean z11 = false;
                        if (issuingDistributionPoint != null ? issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 == null) {
                            z11 = true;
                        }
                        if (z11) {
                            try {
                                String str2 = AUTHORITY_KEY_IDENTIFIER;
                                ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                                try {
                                    ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                                    if (extensionValue == null) {
                                        throw new AnnotatedException("CRL authority key identifier is null.");
                                    }
                                    if (extensionValue2 != null) {
                                        if (!extensionValue.equals(extensionValue2)) {
                                            throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                        }
                                        return;
                                    }
                                    throw new AnnotatedException("Delta CRL authority key identifier is null.");
                                } catch (AnnotatedException e11) {
                                    throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e11);
                                }
                            } catch (AnnotatedException e12) {
                                throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e12);
                            }
                        }
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    } catch (Exception e13) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e13);
                    }
                }
                throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
            }
        } catch (Exception e14) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e11) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) {
        int i11;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            try {
                Collection findCertificates = CertPathValidatorUtilities.findCertificates(build, pKIXExtendedParameters.getCertificateStores());
                findCertificates.addAll(CertPathValidatorUtilities.findCertificates(build, pKIXExtendedParameters.getCertStores()));
                findCertificates.add(x509Certificate);
                Iterator it2 = findCertificates.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            PKIXCertPathBuilderSpi pKIXCertPathBuilderSpi = new PKIXCertPathBuilderSpi();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e11) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e11);
                        } catch (CertPathValidatorException e12) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e12);
                        } catch (Exception e13) {
                            throw new AnnotatedException(e13.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i11)).getKeyUsage();
                    if (keyUsage != null && (keyUsage.length < 7 || !keyUsage[6])) {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    } else {
                        hashSet.add(arrayList2.get(i11));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e14) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e14);
            }
        } catch (IOException e15) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PublicKey processCRLG(X509CRL x509crl, Set set) {
        Iterator it2 = set.iterator();
        Exception e11 = null;
        while (it2.hasNext()) {
            PublicKey publicKey = (PublicKey) it2.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e12) {
                e11 = e12;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static X509CRL processCRLH(Set set, PublicKey publicKey) {
        Iterator it2 = set.iterator();
        Exception e11 = null;
        while (it2.hasNext()) {
            X509CRL x509crl = (X509CRL) it2.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e12) {
                e11 = e12;
            }
        }
        if (e11 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, int i11, PublicKey publicKey, boolean z11, X500Name x500Name, X509Certificate x509Certificate, JcaJceHelper jcaJceHelper) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i11);
        if (!z11) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e11) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e11, certPath, i11);
            }
        }
        try {
            x509Certificate2.checkValidity(CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i11));
            if (pKIXExtendedParameters.isRevocationEnabled()) {
                try {
                    checkCRLs(pKIXExtendedParameters, x509Certificate2, CertPathValidatorUtilities.getValidCertDateFromValidityModel(pKIXExtendedParameters, certPath, i11), x509Certificate, publicKey, certificates, jcaJceHelper);
                } catch (AnnotatedException e12) {
                    throw new ExtCertPathValidatorException(e12.getMessage(), e12.getCause() != null ? e12.getCause() : e12, certPath, i11);
                }
            }
            if (PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2).equals(x500Name)) {
                return;
            }
            throw new ExtCertPathValidatorException("IssuerName(" + PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate2) + ") does not match SubjectName(" + x500Name + ") of signing certificate.", null, certPath, i11);
        } catch (CertificateExpiredException e13) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e13.getMessage(), e13, certPath, i11);
        } catch (CertificateNotYetValidException e14) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e14.getMessage(), e14, certPath, i11);
        } catch (AnnotatedException e15) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e15, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertBC(CertPath certPath, int i11, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i12 = size - i11;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i12 >= size) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate).getEncoded());
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i13 = 0; i13 != rDNs.length; i13++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i13].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e11) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e11, certPath, i11);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i14 = 0; i14 < names.length; i14++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i14]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i14]);
                                    } catch (PKIXNameConstraintValidatorException e12) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e12, certPath, i11);
                                    }
                                }
                            } catch (Exception e13) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e13, certPath, i11);
                            }
                        }
                    } catch (Exception e14) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e14, certPath, i11);
                    }
                } catch (PKIXNameConstraintValidatorException e15) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e15, certPath, i11);
                }
            } catch (Exception e16) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e16, certPath, i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode processCertD(CertPath certPath, int i11, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i12) {
        String str;
        int i13;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i14 = size - i11;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i14, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i14, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e11) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e11, certPath, i11);
                    }
                }
            }
            if (!set.isEmpty() && !set.contains("2.5.29.32.0")) {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            } else {
                set.clear();
                set.addAll(hashSet);
            }
            if (i12 > 0 || (i14 < size && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i14 - 1];
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i15);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    str = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    str = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z11 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i14, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i14].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
            for (int i16 = i14 - 1; i16 >= 0; i16--) {
                List list2 = listArr[i16];
                while (i13 < list2.size()) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i13);
                    i13 = (pKIXPolicyNode5.hasChildren() || (pKIXPolicyNode4 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode4, listArr, pKIXPolicyNode5)) != null) ? i13 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i14];
                for (int i17 = 0; i17 < list3.size(); i17++) {
                    ((PKIXPolicyNode) list3.get(i17)).setCritical(contains);
                }
            }
            return pKIXPolicyNode4;
        } catch (AnnotatedException e12) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e12, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode processCertE(CertPath certPath, int i11, PKIXPolicyNode pKIXPolicyNode) {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e11) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e11, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertF(CertPath certPath, int i11, PKIXPolicyNode pKIXPolicyNode, int i12) {
        if (i12 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int wrapupCertA(int i11, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i11 == 0) ? i11 : i11 - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int wrapupCertB(CertPath certPath, int i11, int i12) {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).getValue().intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e11) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e11, certPath, i11);
                        }
                    }
                }
            }
            return i12;
        } catch (AnnotatedException e12) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e12, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void wrapupCertF(CertPath certPath, int i11, List list, Set set) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i11);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ((PKIXCertPathChecker) it2.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e11) {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", e11, certPath, i11);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i11, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i11);
            }
            return null;
        }
        if (CertPathValidatorUtilities.isAnyPolicy(set)) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                if (!set2.isEmpty()) {
                    HashSet<PKIXPolicyNode> hashSet = new HashSet();
                    for (List list : listArr) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i12);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                                Iterator children = pKIXPolicyNode2.getChildren();
                                while (children.hasNext()) {
                                    hashSet.add(children.next());
                                }
                            }
                        }
                    }
                    for (PKIXPolicyNode pKIXPolicyNode3 : hashSet) {
                        set2.contains(pKIXPolicyNode3.getValidPolicy());
                    }
                    for (int i13 = size - 1; i13 >= 0; i13--) {
                        List list2 = listArr[i13];
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list2.get(i14);
                            if (!pKIXPolicyNode4.hasChildren()) {
                                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                            }
                        }
                    }
                } else {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i11);
                }
            }
        } else {
            HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
            for (List list3 : listArr) {
                for (int i15 = 0; i15 < list3.size(); i15++) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list3.get(i15);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode5.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode5.getChildren();
                        while (children2.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) children2.next();
                            if (!"2.5.29.32.0".equals(pKIXPolicyNode6.getValidPolicy())) {
                                hashSet2.add(pKIXPolicyNode6);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode7 : hashSet2) {
                if (!set.contains(pKIXPolicyNode7.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i16 = size - 1; i16 >= 0; i16--) {
                    List list4 = listArr[i16];
                    for (int i17 = 0; i17 < list4.size(); i17++) {
                        PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) list4.get(i17);
                        if (!pKIXPolicyNode8.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode8);
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
package org.bouncycastle.jce.provider;

import c50.c;
import e40.b;
import e40.g;
import e50.b0;
import e50.e0;
import e50.i0;
import e50.j;
import e50.s;
import e50.t;
import e50.u;
import e50.w;
import e50.x;
import e50.y;
import e60.o;
import e60.q;
import e60.r;
import e60.s;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = u.f24792o.t();
    public static final String POLICY_MAPPINGS = u.f24793p.t();
    public static final String INHIBIT_ANY_POLICY = u.f24798y.t();
    public static final String ISSUING_DISTRIBUTION_POINT = u.f24788k.t();
    public static final String FRESHEST_CRL = u.f24797x.t();
    public static final String DELTA_CRL_INDICATOR = u.f24787j.t();
    public static final String POLICY_CONSTRAINTS = u.f24795t.t();
    public static final String BASIC_CONSTRAINTS = u.f24784g.t();
    public static final String CRL_DISTRIBUTION_POINTS = u.f24791n.t();
    public static final String SUBJECT_ALTERNATIVE_NAME = u.f24782e.t();
    public static final String NAME_CONSTRAINTS = u.f24790m.t();
    public static final String AUTHORITY_KEY_IDENTIFIER = u.f24794q.t();
    public static final String KEY_USAGE = u.f24781d.t();
    public static final String CRL_NUMBER = u.f24785h.t();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    RFC3280CertPathUtilities() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void checkCRL(e60.o r21, e50.s r22, e60.s r23, java.util.Date r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.cert.X509Certificate r27, java.security.PublicKey r28, org.bouncycastle.jce.provider.CertStatus r29, org.bouncycastle.jce.provider.ReasonsMask r30, java.util.List r31, i60.c r32) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRL(e60.o, e50.s, e60.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, i60.c):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void checkCRLs(e60.o r23, e60.s r24, java.util.Date r25, java.util.Date r26, java.security.cert.X509Certificate r27, java.security.cert.X509Certificate r28, java.security.PublicKey r29, java.util.List r30, i60.c r31) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(e60.o, e60.s, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, i60.c):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
        r7 = ((org.bouncycastle.asn1.p) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r7.hasMoreElements() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
        r9 = e50.i0.e(r7.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
        if ("2.5.29.32.0".equals(r9.f().t()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r9.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0105, code lost:
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r19, r20);
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
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
        r9 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
        if ("2.5.29.32.0".equals(r9.getValidPolicy()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
        r8 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r3, (java.util.Set) r13.get(r11), r9, r10, r11, r12);
        r9.addChild(r8);
        r21[r3].add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("Certificate policies extension could not be decoded.", r0, r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r19, int r20, java.util.List[] r21, org.bouncycastle.jce.provider.PKIXPolicyNode r22, int r23) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertA(CertPath certPath, int i11) {
        try {
            p p11 = p.p(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_MAPPINGS));
            if (p11 != null) {
                for (int i12 = 0; i12 < p11.size(); i12++) {
                    try {
                        p p12 = p.p(p11.r(i12));
                        k u11 = k.u(p12.r(0));
                        k u12 = k.u(p12.r(1));
                        if ("2.5.29.32.0".equals(u11.t())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i11);
                        }
                        if ("2.5.29.32.0".equals(u12.t())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i11);
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
            p p11 = p.p(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), NAME_CONSTRAINTS));
            e0 i12 = p11 != null ? e0.i(p11) : null;
            if (i12 != null) {
                y[] j11 = i12.j();
                if (j11 != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(j11);
                    } catch (Exception e11) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e11, certPath, i11);
                    }
                }
                y[] h11 = i12.h();
                if (h11 != null) {
                    for (int i13 = 0; i13 != h11.length; i13++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(h11[i13]);
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
        r3 = org.bouncycastle.asn1.i.q(r1, false).x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r3 >= r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
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
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.n r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.p r0 = org.bouncycastle.asn1.p.p(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L43
            java.util.Enumeration r0 = r0.s()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3a
            org.bouncycastle.asn1.s r1 = org.bouncycastle.asn1.s.p(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r2 = r1.s()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r2 != 0) goto L1a
            r0 = 0
            org.bouncycastle.asn1.i r0 = org.bouncycastle.asn1.i.q(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r3 = r0.x()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r3 >= r5) goto L43
            return r3
        L3a:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L43:
            return r5
        L44:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        r4 = org.bouncycastle.asn1.i.q(r1, false).x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 >= r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
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
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L45
            org.bouncycastle.asn1.n r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L45
            org.bouncycastle.asn1.p r0 = org.bouncycastle.asn1.p.p(r0)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L44
            java.util.Enumeration r0 = r0.s()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3b
            org.bouncycastle.asn1.s r1 = org.bouncycastle.asn1.s.p(r1)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r2 = r1.s()     // Catch: java.lang.IllegalArgumentException -> L3b
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.bouncycastle.asn1.i r0 = org.bouncycastle.asn1.i.q(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r4 = r0.x()     // Catch: java.lang.IllegalArgumentException -> L3b
            if (r4 >= r6) goto L44
            return r4
        L3b:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension contents cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L44:
            return r6
        L45:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Policy constraints extension cannot be decoded."
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int prepareNextCertJ(CertPath certPath, int i11, int i12) {
        int x11;
        try {
            i p11 = i.p(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), INHIBIT_ANY_POLICY));
            return (p11 == null || (x11 = p11.x()) >= i12) ? i12 : x11;
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e11, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertK(CertPath certPath, int i11) {
        try {
            j e11 = j.e(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            if (e11 == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i11);
            }
            if (!e11.h()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i11);
            }
        } catch (Exception e12) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e12, certPath, i11);
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
        BigInteger f11;
        int intValue;
        try {
            j e11 = j.e(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            return (e11 == null || (f11 = e11.f()) == null || (intValue = f11.intValue()) >= i12) ? i12 : intValue;
        } catch (Exception e12) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e12, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void prepareNextCertN(CertPath certPath, int i11) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i11)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i11);
            }
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

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLB1(s sVar, Object obj, X509CRL x509crl) {
        n extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        int i11 = 0;
        boolean z11 = extensionValue != null && b0.i(extensionValue).k();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (sVar.f() != null) {
                w[] i12 = sVar.f().i();
                int i13 = 0;
                while (i11 < i12.length) {
                    if (i12[i11].j() == 4) {
                        try {
                            if (a.c(i12[i11].i().toASN1Primitive().getEncoded(), encoded)) {
                                i13 = 1;
                            }
                        } catch (IOException e11) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e11);
                        }
                    }
                    i11++;
                }
                if (i13 != 0 && !z11) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (i13 == 0) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                i11 = i13;
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
    public static void processCRLB2(s sVar, Object obj, X509CRL x509crl) {
        w[] wVarArr;
        try {
            b0 i11 = b0.i(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (i11 != null) {
                if (i11.h() != null) {
                    t h11 = b0.i(i11).h();
                    ArrayList arrayList = new ArrayList();
                    boolean z11 = false;
                    if (h11.j() == 0) {
                        for (w wVar : x.f(h11.i()).i()) {
                            arrayList.add(wVar);
                        }
                    }
                    if (h11.j() == 1) {
                        d dVar = new d();
                        try {
                            Enumeration s11 = p.p(PrincipalUtils.getIssuerPrincipal(x509crl)).s();
                            while (s11.hasMoreElements()) {
                                dVar.a((b) s11.nextElement());
                            }
                            dVar.a(h11.i());
                            arrayList.add(new w(c.f(new w0(dVar))));
                        } catch (Exception e11) {
                            throw new AnnotatedException("Could not read CRL issuer.", e11);
                        }
                    }
                    if (sVar.h() != null) {
                        t h12 = sVar.h();
                        w[] i12 = h12.j() == 0 ? x.f(h12.i()).i() : null;
                        if (h12.j() == 1) {
                            if (sVar.f() != null) {
                                wVarArr = sVar.f().i();
                            } else {
                                wVarArr = new w[1];
                                try {
                                    wVarArr[0] = new w(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                                } catch (Exception e12) {
                                    throw new AnnotatedException("Could not read certificate issuer.", e12);
                                }
                            }
                            i12 = wVarArr;
                            for (int i13 = 0; i13 < i12.length; i13++) {
                                Enumeration s12 = p.p(i12[i13].i().toASN1Primitive()).s();
                                d dVar2 = new d();
                                while (s12.hasMoreElements()) {
                                    dVar2.a((b) s12.nextElement());
                                }
                                dVar2.a(h12.i());
                                i12[i13] = new w(c.f(new w0(dVar2)));
                            }
                        }
                        if (i12 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i12.length) {
                                    break;
                                } else if (arrayList.contains(i12[i14])) {
                                    z11 = true;
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        if (!z11) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else if (sVar.f() == null) {
                        throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                    } else {
                        w[] i15 = sVar.f().i();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15.length) {
                                break;
                            } else if (arrayList.contains(i15[i16])) {
                                z11 = true;
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (!z11) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    }
                }
                try {
                    j e13 = j.e(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (i11.o() && e13 != null && e13.h()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (i11.n() && (e13 == null || !e13.h())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (i11.m()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e14) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e14);
                }
            }
        } catch (Exception e15) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, e60.s sVar) {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException("delta CRL has unsupported critical extensions");
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            b0 i11 = b0.i(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (sVar.A()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try {
                    b0 i12 = b0.i(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    boolean z11 = false;
                    if (i11 != null ? i11.equals(i12) : i12 == null) {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        n extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            n extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                            if (extensionValue == null) {
                                throw new AnnotatedException("CRL authority key identifier is null.");
                            }
                            if (extensionValue2 == null) {
                                throw new AnnotatedException("Delta CRL authority key identifier is null.");
                            }
                            if (!extensionValue.j(extensionValue2)) {
                                throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e11) {
                            throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e11);
                        }
                    } catch (AnnotatedException e12) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e12);
                    }
                } catch (Exception e13) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e13);
                }
            }
        } catch (Exception e14) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ReasonsMask processCRLD(X509CRL x509crl, s sVar) {
        try {
            b0 i11 = b0.i(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (i11 == null || i11.j() == null || sVar.j() == null) {
                if ((i11 == null || i11.j() == null) && sVar.j() == null) {
                    return ReasonsMask.allReasons;
                }
                return (sVar.j() == null ? ReasonsMask.allReasons : new ReasonsMask(sVar.j())).intersect(i11 == null ? ReasonsMask.allReasons : new ReasonsMask(i11.j()));
            }
            return new ReasonsMask(sVar.j()).intersect(new ReasonsMask(i11.j()));
        } catch (Exception e11) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, e60.s sVar, List list, i60.c cVar) {
        int i11;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            q<? extends Certificate> a11 = new q.b(x509CertSelector).a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, a11, sVar.n());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, a11, sVar.m());
                linkedHashSet.add(x509Certificate);
                Iterator it2 = linkedHashSet.iterator();
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
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            s.b q11 = new s.b(sVar).q(new q.b(x509CertSelector2).a());
                            if (list.contains(x509Certificate2)) {
                                q11.p(false);
                            } else {
                                q11.p(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new r.b(q11.o()).e()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, cVar));
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
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i11));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
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
    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, e60.s sVar) {
        if (!sVar.A() || x509crl == null) {
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
    public static void processCertA(CertPath certPath, e60.s sVar, Date date, e60.n nVar, int i11, PublicKey publicKey, boolean z11, c cVar, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i11);
        if (!z11) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, sVar.r());
            } catch (GeneralSecurityException e11) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e11, certPath, i11);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, sVar.v(), certPath, i11);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (nVar != null) {
                    nVar.initialize(new o(sVar, validCertDateFromValidityModel, certPath, i11, x509Certificate, publicKey));
                    nVar.check(x509Certificate2);
                }
                c issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(cVar)) {
                    return;
                }
                throw new ExtCertPathValidatorException("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + cVar + ") of signing certificate.", null, certPath, i11);
            } catch (CertificateExpiredException e12) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e12.getMessage(), e12, certPath, i11);
            } catch (CertificateNotYetValidException e13) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e13.getMessage(), e13, certPath, i11);
            }
        } catch (AnnotatedException e14) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e14, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertBC(CertPath certPath, int i11, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z11) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i12 = size - i11;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i12 >= size && !z11)) {
            try {
                p p11 = p.p(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(p11);
                    pKIXNameConstraintValidator.checkExcludedDN(p11);
                    try {
                        x f11 = x.f(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        c50.b[] j11 = c.f(p11).j(d50.c.H);
                        for (int i13 = 0; i13 != j11.length; i13++) {
                            w wVar = new w(1, ((g) j11[i13].f().h()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(wVar);
                                pKIXNameConstraintValidator.checkExcluded(wVar);
                            } catch (PKIXNameConstraintValidatorException e11) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e11, certPath, i11);
                            }
                        }
                        if (f11 != null) {
                            try {
                                w[] i14 = f11.i();
                                for (int i15 = 0; i15 < i14.length; i15++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(i14[i15]);
                                        pKIXNameConstraintValidator.checkExcluded(i14[i15]);
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
    public static PKIXPolicyNode processCertD(CertPath certPath, int i11, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i12, boolean z11) {
        String str;
        int i13;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i14 = size - i11;
        try {
            p p11 = p.p(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (p11 == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration s11 = p11.s();
            HashSet hashSet = new HashSet();
            while (s11.hasMoreElements()) {
                i0 e11 = i0.e(s11.nextElement());
                k f11 = e11.f();
                hashSet.add(f11.t());
                if (!"2.5.29.32.0".equals(f11.t())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(e11.h());
                        if (!CertPathValidatorUtilities.processCertD1i(i14, listArr, f11, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i14, listArr, f11, qualifierSet);
                        }
                    } catch (CertPathValidatorException e12) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e12, certPath, i11);
                    }
                }
            }
            if (set.isEmpty() || set.contains("2.5.29.32.0")) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i12 > 0 || ((i14 < size || z11) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration s12 = p11.s();
                while (true) {
                    if (!s12.hasMoreElements()) {
                        break;
                    }
                    i0 e13 = i0.e(s12.nextElement());
                    if ("2.5.29.32.0".equals(e13.f().t())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(e13.h());
                        List list = listArr[i14 - 1];
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i15);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    str = (String) obj2;
                                } else if (obj2 instanceof k) {
                                    str = ((k) obj2).t();
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z12 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z12 = true;
                                    }
                                }
                                if (!z12) {
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
        } catch (AnnotatedException e14) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e14, certPath, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode processCertE(CertPath certPath, int i11, PKIXPolicyNode pKIXPolicyNode) {
        try {
            if (p.p(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), CERTIFICATE_POLICIES)) == null) {
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
            p p11 = p.p(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_CONSTRAINTS));
            if (p11 != null) {
                Enumeration s11 = p11.s();
                while (s11.hasMoreElements()) {
                    org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) s11.nextElement();
                    if (sVar.s() == 0) {
                        try {
                            if (i.q(sVar, false).x() == 0) {
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
                throw new ExtCertPathValidatorException(e11.getMessage(), e11, certPath, i11);
            } catch (Exception e12) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e12, certPath, i11);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode wrapupCertG(CertPath certPath, e60.s sVar, Set set, int i11, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (sVar.x()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i11);
            }
            return null;
        }
        if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
            HashSet<PKIXPolicyNode> hashSet = new HashSet();
            for (List list : listArr) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i12);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                            if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                                hashSet.add(pKIXPolicyNode3);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode4 : hashSet) {
                if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                    pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i13 = size - 1; i13 >= 0; i13--) {
                    List list2 = listArr[i13];
                    for (int i14 = 0; i14 < list2.size(); i14++) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i14);
                        if (!pKIXPolicyNode5.hasChildren()) {
                            pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode5);
                        }
                    }
                }
            }
        } else if (sVar.x()) {
            if (set2.isEmpty()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i11);
            }
            HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
            for (List list3 : listArr) {
                for (int i15 = 0; i15 < list3.size(); i15++) {
                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list3.get(i15);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode6.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode6.getChildren();
                        while (children2.hasNext()) {
                            hashSet2.add(children2.next());
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode7 : hashSet2) {
                set2.contains(pKIXPolicyNode7.getValidPolicy());
            }
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
        return pKIXPolicyNode;
    }
}
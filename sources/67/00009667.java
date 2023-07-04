package org.bouncycastle.jce.provider;

import c50.c;
import d50.e;
import d60.a;
import e40.g;
import e50.b;
import e50.i;
import e50.i0;
import e50.k;
import e50.m0;
import e50.t;
import e50.u;
import e50.w;
import e50.x;
import e60.m;
import e60.o;
import e60.p;
import e60.q;
import e60.r;
import e60.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.StoreException;
import r70.j;
import r70.l;
import v70.h;

/* loaded from: classes5.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String CERTIFICATE_POLICIES = u.f24792o.t();
    protected static final String BASIC_CONSTRAINTS = u.f24784g.t();
    protected static final String POLICY_MAPPINGS = u.f24793p.t();
    protected static final String SUBJECT_ALTERNATIVE_NAME = u.f24782e.t();
    protected static final String NAME_CONSTRAINTS = u.f24790m.t();
    protected static final String KEY_USAGE = u.f24781d.t();
    protected static final String INHIBIT_ANY_POLICY = u.f24798y.t();
    protected static final String ISSUING_DISTRIBUTION_POINT = u.f24788k.t();
    protected static final String DELTA_CRL_INDICATOR = u.f24787j.t();
    protected static final String POLICY_CONSTRAINTS = u.f24795t.t();
    protected static final String FRESHEST_CRL = u.f24797x.t();
    protected static final String CRL_DISTRIBUTION_POINTS = u.f24791n.t();
    protected static final String AUTHORITY_KEY_IDENTIFIER = u.f24794q.t();
    protected static final String CRL_NUMBER = u.f24785h.t();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    CertPathValidatorUtilities() {
    }

    static void checkCRLsNotEmpty(o oVar, Set set, Object obj) {
        if (set.isEmpty()) {
            if (obj instanceof h) {
                throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + ((h) obj).getIssuer().b()[0] + "\"", null, oVar.a(), oVar.b());
            }
            throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + e.V.c(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)) + "\"", null, oVar.a(), oVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void findCertificates(LinkedHashSet linkedHashSet, q qVar, List list) {
        for (Object obj : list) {
            if (obj instanceof l) {
                try {
                    linkedHashSet.addAll(((l) obj).getMatches(qVar));
                } catch (StoreException e11) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e11);
                }
            } else {
                try {
                    linkedHashSet.addAll(q.c(qVar, (CertStore) obj));
                } catch (CertStoreException e12) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e12);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<p> list2) {
        byte[] f11;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(AUTHORITY_KEY_IDENTIFIER);
                if (extensionValue != null && (f11 = i.e(org.bouncycastle.asn1.l.p(extensionValue).r()).f()) != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new s0(f11).getEncoded());
                }
            } catch (Exception unused) {
            }
            q<? extends Certificate> a11 = new q.b(x509CertSelector).a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, a11, list);
                findCertificates(linkedHashSet, a11, list2);
                return linkedHashSet;
            } catch (AnnotatedException e11) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e11);
            }
        } catch (Exception e12) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection findTargets(r rVar) {
        s a11 = rVar.a();
        q s11 = a11.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, s11, a11.n());
            findCertificates(linkedHashSet, s11, a11.m());
            if (linkedHashSet.isEmpty()) {
                Certificate b11 = s11.b();
                if (b11 != null) {
                    return Collections.singleton(b11);
                }
                throw new CertPathBuilderException("No certificate found matching targetConstraints.");
            }
            return linkedHashSet;
        } catch (AnnotatedException e11) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e11);
        }
    }

    protected static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) {
        return findTrustAnchor(x509Certificate, set, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set, String str) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it2 = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e11 = null;
        c cVar = null;
        PublicKey publicKey = null;
        while (it2.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it2.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (trustAnchor.getCA() != null && trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                    if (cVar == null) {
                        cVar = c.f(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (cVar.equals(c.f(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                try {
                    verifyX509Certificate(x509Certificate, publicKey, str);
                } catch (Exception e12) {
                    e11 = e12;
                    trustAnchor = null;
                    publicKey = null;
                }
            }
        }
        if (trustAnchor != null || e11 == null) {
            return trustAnchor;
        }
        throw new AnnotatedException("TrustAnchor found but certificate validation failed.", e11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<p> getAdditionalStoresFromAltNames(byte[] bArr, Map<w, p> map) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        w[] i11 = x.f(org.bouncycastle.asn1.l.p(bArr).r()).i();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 != i11.length; i12++) {
            p pVar = map.get(i11[i12]);
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<e60.l> getAdditionalStoresFromCRLDistributionPoint(k kVar, Map<w, e60.l> map, Date date, i60.c cVar) {
        if (kVar == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            e50.s[] e11 = kVar.e();
            ArrayList arrayList = new ArrayList();
            for (e50.s sVar : e11) {
                t h11 = sVar.h();
                if (h11 != null && h11.j() == 0) {
                    for (w wVar : x.f(h11.i()).i()) {
                        e60.l lVar = map.get(wVar);
                        if (lVar != null) {
                            arrayList.add(lVar);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && j.c("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory createCertificateFactory = cVar.createCertificateFactory("X.509");
                    for (int i11 = 0; i11 < e11.length; i11++) {
                        t h12 = e11[i11].h();
                        if (h12 != null && h12.j() == 0) {
                            w[] i12 = x.f(h12.i()).i();
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12.length) {
                                    w wVar2 = i12[i11];
                                    if (wVar2.j() == 6) {
                                        try {
                                            e60.l crl = CrlCache.getCrl(createCertificateFactory, date, new URI(((g) wVar2.i()).getString()));
                                            if (crl != null) {
                                                arrayList.add(crl);
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                } catch (Exception e12) {
                    throw new AnnotatedException("cannot create certificate factory: " + e12.getMessage(), e12);
                }
            }
            return arrayList;
        } catch (Exception e13) {
            throw new AnnotatedException("Distribution points could not be read.", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static b getAlgorithmIdentifier(PublicKey publicKey) {
        try {
            return m0.h(publicKey.getEncoded()).e();
        } catch (Exception e11) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e11);
        }
    }

    protected static void getCRLIssuersFromDistributionPoint(e50.s sVar, Collection collection, X509CRLSelector x509CRLSelector) {
        ArrayList<c> arrayList = new ArrayList();
        if (sVar.f() != null) {
            w[] i11 = sVar.f().i();
            for (int i12 = 0; i12 < i11.length; i12++) {
                if (i11[i12].j() == 4) {
                    try {
                        arrayList.add(c.f(i11[i12].i().toASN1Primitive().getEncoded()));
                    } catch (IOException e11) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e11);
                    }
                }
            }
        } else if (sVar.h() == null) {
            throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        } else {
            for (Object obj : collection) {
                arrayList.add(obj);
            }
        }
        for (c cVar : arrayList) {
            try {
                x509CRLSelector.addIssuerName(cVar.getEncoded());
            } catch (IOException e12) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        X509CRLEntry revokedCertificate;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            org.bouncycastle.asn1.e eVar = null;
            if (revokedCertificate.hasExtensions()) {
                if (revokedCertificate.hasUnsupportedCriticalExtension()) {
                    throw new AnnotatedException("CRL entry has unsupported critical extensions.");
                }
                try {
                    eVar = org.bouncycastle.asn1.e.q(getExtensionValue(revokedCertificate, u.f24786i.t()));
                } catch (Exception e11) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e11);
                }
            }
            int t11 = eVar == null ? 0 : eVar.t();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || t11 == 0 || t11 == 1 || t11 == 2 || t11 == 10) {
                certStatus.setCertStatus(t11);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
        } catch (CRLException e12) {
            throw new AnnotatedException("Failed check for indirect CRL.", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Set getCompleteCRLs(o oVar, e50.s sVar, Object obj, s sVar2, Date date) {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(sVar, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            Set findCRLs = PKIXCRLUtil.findCRLs(new m.b(x509CRLSelector).h(true).g(), date, sVar2.m(), sVar2.k());
            checkCRLsNotEmpty(oVar, findCRLs, obj);
            return findCRLs;
        } catch (AnnotatedException e11) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<e60.l> list2, i60.c cVar) {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                n extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger r11 = extensionValue != null ? org.bouncycastle.asn1.i.p(extensionValue).r() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(r11 != null ? r11.add(BigInteger.valueOf(1L)) : null);
                    m.b bVar = new m.b(x509CRLSelector);
                    bVar.i(extensionValue2);
                    bVar.j(true);
                    bVar.k(r11);
                    m<? extends CRL> g11 = bVar.g();
                    Set<X509CRL> findCRLs = PKIXCRLUtil.findCRLs(g11, date, list, list2);
                    if (findCRLs.isEmpty() && j.c("org.bouncycastle.x509.enableCRLDP")) {
                        try {
                            CertificateFactory createCertificateFactory = cVar.createCertificateFactory("X.509");
                            e50.s[] e11 = k.f(extensionValue2).e();
                            for (int i11 = 0; i11 < e11.length; i11++) {
                                t h11 = e11[i11].h();
                                if (h11 != null && h11.j() == 0) {
                                    w[] i12 = x.f(h11.i()).i();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < i12.length) {
                                            w wVar = i12[i11];
                                            if (wVar.j() == 6) {
                                                try {
                                                    e60.l crl = CrlCache.getCrl(createCertificateFactory, date, new URI(((g) wVar.i()).getString()));
                                                    if (crl != null) {
                                                        findCRLs = PKIXCRLUtil.findCRLs(g11, date, Collections.EMPTY_LIST, Collections.singletonList(crl));
                                                    }
                                                } catch (Exception unused) {
                                                    continue;
                                                }
                                            }
                                            i13++;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            throw new AnnotatedException("cannot create certificate factory: " + e12.getMessage(), e12);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : findCRLs) {
                        if (isDeltaCRL(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e13) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e13);
                }
            } catch (Exception e14) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e14);
            }
        } catch (IOException e15) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static n getExtensionValue(X509Extension x509Extension, String str) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PublicKey getNextWorkingKey(List list, int i11, i60.c cVar) {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i11)).getPublicKey();
        if (publicKey instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
            if (dSAPublicKey2.getParams() != null) {
                return dSAPublicKey2;
            }
            do {
                i11++;
                if (i11 >= list.size()) {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
                PublicKey publicKey2 = ((X509Certificate) list.get(i11)).getPublicKey();
                if (!(publicKey2 instanceof DSAPublicKey)) {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
                dSAPublicKey = (DSAPublicKey) publicKey2;
            } while (dSAPublicKey.getParams() == null);
            DSAParams params = dSAPublicKey.getParams();
            try {
                return cVar.createKeyFactory("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }
        return publicKey;
    }

    private static n getObject(String str, byte[] bArr) {
        try {
            return n.k(org.bouncycastle.asn1.l.p(bArr).r());
        } catch (Exception e11) {
            throw new AnnotatedException("exception processing extension " + str, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Set getQualifierSet(org.bouncycastle.asn1.p pVar) {
        HashSet hashSet = new HashSet();
        if (pVar == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        org.bouncycastle.asn1.m a11 = org.bouncycastle.asn1.m.a(byteArrayOutputStream);
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            try {
                a11.s((e40.b) s11.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e11) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e11);
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Date getValidCertDateFromValidityModel(Date date, int i11, CertPath certPath, int i12) {
        if (1 != i11 || i12 <= 0) {
            return date;
        }
        int i13 = i12 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i13);
        if (i13 == 0) {
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i13)).getExtensionValue(a.f23746d.t());
                org.bouncycastle.asn1.g t11 = extensionValue != null ? org.bouncycastle.asn1.g.t(n.k(extensionValue)) : null;
                if (t11 != null) {
                    try {
                        return t11.s();
                    } catch (ParseException e11) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e11);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return x509Certificate.getNotBefore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Date getValidityDate(s sVar, Date date) {
        Date u11 = sVar.u();
        return u11 == null ? date : u11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) {
        try {
            return findTrustAnchor(x509Certificate, set, str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    protected static void prepareNextCertB1(int i11, List[] listArr, String str, Map map, X509Certificate x509Certificate) {
        boolean z11;
        Iterator it2 = listArr[i11].iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = false;
                break;
            }
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it2.next();
            if (pKIXPolicyNode.getValidPolicy().equals(str)) {
                z11 = true;
                pKIXPolicyNode.expectedPolicies = (Set) map.get(str);
                break;
            }
        }
        if (z11) {
            return;
        }
        for (PKIXPolicyNode pKIXPolicyNode2 : listArr[i11]) {
            if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                Set set = null;
                try {
                    Enumeration s11 = org.bouncycastle.asn1.p.p(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).s();
                    while (true) {
                        if (!s11.hasMoreElements()) {
                            break;
                        }
                        try {
                            i0 e11 = i0.e(s11.nextElement());
                            if ("2.5.29.32.0".equals(e11.f().t())) {
                                try {
                                    set = getQualifierSet(e11.h());
                                    break;
                                } catch (CertPathValidatorException e12) {
                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e12);
                                }
                            }
                        } catch (Exception e13) {
                            throw new AnnotatedException("Policy information cannot be decoded.", e13);
                        }
                    }
                    Set set2 = set;
                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : false;
                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                    if ("2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                        PKIXPolicyNode pKIXPolicyNode4 = new PKIXPolicyNode(new ArrayList(), i11, (Set) map.get(str), pKIXPolicyNode3, set2, str, contains);
                        pKIXPolicyNode3.addChild(pKIXPolicyNode4);
                        listArr[i11].add(pKIXPolicyNode4);
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    throw new AnnotatedException("Certificate policies cannot be decoded.", e14);
                }
            }
        }
    }

    protected static PKIXPolicyNode prepareNextCertB2(int i11, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        int i12;
        Iterator it2 = listArr[i11].iterator();
        while (it2.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) it2.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                ((PKIXPolicyNode) pKIXPolicyNode2.getParent()).removeChild(pKIXPolicyNode2);
                it2.remove();
                for (int i13 = i11 - 1; i13 >= 0; i13--) {
                    List list = listArr[i13];
                    while (i12 < list.size()) {
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i12);
                        i12 = (pKIXPolicyNode3.hasChildren() || (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) != null) ? i12 + 1 : 0;
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean processCertD1i(int i11, List[] listArr, org.bouncycastle.asn1.k kVar, Set set) {
        List list = listArr[i11 - 1];
        for (int i12 = 0; i12 < list.size(); i12++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i12);
            if (pKIXPolicyNode.getExpectedPolicies().contains(kVar.t())) {
                HashSet hashSet = new HashSet();
                hashSet.add(kVar.t());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i11, hashSet, pKIXPolicyNode, set, kVar.t(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i11].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void processCertD1ii(int i11, List[] listArr, org.bouncycastle.asn1.k kVar, Set set) {
        List list = listArr[i11 - 1];
        for (int i12 = 0; i12 < list.size(); i12++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i12);
            if ("2.5.29.32.0".equals(pKIXPolicyNode.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(kVar.t());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i11, hashSet, pKIXPolicyNode, set, kVar.t(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i11].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i11 = 0; i11 < listArr.length; i11++) {
            listArr[i11] = new ArrayList();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }
}
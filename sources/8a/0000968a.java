package org.bouncycastle.jce.provider;

import c50.e;
import e40.g;
import e50.c0;
import e50.h;
import e50.m0;
import e50.u;
import e50.w;
import e60.n;
import e60.o;
import i40.a;
import i60.c;
import i60.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.spongycastle.asn1.ASN1Encoding;
import r70.j;
import v40.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ProvOcspRevocationChecker implements n {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final c helper;
    private boolean isEnabledOCSP;
    private String ocspURL;
    private o parameters;
    private final ProvRevocationChecker parent;

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        hashMap.put(new k("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(w40.n.C1, "SHA224WITHRSA");
        hashMap.put(w40.n.f55559z1, "SHA256WITHRSA");
        hashMap.put(w40.n.A1, "SHA384WITHRSA");
        hashMap.put(w40.n.B1, "SHA512WITHRSA");
        hashMap.put(a.f29851n, "GOST3411WITHGOST3410");
        hashMap.put(a.f29852o, "GOST3411WITHECGOST3410");
        hashMap.put(x40.a.f57035i, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(x40.a.f57036j, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(a60.a.f293d, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(a60.a.f294e, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(a60.a.f295f, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(a60.a.f296g, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(a60.a.f297h, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(a60.a.f298i, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(c60.a.f8911i, "SHA1WITHCVC-ECDSA");
        hashMap.put(c60.a.f8912j, "SHA224WITHCVC-ECDSA");
        hashMap.put(c60.a.f8913k, "SHA256WITHCVC-ECDSA");
        hashMap.put(c60.a.f8914l, "SHA384WITHCVC-ECDSA");
        hashMap.put(c60.a.f8915m, "SHA512WITHCVC-ECDSA");
        hashMap.put(n40.a.f40491a, "XMSS");
        hashMap.put(n40.a.f40492b, "XMSSMT");
        hashMap.put(new k("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new k("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new k("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(f50.o.f25889f0, "SHA1WITHECDSA");
        hashMap.put(f50.o.f25893j0, "SHA224WITHECDSA");
        hashMap.put(f50.o.f25894k0, "SHA256WITHECDSA");
        hashMap.put(f50.o.f25895l0, "SHA384WITHECDSA");
        hashMap.put(f50.o.f25896m0, "SHA512WITHECDSA");
        hashMap.put(b.f54053h, "SHA1WITHRSA");
        hashMap.put(b.f54052g, "SHA1WITHDSA");
        hashMap.put(r40.b.S, "SHA224WITHDSA");
        hashMap.put(r40.b.T, "SHA256WITHDSA");
    }

    public ProvOcspRevocationChecker(ProvRevocationChecker provRevocationChecker, c cVar) {
        this.parent = provRevocationChecker;
        this.helper = cVar;
    }

    private static byte[] calcKeyHash(MessageDigest messageDigest, PublicKey publicKey) {
        return messageDigest.digest(m0.h(publicKey.getEncoded()).i().q());
    }

    private u40.b createCertID(e50.b bVar, e50.n nVar, i iVar) {
        try {
            MessageDigest a11 = this.helper.a(d.a(bVar.e()));
            return new u40.b(bVar, new s0(a11.digest(nVar.o().d(ASN1Encoding.DER))), new s0(a11.digest(nVar.p().i().q())), iVar);
        } catch (Exception e11) {
            throw new CertPathValidatorException("problem creating ID: " + e11, e11);
        }
    }

    private u40.b createCertID(u40.b bVar, e50.n nVar, i iVar) {
        return createCertID(bVar.e(), nVar, iVar);
    }

    private e50.n extractCert() {
        try {
            return e50.n.f(this.parameters.d().getEncoded());
        } catch (Exception e11) {
            throw new CertPathValidatorException("cannot process signing cert: " + e11.getMessage(), e11, this.parameters.a(), this.parameters.b());
        }
    }

    private static String getDigestName(k kVar) {
        String a11 = d.a(kVar);
        int indexOf = a11.indexOf(45);
        if (indexOf <= 0 || a11.startsWith("SHA3")) {
            return a11;
        }
        return a11.substring(0, indexOf) + a11.substring(indexOf + 1);
    }

    static URI getOcspResponderURI(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(u.f24799z.t());
        if (extensionValue == null) {
            return null;
        }
        e50.a[] f11 = h.h(l.p(extensionValue).r()).f();
        for (int i11 = 0; i11 != f11.length; i11++) {
            e50.a aVar = f11[i11];
            if (e50.a.f24655c.j(aVar.f())) {
                w e11 = aVar.e();
                if (e11.j() == 6) {
                    try {
                        return new URI(((g) e11.i()).getString());
                    } catch (URISyntaxException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String getSignatureName(e50.b bVar) {
        e40.b i11 = bVar.i();
        if (i11 == null || q0.f43085a.i(i11) || !bVar.e().j(w40.n.f55557w1)) {
            Map map = oids;
            boolean containsKey = map.containsKey(bVar.e());
            k e11 = bVar.e();
            return containsKey ? (String) map.get(e11) : e11.t();
        }
        w40.u f11 = w40.u.f(i11);
        return getDigestName(f11.e().e()) + "WITHRSAANDMGF1";
    }

    private static X509Certificate getSignerCert(u40.a aVar, X509Certificate x509Certificate, X509Certificate x509Certificate2, c cVar) {
        u40.i f11 = aVar.j().f();
        byte[] f12 = f11.f();
        if (f12 != null) {
            MessageDigest a11 = cVar.a("SHA1");
            if (x509Certificate2 == null || !org.bouncycastle.util.a.c(f12, calcKeyHash(a11, x509Certificate2.getPublicKey()))) {
                if (x509Certificate == null || !org.bouncycastle.util.a.c(f12, calcKeyHash(a11, x509Certificate.getPublicKey()))) {
                    return null;
                }
                return x509Certificate;
            }
            return x509Certificate2;
        }
        e eVar = d50.b.Q;
        c50.c e11 = c50.c.e(eVar, f11.h());
        if (x509Certificate2 == null || !e11.equals(c50.c.e(eVar, x509Certificate2.getSubjectX500Principal().getEncoded()))) {
            if (x509Certificate == null || !e11.equals(c50.c.e(eVar, x509Certificate.getSubjectX500Principal().getEncoded()))) {
                return null;
            }
            return x509Certificate;
        }
        return x509Certificate2;
    }

    private static boolean responderMatches(u40.i iVar, X509Certificate x509Certificate, c cVar) {
        byte[] f11 = iVar.f();
        if (f11 != null) {
            return org.bouncycastle.util.a.c(f11, calcKeyHash(cVar.a("SHA1"), x509Certificate.getPublicKey()));
        }
        e eVar = d50.b.Q;
        return c50.c.e(eVar, iVar.h()).equals(c50.c.e(eVar, x509Certificate.getSubjectX500Principal().getEncoded()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean validatedOcspResponse(u40.a aVar, o oVar, byte[] bArr, X509Certificate x509Certificate, c cVar) {
        try {
            p e11 = aVar.e();
            Signature createSignature = cVar.createSignature(getSignatureName(aVar.i()));
            X509Certificate signerCert = getSignerCert(aVar, oVar.d(), x509Certificate, cVar);
            if (signerCert == null && e11 == null) {
                throw new CertPathValidatorException("OCSP responder certificate not found");
            }
            if (signerCert != null) {
                createSignature.initVerify(signerCert.getPublicKey());
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) cVar.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(e11.r(0).toASN1Primitive().getEncoded()));
                x509Certificate2.verify(oVar.d().getPublicKey());
                x509Certificate2.checkValidity(oVar.e());
                if (!responderMatches(aVar.j().f(), x509Certificate2, cVar)) {
                    throw new CertPathValidatorException("responder certificate does not match responderID", null, oVar.a(), oVar.b());
                }
                List<String> extendedKeyUsage = x509Certificate2.getExtendedKeyUsage();
                if (extendedKeyUsage == null || !extendedKeyUsage.contains(c0.f24673c.e())) {
                    throw new CertPathValidatorException("responder certificate not valid for signing OCSP responses", null, oVar.a(), oVar.b());
                }
                createSignature.initVerify(x509Certificate2);
            }
            createSignature.update(aVar.j().d(ASN1Encoding.DER));
            if (createSignature.verify(aVar.h().q())) {
                if (bArr != null && !org.bouncycastle.util.a.c(bArr, aVar.j().h().e(u40.d.f53147c).h().r())) {
                    throw new CertPathValidatorException("nonce mismatch in OCSP response", null, oVar.a(), oVar.b());
                }
                return true;
            }
            return false;
        } catch (IOException e12) {
            throw new CertPathValidatorException("OCSP response failure: " + e12.getMessage(), e12, oVar.a(), oVar.b());
        } catch (CertPathValidatorException e13) {
            throw e13;
        } catch (GeneralSecurityException e14) {
            throw new CertPathValidatorException("OCSP response failure: " + e14.getMessage(), e14, oVar.a(), oVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
        if (r0.e().equals(r1.e().e()) != false) goto L59;
     */
    @Override // e60.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void check(java.security.cert.Certificate r12) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.ProvOcspRevocationChecker.check(java.security.cert.Certificate):void");
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return null;
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z11) {
        if (z11) {
            throw new CertPathValidatorException("forward checking not supported");
        }
        this.parameters = null;
        this.isEnabledOCSP = j.c("ocsp.enable");
        this.ocspURL = j.b("ocsp.responderURL");
    }

    @Override // e60.n
    public void initialize(o oVar) {
        this.parameters = oVar;
        this.isEnabledOCSP = j.c("ocsp.enable");
        this.ocspURL = j.b("ocsp.responderURL");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
package org.bouncycastle.jce.provider;

import e60.n;
import e60.o;
import i40.a;
import i60.c;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.k;
import v40.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ProvRevocationChecker extends PKIXRevocationChecker implements n {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final ProvCrlRevocationChecker crlChecker;
    private final c helper;
    private final ProvOcspRevocationChecker ocspChecker;
    private o parameters;

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

    public ProvRevocationChecker(c cVar) {
        this.helper = cVar;
        this.crlChecker = new ProvCrlRevocationChecker(cVar);
        this.ocspChecker = new ProvOcspRevocationChecker(this, cVar);
    }

    private boolean hasOption(PKIXRevocationChecker.Option option) {
        return getOptions().contains(option);
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!hasOption(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (hasOption(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.crlChecker.check(certificate);
                    return;
                } catch (RecoverableCertPathValidatorException e11) {
                    if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        throw e11;
                    }
                    this.ocspChecker.check(certificate);
                    return;
                }
            }
            try {
                this.ocspChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e12) {
                if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    throw e12;
                }
                this.crlChecker.check(certificate);
            }
        }
    }

    @Override // java.security.cert.PKIXRevocationChecker
    public List<CertPathValidatorException> getSoftFailExceptions() {
        return this.ocspChecker.getSoftFailExceptions();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z11) {
        this.parameters = null;
        this.crlChecker.init(z11);
        this.ocspChecker.init(z11);
    }

    @Override // e60.n
    public void initialize(o oVar) {
        this.parameters = oVar;
        this.crlChecker.initialize(oVar);
        this.ocspChecker.initialize(oVar);
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    public void setParameter(String str, Object obj) {
    }
}
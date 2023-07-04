package e60;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;

/* loaded from: classes5.dex */
public class m<T extends CRL> implements r70.k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CRLSelector f24879a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24880b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24881c;

    /* renamed from: d  reason: collision with root package name */
    private final BigInteger f24882d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f24883e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f24884f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final CRLSelector f24885a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24886b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f24887c = false;

        /* renamed from: d  reason: collision with root package name */
        private BigInteger f24888d = null;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f24889e = null;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24890f = false;

        public b(CRLSelector cRLSelector) {
            this.f24885a = (CRLSelector) cRLSelector.clone();
        }

        public m<? extends CRL> g() {
            return new m<>(this);
        }

        public b h(boolean z11) {
            this.f24887c = z11;
            return this;
        }

        public void i(byte[] bArr) {
            this.f24889e = org.bouncycastle.util.a.h(bArr);
        }

        public void j(boolean z11) {
            this.f24890f = z11;
        }

        public void k(BigInteger bigInteger) {
            this.f24888d = bigInteger;
        }
    }

    /* loaded from: classes5.dex */
    private static class c extends X509CRLSelector {

        /* renamed from: a  reason: collision with root package name */
        private final m f24891a;

        c(m mVar) {
            this.f24891a = mVar;
            if (mVar.f24879a instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) mVar.f24879a;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            m mVar = this.f24891a;
            return mVar == null ? crl != null : mVar.match(crl);
        }
    }

    private m(b bVar) {
        this.f24879a = bVar.f24885a;
        this.f24880b = bVar.f24886b;
        this.f24881c = bVar.f24887c;
        this.f24882d = bVar.f24888d;
        this.f24883e = bVar.f24889e;
        this.f24884f = bVar.f24890f;
    }

    public static Collection<? extends CRL> b(m mVar, CertStore certStore) {
        return certStore.getCRLs(new c(mVar));
    }

    public X509Certificate c() {
        CRLSelector cRLSelector = this.f24879a;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    @Override // r70.k
    public Object clone() {
        return this;
    }

    public boolean d() {
        return this.f24881c;
    }

    public boolean e() {
        return this.f24880b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (org.bouncycastle.util.a.c(r0, r1) == false) goto L34;
     */
    @Override // r70.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean match(java.security.cert.CRL r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.security.cert.X509CRL
            if (r0 != 0) goto Lb
        L4:
            java.security.cert.CRLSelector r0 = r4.f24879a
            boolean r5 = r0.match(r5)
            return r5
        Lb:
            r0 = r5
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0
            r1 = 0
            r2 = 0
            org.bouncycastle.asn1.k r3 = e50.u.f24787j     // Catch: java.lang.Exception -> L69
            java.lang.String r3 = r3.t()     // Catch: java.lang.Exception -> L69
            byte[] r3 = r0.getExtensionValue(r3)     // Catch: java.lang.Exception -> L69
            if (r3 == 0) goto L28
            org.bouncycastle.asn1.l r1 = org.bouncycastle.asn1.l.p(r3)     // Catch: java.lang.Exception -> L69
            byte[] r1 = r1.r()     // Catch: java.lang.Exception -> L69
            org.bouncycastle.asn1.i r1 = org.bouncycastle.asn1.i.p(r1)     // Catch: java.lang.Exception -> L69
        L28:
            boolean r3 = r4.e()
            if (r3 == 0) goto L31
            if (r1 != 0) goto L31
            return r2
        L31:
            boolean r3 = r4.d()
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            return r2
        L3a:
            if (r1 == 0) goto L4e
            java.math.BigInteger r3 = r4.f24882d
            if (r3 == 0) goto L4e
            java.math.BigInteger r1 = r1.r()
            java.math.BigInteger r3 = r4.f24882d
            int r1 = r1.compareTo(r3)
            r3 = 1
            if (r1 != r3) goto L4e
            return r2
        L4e:
            boolean r1 = r4.f24884f
            if (r1 == 0) goto L4
            org.bouncycastle.asn1.k r1 = e50.u.f24788k
            java.lang.String r1 = r1.t()
            byte[] r0 = r0.getExtensionValue(r1)
            byte[] r1 = r4.f24883e
            if (r1 != 0) goto L63
            if (r0 == 0) goto L4
            return r2
        L63:
            boolean r0 = org.bouncycastle.util.a.c(r0, r1)
            if (r0 != 0) goto L4
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e60.m.match(java.security.cert.CRL):boolean");
    }
}
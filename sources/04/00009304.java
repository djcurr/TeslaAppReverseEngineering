package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import e50.b0;
import e50.n0;
import e50.o;
import e50.t0;
import e50.u;
import e50.v;
import e50.x;
import e60.e;
import i60.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.util.a;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;

/* loaded from: classes5.dex */
abstract class X509CRLImpl extends X509CRL {
    protected c bcHelper;

    /* renamed from: c  reason: collision with root package name */
    protected o f43177c;
    protected boolean isIndirect;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLImpl(c cVar, o oVar, String str, byte[] bArr, boolean z11) {
        this.bcHelper = cVar;
        this.f43177c = oVar;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z11;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, b bVar, byte[] bArr) {
        if (bVar != null) {
            X509SignatureUtil.setSignatureParameters(signature, bVar);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(g60.c.a(signature), 512);
            this.f43177c.m().c(bufferedOutputStream, ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e11) {
            throw new CRLException(e11.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) {
        if (!this.f43177c.k().equals(this.f43177c.m().k())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i11 = 0;
        if ((publicKey instanceof e) && X509SignatureUtil.isCompositeAlgorithm(this.f43177c.k())) {
            List<PublicKey> a11 = ((e) publicKey).a();
            p p11 = p.p(this.f43177c.k().i());
            p p12 = p.p(j0.v(this.f43177c.j()).q());
            boolean z11 = false;
            while (i11 != a11.size()) {
                if (a11.get(i11) != null) {
                    e50.b f11 = e50.b.f(p11.r(i11));
                    try {
                        checkSignature(a11.get(i11), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(f11)), f11.i(), j0.v(p12.r(i11)).q());
                        e = null;
                        z11 = true;
                    } catch (SignatureException e11) {
                        e = e11;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i11++;
            }
            if (!z11) {
                throw new InvalidKeyException("no matching key found");
            }
        } else if (!X509SignatureUtil.isCompositeAlgorithm(this.f43177c.k())) {
            Signature createSignature = signatureCreator.createSignature(getSigAlgName());
            byte[] bArr = this.sigAlgParams;
            if (bArr == null) {
                checkSignature(publicKey, createSignature, null, getSignature());
                return;
            }
            try {
                checkSignature(publicKey, createSignature, n.k(bArr), getSignature());
            } catch (IOException e12) {
                throw new SignatureException("cannot decode signature parameters: " + e12.getMessage());
            }
        } else {
            p p13 = p.p(this.f43177c.k().i());
            p p14 = p.p(j0.v(this.f43177c.j()).q());
            boolean z12 = false;
            while (i11 != p14.size()) {
                e50.b f12 = e50.b.f(p13.r(i11));
                try {
                    checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(f12)), f12.i(), j0.v(p14.r(i11)).q());
                    e = null;
                    z12 = true;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    e = null;
                } catch (SignatureException e13) {
                    e = e13;
                }
                if (e != null) {
                    throw e;
                }
                i11++;
            }
            if (!z12) {
                throw new InvalidKeyException("no matching key found");
            }
        }
    }

    private Set getExtensionOIDs(boolean z11) {
        v e11;
        if (getVersion() != 2 || (e11 = this.f43177c.m().e()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration i11 = e11.i();
        while (i11.hasMoreElements()) {
            k kVar = (k) i11.nextElement();
            if (z11 == e11.e(kVar).k()) {
                hashSet.add(kVar.t());
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getExtensionOctets(o oVar, String str) {
        l extensionValue = getExtensionValue(oVar, str);
        if (extensionValue != null) {
            return extensionValue.r();
        }
        return null;
    }

    protected static l getExtensionValue(o oVar, String str) {
        u e11;
        v e12 = oVar.m().e();
        if (e12 == null || (e11 = e12.e(new k(str))) == null) {
            return null;
        }
        return e11.h();
    }

    private Set loadCRLEntries() {
        u e11;
        HashSet hashSet = new HashSet();
        Enumeration i11 = this.f43177c.i();
        c50.c cVar = null;
        while (i11.hasMoreElements()) {
            n0.b bVar = (n0.b) i11.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.j() && (e11 = bVar.e().e(u.f24789l)) != null) {
                cVar = c50.c.f(x.f(e11.j()).i()[0].i());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        l extensionValue = getExtensionValue(this.f43177c, str);
        if (extensionValue != null) {
            try {
                return extensionValue.getEncoded();
            } catch (Exception e11) {
                throw new IllegalStateException("error parsing " + e11.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new j60.e(c50.c.f(this.f43177c.f().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f43177c.f().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        t0 h11 = this.f43177c.h();
        if (h11 == null) {
            return null;
        }
        return h11.e();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u e11;
        Enumeration i11 = this.f43177c.i();
        c50.c cVar = null;
        while (i11.hasMoreElements()) {
            n0.b bVar = (n0.b) i11.nextElement();
            if (bVar.i().u(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.j() && (e11 = bVar.e().e(u.f24789l)) != null) {
                cVar = c50.c.f(x.f(e11.j()).i()[0].i());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (loadCRLEntries.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(loadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f43177c.k().e().t();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return a.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f43177c.j().r();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        try {
            return this.f43177c.m().d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CRLException(e11.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f43177c.n().e();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f43177c.o();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(u.f24788k.t());
        criticalExtensionOIDs.remove(u.f24787j.t());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        c50.c i11;
        u e11;
        if (certificate.getType().equals("X.509")) {
            Enumeration i12 = this.f43177c.i();
            c50.c f11 = this.f43177c.f();
            if (i12.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (i12.hasMoreElements()) {
                    n0.b f12 = n0.b.f(i12.nextElement());
                    if (this.isIndirect && f12.j() && (e11 = f12.e().e(u.f24789l)) != null) {
                        f11 = c50.c.f(x.f(e11.j()).i()[0].i());
                    }
                    if (f12.i().u(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            i11 = c50.c.f(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                i11 = e50.n.f(certificate.getEncoded()).i();
                            } catch (CertificateEncodingException e12) {
                                throw new IllegalArgumentException("Cannot process certificate: " + e12.getMessage());
                            }
                        }
                        return f11.equals(i11);
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0143 -> B:7:0x0075). Please submit an issue!!! */
    @Override // java.security.cert.CRL
    public String toString() {
        String str;
        String c11;
        Object f11;
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d11);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d11);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(d11);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(d11);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d11);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d11);
        v e11 = this.f43177c.m().e();
        if (e11 != null) {
            Enumeration i11 = e11.i();
            if (i11.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(d11);
            }
            while (i11.hasMoreElements()) {
                k kVar = (k) i11.nextElement();
                u e12 = e11.e(kVar);
                if (e12.h() != null) {
                    h hVar = new h(e12.h().r());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(e12.k());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(kVar.t());
                        stringBuffer.append(" value = ");
                        str = "*****";
                    }
                    if (kVar.j(u.f24785h)) {
                        f11 = new e50.l(i.p(hVar.D()).r());
                    } else {
                        if (kVar.j(u.f24787j)) {
                            c11 = "Base CRL: " + new e50.l(i.p(hVar.D()).r());
                        } else if (kVar.j(u.f24788k)) {
                            f11 = b0.i(hVar.D());
                        } else if (kVar.j(u.f24791n)) {
                            f11 = e50.k.f(hVar.D());
                        } else if (kVar.j(u.f24797x)) {
                            f11 = e50.k.f(hVar.D());
                        } else {
                            stringBuffer.append(kVar.t());
                            stringBuffer.append(" value = ");
                            c11 = b50.a.c(hVar.D());
                        }
                        stringBuffer.append(c11);
                        stringBuffer.append(d11);
                    }
                    stringBuffer.append(f11);
                    stringBuffer.append(d11);
                } else {
                    stringBuffer.append(d11);
                }
            }
        }
        Set<Object> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object obj : revokedCertificates) {
                stringBuffer.append(obj);
                stringBuffer.append(d11);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    return provider != null ? Signature.getInstance(X509CRLImpl.this.getSigAlgName(), provider) : Signature.getInstance(X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e11) {
            throw new NoSuchAlgorithmException("provider issue: " + e11.getMessage());
        }
    }
}
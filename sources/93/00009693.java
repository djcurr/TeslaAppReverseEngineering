package org.bouncycastle.jce.provider;

import b50.a;
import c50.c;
import e50.b0;
import e50.n;
import e50.n0;
import e50.o;
import e50.u;
import e50.v;
import e50.x;
import j60.e;
import java.io.IOException;
import java.math.BigInteger;
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
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.util.encoders.b;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;

/* loaded from: classes5.dex */
public class X509CRLObject extends X509CRL {

    /* renamed from: c  reason: collision with root package name */
    private o f43205c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    public X509CRLObject(o oVar) {
        this.f43205c = oVar;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(oVar.k());
            if (oVar.k().i() != null) {
                this.sigAlgParams = oVar.k().i().toASN1Primitive().d(ASN1Encoding.DER);
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e11) {
            throw new CRLException("CRL contents invalid: " + e11);
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) {
        if (!this.f43205c.k().equals(this.f43205c.m().k())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    private Set getExtensionOIDs(boolean z11) {
        v e11;
        if (getVersion() != 2 || (e11 = this.f43205c.m().e()) == null) {
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

    public static boolean isIndirectCRL(X509CRL x509crl) {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(u.f24788k.t());
            if (extensionValue != null) {
                if (b0.i(l.p(extensionValue).r()).k()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e11);
        }
    }

    private Set loadCRLEntries() {
        u e11;
        HashSet hashSet = new HashSet();
        Enumeration i11 = this.f43205c.i();
        c cVar = null;
        while (i11.hasMoreElements()) {
            n0.b bVar = (n0.b) i11.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.j() && (e11 = bVar.e().e(u.f24789l)) != null) {
                cVar = c.f(x.f(e11.j()).i()[0].i());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRL) {
            if (obj instanceof X509CRLObject) {
                X509CRLObject x509CRLObject = (X509CRLObject) obj;
                if (this.isHashCodeSet && x509CRLObject.isHashCodeSet && x509CRLObject.hashCodeValue != this.hashCodeValue) {
                    return false;
                }
                return this.f43205c.equals(x509CRLObject.f43205c);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        try {
            return this.f43205c.d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CRLException(e11.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u e11;
        v e12 = this.f43205c.m().e();
        if (e12 == null || (e11 = e12.e(new k(str))) == null) {
            return null;
        }
        try {
            return e11.h().getEncoded();
        } catch (Exception e13) {
            throw new IllegalStateException("error parsing " + e13.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new e(c.f(this.f43205c.f().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f43205c.f().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f43205c.h() != null) {
            return this.f43205c.h().e();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u e11;
        Enumeration i11 = this.f43205c.i();
        c cVar = null;
        while (i11.hasMoreElements()) {
            n0.b bVar = (n0.b) i11.nextElement();
            if (bVar.i().u(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.j() && (e11 = bVar.e().e(u.f24789l)) != null) {
                cVar = c.f(x.f(e11.j()).i()[0].i());
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
        return this.f43205c.k().e().t();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.sigAlgParams;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f43205c.j().r();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        try {
            return this.f43205c.m().d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CRLException(e11.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f43205c.n().e();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f43205c.o();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        c i11;
        u e11;
        if (certificate.getType().equals("X.509")) {
            Enumeration i12 = this.f43205c.i();
            c f11 = this.f43205c.f();
            if (i12 != null) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (i12.hasMoreElements()) {
                    n0.b f12 = n0.b.f(i12.nextElement());
                    if (this.isIndirect && f12.j() && (e11 = f12.e().e(u.f24789l)) != null) {
                        f11 = c.f(x.f(e11.j()).i()[0].i());
                    }
                    if (f12.i().u(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            i11 = c.f(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                i11 = n.f(certificate.getEncoded()).i();
                            } catch (CertificateEncodingException unused) {
                                throw new RuntimeException("Cannot process certificate");
                            }
                        }
                        return f11.equals(i11);
                    }
                }
            }
            return false;
        }
        throw new RuntimeException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0182 -> B:15:0x00b4). Please submit an issue!!! */
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(b.e(signature, 0, 20)));
        stringBuffer.append(d11);
        int i11 = 20;
        while (i11 < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i11 < length ? new String(b.e(signature, i11, 20)) : new String(b.e(signature, i11, signature.length - i11)));
            stringBuffer.append(d11);
            i11 += 20;
        }
        v e11 = this.f43205c.m().e();
        if (e11 != null) {
            Enumeration i12 = e11.i();
            if (i12.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(d11);
            }
            while (i12.hasMoreElements()) {
                k kVar = (k) i12.nextElement();
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
                            c11 = a.c(hVar.D());
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
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
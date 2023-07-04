package org.bouncycastle.jcajce.provider.asymmetric.x509;

import b50.a;
import c50.c;
import e50.n0;
import e50.u;
import e50.v;
import e50.w;
import e50.x;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;

/* loaded from: classes5.dex */
class X509CRLEntryObject extends X509CRLEntry {

    /* renamed from: c  reason: collision with root package name */
    private n0.b f43176c;
    private c certificateIssuer;
    private volatile int hashValue;
    private volatile boolean hashValueSet;

    protected X509CRLEntryObject(n0.b bVar) {
        this.f43176c = bVar;
        this.certificateIssuer = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public X509CRLEntryObject(n0.b bVar, boolean z11, c cVar) {
        this.f43176c = bVar;
        this.certificateIssuer = loadCertificateIssuer(z11, cVar);
    }

    private u getExtension(k kVar) {
        v e11 = this.f43176c.e();
        if (e11 != null) {
            return e11.e(kVar);
        }
        return null;
    }

    private Set getExtensionOIDs(boolean z11) {
        v e11 = this.f43176c.e();
        if (e11 != null) {
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
        return null;
    }

    private c loadCertificateIssuer(boolean z11, c cVar) {
        if (z11) {
            u extension = getExtension(u.f24789l);
            if (extension == null) {
                return cVar;
            }
            try {
                w[] i11 = x.f(extension.j()).i();
                for (int i12 = 0; i12 < i11.length; i12++) {
                    if (i11[i12].j() == 4) {
                        return c.f(i11[i12].i());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLEntryObject) {
            X509CRLEntryObject x509CRLEntryObject = (X509CRLEntryObject) obj;
            if (this.hashValueSet && x509CRLEntryObject.hashValueSet && this.hashValue != x509CRLEntryObject.hashValue) {
                return false;
            }
            return this.f43176c.equals(x509CRLEntryObject.f43176c);
        }
        return super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() {
        try {
            return this.f43176c.d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CRLException(e11.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u extension = getExtension(new k(str));
        if (extension != null) {
            try {
                return extension.h().getEncoded();
            } catch (Exception e11) {
                throw new IllegalStateException("Exception encoding: " + e11.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f43176c.h().e();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f43176c.i().s();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f43176c.e() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object f11;
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d11);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(d11);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(d11);
        v e11 = this.f43176c.e();
        if (e11 != null) {
            Enumeration i11 = e11.i();
            if (i11.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    stringBuffer.append(str);
                    while (true) {
                        stringBuffer.append(d11);
                        while (i11.hasMoreElements()) {
                            k kVar = (k) i11.nextElement();
                            u e12 = e11.e(kVar);
                            if (e12.h() != null) {
                                h hVar = new h(e12.h().r());
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(e12.k());
                                stringBuffer.append(") ");
                                try {
                                    if (kVar.j(u.f24786i)) {
                                        f11 = e50.m.e(e.q(hVar.D()));
                                    } else if (kVar.j(u.f24789l)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        f11 = x.f(hVar.D());
                                    } else {
                                        stringBuffer.append(kVar.t());
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(a.c(hVar.D()));
                                        stringBuffer.append(d11);
                                    }
                                    stringBuffer.append(f11);
                                    stringBuffer.append(d11);
                                } catch (Exception unused) {
                                    stringBuffer.append(kVar.t());
                                    stringBuffer.append(" value = ");
                                    str = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
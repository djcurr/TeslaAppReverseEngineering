package v70;

import e50.u;
import e50.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class q implements h {

    /* renamed from: a  reason: collision with root package name */
    private e50.f f54364a;

    /* renamed from: b  reason: collision with root package name */
    private Date f54365b;

    /* renamed from: c  reason: collision with root package name */
    private Date f54366c;

    q(e50.f fVar) {
        this.f54364a = fVar;
        try {
            this.f54366c = fVar.e().e().f().s();
            this.f54365b = fVar.e().e().h().s();
        } catch (ParseException unused) {
            throw new IOException("invalid data structure in certificate!");
        }
    }

    public q(InputStream inputStream) {
        this(b(inputStream));
    }

    public q(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    private Set a(boolean z11) {
        v h11 = this.f54364a.e().h();
        if (h11 != null) {
            HashSet hashSet = new HashSet();
            Enumeration i11 = h11.i();
            while (i11.hasMoreElements()) {
                org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) i11.nextElement();
                if (h11.e(kVar).k() == z11) {
                    hashSet.add(kVar.t());
                }
            }
            return hashSet;
        }
        return null;
    }

    private static e50.f b(InputStream inputStream) {
        try {
            return e50.f.f(new org.bouncycastle.asn1.h(inputStream).D());
        } catch (IOException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new IOException("exception decoding certificate structure: " + e12.toString());
        }
    }

    @Override // v70.h
    public void checkValidity(Date date) {
        if (date.after(getNotAfter())) {
            throw new CertificateExpiredException("certificate expired on " + getNotAfter());
        } else if (date.before(getNotBefore())) {
            throw new CertificateNotYetValidException("certificate not valid till " + getNotBefore());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            try {
                return org.bouncycastle.util.a.c(getEncoded(), ((h) obj).getEncoded());
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // v70.h
    public f[] getAttributes(String str) {
        org.bouncycastle.asn1.p f11 = this.f54364a.e().f();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != f11.size(); i11++) {
            f fVar = new f(f11.r(i11));
            if (fVar.e().equals(str)) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // v70.h
    public byte[] getEncoded() {
        return this.f54364a.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u e11;
        v h11 = this.f54364a.e().h();
        if (h11 == null || (e11 = h11.e(new org.bouncycastle.asn1.k(str))) == null) {
            return null;
        }
        try {
            return e11.h().d(ASN1Encoding.DER);
        } catch (Exception e12) {
            throw new RuntimeException("error encoding " + e12.toString());
        }
    }

    @Override // v70.h
    public a getHolder() {
        return new a((org.bouncycastle.asn1.p) this.f54364a.e().i().toASN1Primitive());
    }

    @Override // v70.h
    public b getIssuer() {
        return new b(this.f54364a.e().k());
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // v70.h
    public Date getNotAfter() {
        return this.f54366c;
    }

    public Date getNotBefore() {
        return this.f54365b;
    }

    @Override // v70.h
    public BigInteger getSerialNumber() {
        return this.f54364a.e().m().s();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.a.F(getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }
}
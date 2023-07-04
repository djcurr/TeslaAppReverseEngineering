package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import e40.g;
import e50.d0;
import e50.j;
import e50.n;
import e50.o0;
import e50.u;
import e50.v;
import e50.w;
import e60.e;
import f60.a;
import i60.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.asn1.ASN1Encoding;
import q40.d;
import r70.f;
import r70.m;

/* loaded from: classes5.dex */
abstract class X509CertificateImpl extends X509Certificate implements a {
    protected j basicConstraints;
    protected c bcHelper;

    /* renamed from: c  reason: collision with root package name */
    protected n f43178c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateImpl(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = cVar;
        this.f43178c = nVar;
        this.basicConstraints = jVar;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, b bVar, byte[] bArr) {
        if (!isAlgIdEqual(this.f43178c.m(), this.f43178c.q().m())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, bVar);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(g60.c.a(signature), 512);
            this.f43178c.q().c(bufferedOutputStream, ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) {
        boolean z11 = publicKey instanceof e;
        int i11 = 0;
        if (z11 && X509SignatureUtil.isCompositeAlgorithm(this.f43178c.m())) {
            List<PublicKey> a11 = ((e) publicKey).a();
            p p11 = p.p(this.f43178c.m().i());
            p p12 = p.p(j0.v(this.f43178c.k()).q());
            boolean z12 = false;
            while (i11 != a11.size()) {
                if (a11.get(i11) != null) {
                    e50.b f11 = e50.b.f(p11.r(i11));
                    try {
                        checkSignature(a11.get(i11), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(f11)), f11.i(), j0.v(p12.r(i11)).q());
                        e = null;
                        z12 = true;
                    } catch (SignatureException e11) {
                        e = e11;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i11++;
            }
            if (!z12) {
                throw new InvalidKeyException("no matching key found");
            }
        } else if (!X509SignatureUtil.isCompositeAlgorithm(this.f43178c.m())) {
            Signature createSignature = signatureCreator.createSignature(X509SignatureUtil.getSignatureName(this.f43178c.m()));
            if (!z11) {
                checkSignature(publicKey, createSignature, this.f43178c.m().i(), getSignature());
                return;
            }
            List<PublicKey> a12 = ((e) publicKey).a();
            while (i11 != a12.size()) {
                try {
                    checkSignature(a12.get(i11), createSignature, this.f43178c.m().i(), getSignature());
                    return;
                } catch (InvalidKeyException unused) {
                    i11++;
                }
            }
            throw new InvalidKeyException("no matching signature found");
        } else {
            p p13 = p.p(this.f43178c.m().i());
            p p14 = p.p(j0.v(this.f43178c.k()).q());
            boolean z13 = false;
            while (i11 != p14.size()) {
                e50.b f12 = e50.b.f(p13.r(i11));
                try {
                    checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(f12)), f12.i(), j0.v(p14.r(i11)).q());
                    e = null;
                    z13 = true;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                    e = null;
                } catch (SignatureException e12) {
                    e = e12;
                }
                if (e != null) {
                    throw e;
                }
                i11++;
            }
            if (!z13) {
                throw new InvalidKeyException("no matching key found");
            }
        }
    }

    private static Collection getAlternativeNames(n nVar, String str) {
        String string;
        byte[] extensionOctets = getExtensionOctets(nVar, str);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration s11 = p.p(extensionOctets).s();
            while (s11.hasMoreElements()) {
                w f11 = w.f(s11.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(f.d(f11.j()));
                switch (f11.j()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(f11.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        string = ((g) f11.i()).getString();
                        arrayList2.add(string);
                        break;
                    case 4:
                        string = c50.c.e(d50.e.V, f11.i()).toString();
                        arrayList2.add(string);
                        break;
                    case 7:
                        try {
                            string = InetAddress.getByAddress(l.p(f11.i()).r()).getHostAddress();
                            arrayList2.add(string);
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        string = k.u(f11.i()).t();
                        arrayList2.add(string);
                        break;
                    default:
                        throw new IOException("Bad tag number: " + f11.j());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e11) {
            throw new CertificateParsingException(e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getExtensionOctets(n nVar, String str) {
        l extensionValue = getExtensionValue(nVar, str);
        if (extensionValue != null) {
            return extensionValue.r();
        }
        return null;
    }

    protected static l getExtensionValue(n nVar, String str) {
        u e11;
        v f11 = nVar.q().f();
        if (f11 == null || (e11 = f11.e(new k(str))) == null) {
            return null;
        }
        return e11.h();
    }

    private boolean isAlgIdEqual(e50.b bVar, e50.b bVar2) {
        if (bVar.e().j(bVar2.e())) {
            if (r70.j.c("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
                if (bVar.i() == null) {
                    return bVar2.i() == null || bVar2.i().equals(q0.f43085a);
                } else if (bVar2.i() == null) {
                    return bVar.i() == null || bVar.i().equals(q0.f43085a);
                }
            }
            if (bVar.i() != null) {
                return bVar.i().equals(bVar2.i());
            }
            if (bVar2.i() != null) {
                return bVar2.i().equals(bVar.i());
            }
            return true;
        }
        return false;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f43178c.e().h());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f43178c.n().h());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        j jVar = this.basicConstraints;
        if (jVar == null || !jVar.h()) {
            return -1;
        }
        if (this.basicConstraints.f() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.f().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            v f11 = this.f43178c.q().f();
            if (f11 != null) {
                Enumeration i11 = f11.i();
                while (i11.hasMoreElements()) {
                    k kVar = (k) i11.nextElement();
                    if (f11.e(kVar).k()) {
                        hashSet.add(kVar.t());
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        byte[] extensionOctets = getExtensionOctets(this.f43178c, "2.5.29.37");
        if (extensionOctets == null) {
            return null;
        }
        try {
            p p11 = p.p(org.bouncycastle.asn1.n.k(extensionOctets));
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 != p11.size(); i11++) {
                arrayList.add(((k) p11.r(i11)).t());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        l extensionValue = getExtensionValue(this.f43178c, str);
        if (extensionValue != null) {
            try {
                return extensionValue.getEncoded();
            } catch (Exception e11) {
                throw new IllegalStateException("error parsing " + e11.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(this.f43178c, u.f24783f.t());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new j60.e(this.f43178c.i());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        j0 j11 = this.f43178c.q().j();
        if (j11 != null) {
            byte[] q11 = j11.q();
            int length = (q11.length * 8) - j11.s();
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 != length; i11++) {
                zArr[i11] = (q11[i11 / 8] & (128 >>> (i11 % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // f60.a
    public c50.c getIssuerX500Name() {
        return this.f43178c.i();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f43178c.i().d(ASN1Encoding.DER));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return org.bouncycastle.util.a.o(this.keyUsage);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            v f11 = this.f43178c.q().f();
            if (f11 != null) {
                Enumeration i11 = f11.i();
                while (i11.hasMoreElements()) {
                    k kVar = (k) i11.nextElement();
                    if (!f11.e(kVar).k()) {
                        hashSet.add(kVar.t());
                    }
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f43178c.e().e();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f43178c.n().e();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f43178c.p());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f43178c.j().s();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f43178c.m().e().t();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return org.bouncycastle.util.a.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f43178c.k().r();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(this.f43178c, u.f24782e.t());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new j60.e(this.f43178c.o());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        j0 q11 = this.f43178c.q().q();
        if (q11 != null) {
            byte[] q12 = q11.q();
            int length = (q12.length * 8) - q11.s();
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 != length; i11++) {
                zArr[i11] = (q12[i11 / 8] & (128 >>> (i11 % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // f60.a
    public c50.c getSubjectX500Name() {
        return this.f43178c.o();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f43178c.o().d(ASN1Encoding.DER));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        try {
            return this.f43178c.q().d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }

    @Override // f60.a
    public o0 getTBSCertificateNative() {
        return this.f43178c.q();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f43178c.r();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        v f11;
        if (getVersion() != 3 || (f11 = this.f43178c.q().f()) == null) {
            return false;
        }
        Enumeration i11 = f11.i();
        while (i11.hasMoreElements()) {
            k kVar = (k) i11.nextElement();
            if (!kVar.j(u.f24781d) && !kVar.j(u.f24792o) && !kVar.j(u.f24793p) && !kVar.j(u.f24798y) && !kVar.j(u.f24791n) && !kVar.j(u.f24788k) && !kVar.j(u.f24787j) && !kVar.j(u.f24795t) && !kVar.j(u.f24784g) && !kVar.j(u.f24782e) && !kVar.j(u.f24790m) && f11.e(kVar).k()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object gVar;
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d11);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d11);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d11);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(d11);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(d11);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(d11);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(d11);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d11);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d11);
        v f11 = this.f43178c.q().f();
        if (f11 != null) {
            Enumeration i11 = f11.i();
            if (i11.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (i11.hasMoreElements()) {
                k kVar = (k) i11.nextElement();
                u e11 = f11.e(kVar);
                if (e11.h() != null) {
                    h hVar = new h(e11.h().r());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(e11.k());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(kVar.t());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                    if (kVar.j(u.f24784g)) {
                        gVar = j.e(hVar.D());
                    } else if (kVar.j(u.f24781d)) {
                        gVar = d0.e(hVar.D());
                    } else if (kVar.j(q40.c.f47456b)) {
                        gVar = new d(j0.v(hVar.D()));
                    } else if (kVar.j(q40.c.f47457c)) {
                        gVar = new q40.e(p0.p(hVar.D()));
                    } else if (kVar.j(q40.c.f47459e)) {
                        gVar = new q40.g(p0.p(hVar.D()));
                    } else {
                        stringBuffer.append(kVar.t());
                        stringBuffer.append(" value = ");
                        stringBuffer.append(b50.a.c(hVar.D()));
                        stringBuffer.append(d11);
                    }
                    stringBuffer.append(gVar);
                    stringBuffer.append(d11);
                }
                stringBuffer.append(d11);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final String str) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final Provider provider) {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    Provider provider2 = provider;
                    return provider2 != null ? Signature.getInstance(str, provider2) : Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e11) {
            throw new NoSuchAlgorithmException("provider issue: " + e11.getMessage());
        }
    }
}
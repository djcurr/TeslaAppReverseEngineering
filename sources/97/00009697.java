package org.bouncycastle.jce.provider;

import c50.c;
import d50.e;
import e40.g;
import e50.b;
import e50.d0;
import e50.j;
import e50.u;
import e50.v;
import e50.w;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
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
import k60.n;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.util.a;
import org.spongycastle.asn1.ASN1Encoding;
import q40.d;
import r70.f;
import r70.m;

/* loaded from: classes5.dex */
public class X509CertificateObject extends X509Certificate implements n {
    private n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private j basicConstraints;

    /* renamed from: c  reason: collision with root package name */
    private e50.n f43206c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(e50.n nVar) {
        this.f43206c = nVar;
        try {
            byte[] extensionBytes = getExtensionBytes("2.5.29.19");
            if (extensionBytes != null) {
                this.basicConstraints = j.e(org.bouncycastle.asn1.n.k(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes("2.5.29.15");
                if (extensionBytes2 == null) {
                    this.keyUsage = null;
                    return;
                }
                j0 v11 = j0.v(org.bouncycastle.asn1.n.k(extensionBytes2));
                byte[] q11 = v11.q();
                int length = (q11.length * 8) - v11.s();
                int i11 = 9;
                if (length >= 9) {
                    i11 = length;
                }
                this.keyUsage = new boolean[i11];
                for (int i12 = 0; i12 != length; i12++) {
                    this.keyUsage[i12] = (q11[i12 / 8] & (128 >>> (i12 % 8))) != 0;
                }
            } catch (Exception e11) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e11);
            }
        } catch (Exception e12) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e12);
        }
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i11 = 0;
            for (int i12 = 1; i12 < encoded.length; i12++) {
                i11 += encoded[i12] * i12;
            }
            return i11;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) {
        if (!isAlgIdEqual(this.f43206c.m(), this.f43206c.q().m())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.setSignatureParameters(signature, this.f43206c.m().i());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    private static Collection getAlternativeNames(byte[] bArr) {
        String string;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration s11 = p.p(bArr).s();
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
                        string = c.e(e.V, f11.i()).toString();
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

    private byte[] getExtensionBytes(String str) {
        u e11;
        v f11 = this.f43206c.q().f();
        if (f11 == null || (e11 = f11.e(new k(str))) == null) {
            return null;
        }
        return e11.h().r();
    }

    private boolean isAlgIdEqual(b bVar, b bVar2) {
        if (bVar.e().j(bVar2.e())) {
            return bVar.i() == null ? bVar2.i() == null || bVar2.i().equals(q0.f43085a) : bVar2.i() == null ? bVar.i() == null || bVar.i().equals(q0.f43085a) : bVar.i().equals(bVar2.i());
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
            throw new CertificateExpiredException("certificate expired on " + this.f43206c.e().h());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f43206c.n().h());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Certificate) {
            try {
                return a.c(getEncoded(), ((Certificate) obj).getEncoded());
            } catch (CertificateEncodingException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // k60.n
    public e40.b getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
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
            v f11 = this.f43206c.q().f();
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

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        try {
            return this.f43206c.d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        byte[] extensionBytes = getExtensionBytes("2.5.29.37");
        if (extensionBytes != null) {
            try {
                p pVar = (p) new h(extensionBytes).D();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 != pVar.size(); i11++) {
                    arrayList.add(((k) pVar.r(i11)).t());
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception unused) {
                throw new CertificateParsingException("error processing extended key usage extension");
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u e11;
        v f11 = this.f43206c.q().f();
        if (f11 == null || (e11 = f11.e(new k(str))) == null) {
            return null;
        }
        try {
            return e11.h().getEncoded();
        } catch (Exception e12) {
            throw new IllegalStateException("error parsing " + e12.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(u.f24783f.t()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new j60.e(this.f43206c.i());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        j0 j11 = this.f43206c.q().j();
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f43206c.i().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            v f11 = this.f43206c.q().f();
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
        return this.f43206c.e().e();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f43206c.n().e();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f43206c.p());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f43206c.j().s();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i11 = 0; i11 != providers.length; i11++) {
            Provider provider2 = providers[i11];
            String property2 = provider2.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f43206c.m().e().t();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f43206c.m().i() != null) {
            try {
                return this.f43206c.m().i().toASN1Primitive().d(ASN1Encoding.DER);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f43206c.k().r();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(u.f24782e.t()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new j60.e(this.f43206c.o());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        j0 q11 = this.f43206c.q().q();
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f43206c.o().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        try {
            return this.f43206c.q().d(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f43206c.r();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        v f11;
        if (getVersion() != 3 || (f11 = this.f43206c.q().f()) == null) {
            return false;
        }
        Enumeration i11 = f11.i();
        while (i11.hasMoreElements()) {
            k kVar = (k) i11.nextElement();
            String t11 = kVar.t();
            if (!t11.equals(RFC3280CertPathUtilities.KEY_USAGE) && !t11.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) && !t11.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) && !t11.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) && !t11.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) && !t11.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) && !t11.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) && !t11.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) && !t11.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) && !t11.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) && !t11.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) && f11.e(kVar).k()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = calculateHashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, e40.b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(org.bouncycastle.util.encoders.b.e(signature, 0, 20)));
        stringBuffer.append(d11);
        int i11 = 20;
        while (i11 < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i11 < length ? new String(org.bouncycastle.util.encoders.b.e(signature, i11, 20)) : new String(org.bouncycastle.util.encoders.b.e(signature, i11, signature.length - i11)));
            stringBuffer.append(d11);
            i11 += 20;
        }
        v f11 = this.f43206c.q().f();
        if (f11 != null) {
            Enumeration i12 = f11.i();
            if (i12.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (i12.hasMoreElements()) {
                k kVar = (k) i12.nextElement();
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
                        gVar = new d((j0) hVar.D());
                    } else if (kVar.j(q40.c.f47457c)) {
                        gVar = new q40.e((p0) hVar.D());
                    } else if (kVar.j(q40.c.f47459e)) {
                        gVar = new q40.g((p0) hVar.D());
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
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f43206c.m());
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        String signatureName = X509SignatureUtil.getSignatureName(this.f43206c.m());
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) {
        String signatureName = X509SignatureUtil.getSignatureName(this.f43206c.m());
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }
}
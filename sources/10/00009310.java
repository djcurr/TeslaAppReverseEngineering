package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import e50.j;
import i60.c;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import k60.n;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.util.a;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
class X509CertificateObject extends X509CertificateImpl implements n {
    private n attrCarrier;
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class X509CertificateEncodingException extends CertificateEncodingException {
        private final Throwable cause;

        X509CertificateEncodingException(Throwable th2) {
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CertificateObject(c cVar, e50.n nVar) {
        super(cVar, nVar, createBasicConstraints(nVar), createKeyUsage(nVar), createSigAlgName(nVar), createSigAlgParams(nVar));
        this.cacheLock = new Object();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private static j createBasicConstraints(e50.n nVar) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(nVar, "2.5.29.19");
            if (extensionOctets == null) {
                return null;
            }
            return j.e(org.bouncycastle.asn1.n.k(extensionOctets));
        } catch (Exception e11) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e11);
        }
    }

    private static boolean[] createKeyUsage(e50.n nVar) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(nVar, "2.5.29.15");
            if (extensionOctets == null) {
                return null;
            }
            j0 v11 = j0.v(org.bouncycastle.asn1.n.k(extensionOctets));
            byte[] q11 = v11.q();
            int length = (q11.length * 8) - v11.s();
            int i11 = 9;
            if (length >= 9) {
                i11 = length;
            }
            boolean[] zArr = new boolean[i11];
            for (int i12 = 0; i12 != length; i12++) {
                zArr[i12] = (q11[i12 / 8] & (128 >>> (i12 % 8))) != 0;
            }
            return zArr;
        } catch (Exception e11) {
            throw new CertificateParsingException("cannot construct KeyUsage: " + e11);
        }
    }

    private static String createSigAlgName(e50.n nVar) {
        try {
            return X509SignatureUtil.getSignatureName(nVar.m());
        } catch (Exception e11) {
            throw new CertificateParsingException("cannot construct SigAlgName: " + e11);
        }
    }

    private static byte[] createSigAlgParams(e50.n nVar) {
        try {
            b i11 = nVar.m().i();
            if (i11 == null) {
                return null;
            }
            return i11.toASN1Primitive().d(ASN1Encoding.DER);
        } catch (Exception e11) {
            throw new CertificateParsingException("cannot construct SigAlgParams: " + e11);
        }
    }

    private X509CertificateInternal getInternalCertificate() {
        byte[] bArr;
        X509CertificateEncodingException x509CertificateEncodingException;
        X509CertificateInternal x509CertificateInternal;
        synchronized (this.cacheLock) {
            X509CertificateInternal x509CertificateInternal2 = this.internalCertificateValue;
            if (x509CertificateInternal2 != null) {
                return x509CertificateInternal2;
            }
            try {
                x509CertificateEncodingException = null;
                bArr = this.f43178c.d(ASN1Encoding.DER);
            } catch (IOException e11) {
                bArr = null;
                x509CertificateEncodingException = new X509CertificateEncodingException(e11);
            }
            X509CertificateInternal x509CertificateInternal3 = new X509CertificateInternal(this.bcHelper, this.f43178c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, bArr, x509CertificateEncodingException);
            synchronized (this.cacheLock) {
                if (this.internalCertificateValue == null) {
                    this.internalCertificateValue = x509CertificateInternal3;
                }
                x509CertificateInternal = this.internalCertificateValue;
            }
            return x509CertificateInternal;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        long time = date.getTime();
        long[] validityValues = getValidityValues();
        if (time > validityValues[1]) {
            throw new CertificateExpiredException("certificate expired on " + this.f43178c.e().h());
        } else if (time >= validityValues[0]) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f43178c.n().h());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        X509CertificateInternal internalCertificate;
        j0 k11;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
            if (this.hashValueSet && x509CertificateObject.hashValueSet) {
                if (this.hashValue != x509CertificateObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCertificateValue == null || x509CertificateObject.internalCertificateValue == null) && (k11 = this.f43178c.k()) != null && !k11.j(x509CertificateObject.f43178c.k())) {
                return false;
            }
            internalCertificate = getInternalCertificate();
            obj = x509CertificateObject.getInternalCertificate();
        } else {
            internalCertificate = getInternalCertificate();
        }
        return internalCertificate.equals(obj);
    }

    @Override // k60.n
    public b getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return a.h(getInternalCertificate().getEncoded());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            X500Principal x500Principal2 = this.issuerValue;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.cacheLock) {
                if (this.issuerValue == null) {
                    this.issuerValue = issuerX500Principal;
                }
                x500Principal = this.issuerValue;
            }
            return x500Principal;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.cacheLock) {
            PublicKey publicKey2 = this.publicKeyValue;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.cacheLock) {
                if (this.publicKeyValue == null) {
                    this.publicKeyValue = publicKey3;
                }
                publicKey = this.publicKeyValue;
            }
            return publicKey;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            X500Principal x500Principal2 = this.subjectValue;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.cacheLock) {
                if (this.subjectValue == null) {
                    this.subjectValue = subjectX500Principal;
                }
                x500Principal = this.subjectValue;
            }
            return x500Principal;
        }
    }

    public long[] getValidityValues() {
        long[] jArr;
        synchronized (this.cacheLock) {
            long[] jArr2 = this.validityValues;
            if (jArr2 != null) {
                return jArr2;
            }
            long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
            synchronized (this.cacheLock) {
                if (this.validityValues == null) {
                    this.validityValues = jArr3;
                }
                jArr = this.validityValues;
            }
            return jArr;
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getInternalCertificate().getEncoded();
            int i11 = 0;
            for (int i12 = 1; i12 < encoded.length; i12++) {
                i11 += encoded[i12] * i12;
            }
            return i11;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }
}
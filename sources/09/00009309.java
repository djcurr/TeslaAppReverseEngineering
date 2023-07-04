package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import e50.b0;
import e50.o;
import e50.u;
import i60.c;
import java.io.IOException;
import java.security.cert.CRLException;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.util.a;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class X509CRLException extends CRLException {
        private final Throwable cause;

        X509CRLException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        X509CRLException(Throwable th2) {
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLObject(c cVar, o oVar) {
        super(cVar, oVar, createSigAlgName(oVar), createSigAlgParams(oVar), isIndirectCRL(oVar));
        this.cacheLock = new Object();
    }

    private static String createSigAlgName(o oVar) {
        try {
            return X509SignatureUtil.getSignatureName(oVar.k());
        } catch (Exception e11) {
            throw new X509CRLException("CRL contents invalid: " + e11.getMessage(), e11);
        }
    }

    private static byte[] createSigAlgParams(o oVar) {
        try {
            b i11 = oVar.k().i();
            if (i11 == null) {
                return null;
            }
            return i11.toASN1Primitive().d(ASN1Encoding.DER);
        } catch (Exception e11) {
            throw new CRLException("CRL contents invalid: " + e11);
        }
    }

    private X509CRLInternal getInternalCRL() {
        byte[] bArr;
        X509CRLException x509CRLException;
        X509CRLInternal x509CRLInternal;
        synchronized (this.cacheLock) {
            X509CRLInternal x509CRLInternal2 = this.internalCRLValue;
            if (x509CRLInternal2 != null) {
                return x509CRLInternal2;
            }
            try {
                x509CRLException = null;
                bArr = this.f43177c.d(ASN1Encoding.DER);
            } catch (IOException e11) {
                bArr = null;
                x509CRLException = new X509CRLException(e11);
            }
            X509CRLInternal x509CRLInternal3 = new X509CRLInternal(this.bcHelper, this.f43177c, this.sigAlgName, this.sigAlgParams, this.isIndirect, bArr, x509CRLException);
            synchronized (this.cacheLock) {
                if (this.internalCRLValue == null) {
                    this.internalCRLValue = x509CRLInternal3;
                }
                x509CRLInternal = this.internalCRLValue;
            }
            return x509CRLInternal;
        }
    }

    private static boolean isIndirectCRL(o oVar) {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(oVar, u.f24788k.t());
            if (extensionOctets == null) {
                return false;
            }
            return b0.i(extensionOctets).k();
        } catch (Exception e11) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e11);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        X509CRLInternal internalCRL;
        j0 j11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (this.hashValueSet && x509CRLObject.hashValueSet) {
                if (this.hashValue != x509CRLObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (j11 = this.f43177c.j()) != null && !j11.j(x509CRLObject.f43177c.j())) {
                return false;
            }
            internalCRL = getInternalCRL();
            obj = x509CRLObject.getInternalCRL();
        } else {
            internalCRL = getInternalCRL();
        }
        return internalCRL.equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        return a.h(getInternalCRL().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }
}
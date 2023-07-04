package org.spongycastle.cert.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import org.spongycastle.cert.X509CRLHolder;

/* loaded from: classes5.dex */
public class JcaX509CRLConverter {
    private CertHelper helper;

    /* loaded from: classes5.dex */
    private class ExCRLException extends CRLException {
        private Throwable cause;

        public ExCRLException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CRLConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509CRL getCRL(X509CRLHolder x509CRLHolder) {
        try {
            return (X509CRL) this.helper.getCertificateFactory("X.509").generateCRL(new ByteArrayInputStream(x509CRLHolder.getEncoded()));
        } catch (IOException e11) {
            throw new ExCRLException("exception parsing certificate: " + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new ExCRLException("cannot find required provider:" + e12.getMessage(), e12);
        } catch (CertificateException e13) {
            throw new ExCRLException("cannot create factory: " + e13.getMessage(), e13);
        }
    }

    public JcaX509CRLConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }

    public JcaX509CRLConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }
}
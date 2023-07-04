package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import e50.o;
import i60.a;
import i60.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import w40.n;
import w40.w;

/* loaded from: classes5.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final c bcHelper = new a();
    private q sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;
    private q sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private InputStream currentCrlStream = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        public ExCertificateException(Throwable th2) {
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    private CRL doGenerateCRL(InputStream inputStream, boolean z11) {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            q qVar = this.sCrlData;
            if (qVar != null) {
                if (this.sCrlDataObjectCount != qVar.size()) {
                    return getCRL();
                }
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(t70.a.c(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCRL(inputStream, z11) : readDERCRL(new h(inputStream, true));
        } catch (CRLException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new CRLException(e12.toString());
        }
    }

    private Certificate doGenerateCertificate(InputStream inputStream, boolean z11) {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            q qVar = this.sData;
            if (qVar != null) {
                if (this.sDataObjectCount != qVar.size()) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(t70.a.c(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCertificate(inputStream, z11) : readDERCertificate(new h(inputStream));
        } catch (Exception e11) {
            throw new ExCertificateException("parsing issue: " + e11.getMessage(), e11);
        }
    }

    private CRL getCRL() {
        q qVar = this.sCrlData;
        if (qVar == null || this.sCrlDataObjectCount >= qVar.size()) {
            return null;
        }
        q qVar2 = this.sCrlData;
        int i11 = this.sCrlDataObjectCount;
        this.sCrlDataObjectCount = i11 + 1;
        return createCRL(o.e(qVar2.s(i11)));
    }

    private CRL getCRL(p pVar) {
        if (pVar == null) {
            return null;
        }
        if (pVar.size() > 1 && (pVar.r(0) instanceof k) && pVar.r(0).equals(n.f55535i2)) {
            this.sCrlData = w.h(p.q((s) pVar.r(1), true)).e();
            return getCRL();
        }
        return createCRL(o.e(pVar));
    }

    private Certificate getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                q qVar = this.sData;
                int i11 = this.sDataObjectCount;
                this.sDataObjectCount = i11 + 1;
                b s11 = qVar.s(i11);
                if (s11 instanceof p) {
                    return new X509CertificateObject(this.bcHelper, e50.n.f(s11));
                }
            }
            return null;
        }
        return null;
    }

    private Certificate getCertificate(p pVar) {
        if (pVar == null) {
            return null;
        }
        if (pVar.size() > 1 && (pVar.r(0) instanceof k) && pVar.r(0).equals(n.f55535i2)) {
            this.sData = w.h(p.q((s) pVar.r(1), true)).f();
            return getCertificate();
        }
        return new X509CertificateObject(this.bcHelper, e50.n.f(pVar));
    }

    private CRL readDERCRL(h hVar) {
        return getCRL(p.p(hVar.D()));
    }

    private Certificate readDERCertificate(h hVar) {
        return getCertificate(p.p(hVar.D()));
    }

    private CRL readPEMCRL(InputStream inputStream, boolean z11) {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream, z11));
    }

    private Certificate readPEMCertificate(InputStream inputStream, boolean z11) {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream, z11));
    }

    protected CRL createCRL(o oVar) {
        return new X509CRLObject(this.bcHelper, oVar);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        return doGenerateCRL(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL doGenerateCRL = doGenerateCRL(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(doGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        return doGenerateCertificate(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate doGenerateCertificate = doGenerateCertificate(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(doGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }
}
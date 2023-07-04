package org.bouncycastle.jce.provider;

import e40.b;
import e50.n;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.x509.util.StreamParsingException;
import v70.p;
import w40.w;

/* loaded from: classes5.dex */
public class X509CertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CERTIFICATE");
    private q sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private Certificate getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                q qVar = this.sData;
                int i11 = this.sDataObjectCount;
                this.sDataObjectCount = i11 + 1;
                b s11 = qVar.s(i11);
                if (s11 instanceof org.bouncycastle.asn1.p) {
                    return new X509CertificateObject(n.f(s11));
                }
            }
            return null;
        }
        return null;
    }

    private Certificate readDERCertificate(InputStream inputStream) {
        org.bouncycastle.asn1.p pVar = (org.bouncycastle.asn1.p) new h(inputStream).D();
        if (pVar.size() > 1 && (pVar.r(0) instanceof k) && pVar.r(0).equals(w40.n.f55535i2)) {
            this.sData = new w(org.bouncycastle.asn1.p.q((s) pVar.r(1), true)).f();
            return getCertificate();
        }
        return new X509CertificateObject(n.f(pVar));
    }

    private Certificate readPEMCertificate(InputStream inputStream) {
        org.bouncycastle.asn1.p readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new X509CertificateObject(n.f(readPEMObject));
        }
        return null;
    }

    @Override // v70.p
    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        this.sData = null;
        this.sDataObjectCount = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.currentStream = new BufferedInputStream(this.currentStream);
    }

    @Override // v70.p
    public Object engineRead() {
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
            this.currentStream.mark(10);
            int read = this.currentStream.read();
            if (read == -1) {
                return null;
            }
            if (read != 48) {
                this.currentStream.reset();
                return readPEMCertificate(this.currentStream);
            }
            this.currentStream.reset();
            return readDERCertificate(this.currentStream);
        } catch (Exception e11) {
            throw new StreamParsingException(e11.toString(), e11);
        }
    }

    @Override // v70.p
    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificate = (Certificate) engineRead();
            if (certificate == null) {
                return arrayList;
            }
            arrayList.add(certificate);
        }
    }
}
package org.bouncycastle.jce.provider;

import e50.o;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.x509.util.StreamParsingException;
import v70.p;
import w40.n;
import w40.w;

/* loaded from: classes5.dex */
public class X509CRLParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CRL");
    private q sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private CRL getCRL() {
        q qVar = this.sData;
        if (qVar == null || this.sDataObjectCount >= qVar.size()) {
            return null;
        }
        q qVar2 = this.sData;
        int i11 = this.sDataObjectCount;
        this.sDataObjectCount = i11 + 1;
        return new X509CRLObject(o.e(qVar2.s(i11)));
    }

    private CRL readDERCRL(InputStream inputStream) {
        org.bouncycastle.asn1.p pVar = (org.bouncycastle.asn1.p) new h(inputStream).D();
        if (pVar.size() > 1 && (pVar.r(0) instanceof k) && pVar.r(0).equals(n.f55535i2)) {
            this.sData = new w(org.bouncycastle.asn1.p.q((s) pVar.r(1), true)).e();
            return getCRL();
        }
        return new X509CRLObject(o.e(pVar));
    }

    private CRL readPEMCRL(InputStream inputStream) {
        org.bouncycastle.asn1.p readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new X509CRLObject(o.e(readPEMObject));
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
                    return getCRL();
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
                return readPEMCRL(this.currentStream);
            }
            this.currentStream.reset();
            return readDERCRL(this.currentStream);
        } catch (Exception e11) {
            throw new StreamParsingException(e11.toString(), e11);
        }
    }

    @Override // v70.p
    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            CRL crl = (CRL) engineRead();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }
}
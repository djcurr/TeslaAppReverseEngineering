package org.bouncycastle.jce.provider;

import e40.b;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.x509.util.StreamParsingException;
import v70.h;
import v70.p;
import w40.n;
import w40.w;

/* loaded from: classes5.dex */
public class X509AttrCertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private q sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private h getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                q qVar = this.sData;
                int i11 = this.sDataObjectCount;
                this.sDataObjectCount = i11 + 1;
                b s11 = qVar.s(i11);
                if (s11 instanceof s) {
                    s sVar = (s) s11;
                    if (sVar.s() == 2) {
                        return new v70.q(org.bouncycastle.asn1.p.q(sVar, false).getEncoded());
                    }
                }
            }
            return null;
        }
        return null;
    }

    private h readDERCertificate(InputStream inputStream) {
        org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(new org.bouncycastle.asn1.h(inputStream).D());
        if (p11.size() > 1 && (p11.r(0) instanceof k) && p11.r(0).equals(n.f55535i2)) {
            this.sData = new w(org.bouncycastle.asn1.p.q((s) p11.r(1), true)).f();
            return getCertificate();
        }
        return new v70.q(p11.getEncoded());
    }

    private h readPEMCertificate(InputStream inputStream) {
        org.bouncycastle.asn1.p readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new v70.q(readPEMObject.getEncoded());
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
            h hVar = (h) engineRead();
            if (hVar == null) {
                return arrayList;
            }
            arrayList.add(hVar);
        }
    }
}
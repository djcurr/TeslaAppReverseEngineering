package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.asn1.h;
import org.bouncycastle.x509.util.StreamParsingException;
import v70.l;
import v70.p;

/* loaded from: classes5.dex */
public class X509CertPairParser extends p {
    private InputStream currentStream = null;

    private l readDERCrossCertificatePair(InputStream inputStream) {
        return new l(e50.p.f((org.bouncycastle.asn1.p) new h(inputStream).D()));
    }

    @Override // v70.p
    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        if (inputStream.markSupported()) {
            return;
        }
        this.currentStream = new BufferedInputStream(this.currentStream);
    }

    @Override // v70.p
    public Object engineRead() {
        try {
            this.currentStream.mark(10);
            if (this.currentStream.read() == -1) {
                return null;
            }
            this.currentStream.reset();
            return readDERCrossCertificatePair(this.currentStream);
        } catch (Exception e11) {
            throw new StreamParsingException(e11.toString(), e11);
        }
    }

    @Override // v70.p
    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            l lVar = (l) engineRead();
            if (lVar == null) {
                return arrayList;
            }
            arrayList.add(lVar);
        }
    }
}
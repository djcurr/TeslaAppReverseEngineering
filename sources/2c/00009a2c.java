package org.spongycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* loaded from: classes5.dex */
abstract class CertHelper {
    protected abstract CertificateFactory createCertificateFactory(String str);

    public CertificateFactory getCertificateFactory(String str) {
        return createCertificateFactory(str);
    }
}
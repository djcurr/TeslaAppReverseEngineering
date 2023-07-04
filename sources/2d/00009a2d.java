package org.spongycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* loaded from: classes5.dex */
class DefaultCertHelper extends CertHelper {
    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str);
    }
}
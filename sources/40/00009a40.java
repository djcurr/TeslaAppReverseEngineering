package org.spongycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* loaded from: classes5.dex */
class NamedCertHelper extends CertHelper {
    private final String providerName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NamedCertHelper(String str) {
        this.providerName = str;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.providerName);
    }
}
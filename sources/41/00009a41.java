package org.spongycastle.cert.jcajce;

import java.security.Provider;
import java.security.cert.CertificateFactory;

/* loaded from: classes5.dex */
class ProviderCertHelper extends CertHelper {
    private final Provider provider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProviderCertHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.cert.jcajce.CertHelper
    protected CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.provider);
    }
}
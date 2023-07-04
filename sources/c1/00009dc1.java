package org.spongycastle.eac.jcajce;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes4.dex */
class ProviderEACHelper implements EACHelper {
    private final Provider provider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProviderEACHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.spongycastle.eac.jcajce.EACHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str, this.provider);
    }
}
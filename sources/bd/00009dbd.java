package org.spongycastle.eac.jcajce;

import java.security.KeyFactory;

/* loaded from: classes4.dex */
class DefaultEACHelper implements EACHelper {
    @Override // org.spongycastle.eac.jcajce.EACHelper
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str);
    }
}
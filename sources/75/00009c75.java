package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    public AsymmetricKeyParameter(boolean z11) {
        this.privateKey = z11;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
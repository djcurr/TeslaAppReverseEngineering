package org.spongycastle.crypto.engines;

/* loaded from: classes4.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z11) {
        super(new AESEngine(), z11);
    }
}
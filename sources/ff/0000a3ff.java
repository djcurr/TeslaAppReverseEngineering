package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes4.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private int docLength;

    public RainbowKeyParameters(boolean z11, int i11) {
        super(z11);
        this.docLength = i11;
    }

    public int getDocLength() {
        return this.docLength;
    }
}
package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    public DSAKeyParameters(boolean z11, DSAParameters dSAParameters) {
        super(z11);
        this.params = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.params;
    }
}
package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    ECDomainParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public ECKeyParameters(boolean z11, ECDomainParameters eCDomainParameters) {
        super(z11);
        this.params = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.params;
    }
}
package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {
    private DHParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public DHKeyParameters(boolean z11, DHParameters dHParameters) {
        super(z11);
        this.params = dHParameters;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHKeyParameters) {
            DHKeyParameters dHKeyParameters = (DHKeyParameters) obj;
            DHParameters dHParameters = this.params;
            if (dHParameters == null) {
                return dHKeyParameters.getParameters() == null;
            }
            return dHParameters.equals(dHKeyParameters.getParameters());
        }
        return false;
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i11 = !isPrivate();
        DHParameters dHParameters = this.params;
        return dHParameters != null ? i11 ^ dHParameters.hashCode() : i11;
    }
}
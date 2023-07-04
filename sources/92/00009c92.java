package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class ElGamalKeyParameters extends AsymmetricKeyParameter {
    private ElGamalParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public ElGamalKeyParameters(boolean z11, ElGamalParameters elGamalParameters) {
        super(z11);
        this.params = elGamalParameters;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ElGamalKeyParameters) {
            ElGamalKeyParameters elGamalKeyParameters = (ElGamalKeyParameters) obj;
            ElGamalParameters elGamalParameters = this.params;
            if (elGamalParameters == null) {
                return elGamalKeyParameters.getParameters() == null;
            }
            return elGamalParameters.equals(elGamalKeyParameters.getParameters());
        }
        return false;
    }

    public ElGamalParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        ElGamalParameters elGamalParameters = this.params;
        if (elGamalParameters != null) {
            return elGamalParameters.hashCode();
        }
        return 0;
    }
}
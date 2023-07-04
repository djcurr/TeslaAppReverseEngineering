package org.spongycastle.crypto.params;

/* loaded from: classes4.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {
    private CramerShoupParameters params;

    /* JADX INFO: Access modifiers changed from: protected */
    public CramerShoupKeyParameters(boolean z11, CramerShoupParameters cramerShoupParameters) {
        super(z11);
        this.params = cramerShoupParameters;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupKeyParameters) {
            CramerShoupKeyParameters cramerShoupKeyParameters = (CramerShoupKeyParameters) obj;
            CramerShoupParameters cramerShoupParameters = this.params;
            if (cramerShoupParameters == null) {
                return cramerShoupKeyParameters.getParameters() == null;
            }
            return cramerShoupParameters.equals(cramerShoupKeyParameters.getParameters());
        }
        return false;
    }

    public CramerShoupParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i11 = !isPrivate();
        CramerShoupParameters cramerShoupParameters = this.params;
        return cramerShoupParameters != null ? i11 ^ cramerShoupParameters.hashCode() : i11;
    }
}
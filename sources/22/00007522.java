package ic;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class e1 extends cc.h<f1> {
    public e1(f1 f1Var) {
        super(f1Var);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 8192) {
            return super.f(i11);
        }
        return v();
    }

    public String v() {
        return u(PKIFailureInfo.certRevoked, 2);
    }
}
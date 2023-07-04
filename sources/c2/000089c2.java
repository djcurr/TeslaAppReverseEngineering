package n50;

import u50.d0;
import u50.e0;

/* loaded from: classes5.dex */
public class k extends l {
    @Override // n50.l, org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        org.bouncycastle.crypto.b generateKeyPair = super.generateKeyPair();
        e0 e0Var = (e0) generateKeyPair.b();
        return new org.bouncycastle.crypto.b(new e0(e0Var.c().z(), e0Var.b()), (d0) generateKeyPair.a());
    }
}
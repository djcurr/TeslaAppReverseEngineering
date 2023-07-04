package n50;

import java.security.SecureRandom;
import u50.j0;

/* loaded from: classes5.dex */
public class n implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private SecureRandom f40559g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40559g = tVar.a();
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        j0 j0Var = new j0(this.f40559g);
        return new org.bouncycastle.crypto.b(j0Var.b(), j0Var);
    }
}
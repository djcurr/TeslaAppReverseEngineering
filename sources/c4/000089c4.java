package n50;

import java.security.SecureRandom;
import u50.g0;

/* loaded from: classes5.dex */
public class m implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private SecureRandom f40558g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40558g = tVar.a();
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        g0 g0Var = new g0(this.f40558g);
        return new org.bouncycastle.crypto.b(g0Var.b(), g0Var);
    }
}
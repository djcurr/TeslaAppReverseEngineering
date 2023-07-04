package n50;

import java.security.SecureRandom;
import u50.s1;

/* loaded from: classes5.dex */
public class b0 implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private SecureRandom f40532g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40532g = tVar.a();
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        s1 s1Var = new s1(this.f40532g);
        return new org.bouncycastle.crypto.b(s1Var.b(), s1Var);
    }
}
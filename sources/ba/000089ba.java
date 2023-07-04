package n50;

import java.security.SecureRandom;
import u50.v1;

/* loaded from: classes5.dex */
public class c0 implements org.bouncycastle.crypto.c {

    /* renamed from: g  reason: collision with root package name */
    private SecureRandom f40533g;

    public void a(org.bouncycastle.crypto.t tVar) {
        this.f40533g = tVar.a();
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b generateKeyPair() {
        v1 v1Var = new v1(this.f40533g);
        return new org.bouncycastle.crypto.b(v1Var.b(), v1Var);
    }
}
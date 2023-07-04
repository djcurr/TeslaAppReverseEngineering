package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class l0 extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private n0 f53241c;

    public l0(SecureRandom secureRandom, n0 n0Var) {
        super(secureRandom, d(n0Var));
        this.f53241c = n0Var;
    }

    static int d(n0 n0Var) {
        return n0Var.b() != 0 ? n0Var.b() : n0Var.c().bitLength();
    }

    public n0 c() {
        return this.f53241c;
    }
}
package u50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class r0 extends org.bouncycastle.crypto.t {

    /* renamed from: c  reason: collision with root package name */
    private t0 f53284c;

    public r0(SecureRandom secureRandom, t0 t0Var) {
        super(secureRandom, t0Var.b().bitLength() - 1);
        this.f53284c = t0Var;
    }

    public t0 c() {
        return this.f53284c;
    }
}
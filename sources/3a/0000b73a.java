package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class c1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private d0 f53195a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f53196b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f53197c;

    public c1(d0 d0Var, d0 d0Var2, e0 e0Var) {
        Objects.requireNonNull(d0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(d0Var2, "ephemeralPrivateKey cannot be null");
        y b11 = d0Var.b();
        if (!b11.equals(d0Var2.b())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (e0Var == null) {
            e0Var = new e0(new n60.k().a(b11.b(), d0Var2.c()), b11);
        } else if (!b11.equals(e0Var.b())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.f53195a = d0Var;
        this.f53196b = d0Var2;
        this.f53197c = e0Var;
    }

    public d0 a() {
        return this.f53196b;
    }

    public e0 b() {
        return this.f53197c;
    }

    public d0 c() {
        return this.f53195a;
    }
}
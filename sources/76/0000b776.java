package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class w implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private d0 f53300a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f53301b;

    public w(d0 d0Var, d0 d0Var2, e0 e0Var) {
        Objects.requireNonNull(d0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(d0Var2, "ephemeralPrivateKey cannot be null");
        y b11 = d0Var.b();
        if (!b11.equals(d0Var2.b())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (e0Var == null) {
            new e0(new n60.k().a(b11.b(), d0Var2.c()), b11);
        } else if (!b11.equals(e0Var.b())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f53300a = d0Var;
        this.f53301b = d0Var2;
    }

    public d0 a() {
        return this.f53301b;
    }

    public d0 b() {
        return this.f53300a;
    }
}
package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class x implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private e0 f53307a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f53308b;

    public x(e0 e0Var, e0 e0Var2) {
        Objects.requireNonNull(e0Var, "staticPublicKey cannot be null");
        Objects.requireNonNull(e0Var2, "ephemeralPublicKey cannot be null");
        if (!e0Var.b().equals(e0Var2.b())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f53307a = e0Var;
        this.f53308b = e0Var2;
    }

    public e0 a() {
        return this.f53308b;
    }

    public e0 b() {
        return this.f53307a;
    }
}
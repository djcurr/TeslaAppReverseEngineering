package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class l implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private j f53239a;

    /* renamed from: b  reason: collision with root package name */
    private j f53240b;

    public l(j jVar, j jVar2) {
        this(jVar, jVar2, null);
    }

    public l(j jVar, j jVar2, k kVar) {
        Objects.requireNonNull(jVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(jVar2, "ephemeralPrivateKey cannot be null");
        i b11 = jVar.b();
        if (!b11.equals(jVar2.b())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (kVar == null) {
            new k(b11.b().modPow(jVar2.c(), b11.f()), b11);
        } else if (!b11.equals(kVar.b())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f53239a = jVar;
        this.f53240b = jVar2;
    }

    public j a() {
        return this.f53240b;
    }

    public j b() {
        return this.f53239a;
    }
}
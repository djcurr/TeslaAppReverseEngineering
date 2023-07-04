package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class g implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private j f53208a;

    /* renamed from: b  reason: collision with root package name */
    private j f53209b;

    /* renamed from: c  reason: collision with root package name */
    private k f53210c;

    public g(j jVar, j jVar2) {
        this(jVar, jVar2, null);
    }

    public g(j jVar, j jVar2, k kVar) {
        Objects.requireNonNull(jVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(jVar2, "ephemeralPrivateKey cannot be null");
        i b11 = jVar.b();
        if (!b11.equals(jVar2.b())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (kVar == null) {
            kVar = new k(b11.b().multiply(jVar2.c()), b11);
        } else if (!b11.equals(kVar.b())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.f53208a = jVar;
        this.f53209b = jVar2;
        this.f53210c = kVar;
    }

    public j a() {
        return this.f53209b;
    }

    public k b() {
        return this.f53210c;
    }

    public j c() {
        return this.f53208a;
    }
}
package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class m implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private k f53243a;

    /* renamed from: b  reason: collision with root package name */
    private k f53244b;

    public m(k kVar, k kVar2) {
        Objects.requireNonNull(kVar, "staticPublicKey cannot be null");
        Objects.requireNonNull(kVar2, "ephemeralPublicKey cannot be null");
        if (!kVar.b().equals(kVar2.b())) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.f53243a = kVar;
        this.f53244b = kVar2;
    }

    public k a() {
        return this.f53244b;
    }

    public k b() {
        return this.f53243a;
    }
}
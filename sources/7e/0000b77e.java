package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class y1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private b f53321a;

    /* renamed from: b  reason: collision with root package name */
    private b f53322b;

    public y1(b bVar, b bVar2) {
        Objects.requireNonNull(bVar, "staticPublicKey cannot be null");
        if (!(bVar instanceof w1) && !(bVar instanceof t1)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        Objects.requireNonNull(bVar2, "ephemeralPublicKey cannot be null");
        if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f53321a = bVar;
        this.f53322b = bVar2;
    }

    public b a() {
        return this.f53322b;
    }

    public b b() {
        return this.f53321a;
    }
}
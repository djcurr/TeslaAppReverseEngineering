package u50;

import java.util.Objects;

/* loaded from: classes5.dex */
public class x1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private b f53312a;

    /* renamed from: b  reason: collision with root package name */
    private b f53313b;

    public x1(b bVar, b bVar2, b bVar3) {
        Objects.requireNonNull(bVar, "staticPrivateKey cannot be null");
        boolean z11 = bVar instanceof v1;
        if (!z11 && !(bVar instanceof s1)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        Objects.requireNonNull(bVar2, "ephemeralPrivateKey cannot be null");
        if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (bVar3 == null) {
            if (bVar2 instanceof v1) {
                ((v1) bVar2).b();
            } else {
                ((s1) bVar2).b();
            }
        } else if ((bVar3 instanceof w1) && !z11) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        } else {
            if ((bVar3 instanceof t1) && !(bVar instanceof s1)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
        }
        this.f53312a = bVar;
        this.f53313b = bVar2;
    }

    public b a() {
        return this.f53313b;
    }

    public b b() {
        return this.f53312a;
    }
}
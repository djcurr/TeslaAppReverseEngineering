package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class c extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    e40.b f24670a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.n f24671b;

    public c(u0 u0Var) {
        this.f24670a = u0Var;
        this.f24671b = new z0(false, 0, u0Var);
    }

    public c(x xVar) {
        this.f24670a = xVar;
        this.f24671b = xVar.toASN1Primitive();
    }

    public static c e(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof u0) {
            return new c(u0.f(obj));
        }
        if (obj instanceof x) {
            return new c((x) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.s) {
            return new c(u0.h((org.bouncycastle.asn1.s) obj, false));
        }
        if (obj instanceof org.bouncycastle.asn1.p) {
            return new c(x.f(obj));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public e40.b f() {
        return this.f24670a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24671b;
    }
}
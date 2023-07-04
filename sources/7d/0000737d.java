package hl;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import ol.c0;
import ol.d0;
import ol.t;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f29323a;

    private i(c0 c0Var) {
        this.f29323a = c0Var;
    }

    public static void a(t tVar) {
        if (tVar == null || tVar.F().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(c0 c0Var) {
        if (c0Var == null || c0Var.I() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t tVar, a aVar) {
        try {
            c0 M = c0.M(aVar.decrypt(tVar.F().t(), new byte[0]), com.google.crypto.tink.shaded.protobuf.p.b());
            b(M);
            return M;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(c0 c0Var, a aVar) {
        byte[] a11 = aVar.a(c0Var.toByteArray(), new byte[0]);
        try {
            if (c0.M(aVar.decrypt(a11, new byte[0]), com.google.crypto.tink.shaded.protobuf.p.b()).equals(c0Var)) {
                return t.G().n(com.google.crypto.tink.shaded.protobuf.i.f(a11)).o(s.b(c0Var)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final i e(c0 c0Var) {
        b(c0Var);
        return new i(c0Var);
    }

    private <B, P> P i(Class<P> cls, Class<B> cls2) {
        return (P) r.t(r.l(this, cls2), cls);
    }

    public static final i j(k kVar, a aVar) {
        t a11 = kVar.a();
        a(a11);
        return new i(c(a11, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 f() {
        return this.f29323a;
    }

    public d0 g() {
        return s.b(this.f29323a);
    }

    public <P> P h(Class<P> cls) {
        Class<?> e11 = r.e(cls);
        if (e11 != null) {
            return (P) i(cls, e11);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(l lVar, a aVar) {
        lVar.b(d(this.f29323a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.r;
import java.security.GeneralSecurityException;
import ol.k0;
import ol.l0;
import ol.y;
import pl.u;
import pl.w;
import pl.y;

/* loaded from: classes3.dex */
public class l extends hl.h<k0> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, k0> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(k0 k0Var) {
            return new y(k0Var.F().t());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<l0, k0> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public k0 a(l0 l0Var) {
            return k0.H().o(l.this.j()).n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(32))).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public l0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return l0.D(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(l0 l0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
        super(k0.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        r.q(new l(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // hl.h
    public h.a<?, k0> e() {
        return new b(l0.class);
    }

    @Override // hl.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    @Override // hl.h
    /* renamed from: k */
    public k0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return k0.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(k0 k0Var) {
        w.c(k0Var.G(), j());
        if (k0Var.F().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.n;
import hl.r;
import ol.e0;
import ol.f0;
import ol.y;
import pl.w;

/* loaded from: classes3.dex */
public class i extends hl.h<e0> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, e0> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(e0 e0Var) {
            String E = e0Var.F().E();
            return n.a(E).b(E);
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<f0, e0> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public e0 a(f0 f0Var) {
            return e0.H().n(f0Var).o(i.this.j()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public f0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f0.F(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(f0 f0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        super(e0.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        r.q(new i(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // hl.h
    public h.a<?, e0> e() {
        return new b(f0.class);
    }

    @Override // hl.h
    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    @Override // hl.h
    /* renamed from: k */
    public e0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return e0.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(e0 e0Var) {
        w.c(e0Var.G(), j());
    }
}
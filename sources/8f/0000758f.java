package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.n;
import hl.r;
import ol.g0;
import ol.h0;
import ol.y;
import pl.w;

/* loaded from: classes3.dex */
public class k extends hl.h<g0> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, g0> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(g0 g0Var) {
            String F = g0Var.F().F();
            return new j(g0Var.F().E(), n.a(F).b(F));
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<h0, g0> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public g0 a(h0 h0Var) {
            return g0.H().n(h0Var).o(k.this.j()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public h0 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return h0.G(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(h0 h0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        super(g0.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        r.q(new k(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // hl.h
    public h.a<?, g0> e() {
        return new b(h0.class);
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
    public g0 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return g0.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(g0 g0Var) {
        w.c(g0Var.G(), j());
    }
}
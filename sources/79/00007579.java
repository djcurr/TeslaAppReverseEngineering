package il;

import hl.h;
import hl.o;
import hl.r;
import ol.y;
import pl.p;
import pl.w;

/* loaded from: classes3.dex */
public final class c extends hl.h<ol.d> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, ol.d> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(ol.d dVar) {
            return new pl.l((p) new d().d(dVar.G(), p.class), (o) new ml.b().d(dVar.H(), o.class), dVar.H().I().F());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<ol.e, ol.d> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public ol.d a(ol.e eVar) {
            return ol.d.J().n(new d().e().a(eVar.D())).o(new ml.b().e().a(eVar.E())).p(c.this.j()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public ol.e c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return ol.e.F(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(ol.e eVar) {
            new d().e().d(eVar.D());
            new ml.b().e().d(eVar.E());
            w.a(eVar.D().E());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        super(ol.d.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        r.q(new c(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // hl.h
    public h.a<?, ol.d> e() {
        return new b(ol.e.class);
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
    public ol.d g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return ol.d.K(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(ol.d dVar) {
        w.c(dVar.I(), j());
        new d().i(dVar.G());
        new ml.b().i(dVar.H());
    }
}
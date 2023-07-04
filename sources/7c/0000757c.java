package il;

import hl.h;
import java.security.GeneralSecurityException;
import ol.y;
import pl.p;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public class d extends hl.h<ol.f> {

    /* loaded from: classes3.dex */
    class a extends h.b<p, ol.f> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public p a(ol.f fVar) {
            return new pl.a(fVar.H().t(), fVar.I().E());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<ol.g, ol.f> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public ol.f a(ol.g gVar) {
            return ol.f.K().o(gVar.F()).n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(gVar.E()))).p(d.this.k()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public ol.g c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return ol.g.G(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(ol.g gVar) {
            w.a(gVar.E());
            d.this.n(gVar.F());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(ol.f.class, new a(p.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(ol.h hVar) {
        if (hVar.E() < 12 || hVar.E() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // hl.h
    public h.a<?, ol.f> e() {
        return new b(ol.g.class);
    }

    @Override // hl.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // hl.h
    /* renamed from: l */
    public ol.f g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return ol.f.L(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(ol.f fVar) {
        w.c(fVar.J(), k());
        w.a(fVar.H().size());
        n(fVar.I());
    }
}
package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.g;
import hl.h;
import hl.r;
import ol.m;
import ol.y;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class f extends hl.h<ol.l> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, ol.l> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(ol.l lVar) {
            return new pl.c(lVar.F().t());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<m, ol.l> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public ol.l a(m mVar) {
            return ol.l.H().n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(mVar.E()))).o(f.this.l()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public m c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return m.G(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(m mVar) {
            w.a(mVar.E());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(ol.l.class, new a(hl.a.class));
    }

    public static final hl.g j() {
        return k(32, g.b.TINK);
    }

    private static hl.g k(int i11, g.b bVar) {
        return hl.g.a(new f().c(), m.F().n(i11).build().toByteArray(), bVar);
    }

    public static void n(boolean z11) {
        r.q(new f(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // hl.h
    public h.a<?, ol.l> e() {
        return new b(m.class);
    }

    @Override // hl.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // hl.h
    /* renamed from: m */
    public ol.l g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return ol.l.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: o */
    public void i(ol.l lVar) {
        w.c(lVar.G(), l());
        w.a(lVar.F().size());
    }
}
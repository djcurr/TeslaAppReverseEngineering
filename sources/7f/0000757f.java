package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.r;
import java.security.GeneralSecurityException;
import ol.y;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class e extends hl.h<ol.i> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, ol.i> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(ol.i iVar) {
            return new pl.b(iVar.G().t(), iVar.H().E());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<ol.j, ol.i> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public ol.i a(ol.j jVar) {
            return ol.i.J().n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(jVar.D()))).o(jVar.E()).p(e.this.j()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public ol.j c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return ol.j.F(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(ol.j jVar) {
            w.a(jVar.D());
            if (jVar.E().E() != 12 && jVar.E().E() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(ol.i.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        r.q(new e(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // hl.h
    public h.a<?, ol.i> e() {
        return new b(ol.j.class);
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
    public ol.i g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return ol.i.K(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(ol.i iVar) {
        w.c(iVar.I(), j());
        w.a(iVar.G().size());
        if (iVar.H().E() != 12 && iVar.H().E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
package ml;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.o;
import java.security.GeneralSecurityException;
import ol.y;
import pl.r;
import pl.t;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class a extends h<ol.a> {

    /* renamed from: ml.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0748a extends h.b<o, ol.a> {
        C0748a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public o a(ol.a aVar) {
            return new t(new r(aVar.G().t()), aVar.H().E());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<ol.b, ol.a> {
        b(a aVar, Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public ol.a a(ol.b bVar) {
            return ol.a.J().p(0).n(i.f(u.c(bVar.D()))).o(bVar.E()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public ol.b c(i iVar) {
            return ol.b.F(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(ol.b bVar) {
            a.p(bVar.E());
            a.q(bVar.D());
        }
    }

    a() {
        super(ol.a.class, new C0748a(o.class));
    }

    public static void n(boolean z11) {
        hl.r.q(new a(), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(ol.c cVar) {
        if (cVar.E() >= 10) {
            if (cVar.E() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(int i11) {
        if (i11 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // hl.h
    public h.a<?, ol.a> e() {
        return new b(this, ol.b.class);
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
    public ol.a g(i iVar) {
        return ol.a.K(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: o */
    public void i(ol.a aVar) {
        w.c(aVar.I(), l());
        q(aVar.G().size());
        p(aVar.H());
    }
}
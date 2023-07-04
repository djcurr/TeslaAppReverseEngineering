package kl;

import com.google.crypto.tink.shaded.protobuf.i;
import hl.d;
import hl.g;
import hl.h;
import hl.r;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import ol.p;
import ol.q;
import ol.y;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class a extends h<p> {

    /* renamed from: kl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0647a extends h.b<d, p> {
        C0647a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public d a(p pVar) {
            return new pl.d(pVar.F().t());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public p a(q qVar) {
            return p.H().n(i.f(u.c(qVar.E()))).o(a.this.l()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public q c(i iVar) {
            return q.G(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(q qVar) {
            if (qVar.E() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.E() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        super(p.class, new C0647a(d.class));
    }

    public static final g j() {
        return k(64, g.b.TINK);
    }

    private static g k(int i11, g.b bVar) {
        return g.a(new a().c(), q.F().n(i11).build().toByteArray(), bVar);
    }

    public static void n(boolean z11) {
        r.q(new a(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // hl.h
    public h.a<?, p> e() {
        return new b(q.class);
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
    public p g(i iVar) {
        return p.I(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // hl.h
    /* renamed from: o */
    public void i(p pVar) {
        w.c(pVar.G(), l());
        if (pVar.F().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.F().size() + ". Valid keys must have 64 bytes.");
    }
}
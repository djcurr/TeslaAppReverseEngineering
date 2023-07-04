package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import java.security.GeneralSecurityException;
import ol.r;
import ol.s;
import ol.y;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public class h extends hl.h<r> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, r> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(r rVar) {
            return new pl.j(rVar.F().t());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public r a(s sVar) {
            return r.H().o(h.this.j()).n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(32))).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public s c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return s.D(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(s sVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        super(r.class, new a(hl.a.class));
    }

    public static void l(boolean z11) {
        hl.r.q(new h(), z11);
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // hl.h
    public h.a<?, r> e() {
        return new b(s.class);
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
    public r g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return r.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: m */
    public void i(r rVar) {
        w.c(rVar.G(), j());
        if (rVar.F().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
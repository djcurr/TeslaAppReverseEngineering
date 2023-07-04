package il;

import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.r;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import ol.n;
import ol.o;
import ol.y;
import pl.u;
import pl.w;

/* loaded from: classes3.dex */
public final class g extends hl.h<n> {

    /* loaded from: classes3.dex */
    class a extends h.b<hl.a, n> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public hl.a a(n nVar) {
            return new jl.a(nVar.F().t());
        }
    }

    /* loaded from: classes3.dex */
    class b extends h.a<o, n> {
        b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public n a(o oVar) {
            return n.H().n(com.google.crypto.tink.shaded.protobuf.i.f(u.c(oVar.D()))).o(g.this.k()).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public o c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return o.E(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(o oVar) {
            w.a(oVar.D());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        super(n.class, new a(hl.a.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z11) {
        if (j()) {
            r.q(new g(), z11);
        }
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // hl.h
    public h.a<?, n> e() {
        return new b(o.class);
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
    public n g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return n.I(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: n */
    public void i(n nVar) {
        w.c(nVar.G(), k());
        w.a(nVar.F().size());
    }
}
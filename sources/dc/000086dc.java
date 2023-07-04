package ml;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import hl.h;
import hl.o;
import hl.r;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import ol.u;
import ol.v;
import ol.w;
import ol.x;
import ol.y;
import pl.s;
import pl.t;

/* loaded from: classes3.dex */
public final class b extends h<v> {

    /* loaded from: classes3.dex */
    class a extends h.b<o, v> {
        a(Class cls) {
            super(cls);
        }

        @Override // hl.h.b
        /* renamed from: c */
        public o a(v vVar) {
            u E = vVar.I().E();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.H().t(), "HMAC");
            int F = vVar.I().F();
            int i11 = c.f38616a[E.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return new t(new s("HMACSHA512", secretKeySpec), F);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
                return new t(new s("HMACSHA256", secretKeySpec), F);
            }
            return new t(new s("HMACSHA1", secretKeySpec), F);
        }
    }

    /* renamed from: ml.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0749b extends h.a<w, v> {
        C0749b(Class cls) {
            super(cls);
        }

        @Override // hl.h.a
        /* renamed from: e */
        public v a(w wVar) {
            return v.K().p(b.this.k()).o(wVar.F()).n(i.f(pl.u.c(wVar.E()))).build();
        }

        @Override // hl.h.a
        /* renamed from: f */
        public w c(i iVar) {
            return w.G(iVar, p.b());
        }

        @Override // hl.h.a
        /* renamed from: g */
        public void d(w wVar) {
            if (wVar.E() >= 16) {
                b.o(wVar.F());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38616a;

        static {
            int[] iArr = new int[u.values().length];
            f38616a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38616a[u.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38616a[u.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b() {
        super(v.class, new a(o.class));
    }

    public static void m(boolean z11) {
        r.q(new b(), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(x xVar) {
        if (xVar.F() >= 10) {
            int i11 = c.f38616a[xVar.E().ordinal()];
            if (i11 == 1) {
                if (xVar.F() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i11 == 2) {
                if (xVar.F() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i11 == 3) {
                if (xVar.F() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // hl.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // hl.h
    public h.a<?, v> e() {
        return new C0749b(w.class);
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
    public v g(i iVar) {
        return v.L(iVar, p.b());
    }

    @Override // hl.h
    /* renamed from: n */
    public void i(v vVar) {
        pl.w.c(vVar.J(), k());
        if (vVar.H().size() >= 16) {
            o(vVar.I());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
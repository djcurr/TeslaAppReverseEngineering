package gu;

import bu.b1;
import bu.b4;
import bu.d0;
import bu.g2;
import bu.n3;
import hu.b;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lt.j2;
import okio.i;
import vz.b0;

/* loaded from: classes6.dex */
public final class f implements p {

    /* renamed from: b */
    public static final a f28098b = new a(null);

    /* renamed from: a */
    private final zs.d f28099a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(zs.d signMessage) {
            kotlin.jvm.internal.s.g(signMessage, "signMessage");
            return new f(signMessage, null);
        }
    }

    private f(zs.d dVar) {
        this.f28099a = dVar;
    }

    public /* synthetic */ f(zs.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    public static final yt.f c(f this$0, k params) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(params, "$params");
        yt.f d11 = this$0.d(params);
        return params.c().Y() ? this$0.e(params, d11) : d11;
    }

    private final yt.f d(k kVar) {
        okio.i h11;
        yt.f fVar;
        b4 d11;
        uu.h c11 = kVar.c();
        ot.b i11 = c11.i();
        yt.b a11 = com.tesla.data.oapi.d.a(c11.i());
        if (c11.z() != null) {
            h11 = c11.z();
            kotlin.jvm.internal.s.e(h11);
        } else {
            h11 = i.a.h(okio.i.f42657e, kVar.b(), 0, 0, 3, null);
        }
        okio.i iVar = h11;
        j2 c12 = i11.c();
        if (c12 == null) {
            fVar = null;
        } else {
            fVar = new yt.f(null, null, null, null, null, 0, new lt.a(c12, null, null, null, null, null, 62, null).encodeByteString(), null, null, null, null, 1983, null);
            b0 b0Var = b0.f54756a;
        }
        g2 g11 = i11.g();
        if (g11 != null) {
            fVar = new yt.f(null, null, null, null, null, 0, new n3(null, null, g11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 31, null).encodeByteString(), null, null, null, null, 1983, null);
            b0 b0Var2 = b0.f54756a;
        }
        d0 d12 = i11.d();
        if (d12 != null) {
            fVar = new yt.f(null, null, null, null, null, 0, new n3(null, null, null, null, d12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 31, null).encodeByteString(), null, null, null, null, 1983, null);
            b0 b0Var3 = b0.f54756a;
        }
        b4 j11 = i11.j();
        if (j11 != null) {
            fVar = new yt.f(null, null, null, null, null, 0, new n3(null, null, null, null, null, null, j11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 31, null).encodeByteString(), null, null, null, null, 1983, null);
            b0 b0Var4 = b0.f54756a;
        }
        ot.l h12 = i11.h();
        if (h12 != null && (d11 = h12.d()) != null) {
            n3 n3Var = new n3(null, null, null, null, null, null, d11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 31, null);
            yt.f fVar2 = new yt.f(null, null, null, null, null, 0, n3Var.encodeByteString(), null, null, new xt.j(null, new xt.f(i.a.h(okio.i.f42657e, zu.s.f60788a.b(h12.c().E(), n3Var.encode()), 0, 0, 3, null), null, 2, null), null, null, null, null, null, 125, null), null, 1471, null);
            b0 b0Var5 = b0.f54756a;
            fVar = fVar2;
        }
        b1 e11 = i11.e();
        if (e11 != null) {
            fVar = new yt.f(null, null, null, null, null, 0, new n3(null, e11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 31, null).encodeByteString(), null, null, null, null, 1983, null);
            b0 b0Var6 = b0.f54756a;
        }
        if (i11.i() != null) {
            fVar = new yt.f(null, null, null, null, null, 0, null, new yt.g(iVar, null, null, 6, null), null, null, null, 1919, null);
            b0 b0Var7 = b0.f54756a;
        }
        yt.f fVar3 = fVar;
        if (fVar3 != null) {
            return yt.f.b(fVar3, new yt.a(a11, null, null, 6, null), new yt.a(null, c11.B(), null, 5, null), null, null, i.a.h(okio.i.f42657e, new byte[1], 0, 0, 3, null), 0, null, null, null, null, null, 2028, null);
        }
        throw new IllegalStateException("Routable message is null, can't do anything else for " + c11.m() + ".");
    }

    private final yt.f e(k kVar, yt.f fVar) {
        okio.i h11;
        int d11;
        vu.c e11 = kVar.e();
        kotlin.jvm.internal.s.e(e11);
        if (kVar.c().z() != null) {
            h11 = kVar.c().z();
            kotlin.jvm.internal.s.e(h11);
        } else {
            h11 = i.a.h(okio.i.f42657e, kVar.b(), 0, 0, 3, null);
        }
        xt.e eVar = new xt.e(h11, null, null, 6, null);
        if (kVar.c().A().d()) {
            d11 = 0;
        } else {
            e11.k();
            d11 = e11.d();
        }
        hu.b bVar = hu.b.f29424a;
        yt.a k11 = fVar.k();
        kotlin.jvm.internal.s.e(k11);
        yt.b c11 = k11.c();
        kotlin.jvm.internal.s.e(c11);
        b.a a11 = bVar.a(e11, d11, c11, kVar.f(), kVar.a());
        hu.a a12 = a11.a();
        int b11 = a11.b();
        okio.i e12 = fVar.e();
        if (e12 != null) {
            zs.e a13 = this.f28099a.a(e12.n(), e11.h(), zu.j.e(a12.d(), 0, 1, null), com.tesla.data.oapi.d.a(kVar.c().i()));
            if (a13.e() == null) {
                boolean a14 = a13.a();
                byte[] b12 = a13.b();
                byte[] c12 = a13.c();
                byte[] d12 = a13.d();
                if (a14) {
                    if (b12 != null && c12 != null && d12 != null) {
                        okio.i g11 = zu.j.g(e11.f());
                        i.a aVar = okio.i.f42657e;
                        return yt.f.b(fVar, null, null, null, null, null, 0, i.a.h(aVar, b12, 0, 0, 3, null), null, null, new xt.j(eVar, null, new xt.a(g11, i.a.h(aVar, c12, 0, 0, 3, null), d11, b11, i.a.h(aVar, d12, 0, 0, 3, null), null, 32, null), null, null, null, null, 122, null), null, 1471, null);
                    }
                    throw new IllegalStateException("Signed message contains invalid data");
                }
                throw new IllegalStateException("Failed to sign message");
            }
            throw new IllegalStateException("Failed to sign message " + a13.e());
        }
        throw new IllegalStateException("routable message as bytes is null");
    }

    @Override // gu.p
    public hy.m<yt.f> a(final k params) {
        kotlin.jvm.internal.s.g(params, "params");
        hy.m<yt.f> l11 = hy.m.l(new Callable() { // from class: gu.e
            {
                f.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                yt.f c11;
                c11 = f.c(f.this, params);
                return c11;
            }
        });
        kotlin.jvm.internal.s.f(l11, "fromCallable {\n      val…ableMessage\n      }\n    }");
        return l11;
    }
}
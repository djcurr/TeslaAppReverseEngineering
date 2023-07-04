package jf;

import android.net.Uri;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import hf.s;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: o  reason: collision with root package name */
    private static final CancellationException f33474o = new CancellationException("Prefetching is not enabled");

    /* renamed from: a  reason: collision with root package name */
    private final p f33475a;

    /* renamed from: b  reason: collision with root package name */
    private final pf.e f33476b;

    /* renamed from: c  reason: collision with root package name */
    private final pf.d f33477c;

    /* renamed from: d  reason: collision with root package name */
    private final md.n<Boolean> f33478d;

    /* renamed from: e  reason: collision with root package name */
    private final s<gd.d, nf.c> f33479e;

    /* renamed from: f  reason: collision with root package name */
    private final s<gd.d, PooledByteBuffer> f33480f;

    /* renamed from: g  reason: collision with root package name */
    private final hf.e f33481g;

    /* renamed from: h  reason: collision with root package name */
    private final hf.e f33482h;

    /* renamed from: i  reason: collision with root package name */
    private final hf.f f33483i;

    /* renamed from: j  reason: collision with root package name */
    private final md.n<Boolean> f33484j;

    /* renamed from: k  reason: collision with root package name */
    private AtomicLong f33485k = new AtomicLong();

    /* renamed from: l  reason: collision with root package name */
    private final md.n<Boolean> f33486l;

    /* renamed from: m  reason: collision with root package name */
    private final id.a f33487m;

    /* renamed from: n  reason: collision with root package name */
    private final j f33488n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements md.l<gd.d> {
        a(h hVar) {
        }

        @Override // md.l
        /* renamed from: a */
        public boolean apply(gd.d dVar) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements md.l<gd.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f33489a;

        b(h hVar, Uri uri) {
            this.f33489a = uri;
        }

        @Override // md.l
        /* renamed from: a */
        public boolean apply(gd.d dVar) {
            return dVar.b(this.f33489a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33490a;

        static {
            int[] iArr = new int[a.b.values().length];
            f33490a = iArr;
            try {
                iArr[a.b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33490a[a.b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(p pVar, Set<pf.e> set, Set<pf.d> set2, md.n<Boolean> nVar, s<gd.d, nf.c> sVar, s<gd.d, PooledByteBuffer> sVar2, hf.e eVar, hf.e eVar2, hf.f fVar, z0 z0Var, md.n<Boolean> nVar2, md.n<Boolean> nVar3, id.a aVar, j jVar) {
        this.f33475a = pVar;
        this.f33476b = new pf.c(set);
        this.f33477c = new pf.b(set2);
        this.f33478d = nVar;
        this.f33479e = sVar;
        this.f33480f = sVar2;
        this.f33481g = eVar;
        this.f33482h = eVar2;
        this.f33483i = fVar;
        this.f33484j = nVar2;
        this.f33486l = nVar3;
        this.f33487m = aVar;
        this.f33488n = jVar;
    }

    private md.l<gd.d> r(Uri uri) {
        return new b(this, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> com.facebook.datasource.c<qd.a<T>> v(com.facebook.imagepipeline.producers.o0<qd.a<T>> r15, com.facebook.imagepipeline.request.a r16, com.facebook.imagepipeline.request.a.c r17, java.lang.Object r18, pf.e r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = tf.b.d()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            tf.b.a(r0)
        Lc:
            com.facebook.imagepipeline.producers.z r0 = new com.facebook.imagepipeline.producers.z
            r3 = r16
            r2 = r19
            pf.e r2 = r14.l(r3, r2)
            pf.d r4 = r1.f33477c
            r0.<init>(r2, r4)
            id.a r2 = r1.f33487m
            r4 = 0
            r7 = r18
            if (r2 == 0) goto L25
            r2.a(r7, r4)
        L25:
            com.facebook.imagepipeline.request.a$c r2 = r16.h()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5 = r17
            com.facebook.imagepipeline.request.a$c r8 = com.facebook.imagepipeline.request.a.c.getMax(r2, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            com.facebook.imagepipeline.producers.v0 r13 = new com.facebook.imagepipeline.producers.v0     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r5 = r14.i()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 0
            boolean r2 = r16.m()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L49
            android.net.Uri r2 = r16.s()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = ud.d.l(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L47
            goto L49
        L47:
            r10 = r4
            goto L4b
        L49:
            r2 = 1
            r10 = r2
        L4b:
            com.facebook.imagepipeline.common.a r11 = r16.l()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            jf.j r12 = r1.f33488n     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r13
            r3 = r16
            r4 = r5
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r15
            com.facebook.datasource.c r0 = com.facebook.imagepipeline.datasource.c.I(r15, r13, r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = tf.b.d()
            if (r2 == 0) goto L6b
            tf.b.b()
        L6b:
            return r0
        L6c:
            r0 = move-exception
            goto L7d
        L6e:
            r0 = move-exception
            com.facebook.datasource.c r0 = com.facebook.datasource.d.b(r0)     // Catch: java.lang.Throwable -> L6c
            boolean r2 = tf.b.d()
            if (r2 == 0) goto L7c
            tf.b.b()
        L7c:
            return r0
        L7d:
            boolean r2 = tf.b.d()
            if (r2 == 0) goto L86
            tf.b.b()
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.v(com.facebook.imagepipeline.producers.o0, com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.a$c, java.lang.Object, pf.e, java.lang.String):com.facebook.datasource.c");
    }

    private com.facebook.datasource.c<Void> w(o0<Void> o0Var, com.facebook.imagepipeline.request.a aVar, a.c cVar, Object obj, com.facebook.imagepipeline.common.a aVar2, pf.e eVar) {
        z zVar = new z(l(aVar, eVar), this.f33477c);
        id.a aVar3 = this.f33487m;
        if (aVar3 != null) {
            aVar3.a(obj, true);
        }
        try {
            return com.facebook.imagepipeline.datasource.d.H(o0Var, new v0(aVar, i(), zVar, obj, a.c.getMax(aVar.h(), cVar), true, false, aVar2, this.f33488n), zVar);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }

    public void a() {
        c();
        b();
    }

    public void b() {
        this.f33481g.j();
        this.f33482h.j();
    }

    public void c() {
        a aVar = new a(this);
        this.f33479e.g(aVar);
        this.f33480f.g(aVar);
    }

    public com.facebook.datasource.c<qd.a<nf.c>> d(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return e(aVar, obj, a.c.FULL_FETCH);
    }

    public com.facebook.datasource.c<qd.a<nf.c>> e(com.facebook.imagepipeline.request.a aVar, Object obj, a.c cVar) {
        return f(aVar, obj, cVar, null);
    }

    public com.facebook.datasource.c<qd.a<nf.c>> f(com.facebook.imagepipeline.request.a aVar, Object obj, a.c cVar, pf.e eVar) {
        return g(aVar, obj, cVar, eVar, null);
    }

    public com.facebook.datasource.c<qd.a<nf.c>> g(com.facebook.imagepipeline.request.a aVar, Object obj, a.c cVar, pf.e eVar, String str) {
        try {
            return v(this.f33475a.g(aVar), aVar, cVar, obj, eVar, str);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }

    public com.facebook.datasource.c<qd.a<nf.c>> h(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return e(aVar, obj, a.c.BITMAP_MEMORY_CACHE);
    }

    public String i() {
        return String.valueOf(this.f33485k.getAndIncrement());
    }

    public s<gd.d, nf.c> j() {
        return this.f33479e;
    }

    public hf.f k() {
        return this.f33483i;
    }

    public pf.e l(com.facebook.imagepipeline.request.a aVar, pf.e eVar) {
        if (eVar == null) {
            if (aVar.n() == null) {
                return this.f33476b;
            }
            return new pf.c(this.f33476b, aVar.n());
        } else if (aVar.n() == null) {
            return new pf.c(this.f33476b, eVar);
        } else {
            return new pf.c(this.f33476b, eVar, aVar.n());
        }
    }

    public boolean m(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f33479e.e(r(uri));
    }

    public boolean n(com.facebook.imagepipeline.request.a aVar) {
        if (aVar == null) {
            return false;
        }
        qd.a<nf.c> aVar2 = this.f33479e.get(this.f33483i.a(aVar, null));
        try {
            return qd.a.n0(aVar2);
        } finally {
            qd.a.C(aVar2);
        }
    }

    public boolean o(Uri uri) {
        return p(uri, a.b.SMALL) || p(uri, a.b.DEFAULT);
    }

    public boolean p(Uri uri, a.b bVar) {
        return q(ImageRequestBuilder.s(uri).v(bVar).a());
    }

    public boolean q(com.facebook.imagepipeline.request.a aVar) {
        gd.d d11 = this.f33483i.d(aVar, null);
        int i11 = c.f33490a[aVar.d().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            return this.f33482h.l(d11);
        }
        return this.f33481g.l(d11);
    }

    public com.facebook.datasource.c<Void> s(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return t(aVar, obj, com.facebook.imagepipeline.common.a.MEDIUM);
    }

    public com.facebook.datasource.c<Void> t(com.facebook.imagepipeline.request.a aVar, Object obj, com.facebook.imagepipeline.common.a aVar2) {
        return u(aVar, obj, aVar2, null);
    }

    public com.facebook.datasource.c<Void> u(com.facebook.imagepipeline.request.a aVar, Object obj, com.facebook.imagepipeline.common.a aVar2, pf.e eVar) {
        if (!this.f33478d.get().booleanValue()) {
            return com.facebook.datasource.d.b(f33474o);
        }
        try {
            return w(this.f33475a.i(aVar), aVar, a.c.FULL_FETCH, obj, aVar2, eVar);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }
}
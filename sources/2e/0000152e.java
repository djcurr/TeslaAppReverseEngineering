package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import cb.a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private Thread A;
    private ha.b B;
    private ha.b C;
    private Object E;
    private com.bumptech.glide.load.a F;
    private com.bumptech.glide.load.data.d<?> G;
    private volatile com.bumptech.glide.load.engine.f H;
    private volatile boolean K;
    private volatile boolean L;
    private boolean O;

    /* renamed from: d  reason: collision with root package name */
    private final e f10588d;

    /* renamed from: e  reason: collision with root package name */
    private final v3.f<h<?>> f10589e;

    /* renamed from: h  reason: collision with root package name */
    private com.bumptech.glide.e f10592h;

    /* renamed from: i  reason: collision with root package name */
    private ha.b f10593i;

    /* renamed from: j  reason: collision with root package name */
    private com.bumptech.glide.h f10594j;

    /* renamed from: k  reason: collision with root package name */
    private m f10595k;

    /* renamed from: l  reason: collision with root package name */
    private int f10596l;

    /* renamed from: m  reason: collision with root package name */
    private int f10597m;

    /* renamed from: n  reason: collision with root package name */
    private ja.a f10598n;

    /* renamed from: o  reason: collision with root package name */
    private ha.e f10599o;

    /* renamed from: p  reason: collision with root package name */
    private b<R> f10600p;

    /* renamed from: q  reason: collision with root package name */
    private int f10601q;

    /* renamed from: t  reason: collision with root package name */
    private EnumC0203h f10602t;

    /* renamed from: w  reason: collision with root package name */
    private g f10603w;

    /* renamed from: x  reason: collision with root package name */
    private long f10604x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10605y;

    /* renamed from: z  reason: collision with root package name */
    private Object f10606z;

    /* renamed from: a  reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f10585a = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<Throwable> f10586b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final cb.c f10587c = cb.c.a();

    /* renamed from: f  reason: collision with root package name */
    private final d<?> f10590f = new d<>();

    /* renamed from: g  reason: collision with root package name */
    private final f f10591g = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10607a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10608b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f10609c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f10609c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10609c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0203h.values().length];
            f10608b = iArr2;
            try {
                iArr2[EnumC0203h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10608b[EnumC0203h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10608b[EnumC0203h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10608b[EnumC0203h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10608b[EnumC0203h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f10607a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10607a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10607a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<R> {
        void b(GlideException glideException);

        void c(ja.c<R> cVar, com.bumptech.glide.load.a aVar, boolean z11);

        void e(h<?> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final com.bumptech.glide.load.a f10610a;

        c(com.bumptech.glide.load.a aVar) {
            this.f10610a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public ja.c<Z> a(ja.c<Z> cVar) {
            return h.this.y(this.f10610a, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        private ha.b f10612a;

        /* renamed from: b  reason: collision with root package name */
        private ha.g<Z> f10613b;

        /* renamed from: c  reason: collision with root package name */
        private r<Z> f10614c;

        d() {
        }

        void a() {
            this.f10612a = null;
            this.f10613b = null;
            this.f10614c = null;
        }

        void b(e eVar, ha.e eVar2) {
            cb.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f10612a, new com.bumptech.glide.load.engine.e(this.f10613b, this.f10614c, eVar2));
            } finally {
                this.f10614c.g();
                cb.b.d();
            }
        }

        boolean c() {
            return this.f10614c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(ha.b bVar, ha.g<X> gVar, r<X> rVar) {
            this.f10612a = bVar;
            this.f10613b = gVar;
            this.f10614c = rVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        la.a a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10615a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10616b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10617c;

        f() {
        }

        private boolean a(boolean z11) {
            return (this.f10617c || z11 || this.f10616b) && this.f10615a;
        }

        synchronized boolean b() {
            this.f10616b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f10617c = true;
            return a(false);
        }

        synchronized boolean d(boolean z11) {
            this.f10615a = true;
            return a(z11);
        }

        synchronized void e() {
            this.f10616b = false;
            this.f10615a = false;
            this.f10617c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0203h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, v3.f<h<?>> fVar) {
        this.f10588d = eVar;
        this.f10589e = fVar;
    }

    private void A() {
        this.f10591g.e();
        this.f10590f.a();
        this.f10585a.a();
        this.K = false;
        this.f10592h = null;
        this.f10593i = null;
        this.f10599o = null;
        this.f10594j = null;
        this.f10595k = null;
        this.f10600p = null;
        this.f10602t = null;
        this.H = null;
        this.A = null;
        this.B = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.f10604x = 0L;
        this.L = false;
        this.f10606z = null;
        this.f10586b.clear();
        this.f10589e.a(this);
    }

    private void B() {
        this.A = Thread.currentThread();
        this.f10604x = bb.f.b();
        boolean z11 = false;
        while (!this.L && this.H != null && !(z11 = this.H.c())) {
            this.f10602t = l(this.f10602t);
            this.H = k();
            if (this.f10602t == EnumC0203h.SOURCE) {
                b();
                return;
            }
        }
        if ((this.f10602t == EnumC0203h.FINISHED || this.L) && !z11) {
            v();
        }
    }

    private <Data, ResourceType> ja.c<R> D(Data data, com.bumptech.glide.load.a aVar, q<Data, ResourceType, R> qVar) {
        ha.e n11 = n(aVar);
        com.bumptech.glide.load.data.e<Data> l11 = this.f10592h.i().l(data);
        try {
            return qVar.a(l11, n11, this.f10596l, this.f10597m, new c(aVar));
        } finally {
            l11.cleanup();
        }
    }

    private void E() {
        int i11 = a.f10607a[this.f10603w.ordinal()];
        if (i11 == 1) {
            this.f10602t = l(EnumC0203h.INITIALIZE);
            this.H = k();
            B();
        } else if (i11 == 2) {
            B();
        } else if (i11 == 3) {
            i();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f10603w);
        }
    }

    private void F() {
        Throwable th2;
        this.f10587c.c();
        if (this.K) {
            if (this.f10586b.isEmpty()) {
                th2 = null;
            } else {
                List<Throwable> list = this.f10586b;
                th2 = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.K = true;
    }

    private <Data> ja.c<R> g(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            long b11 = bb.f.b();
            ja.c<R> h11 = h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                r("Decoded result " + h11, b11);
            }
            return h11;
        } finally {
            dVar.cleanup();
        }
    }

    private <Data> ja.c<R> h(Data data, com.bumptech.glide.load.a aVar) {
        return D(data, aVar, (q<Data, ?, R>) this.f10585a.h(data.getClass()));
    }

    private void i() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j11 = this.f10604x;
            s("Retrieved data", j11, "data: " + this.E + ", cache key: " + this.B + ", fetcher: " + this.G);
        }
        ja.c<R> cVar = null;
        try {
            cVar = g(this.G, this.E, this.F);
        } catch (GlideException e11) {
            e11.i(this.C, this.F);
            this.f10586b.add(e11);
        }
        if (cVar != null) {
            u(cVar, this.F, this.O);
        } else {
            B();
        }
    }

    private com.bumptech.glide.load.engine.f k() {
        int i11 = a.f10608b[this.f10602t.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f10602t);
                }
                return new v(this.f10585a, this);
            }
            return new com.bumptech.glide.load.engine.c(this.f10585a, this);
        }
        return new s(this.f10585a, this);
    }

    private EnumC0203h l(EnumC0203h enumC0203h) {
        int i11 = a.f10608b[enumC0203h.ordinal()];
        if (i11 == 1) {
            if (this.f10598n.a()) {
                return EnumC0203h.DATA_CACHE;
            }
            return l(EnumC0203h.DATA_CACHE);
        } else if (i11 == 2) {
            return this.f10605y ? EnumC0203h.FINISHED : EnumC0203h.SOURCE;
        } else if (i11 == 3 || i11 == 4) {
            return EnumC0203h.FINISHED;
        } else {
            if (i11 == 5) {
                if (this.f10598n.b()) {
                    return EnumC0203h.RESOURCE_CACHE;
                }
                return l(EnumC0203h.RESOURCE_CACHE);
            }
            throw new IllegalArgumentException("Unrecognized stage: " + enumC0203h);
        }
    }

    private ha.e n(com.bumptech.glide.load.a aVar) {
        ha.e eVar = this.f10599o;
        if (Build.VERSION.SDK_INT < 26) {
            return eVar;
        }
        boolean z11 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f10585a.w();
        ha.d<Boolean> dVar = com.bumptech.glide.load.resource.bitmap.m.f10774i;
        Boolean bool = (Boolean) eVar.c(dVar);
        if (bool == null || (bool.booleanValue() && !z11)) {
            ha.e eVar2 = new ha.e();
            eVar2.d(this.f10599o);
            eVar2.e(dVar, Boolean.valueOf(z11));
            return eVar2;
        }
        return eVar;
    }

    private int o() {
        return this.f10594j.ordinal();
    }

    private void r(String str, long j11) {
        s(str, j11, null);
    }

    private void s(String str, long j11, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(bb.f.a(j11));
        sb2.append(", load key: ");
        sb2.append(this.f10595k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void t(ja.c<R> cVar, com.bumptech.glide.load.a aVar, boolean z11) {
        F();
        this.f10600p.c(cVar, aVar, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(ja.c<R> cVar, com.bumptech.glide.load.a aVar, boolean z11) {
        if (cVar instanceof ja.b) {
            ((ja.b) cVar).initialize();
        }
        r rVar = 0;
        if (this.f10590f.c()) {
            cVar = r.e(cVar);
            rVar = cVar;
        }
        t(cVar, aVar, z11);
        this.f10602t = EnumC0203h.ENCODE;
        try {
            if (this.f10590f.c()) {
                this.f10590f.b(this.f10588d, this.f10599o);
            }
            w();
        } finally {
            if (rVar != 0) {
                rVar.g();
            }
        }
    }

    private void v() {
        F();
        this.f10600p.b(new GlideException("Failed to load resource", new ArrayList(this.f10586b)));
        x();
    }

    private void w() {
        if (this.f10591g.b()) {
            A();
        }
    }

    private void x() {
        if (this.f10591g.c()) {
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        EnumC0203h l11 = l(EnumC0203h.INITIALIZE);
        return l11 == EnumC0203h.RESOURCE_CACHE || l11 == EnumC0203h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(ha.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(bVar, aVar, dVar.a());
        this.f10586b.add(glideException);
        if (Thread.currentThread() != this.A) {
            this.f10603w = g.SWITCH_TO_SOURCE_SERVICE;
            this.f10600p.e(this);
            return;
        }
        B();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b() {
        this.f10603w = g.SWITCH_TO_SOURCE_SERVICE;
        this.f10600p.e(this);
    }

    public void c() {
        this.L = true;
        com.bumptech.glide.load.engine.f fVar = this.H;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // cb.a.f
    public cb.c d() {
        return this.f10587c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(ha.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, ha.b bVar2) {
        this.B = bVar;
        this.E = obj;
        this.G = dVar;
        this.F = aVar;
        this.C = bVar2;
        this.O = bVar != this.f10585a.c().get(0);
        if (Thread.currentThread() != this.A) {
            this.f10603w = g.DECODE_DATA;
            this.f10600p.e(this);
            return;
        }
        cb.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            cb.b.d();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(h<?> hVar) {
        int o11 = o() - hVar.o();
        return o11 == 0 ? this.f10601q - hVar.f10601q : o11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<R> q(com.bumptech.glide.e eVar, Object obj, m mVar, ha.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, ja.a aVar, Map<Class<?>, ha.h<?>> map, boolean z11, boolean z12, boolean z13, ha.e eVar2, b<R> bVar2, int i13) {
        this.f10585a.u(eVar, obj, bVar, i11, i12, aVar, cls, cls2, hVar, eVar2, map, z11, z12, this.f10588d);
        this.f10592h = eVar;
        this.f10593i = bVar;
        this.f10594j = hVar;
        this.f10595k = mVar;
        this.f10596l = i11;
        this.f10597m = i12;
        this.f10598n = aVar;
        this.f10605y = z13;
        this.f10599o = eVar2;
        this.f10600p = bVar2;
        this.f10601q = i13;
        this.f10603w = g.INITIALIZE;
        this.f10606z = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb.b.b("DecodeJob#run(model=%s)", this.f10606z);
        com.bumptech.glide.load.data.d<?> dVar = this.G;
        try {
            try {
                if (this.L) {
                    v();
                    if (dVar != null) {
                        dVar.cleanup();
                    }
                    cb.b.d();
                    return;
                }
                E();
                if (dVar != null) {
                    dVar.cleanup();
                }
                cb.b.d();
            } catch (com.bumptech.glide.load.engine.b e11) {
                throw e11;
            }
        }
    }

    <Z> ja.c<Z> y(com.bumptech.glide.load.a aVar, ja.c<Z> cVar) {
        ja.c<Z> cVar2;
        ha.h<Z> hVar;
        com.bumptech.glide.load.c cVar3;
        ha.b dVar;
        Class<?> cls = cVar.get().getClass();
        ha.g<Z> gVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            ha.h<Z> r11 = this.f10585a.r(cls);
            hVar = r11;
            cVar2 = r11.a(this.f10592h, cVar, this.f10596l, this.f10597m);
        } else {
            cVar2 = cVar;
            hVar = null;
        }
        if (!cVar.equals(cVar2)) {
            cVar.recycle();
        }
        if (this.f10585a.v(cVar2)) {
            gVar = this.f10585a.n(cVar2);
            cVar3 = gVar.b(this.f10599o);
        } else {
            cVar3 = com.bumptech.glide.load.c.NONE;
        }
        ha.g gVar2 = gVar;
        if (this.f10598n.d(!this.f10585a.x(this.B), aVar, cVar3)) {
            if (gVar2 != null) {
                int i11 = a.f10609c[cVar3.ordinal()];
                if (i11 == 1) {
                    dVar = new com.bumptech.glide.load.engine.d(this.B, this.f10593i);
                } else if (i11 == 2) {
                    dVar = new t(this.f10585a.b(), this.B, this.f10593i, this.f10596l, this.f10597m, hVar, cls, this.f10599o);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: " + cVar3);
                }
                r e11 = r.e(cVar2);
                this.f10590f.d(dVar, gVar2, e11);
                return e11;
            }
            throw new Registry.NoResultEncoderAvailableException(cVar2.get().getClass());
        }
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z11) {
        if (this.f10591g.d(z11)) {
            A();
        }
    }
}
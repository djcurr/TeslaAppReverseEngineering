package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: g */
    public static final d0.a<Integer> f2255g = d0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: h */
    public static final d0.a<Integer> f2256h = d0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<DeferrableSurface> f2257a;

    /* renamed from: b */
    final d0 f2258b;

    /* renamed from: c */
    final int f2259c;

    /* renamed from: d */
    final List<e> f2260d;

    /* renamed from: e */
    private final boolean f2261e;

    /* renamed from: f */
    private final l1 f2262f;

    /* loaded from: classes.dex */
    public interface b {
        void a(p1<?> p1Var, a aVar);
    }

    a0(List<DeferrableSurface> list, d0 d0Var, int i11, List<e> list2, boolean z11, l1 l1Var) {
        this.f2257a = list;
        this.f2258b = d0Var;
        this.f2259c = i11;
        this.f2260d = Collections.unmodifiableList(list2);
        this.f2261e = z11;
        this.f2262f = l1Var;
    }

    public static a0 a() {
        return new a().h();
    }

    public List<e> b() {
        return this.f2260d;
    }

    public d0 c() {
        return this.f2258b;
    }

    public List<DeferrableSurface> d() {
        return Collections.unmodifiableList(this.f2257a);
    }

    public l1 e() {
        return this.f2262f;
    }

    public int f() {
        return this.f2259c;
    }

    public boolean g() {
        return this.f2261e;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<DeferrableSurface> f2263a;

        /* renamed from: b */
        private w0 f2264b;

        /* renamed from: c */
        private int f2265c;

        /* renamed from: d */
        private List<e> f2266d;

        /* renamed from: e */
        private boolean f2267e;

        /* renamed from: f */
        private y0 f2268f;

        public a() {
            this.f2263a = new HashSet();
            this.f2264b = x0.I();
            this.f2265c = -1;
            this.f2266d = new ArrayList();
            this.f2267e = false;
            this.f2268f = y0.f();
        }

        public static a i(p1<?> p1Var) {
            b o11 = p1Var.o(null);
            if (o11 != null) {
                a aVar = new a();
                o11.a(p1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + p1Var.r(p1Var.toString()));
        }

        public static a j(a0 a0Var) {
            return new a(a0Var);
        }

        public void a(Collection<e> collection) {
            for (e eVar : collection) {
                c(eVar);
            }
        }

        public void b(l1 l1Var) {
            this.f2268f.e(l1Var);
        }

        public void c(e eVar) {
            if (!this.f2266d.contains(eVar)) {
                this.f2266d.add(eVar);
                return;
            }
            throw new IllegalArgumentException("duplicate camera capture callback");
        }

        public <T> void d(d0.a<T> aVar, T t11) {
            this.f2264b.p(aVar, t11);
        }

        public void e(d0 d0Var) {
            for (d0.a<?> aVar : d0Var.e()) {
                Object g11 = this.f2264b.g(aVar, null);
                Object a11 = d0Var.a(aVar);
                if (g11 instanceof v0) {
                    ((v0) g11).a(((v0) a11).c());
                } else {
                    if (a11 instanceof v0) {
                        a11 = ((v0) a11).clone();
                    }
                    this.f2264b.n(aVar, d0Var.h(aVar), a11);
                }
            }
        }

        public void f(DeferrableSurface deferrableSurface) {
            this.f2263a.add(deferrableSurface);
        }

        public void g(String str, Integer num) {
            this.f2268f.h(str, num);
        }

        public a0 h() {
            return new a0(new ArrayList(this.f2263a), b1.G(this.f2264b), this.f2265c, this.f2266d, this.f2267e, l1.b(this.f2268f));
        }

        public Set<DeferrableSurface> k() {
            return this.f2263a;
        }

        public int l() {
            return this.f2265c;
        }

        public void m(d0 d0Var) {
            this.f2264b = x0.J(d0Var);
        }

        public void n(int i11) {
            this.f2265c = i11;
        }

        public void o(boolean z11) {
            this.f2267e = z11;
        }

        private a(a0 a0Var) {
            HashSet hashSet = new HashSet();
            this.f2263a = hashSet;
            this.f2264b = x0.I();
            this.f2265c = -1;
            this.f2266d = new ArrayList();
            this.f2267e = false;
            this.f2268f = y0.f();
            hashSet.addAll(a0Var.f2257a);
            this.f2264b = x0.J(a0Var.f2258b);
            this.f2265c = a0Var.f2259c;
            this.f2266d.addAll(a0Var.b());
            this.f2267e = a0Var.g();
            this.f2268f = y0.g(a0Var.e());
        }
    }
}
package c1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o implements t {

    /* renamed from: a  reason: collision with root package name */
    private final m f8620a;

    /* renamed from: b  reason: collision with root package name */
    private final e<?> f8621b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Object> f8622c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8623d;

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<d1> f8624e;

    /* renamed from: f  reason: collision with root package name */
    private final i1 f8625f;

    /* renamed from: g  reason: collision with root package name */
    private final d1.d<z0> f8626g;

    /* renamed from: h  reason: collision with root package name */
    private final d1.d<w<?>> f8627h;

    /* renamed from: i  reason: collision with root package name */
    private final List<h00.q<e<?>, k1, c1, vz.b0>> f8628i;

    /* renamed from: j  reason: collision with root package name */
    private final d1.d<z0> f8629j;

    /* renamed from: k  reason: collision with root package name */
    private d1.b<z0, d1.c<Object>> f8630k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8631l;

    /* renamed from: m  reason: collision with root package name */
    private final j f8632m;

    /* renamed from: n  reason: collision with root package name */
    private final zz.g f8633n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8634o;

    /* renamed from: p  reason: collision with root package name */
    private h00.p<? super i, ? super Integer, vz.b0> f8635p;

    /* loaded from: classes.dex */
    private static final class a implements c1 {

        /* renamed from: a  reason: collision with root package name */
        private final Set<d1> f8636a;

        /* renamed from: b  reason: collision with root package name */
        private final List<d1> f8637b;

        /* renamed from: c  reason: collision with root package name */
        private final List<d1> f8638c;

        /* renamed from: d  reason: collision with root package name */
        private final List<h00.a<vz.b0>> f8639d;

        public a(Set<d1> abandoning) {
            kotlin.jvm.internal.s.g(abandoning, "abandoning");
            this.f8636a = abandoning;
            this.f8637b = new ArrayList();
            this.f8638c = new ArrayList();
            this.f8639d = new ArrayList();
        }

        @Override // c1.c1
        public void a(d1 instance) {
            kotlin.jvm.internal.s.g(instance, "instance");
            int lastIndexOf = this.f8638c.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f8638c.remove(lastIndexOf);
                this.f8636a.remove(instance);
                return;
            }
            this.f8637b.add(instance);
        }

        @Override // c1.c1
        public void b(h00.a<vz.b0> effect) {
            kotlin.jvm.internal.s.g(effect, "effect");
            this.f8639d.add(effect);
        }

        @Override // c1.c1
        public void c(d1 instance) {
            kotlin.jvm.internal.s.g(instance, "instance");
            int lastIndexOf = this.f8637b.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f8637b.remove(lastIndexOf);
                this.f8636a.remove(instance);
                return;
            }
            this.f8638c.add(instance);
        }

        public final void d() {
            if (!this.f8636a.isEmpty()) {
                Iterator<d1> it2 = this.f8636a.iterator();
                while (it2.hasNext()) {
                    it2.remove();
                    it2.next().d();
                }
            }
        }

        public final void e() {
            int i11;
            if ((!this.f8638c.isEmpty()) && this.f8638c.size() - 1 >= 0) {
                while (true) {
                    int i12 = i11 - 1;
                    d1 d1Var = this.f8638c.get(i11);
                    if (!this.f8636a.contains(d1Var)) {
                        d1Var.e();
                    }
                    if (i12 < 0) {
                        break;
                    }
                    i11 = i12;
                }
            }
            if (!this.f8637b.isEmpty()) {
                List<d1> list = this.f8637b;
                int i13 = 0;
                int size = list.size();
                while (i13 < size) {
                    int i14 = i13 + 1;
                    d1 d1Var2 = list.get(i13);
                    this.f8636a.remove(d1Var2);
                    d1Var2.b();
                    i13 = i14;
                }
            }
        }

        public final void f() {
            if (!this.f8639d.isEmpty()) {
                List<h00.a<vz.b0>> list = this.f8639d;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).mo11invoke();
                }
                this.f8639d.clear();
            }
        }
    }

    public o(m parent, e<?> applier, zz.g gVar) {
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(applier, "applier");
        this.f8620a = parent;
        this.f8621b = applier;
        this.f8622c = new AtomicReference<>(null);
        this.f8623d = new Object();
        HashSet<d1> hashSet = new HashSet<>();
        this.f8624e = hashSet;
        i1 i1Var = new i1();
        this.f8625f = i1Var;
        this.f8626g = new d1.d<>();
        this.f8627h = new d1.d<>();
        ArrayList arrayList = new ArrayList();
        this.f8628i = arrayList;
        this.f8629j = new d1.d<>();
        this.f8630k = new d1.b<>(0, 1, null);
        j jVar = new j(applier, parent, i1Var, hashSet, arrayList, this);
        parent.i(jVar);
        this.f8632m = jVar;
        this.f8633n = gVar;
        boolean z11 = parent instanceof a1;
        this.f8635p = g.f8467a.a();
    }

    private final void c(Set<? extends Object> set) {
        int f11;
        d1.c<w> n11;
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        for (Object obj : set) {
            if (obj instanceof z0) {
                ((z0) obj).r(null);
            } else {
                g(this, l0Var, obj);
                d1.d<w<?>> dVar = this.f8627h;
                f11 = dVar.f(obj);
                if (f11 >= 0) {
                    n11 = dVar.n(f11);
                    for (w wVar : n11) {
                        g(this, l0Var, wVar);
                    }
                }
            }
        }
        HashSet hashSet = (HashSet) l0Var.f34916a;
        if (hashSet == null) {
            return;
        }
        d1.d<z0> dVar2 = this.f8626g;
        int j11 = dVar2.j();
        int i11 = 0;
        int i12 = 0;
        while (i11 < j11) {
            int i13 = i11 + 1;
            int i14 = dVar2.k()[i11];
            d1.c cVar = dVar2.i()[i14];
            kotlin.jvm.internal.s.e(cVar);
            int size = cVar.size();
            int i15 = 0;
            int i16 = 0;
            while (i15 < size) {
                int i17 = i15 + 1;
                Object obj2 = cVar.f()[i15];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!hashSet.contains((z0) obj2)) {
                    if (i16 != i15) {
                        cVar.f()[i16] = obj2;
                    }
                    i16++;
                }
                i15 = i17;
            }
            int size2 = cVar.size();
            for (int i18 = i16; i18 < size2; i18++) {
                cVar.f()[i18] = null;
            }
            cVar.i(i16);
            if (cVar.size() > 0) {
                if (i12 != i11) {
                    int i19 = dVar2.k()[i12];
                    dVar2.k()[i12] = i14;
                    dVar2.k()[i11] = i19;
                }
                i12++;
            }
            i11 = i13;
        }
        int j12 = dVar2.j();
        for (int i21 = i12; i21 < j12; i21++) {
            dVar2.l()[dVar2.k()[i21]] = null;
        }
        dVar2.o(i12);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, T] */
    private static final void g(o oVar, kotlin.jvm.internal.l0<HashSet<z0>> l0Var, Object obj) {
        int f11;
        d1.c<z0> n11;
        d1.d<z0> dVar = oVar.f8626g;
        f11 = dVar.f(obj);
        if (f11 >= 0) {
            n11 = dVar.n(f11);
            for (z0 z0Var : n11) {
                if (!oVar.f8629j.m(obj, z0Var) && z0Var.r(obj) != g0.IGNORED) {
                    HashSet<z0> hashSet = l0Var.f34916a;
                    HashSet<z0> hashSet2 = hashSet;
                    if (hashSet == null) {
                        ?? hashSet3 = new HashSet();
                        l0Var.f34916a = hashSet3;
                        hashSet2 = hashSet3;
                    }
                    hashSet2.add(z0Var);
                }
            }
        }
    }

    private final void o() {
        Object andSet = this.f8622c.getAndSet(p.c());
        if (andSet == null) {
            return;
        }
        if (!kotlin.jvm.internal.s.c(andSet, p.c())) {
            if (andSet instanceof Set) {
                c((Set) andSet);
                return;
            } else if (!(andSet instanceof Object[])) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("corrupt pendingModifications drain: ", this.f8622c).toString());
            } else {
                Set<? extends Object>[] setArr = (Set[]) andSet;
                int i11 = 0;
                int length = setArr.length;
                while (i11 < length) {
                    Set<? extends Object> set = setArr[i11];
                    i11++;
                    c(set);
                }
                return;
            }
        }
        throw new IllegalStateException("pending composition has not been applied".toString());
    }

    private final void p() {
        Object andSet = this.f8622c.getAndSet(null);
        if (kotlin.jvm.internal.s.c(andSet, p.c())) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new IllegalStateException(kotlin.jvm.internal.s.p("corrupt pendingModifications drain: ", this.f8622c).toString());
        } else {
            Set<? extends Object>[] setArr = (Set[]) andSet;
            int i11 = 0;
            int length = setArr.length;
            while (i11 < length) {
                Set<? extends Object> set = setArr[i11];
                i11++;
                c(set);
            }
        }
    }

    private final boolean q() {
        return this.f8632m.m0();
    }

    private final void t(Object obj) {
        int f11;
        d1.c<z0> n11;
        d1.d<z0> dVar = this.f8626g;
        f11 = dVar.f(obj);
        if (f11 >= 0) {
            n11 = dVar.n(f11);
            for (z0 z0Var : n11) {
                if (z0Var.r(obj) == g0.IMMINENT) {
                    this.f8629j.c(obj, z0Var);
                }
            }
        }
    }

    private final d1.b<z0, d1.c<Object>> x() {
        d1.b<z0, d1.c<Object>> bVar = this.f8630k;
        this.f8630k = new d1.b<>(0, 1, null);
        return bVar;
    }

    @Override // c1.t
    public boolean a() {
        boolean D0;
        synchronized (this.f8623d) {
            o();
            D0 = this.f8632m.D0(x());
            if (!D0) {
                p();
            }
        }
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // c1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.s.g(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            d1.d<c1.z0> r1 = r2.f8626g
            boolean r1 = r1.e(r0)
            if (r1 != 0) goto L23
            d1.d<c1.w<?>> r1 = r2.f8627h
            boolean r0 = r1.e(r0)
            if (r0 == 0) goto L9
        L23:
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.o.b(java.util.Set):boolean");
    }

    @Override // c1.l
    public void d(h00.p<? super i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        if (!this.f8634o) {
            this.f8635p = content;
            this.f8620a.a(this, content);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // c1.l
    public void dispose() {
        synchronized (this.f8623d) {
            if (!this.f8634o) {
                this.f8634o = true;
                v(g.f8467a.b());
                boolean z11 = this.f8625f.i() > 0;
                if (z11 || (true ^ this.f8624e.isEmpty())) {
                    a aVar = new a(this.f8624e);
                    if (z11) {
                        k1 p11 = this.f8625f.p();
                        k.N(p11, aVar);
                        vz.b0 b0Var = vz.b0.f54756a;
                        p11.h();
                        this.f8621b.clear();
                        aVar.e();
                    }
                    aVar.d();
                }
                this.f8632m.c0();
            }
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
        this.f8620a.l(this);
    }

    @Override // c1.t
    public void e(Object value) {
        z0 o02;
        kotlin.jvm.internal.s.g(value, "value");
        if (q() || (o02 = this.f8632m.o0()) == null) {
            return;
        }
        o02.D(true);
        this.f8626g.c(value, o02);
        if (value instanceof w) {
            for (m1.b0 b0Var : ((w) value).f()) {
                this.f8627h.c(b0Var, value);
            }
        }
        o02.t(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // c1.t
    public void f(Set<? extends Object> values) {
        Object obj;
        Set<? extends Object> set;
        kotlin.jvm.internal.s.g(values, "values");
        do {
            obj = this.f8622c.get();
            if (obj == null ? true : kotlin.jvm.internal.s.c(obj, p.c())) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{(Set) obj, values};
            } else if (!(obj instanceof Object[])) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("corrupt pendingModifications: ", this.f8622c).toString());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set = wz.l.w((Set[]) obj, values);
            }
        } while (!this.f8622c.compareAndSet(obj, set));
        if (obj == null) {
            synchronized (this.f8623d) {
                p();
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    @Override // c1.t
    public void h() {
        synchronized (this.f8623d) {
            a aVar = new a(this.f8624e);
            this.f8621b.h();
            k1 p11 = this.f8625f.p();
            e<?> eVar = this.f8621b;
            List<h00.q<e<?>, k1, c1, vz.b0>> list = this.f8628i;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                list.get(i12).invoke(eVar, p11, aVar);
            }
            this.f8628i.clear();
            vz.b0 b0Var = vz.b0.f54756a;
            p11.h();
            this.f8621b.e();
            aVar.e();
            aVar.f();
            if (r()) {
                w(false);
                d1.d<z0> dVar = this.f8626g;
                int j11 = dVar.j();
                int i13 = 0;
                int i14 = 0;
                while (i13 < j11) {
                    int i15 = i13 + 1;
                    int i16 = dVar.k()[i13];
                    d1.c cVar = dVar.i()[i16];
                    kotlin.jvm.internal.s.e(cVar);
                    int size2 = cVar.size();
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < size2) {
                        int i19 = i17 + 1;
                        Object obj = cVar.f()[i17];
                        if (obj != null) {
                            if (!(!((z0) obj).q())) {
                                if (i18 != i17) {
                                    cVar.f()[i18] = obj;
                                }
                                i18++;
                            }
                            i17 = i19;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                    int size3 = cVar.size();
                    for (int i21 = i18; i21 < size3; i21++) {
                        cVar.f()[i21] = null;
                    }
                    cVar.i(i18);
                    if (cVar.size() > 0) {
                        if (i14 != i13) {
                            int i22 = dVar.k()[i14];
                            dVar.k()[i14] = i16;
                            dVar.k()[i13] = i22;
                        }
                        i14++;
                    }
                    i13 = i15;
                }
                int j12 = dVar.j();
                for (int i23 = i14; i23 < j12; i23++) {
                    dVar.l()[dVar.k()[i23]] = null;
                }
                dVar.o(i14);
                d1.d<w<?>> dVar2 = this.f8627h;
                int j13 = dVar2.j();
                int i24 = 0;
                int i25 = 0;
                while (i24 < j13) {
                    int i26 = i24 + 1;
                    int i27 = dVar2.k()[i24];
                    d1.c cVar2 = dVar2.i()[i27];
                    kotlin.jvm.internal.s.e(cVar2);
                    int size4 = cVar2.size();
                    int i28 = i11;
                    int i29 = i28;
                    while (i28 < size4) {
                        int i31 = i28 + 1;
                        Object obj2 = cVar2.f()[i28];
                        if (obj2 != null) {
                            if (!(!this.f8626g.e((w) obj2))) {
                                if (i29 != i28) {
                                    cVar2.f()[i29] = obj2;
                                }
                                i29++;
                            }
                            i28 = i31;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                    int size5 = cVar2.size();
                    for (int i32 = i29; i32 < size5; i32++) {
                        cVar2.f()[i32] = null;
                    }
                    cVar2.i(i29);
                    if (cVar2.size() > 0) {
                        if (i25 != i24) {
                            int i33 = dVar2.k()[i25];
                            dVar2.k()[i25] = i27;
                            dVar2.k()[i24] = i33;
                        }
                        i25++;
                    }
                    i24 = i26;
                    i11 = 0;
                }
                int j14 = dVar2.j();
                for (int i34 = i25; i34 < j14; i34++) {
                    dVar2.l()[dVar2.k()[i34]] = null;
                }
                dVar2.o(i25);
            }
            aVar.d();
            p();
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
    }

    @Override // c1.t
    public boolean i() {
        return this.f8632m.s0();
    }

    @Override // c1.l
    public boolean isDisposed() {
        return this.f8634o;
    }

    @Override // c1.t
    public void j(Object value) {
        int f11;
        d1.c<w> n11;
        kotlin.jvm.internal.s.g(value, "value");
        synchronized (this.f8623d) {
            t(value);
            d1.d<w<?>> dVar = this.f8627h;
            f11 = dVar.f(value);
            if (f11 >= 0) {
                n11 = dVar.n(f11);
                for (w wVar : n11) {
                    t(wVar);
                }
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @Override // c1.l
    public boolean k() {
        boolean z11;
        synchronized (this.f8623d) {
            z11 = this.f8630k.f() > 0;
        }
        return z11;
    }

    @Override // c1.t
    public void l(h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        this.f8632m.w0(block);
    }

    @Override // c1.t
    public void m(h00.p<? super i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        try {
            synchronized (this.f8623d) {
                o();
                this.f8632m.Z(x(), content);
                vz.b0 b0Var = vz.b0.f54756a;
            }
        } catch (Throwable th2) {
            if (!this.f8624e.isEmpty()) {
                new a(this.f8624e).d();
            }
            throw th2;
        }
    }

    @Override // c1.t
    public void n() {
        synchronized (this.f8623d) {
            Object[] j11 = this.f8625f.j();
            int i11 = 0;
            int length = j11.length;
            while (i11 < length) {
                Object obj = j11[i11];
                i11++;
                z0 z0Var = obj instanceof z0 ? (z0) obj : null;
                if (z0Var != null) {
                    z0Var.invalidate();
                }
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final boolean r() {
        return this.f8631l;
    }

    public final g0 s(z0 scope, Object obj) {
        kotlin.jvm.internal.s.g(scope, "scope");
        if (scope.k()) {
            scope.z(true);
        }
        d i11 = scope.i();
        if (i11 != null && this.f8625f.q(i11) && i11.b()) {
            if (i11.d(this.f8625f) < 0) {
                return g0.IGNORED;
            }
            if (i() && this.f8632m.h1(scope, obj)) {
                return g0.IMMINENT;
            }
            if (obj == null) {
                this.f8630k.j(scope, null);
            } else {
                p.b(this.f8630k, scope, obj);
            }
            this.f8620a.g(this);
            return i() ? g0.DEFERRED : g0.SCHEDULED;
        }
        return g0.IGNORED;
    }

    public final void u(Object instance, z0 scope) {
        kotlin.jvm.internal.s.g(instance, "instance");
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f8626g.m(instance, scope);
    }

    public final void v(h00.p<? super i, ? super Integer, vz.b0> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<set-?>");
        this.f8635p = pVar;
    }

    public final void w(boolean z11) {
        this.f8631l = z11;
    }

    public /* synthetic */ o(m mVar, e eVar, zz.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, (i11 & 4) != 0 ? null : gVar);
    }
}
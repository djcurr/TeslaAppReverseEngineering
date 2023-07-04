package m1;

import c1.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import m1.j;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private static final h00.l<j, vz.b0> f38205a = b.f38215a;

    /* renamed from: b */
    private static final t1<h> f38206b = new t1<>();

    /* renamed from: c */
    private static final Object f38207c = new Object();

    /* renamed from: d */
    private static j f38208d;

    /* renamed from: e */
    private static int f38209e;

    /* renamed from: f */
    private static final List<h00.p<Set<? extends Object>, h, vz.b0>> f38210f;

    /* renamed from: g */
    private static final List<h00.l<Object, vz.b0>> f38211g;

    /* renamed from: h */
    private static final AtomicReference<m1.a> f38212h;

    /* renamed from: i */
    private static final h f38213i;

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<j, vz.b0> {

        /* renamed from: a */
        public static final a f38214a = new a();

        a() {
            super(1);
        }

        public final void a(j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(j jVar) {
            a(jVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<j, vz.b0> {

        /* renamed from: a */
        public static final b f38215a = new b();

        b() {
            super(1);
        }

        public final void a(j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(j jVar) {
            a(jVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ h00.l<Object, vz.b0> f38216a;

        /* renamed from: b */
        final /* synthetic */ h00.l<Object, vz.b0> f38217b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
            super(1);
            this.f38216a = lVar;
            this.f38217b = lVar2;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(Object state) {
            kotlin.jvm.internal.s.g(state, "state");
            this.f38216a.invoke(state);
            this.f38217b.invoke(state);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ h00.l<Object, vz.b0> f38218a;

        /* renamed from: b */
        final /* synthetic */ h00.l<Object, vz.b0> f38219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
            super(1);
            this.f38218a = lVar;
            this.f38219b = lVar2;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(Object state) {
            kotlin.jvm.internal.s.g(state, "state");
            this.f38218a.invoke(state);
            this.f38219b.invoke(state);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> extends kotlin.jvm.internal.u implements h00.l<j, T> {

        /* renamed from: a */
        final /* synthetic */ h00.l<j, T> f38220a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(h00.l<? super j, ? extends T> lVar) {
            super(1);
            this.f38220a = lVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final h invoke(j invalid) {
            kotlin.jvm.internal.s.g(invalid, "invalid");
            h hVar = (h) this.f38220a.invoke(invalid);
            synchronized (l.z()) {
                l.f38208d = l.f38208d.o(hVar.d());
                vz.b0 b0Var = vz.b0.f54756a;
            }
            return hVar;
        }
    }

    static {
        j.a aVar = j.f38193e;
        f38208d = aVar.a();
        f38209e = 1;
        f38210f = new ArrayList();
        f38211g = new ArrayList();
        int i11 = f38209e;
        f38209e = i11 + 1;
        m1.a aVar2 = new m1.a(i11, aVar.a());
        f38208d = f38208d.o(aVar2.d());
        AtomicReference<m1.a> atomicReference = new AtomicReference<>(aVar2);
        f38212h = atomicReference;
        m1.a aVar3 = atomicReference.get();
        kotlin.jvm.internal.s.f(aVar3, "currentGlobalSnapshot.get()");
        f38213i = aVar3;
    }

    public static final h A() {
        return f38213i;
    }

    public static final h00.l<Object, vz.b0> B(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.s.c(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new c(lVar, lVar2);
    }

    public static final h00.l<Object, vz.b0> C(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.s.c(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new d(lVar, lVar2);
    }

    public static final <T extends c0> T D(T t11, b0 state, h snapshot) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        T t12 = (T) P(state, snapshot.d(), f38208d);
        if (t12 == null) {
            t12 = null;
        } else {
            t12.f(Integer.MAX_VALUE);
        }
        if (t12 == null) {
            T t13 = (T) t11.b();
            t13.f(Integer.MAX_VALUE);
            t13.e(state.b());
            state.e(t13);
            return t13;
        }
        return t12;
    }

    public static final <T extends c0> T E(T t11, b0 state, h snapshot) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        T t12 = (T) D(t11, state, snapshot);
        t12.a(t11);
        t12.f(snapshot.d());
        return t12;
    }

    public static final void F(h snapshot, b0 state) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        kotlin.jvm.internal.s.g(state, "state");
        h00.l<Object, vz.b0> h11 = snapshot.h();
        if (h11 == null) {
            return;
        }
        h11.invoke(state);
    }

    public static final Map<c0, c0> G(m1.c cVar, m1.c cVar2, j jVar) {
        c0 J;
        Set<b0> x11 = cVar2.x();
        int d11 = cVar.d();
        if (x11 == null) {
            return null;
        }
        j n11 = cVar2.e().o(cVar2.d()).n(cVar2.y());
        HashMap hashMap = null;
        for (b0 b0Var : x11) {
            c0 b11 = b0Var.b();
            c0 J2 = J(b11, d11, jVar);
            if (J2 != null && (J = J(b11, d11, n11)) != null && !kotlin.jvm.internal.s.c(J2, J)) {
                c0 J3 = J(b11, cVar2.d(), cVar2.e());
                if (J3 != null) {
                    c0 c11 = b0Var.c(J, J2, J3);
                    if (c11 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(J2, c11);
                    hashMap = hashMap;
                } else {
                    I();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends c0> T H(T t11, b0 state, h snapshot, T candidate) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        kotlin.jvm.internal.s.g(candidate, "candidate");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        int d11 = snapshot.d();
        if (candidate.d() == d11) {
            return candidate;
        }
        T t12 = (T) D(t11, state, snapshot);
        t12.f(d11);
        snapshot.m(state);
        return t12;
    }

    public static final Void I() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends c0> T J(T t11, int i11, j jVar) {
        T t12 = null;
        while (t11 != null) {
            if (R(t11, i11, jVar) && (t12 == null || t12.d() < t11.d())) {
                t12 = t11;
            }
            t11 = (T) t11.c();
        }
        if (t12 != null) {
            return t12;
        }
        return null;
    }

    public static final <T extends c0> T K(T t11, b0 state) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        return (T) L(t11, state, y());
    }

    public static final <T extends c0> T L(T t11, b0 state, h snapshot) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        h00.l<Object, vz.b0> f11 = snapshot.f();
        if (f11 != null) {
            f11.invoke(state);
        }
        T t12 = (T) J(t11, snapshot.d(), snapshot.e());
        if (t12 != null) {
            return t12;
        }
        I();
        throw new KotlinNothingValueException();
    }

    public static final Void M() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T N(h hVar, h00.l<? super j, ? extends T> lVar) {
        T invoke = lVar.invoke(f38208d.j(hVar.d()));
        synchronized (z()) {
            int i11 = f38209e;
            f38209e = i11 + 1;
            f38208d = f38208d.j(hVar.d());
            f38212h.set(new m1.a(i11, f38208d));
            f38208d = f38208d.o(i11);
            vz.b0 b0Var = vz.b0.f54756a;
        }
        return invoke;
    }

    public static final <T extends h> T O(h00.l<? super j, ? extends T> lVar) {
        return (T) v(new e(lVar));
    }

    private static final c0 P(b0 b0Var, int i11, j jVar) {
        int m11 = jVar.m(i11);
        c0 c0Var = null;
        for (c0 b11 = b0Var.b(); b11 != null; b11 = b11.c()) {
            if (b11.d() == 0) {
                return b11;
            }
            if (R(b11, m11, jVar)) {
                if (c0Var != null) {
                    return b11.d() < c0Var.d() ? b11 : c0Var;
                }
                c0Var = b11;
            }
        }
        return null;
    }

    private static final boolean Q(int i11, int i12, j jVar) {
        return (i12 == 0 || i12 > i11 || jVar.k(i12)) ? false : true;
    }

    private static final boolean R(c0 c0Var, int i11, j jVar) {
        return Q(i11, c0Var.d(), jVar);
    }

    public static final void S(h hVar) {
        if (!f38208d.k(hVar.d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends c0> T T(T t11, b0 state, h snapshot) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        T t12 = (T) J(t11, snapshot.d(), snapshot.e());
        if (t12 != null) {
            if (t12.d() == snapshot.d()) {
                return t12;
            }
            T t13 = (T) E(t12, state, snapshot);
            snapshot.m(state);
            return t13;
        }
        I();
        throw new KotlinNothingValueException();
    }

    public static final /* synthetic */ void b() {
        w();
    }

    public static final /* synthetic */ AtomicReference d() {
        return f38212h;
    }

    public static final /* synthetic */ List f() {
        return f38211g;
    }

    public static final /* synthetic */ int g() {
        return f38209e;
    }

    public static final /* synthetic */ h00.l j(h00.l lVar, h00.l lVar2) {
        return B(lVar, lVar2);
    }

    public static final /* synthetic */ h00.l k(h00.l lVar, h00.l lVar2) {
        return C(lVar, lVar2);
    }

    public static final /* synthetic */ void p(int i11) {
        f38209e = i11;
    }

    public static final /* synthetic */ h s(h00.l lVar) {
        return O(lVar);
    }

    public static final j u(j jVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(jVar, "<this>");
        while (i11 < i12) {
            jVar = jVar.o(i11);
            i11++;
        }
        return jVar;
    }

    public static final <T> T v(h00.l<? super j, ? extends T> lVar) {
        T t11;
        List Q0;
        m1.a previousGlobalSnapshot = f38212h.get();
        synchronized (z()) {
            kotlin.jvm.internal.s.f(previousGlobalSnapshot, "previousGlobalSnapshot");
            t11 = (T) N(previousGlobalSnapshot, lVar);
        }
        Set<b0> x11 = previousGlobalSnapshot.x();
        if (x11 != null) {
            synchronized (z()) {
                Q0 = wz.e0.Q0(f38210f);
            }
            int size = Q0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((h00.p) Q0.get(i11)).invoke(x11, previousGlobalSnapshot);
            }
        }
        return t11;
    }

    public static final void w() {
        v(a.f38214a);
    }

    public static final <T extends c0> T x(T r11, h snapshot) {
        kotlin.jvm.internal.s.g(r11, "r");
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        T t11 = (T) J(r11, snapshot.d(), snapshot.e());
        if (t11 != null) {
            return t11;
        }
        I();
        throw new KotlinNothingValueException();
    }

    public static final h y() {
        h a11 = f38206b.a();
        if (a11 == null) {
            m1.a aVar = f38212h.get();
            kotlin.jvm.internal.s.f(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return a11;
    }

    public static final Object z() {
        return f38207c;
    }
}
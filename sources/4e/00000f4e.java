package c1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import m1.b0;
import m1.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v<T> implements m1.b0, w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.a<T> f8701a;

    /* renamed from: b  reason: collision with root package name */
    private a<T> f8702b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> extends m1.c0 {

        /* renamed from: c  reason: collision with root package name */
        private HashSet<m1.b0> f8703c;

        /* renamed from: d  reason: collision with root package name */
        private T f8704d;

        /* renamed from: e  reason: collision with root package name */
        private int f8705e;

        @Override // m1.c0
        public void a(m1.c0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            a aVar = (a) value;
            this.f8703c = aVar.f8703c;
            this.f8704d = aVar.f8704d;
            this.f8705e = aVar.f8705e;
        }

        @Override // m1.c0
        public m1.c0 b() {
            return new a();
        }

        public final HashSet<m1.b0> g() {
            return this.f8703c;
        }

        public final T h() {
            return this.f8704d;
        }

        public final boolean i(w<?> derivedState, m1.h snapshot) {
            kotlin.jvm.internal.s.g(derivedState, "derivedState");
            kotlin.jvm.internal.s.g(snapshot, "snapshot");
            return this.f8704d != null && this.f8705e == j(derivedState, snapshot);
        }

        public final int j(w<?> derivedState, m1.h snapshot) {
            HashSet<m1.b0> g11;
            t1 t1Var;
            kotlin.jvm.internal.s.g(derivedState, "derivedState");
            kotlin.jvm.internal.s.g(snapshot, "snapshot");
            synchronized (m1.l.z()) {
                g11 = g();
            }
            int i11 = 7;
            if (g11 != null) {
                t1Var = o1.f8640a;
                e1.e eVar = (e1.e) t1Var.a();
                if (eVar == null) {
                    eVar = e1.a.b();
                }
                int size = eVar.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    ((h00.l) ((vz.p) eVar.get(i13)).a()).invoke(derivedState);
                }
                try {
                    Iterator<m1.b0> it2 = g11.iterator();
                    while (it2.hasNext()) {
                        m1.b0 stateObject = it2.next();
                        m1.c0 b11 = stateObject.b();
                        kotlin.jvm.internal.s.f(stateObject, "stateObject");
                        m1.c0 L = m1.l.L(b11, stateObject, snapshot);
                        i11 = (((i11 * 31) + c.a(L)) * 31) + L.d();
                    }
                    vz.b0 b0Var = vz.b0.f54756a;
                } finally {
                    int size2 = eVar.size();
                    while (i12 < size2) {
                        ((h00.l) ((vz.p) eVar.get(i12)).b()).invoke(derivedState);
                        i12++;
                    }
                }
            }
            return i11;
        }

        public final void k(HashSet<m1.b0> hashSet) {
            this.f8703c = hashSet;
        }

        public final void l(T t11) {
            this.f8704d = t11;
        }

        public final void m(int i11) {
            this.f8705e = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v<T> f8706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashSet<m1.b0> f8707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v<T> vVar, HashSet<m1.b0> hashSet) {
            super(1);
            this.f8706a = vVar;
            this.f8707b = hashSet;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 != this.f8706a) {
                if (it2 instanceof m1.b0) {
                    this.f8707b.add(it2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(h00.a<? extends T> calculation) {
        kotlin.jvm.internal.s.g(calculation, "calculation");
        this.f8701a = calculation;
        this.f8702b = new a<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> g(a<T> aVar, m1.h hVar, h00.a<? extends T> aVar2) {
        t1 t1Var;
        t1 t1Var2;
        t1 t1Var3;
        h.a aVar3;
        a<T> aVar4;
        t1 t1Var4;
        if (aVar.i(this, hVar)) {
            return aVar;
        }
        t1Var = o1.f8641b;
        Boolean bool = (Boolean) t1Var.a();
        int i11 = 0;
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        HashSet hashSet = new HashSet();
        t1Var2 = o1.f8640a;
        e1.e eVar = (e1.e) t1Var2.a();
        if (eVar == null) {
            eVar = e1.a.b();
        }
        int size = eVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((h00.l) ((vz.p) eVar.get(i12)).a()).invoke(this);
        }
        if (!booleanValue) {
            try {
                t1Var3 = o1.f8641b;
                t1Var3.b(Boolean.TRUE);
            } finally {
                int size2 = eVar.size();
                while (i11 < size2) {
                    ((h00.l) ((vz.p) eVar.get(i11)).b()).invoke(this);
                    i11++;
                }
            }
        }
        Object c11 = m1.h.f38186d.c(new b(this, hashSet), null, aVar2);
        if (!booleanValue) {
            t1Var4 = o1.f8641b;
            t1Var4.b(Boolean.FALSE);
        }
        synchronized (m1.l.z()) {
            aVar3 = m1.h.f38186d;
            m1.h a11 = aVar3.a();
            aVar4 = (a<T>) ((a) m1.l.E(this.f8702b, this, a11));
            aVar4.k(hashSet);
            aVar4.m(aVar4.j(this, a11));
            aVar4.l(c11);
        }
        if (!booleanValue) {
            aVar3.b();
        }
        return aVar4;
    }

    private final String h() {
        a<T> aVar = this.f8702b;
        h.a aVar2 = m1.h.f38186d;
        a aVar3 = (a) m1.l.x(aVar, aVar2.a());
        return aVar3.i(this, aVar2.a()) ? String.valueOf(aVar3.h()) : "<Not calculated>";
    }

    @Override // c1.w
    public T a() {
        a<T> aVar = this.f8702b;
        h.a aVar2 = m1.h.f38186d;
        return g((a) m1.l.x(aVar, aVar2.a()), aVar2.a(), this.f8701a).h();
    }

    @Override // m1.b0
    public m1.c0 b() {
        return this.f8702b;
    }

    @Override // m1.b0
    public m1.c0 c(m1.c0 c0Var, m1.c0 c0Var2, m1.c0 c0Var3) {
        return b0.a.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // m1.b0
    public void e(m1.c0 value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f8702b = (a) value;
    }

    @Override // c1.w
    public Set<m1.b0> f() {
        Set<m1.b0> d11;
        a<T> aVar = this.f8702b;
        h.a aVar2 = m1.h.f38186d;
        HashSet<m1.b0> g11 = g((a) m1.l.x(aVar, aVar2.a()), aVar2.a(), this.f8701a).g();
        if (g11 == null) {
            d11 = wz.x0.d();
            return d11;
        }
        return g11;
    }

    @Override // c1.v1
    public T getValue() {
        h00.l<Object, vz.b0> f11 = m1.h.f38186d.a().f();
        if (f11 != null) {
            f11.invoke(this);
        }
        return a();
    }

    public String toString() {
        a aVar = (a) m1.l.x(this.f8702b, m1.h.f38186d.a());
        return "DerivedState(value=" + h() + ")@" + hashCode();
    }
}
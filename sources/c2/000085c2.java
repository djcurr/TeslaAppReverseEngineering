package m1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<h00.a<vz.b0>, vz.b0> f38236a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<Set<? extends Object>, h, vz.b0> f38237b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38238c;

    /* renamed from: d  reason: collision with root package name */
    private final d1.e<a<?>> f38239d;

    /* renamed from: e  reason: collision with root package name */
    private f f38240e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38241f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f38242g;

    /* renamed from: h  reason: collision with root package name */
    private a<?> f38243h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h00.l<T, vz.b0> f38244a;

        /* renamed from: b  reason: collision with root package name */
        private final d1.d<T> f38245b;

        /* renamed from: c  reason: collision with root package name */
        private final HashSet<Object> f38246c;

        /* renamed from: d  reason: collision with root package name */
        private T f38247d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h00.l<? super T, vz.b0> onChanged) {
            kotlin.jvm.internal.s.g(onChanged, "onChanged");
            this.f38244a = onChanged;
            this.f38245b = new d1.d<>();
            this.f38246c = new HashSet<>();
        }

        public final void a(Object value) {
            kotlin.jvm.internal.s.g(value, "value");
            d1.d<T> dVar = this.f38245b;
            T t11 = this.f38247d;
            kotlin.jvm.internal.s.e(t11);
            dVar.c(value, t11);
        }

        public final void b(Collection<? extends Object> scopes) {
            kotlin.jvm.internal.s.g(scopes, "scopes");
            Iterator<T> it2 = scopes.iterator();
            while (it2.hasNext()) {
                f().invoke(it2.next());
            }
        }

        public final T c() {
            return this.f38247d;
        }

        public final HashSet<Object> d() {
            return this.f38246c;
        }

        public final d1.d<T> e() {
            return this.f38245b;
        }

        public final h00.l<T, vz.b0> f() {
            return this.f38244a;
        }

        public final void g(T t11) {
            this.f38247d = t11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<Set<? extends Object>, h, vz.b0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f38249a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar) {
                super(0);
                this.f38249a = vVar;
            }

            @Override // h00.a
            public /* bridge */ /* synthetic */ vz.b0 invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f38249a.f();
            }
        }

        b() {
            super(2);
        }

        public final void a(Set<? extends Object> applied, h noName_1) {
            int i11;
            int f11;
            d1.c<Object> n11;
            kotlin.jvm.internal.s.g(applied, "applied");
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            d1.e eVar = v.this.f38239d;
            v vVar = v.this;
            synchronized (eVar) {
                d1.e eVar2 = vVar.f38239d;
                int l11 = eVar2.l();
                i11 = 0;
                if (l11 > 0) {
                    Object[] k11 = eVar2.k();
                    int i12 = 0;
                    do {
                        a aVar = (a) k11[i11];
                        HashSet<Object> d11 = aVar.d();
                        d1.d e11 = aVar.e();
                        for (Object obj : applied) {
                            f11 = e11.f(obj);
                            if (f11 >= 0) {
                                n11 = e11.n(f11);
                                for (Object obj2 : n11) {
                                    d11.add(obj2);
                                    i12 = 1;
                                }
                            }
                        }
                        i11++;
                    } while (i11 < l11);
                    i11 = i12;
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
            if (i11 != 0) {
                v.this.f38236a.invoke(new a(v.this));
            }
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Set<? extends Object> set, h hVar) {
            a(set, hVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {
        c() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            kotlin.jvm.internal.s.g(state, "state");
            if (v.this.f38242g) {
                return;
            }
            d1.e eVar = v.this.f38239d;
            v vVar = v.this;
            synchronized (eVar) {
                a aVar = vVar.f38243h;
                kotlin.jvm.internal.s.e(aVar);
                aVar.a(state);
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(h00.l<? super h00.a<vz.b0>, vz.b0> onChangedExecutor) {
        kotlin.jvm.internal.s.g(onChangedExecutor, "onChangedExecutor");
        this.f38236a = onChangedExecutor;
        this.f38237b = new b();
        this.f38238c = new c();
        this.f38239d = new d1.e<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        d1.e<a<?>> eVar = this.f38239d;
        int l11 = eVar.l();
        if (l11 > 0) {
            int i11 = 0;
            a<?>[] k11 = eVar.k();
            do {
                a<?> aVar = k11[i11];
                HashSet<Object> d11 = aVar.d();
                if (!d11.isEmpty()) {
                    aVar.b(d11);
                    d11.clear();
                }
                i11++;
            } while (i11 < l11);
        }
    }

    private final <T> a<T> i(h00.l<? super T, vz.b0> lVar) {
        int i11;
        d1.e<a<?>> eVar = this.f38239d;
        int l11 = eVar.l();
        if (l11 > 0) {
            a<?>[] k11 = eVar.k();
            i11 = 0;
            do {
                if (k11[i11].f() == lVar) {
                    break;
                }
                i11++;
            } while (i11 < l11);
            i11 = -1;
        } else {
            i11 = -1;
        }
        if (i11 == -1) {
            a<T> aVar = new a<>(lVar);
            this.f38239d.b(aVar);
            return aVar;
        }
        return (a<T>) this.f38239d.k()[i11];
    }

    public final void g() {
        synchronized (this.f38239d) {
            d1.e<a<?>> eVar = this.f38239d;
            int l11 = eVar.l();
            if (l11 > 0) {
                int i11 = 0;
                a<?>[] k11 = eVar.k();
                do {
                    k11[i11].e().d();
                    i11++;
                } while (i11 < l11);
                vz.b0 b0Var = vz.b0.f54756a;
            } else {
                vz.b0 b0Var2 = vz.b0.f54756a;
            }
        }
    }

    public final void h(h00.l<Object, Boolean> predicate) {
        kotlin.jvm.internal.s.g(predicate, "predicate");
        synchronized (this.f38239d) {
            d1.e<a<?>> eVar = this.f38239d;
            int l11 = eVar.l();
            if (l11 > 0) {
                a<?>[] k11 = eVar.k();
                int i11 = 0;
                while (true) {
                    d1.d<?> e11 = k11[i11].e();
                    int j11 = e11.j();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < j11) {
                        int i14 = i12 + 1;
                        int i15 = e11.k()[i12];
                        d1.c cVar = e11.i()[i15];
                        kotlin.jvm.internal.s.e(cVar);
                        int size = cVar.size();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < size) {
                            int i18 = i16 + 1;
                            Object obj = cVar.f()[i16];
                            if (obj != null) {
                                if (!predicate.invoke(obj).booleanValue()) {
                                    if (i17 != i16) {
                                        cVar.f()[i17] = obj;
                                    }
                                    i17++;
                                }
                                i16 = i18;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size2 = cVar.size();
                        for (int i19 = i17; i19 < size2; i19++) {
                            cVar.f()[i19] = null;
                        }
                        cVar.i(i17);
                        if (cVar.size() > 0) {
                            if (i13 != i12) {
                                int i21 = e11.k()[i13];
                                e11.k()[i13] = i15;
                                e11.k()[i12] = i21;
                            }
                            i13++;
                        }
                        i12 = i14;
                    }
                    int j12 = e11.j();
                    for (int i22 = i13; i22 < j12; i22++) {
                        e11.l()[e11.k()[i22]] = null;
                    }
                    e11.o(i13);
                    i11++;
                    if (i11 >= l11) {
                        break;
                    }
                }
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final <T> void j(T scope, h00.l<? super T, vz.b0> onValueChangedForScope, h00.a<vz.b0> block) {
        a<?> i11;
        kotlin.jvm.internal.s.g(scope, "scope");
        kotlin.jvm.internal.s.g(onValueChangedForScope, "onValueChangedForScope");
        kotlin.jvm.internal.s.g(block, "block");
        a<?> aVar = this.f38243h;
        boolean z11 = this.f38242g;
        synchronized (this.f38239d) {
            i11 = i(onValueChangedForScope);
        }
        Object c11 = i11.c();
        i11.g(scope);
        this.f38243h = i11;
        this.f38242g = false;
        synchronized (this.f38239d) {
            d1.d<?> e11 = i11.e();
            int j11 = e11.j();
            int i12 = 0;
            int i13 = 0;
            while (i12 < j11) {
                int i14 = i12 + 1;
                int i15 = e11.k()[i12];
                d1.c cVar = e11.i()[i15];
                kotlin.jvm.internal.s.e(cVar);
                int size = cVar.size();
                int i16 = j11;
                int i17 = 0;
                int i18 = 0;
                while (i18 < size) {
                    int i19 = i18 + 1;
                    int i21 = size;
                    Object obj = cVar.f()[i18];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    if (!(obj == scope)) {
                        if (i17 != i18) {
                            cVar.f()[i17] = obj;
                        }
                        i17++;
                    }
                    i18 = i19;
                    size = i21;
                }
                int size2 = cVar.size();
                for (int i22 = i17; i22 < size2; i22++) {
                    cVar.f()[i22] = null;
                }
                cVar.i(i17);
                if (cVar.size() > 0) {
                    if (i13 != i12) {
                        int i23 = e11.k()[i13];
                        e11.k()[i13] = i15;
                        e11.k()[i12] = i23;
                    }
                    i13++;
                }
                i12 = i14;
                j11 = i16;
            }
            int j12 = e11.j();
            for (int i24 = i13; i24 < j12; i24++) {
                e11.l()[e11.k()[i24]] = null;
            }
            e11.o(i13);
            vz.b0 b0Var = vz.b0.f54756a;
        }
        if (!this.f38241f) {
            this.f38241f = true;
            try {
                h.f38186d.c(this.f38238c, null, block);
            } finally {
                this.f38241f = false;
            }
        } else {
            block.invoke();
        }
        this.f38243h = aVar;
        i11.g(c11);
        this.f38242g = z11;
    }

    public final void k() {
        this.f38240e = h.f38186d.d(this.f38237b);
    }

    public final void l() {
        f fVar = this.f38240e;
        if (fVar == null) {
            return;
        }
        fVar.dispose();
    }

    public final void m(h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        boolean z11 = this.f38242g;
        this.f38242g = true;
        try {
            block.invoke();
        } finally {
            this.f38242g = z11;
        }
    }
}
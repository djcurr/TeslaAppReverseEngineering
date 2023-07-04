package ul;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f53551a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<q> f53552b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53553c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53554d;

    /* renamed from: e  reason: collision with root package name */
    private final h<T> f53555e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f53556f;

    /* loaded from: classes3.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f53557a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<q> f53558b;

        /* renamed from: c  reason: collision with root package name */
        private int f53559c;

        /* renamed from: d  reason: collision with root package name */
        private int f53560d;

        /* renamed from: e  reason: collision with root package name */
        private h<T> f53561e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f53562f;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f53560d = 1;
            return this;
        }

        private b<T> h(int i11) {
            z.d(this.f53559c == 0, "Instantiation type has already been set.");
            this.f53559c = i11;
            return this;
        }

        private void i(Class<?> cls) {
            z.a(!this.f53557a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            i(qVar.c());
            this.f53558b.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public d<T> d() {
            z.d(this.f53561e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f53557a), new HashSet(this.f53558b), this.f53559c, this.f53560d, this.f53561e, this.f53562f);
        }

        public b<T> e() {
            return h(2);
        }

        public b<T> f(h<T> hVar) {
            this.f53561e = (h) z.c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f53557a = hashSet;
            this.f53558b = new HashSet();
            this.f53559c = 0;
            this.f53560d = 0;
            this.f53562f = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
            }
            Collections.addAll(this.f53557a, clsArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> i(final T t11, Class<T> cls) {
        return j(cls).f(new h() { // from class: ul.b
            @Override // ul.h
            public final Object a(e eVar) {
                Object n11;
                n11 = d.n(t11, eVar);
                return n11;
            }
        }).d();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object n(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> p(final T t11, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: ul.c
            @Override // ul.h
            public final Object a(e eVar) {
                Object o11;
                o11 = d.o(t11, eVar);
                return o11;
            }
        }).d();
    }

    public Set<q> e() {
        return this.f53552b;
    }

    public h<T> f() {
        return this.f53555e;
    }

    public Set<Class<? super T>> g() {
        return this.f53551a;
    }

    public Set<Class<?>> h() {
        return this.f53556f;
    }

    public boolean k() {
        return this.f53553c == 1;
    }

    public boolean l() {
        return this.f53553c == 2;
    }

    public boolean m() {
        return this.f53554d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f53551a.toArray()) + ">{" + this.f53553c + ", type=" + this.f53554d + ", deps=" + Arrays.toString(this.f53552b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<q> set2, int i11, int i12, h<T> hVar, Set<Class<?>> set3) {
        this.f53551a = Collections.unmodifiableSet(set);
        this.f53552b = Collections.unmodifiableSet(set2);
        this.f53553c = i11;
        this.f53554d = i12;
        this.f53555e = hVar;
        this.f53556f = Collections.unmodifiableSet(set3);
    }
}
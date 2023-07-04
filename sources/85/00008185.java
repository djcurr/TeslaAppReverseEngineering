package l0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l0<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f36197a;

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: b  reason: collision with root package name */
        private int f36201b;

        /* renamed from: a  reason: collision with root package name */
        private int f36200a = 300;

        /* renamed from: c  reason: collision with root package name */
        private final Map<Integer, a<T>> f36202c = new LinkedHashMap();

        public final a<T> a(T t11, int i11) {
            a<T> aVar = new a<>(t11, null, 2, null);
            d().put(Integer.valueOf(i11), aVar);
            return aVar;
        }

        public final int b() {
            return this.f36201b;
        }

        public final int c() {
            return this.f36200a;
        }

        public final Map<Integer, a<T>> d() {
            return this.f36202c;
        }

        public final void e(int i11) {
            this.f36200a = i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f36201b == bVar.f36201b && this.f36200a == bVar.f36200a && kotlin.jvm.internal.s.c(this.f36202c, bVar.f36202c)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(a<T> aVar, a0 easing) {
            kotlin.jvm.internal.s.g(aVar, "<this>");
            kotlin.jvm.internal.s.g(easing, "easing");
            aVar.a(easing);
        }

        public int hashCode() {
            return (((this.f36200a * 31) + this.f36201b) * 31) + this.f36202c.hashCode();
        }
    }

    public l0(b<T> config) {
        kotlin.jvm.internal.s.g(config, "config");
        this.f36197a = config;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && kotlin.jvm.internal.s.c(this.f36197a, ((l0) obj).f36197a);
    }

    @Override // l0.z, l0.i
    /* renamed from: f */
    public <V extends p> o1<V> a(d1<T, V> converter) {
        int e11;
        kotlin.jvm.internal.s.g(converter, "converter");
        Map<Integer, a<T>> d11 = this.f36197a.d();
        e11 = wz.r0.e(d11.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
        Iterator<T> it2 = d11.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).b(converter.a()));
        }
        return new o1<>(linkedHashMap, this.f36197a.c(), this.f36197a.b());
    }

    public int hashCode() {
        return this.f36197a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f36198a;

        /* renamed from: b  reason: collision with root package name */
        private a0 f36199b;

        public a(T t11, a0 easing) {
            kotlin.jvm.internal.s.g(easing, "easing");
            this.f36198a = t11;
            this.f36199b = easing;
        }

        public final void a(a0 a0Var) {
            kotlin.jvm.internal.s.g(a0Var, "<set-?>");
            this.f36199b = a0Var;
        }

        public final <V extends p> vz.p<V, a0> b(h00.l<? super T, ? extends V> convertToVector) {
            kotlin.jvm.internal.s.g(convertToVector, "convertToVector");
            return vz.v.a(convertToVector.invoke((T) this.f36198a), this.f36199b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.s.c(aVar.f36198a, this.f36198a) && kotlin.jvm.internal.s.c(aVar.f36199b, this.f36199b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t11 = this.f36198a;
            return ((t11 == null ? 0 : t11.hashCode()) * 31) + this.f36199b.hashCode();
        }

        public /* synthetic */ a(Object obj, a0 a0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? b0.b() : a0Var);
        }
    }
}
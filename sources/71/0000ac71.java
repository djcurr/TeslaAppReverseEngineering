package q00;

import java.lang.reflect.Field;
import n00.o;
import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public class s<T, V> extends u<V> implements n00.o<T, V> {

    /* renamed from: l  reason: collision with root package name */
    private final d0.b<a<T, V>> f47239l;

    /* renamed from: m  reason: collision with root package name */
    private final vz.k<Field> f47240m;

    /* loaded from: classes5.dex */
    public static final class a<T, V> extends u.c<V> implements o.a<T, V> {

        /* renamed from: h  reason: collision with root package name */
        private final s<T, V> f47241h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s<T, ? extends V> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47241h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public s<T, V> d() {
            return this.f47241h;
        }

        @Override // h00.l
        public V invoke(T t11) {
            return d().get(t11);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<T, ? extends V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<T, V> invoke() {
            return new a<>(s.this);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<Field> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Field invoke() {
            return s.this.B();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        vz.k<Field> b11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        d0.b<a<T, V>> b12 = d0.b(new b());
        kotlin.jvm.internal.s.f(b12, "ReflectProperties.lazy { Getter(this) }");
        this.f47239l = b12;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c());
        this.f47240m = b11;
    }

    @Override // n00.m
    /* renamed from: M */
    public a<T, V> getGetter() {
        a<T, V> invoke = this.f47239l.invoke();
        kotlin.jvm.internal.s.f(invoke, "_getter()");
        return invoke;
    }

    @Override // n00.o
    public V get(T t11) {
        return getGetter().call(t11);
    }

    @Override // h00.l
    public V invoke(T t11) {
        return get(t11);
    }

    @Override // n00.o
    public Object p(T t11) {
        return F(this.f47240m.getValue(), t11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k container, w00.i0 descriptor) {
        super(container, descriptor);
        vz.k<Field> b11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<T, V>> b12 = d0.b(new b());
        kotlin.jvm.internal.s.f(b12, "ReflectProperties.lazy { Getter(this) }");
        this.f47239l = b12;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c());
        this.f47240m = b11;
    }
}
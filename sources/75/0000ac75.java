package q00;

import java.lang.reflect.Field;
import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public class t<D, E, V> extends u<V> implements h00.p {

    /* renamed from: l  reason: collision with root package name */
    private final d0.b<a<D, E, V>> f47244l;

    /* renamed from: m  reason: collision with root package name */
    private final vz.k<Field> f47245m;

    /* loaded from: classes5.dex */
    public static final class a<D, E, V> extends u.c<V> implements h00.p {

        /* renamed from: h  reason: collision with root package name */
        private final t<D, E, V> f47246h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<D, E, ? extends V> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47246h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public t<D, E, V> d() {
            return this.f47246h;
        }

        @Override // h00.p
        public V invoke(D d11, E e11) {
            return d().M(d11, e11);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<D, E, ? extends V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<D, E, V> invoke() {
            return new a<>(t.this);
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
            return t.this.B();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k container, w00.i0 descriptor) {
        super(container, descriptor);
        vz.k<Field> b11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<D, E, V>> b12 = d0.b(new b());
        kotlin.jvm.internal.s.f(b12, "ReflectProperties.lazy { Getter(this) }");
        this.f47244l = b12;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c());
        this.f47245m = b11;
    }

    public V M(D d11, E e11) {
        return getGetter().call(d11, e11);
    }

    @Override // n00.m
    /* renamed from: N */
    public a<D, E, V> getGetter() {
        a<D, E, V> invoke = this.f47244l.invoke();
        kotlin.jvm.internal.s.f(invoke, "_getter()");
        return invoke;
    }

    @Override // h00.p
    public V invoke(D d11, E e11) {
        return M(d11, e11);
    }
}
package q00;

import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public final class o<D, E, V> extends t<D, E, V> implements n00.i {

    /* renamed from: n  reason: collision with root package name */
    private final d0.b<a<D, E, V>> f47208n;

    /* loaded from: classes5.dex */
    public static final class a<D, E, V> extends u.d<V> implements h00.q {

        /* renamed from: h  reason: collision with root package name */
        private final o<D, E, V> f47209h;

        public a(o<D, E, V> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47209h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public o<D, E, V> d() {
            return this.f47209h;
        }

        public void H(D d11, E e11, V v11) {
            d().P(d11, e11, v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            H(obj, obj2, obj3);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<D, E, V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<D, E, V> invoke() {
            return new a<>(o.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k container, w00.i0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<D, E, V>> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Setter(this) }");
        this.f47208n = b11;
    }

    @Override // n00.i
    /* renamed from: O */
    public a<D, E, V> getSetter() {
        a<D, E, V> invoke = this.f47208n.invoke();
        kotlin.jvm.internal.s.f(invoke, "_setter()");
        return invoke;
    }

    public void P(D d11, E e11, V v11) {
        getSetter().call(d11, e11, v11);
    }
}
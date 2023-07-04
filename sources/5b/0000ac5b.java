package q00;

import n00.k;
import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public final class n<T, V> extends s<T, V> implements n00.k<T, V> {

    /* renamed from: n  reason: collision with root package name */
    private final d0.b<a<T, V>> f47205n;

    /* loaded from: classes5.dex */
    public static final class a<T, V> extends u.d<V> implements k.a<T, V> {

        /* renamed from: h  reason: collision with root package name */
        private final n<T, V> f47206h;

        public a(n<T, V> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47206h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public n<T, V> d() {
            return this.f47206h;
        }

        public void H(T t11, V v11) {
            d().D(t11, v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj, Object obj2) {
            H(obj, obj2);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<T, V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<T, V> invoke() {
            return new a<>(n.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        d0.b<a<T, V>> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Setter(this) }");
        this.f47205n = b11;
    }

    @Override // n00.k
    public void D(T t11, V v11) {
        getSetter().call(t11, v11);
    }

    @Override // n00.k, n00.i
    /* renamed from: N */
    public a<T, V> getSetter() {
        a<T, V> invoke = this.f47205n.invoke();
        kotlin.jvm.internal.s.f(invoke, "_setter()");
        return invoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k container, w00.i0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<T, V>> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Setter(this) }");
        this.f47205n = b11;
    }
}
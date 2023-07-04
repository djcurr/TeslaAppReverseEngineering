package q00;

import n00.j;
import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public final class m<V> extends r<V> implements n00.j<V> {

    /* renamed from: n  reason: collision with root package name */
    private final d0.b<a<V>> f47200n;

    /* loaded from: classes5.dex */
    public static final class a<R> extends u.d<R> implements j.a<R> {

        /* renamed from: h  reason: collision with root package name */
        private final m<R> f47201h;

        public a(m<R> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47201h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public m<R> d() {
            return this.f47201h;
        }

        public void H(R r11) {
            d().O(r11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            H(obj);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<V> invoke() {
            return new a<>(m.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k container, w00.i0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<V>> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Setter(this) }");
        this.f47200n = b11;
    }

    @Override // n00.j, n00.i
    /* renamed from: N */
    public a<V> getSetter() {
        a<V> invoke = this.f47200n.invoke();
        kotlin.jvm.internal.s.f(invoke, "_setter()");
        return invoke;
    }

    public void O(V v11) {
        getSetter().call(v11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        d0.b<a<V>> b11 = d0.b(new b());
        kotlin.jvm.internal.s.f(b11, "ReflectProperties.lazy { Setter(this) }");
        this.f47200n = b11;
    }
}
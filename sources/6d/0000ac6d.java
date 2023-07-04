package q00;

import n00.n;
import q00.d0;
import q00.u;

/* loaded from: classes5.dex */
public class r<V> extends u<V> implements n00.n<V> {

    /* renamed from: l  reason: collision with root package name */
    private final d0.b<a<V>> f47234l;

    /* renamed from: m  reason: collision with root package name */
    private final vz.k<Object> f47235m;

    /* loaded from: classes5.dex */
    public static final class a<R> extends u.c<R> implements n.a<R> {

        /* renamed from: h  reason: collision with root package name */
        private final r<R> f47236h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r<? extends R> property) {
            kotlin.jvm.internal.s.g(property, "property");
            this.f47236h = property;
        }

        @Override // n00.m.a
        /* renamed from: G */
        public r<R> d() {
            return this.f47236h;
        }

        @Override // h00.a
        public R invoke() {
            return d().get();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<a<? extends V>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final a<V> invoke() {
            return new a<>(r.this);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<Object> {
        c() {
            super(0);
        }

        @Override // h00.a
        public final Object invoke() {
            r rVar = r.this;
            return rVar.F(rVar.B(), r.this.E());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k container, w00.i0 descriptor) {
        super(container, descriptor);
        vz.k<Object> b11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        d0.b<a<V>> b12 = d0.b(new b());
        kotlin.jvm.internal.s.f(b12, "ReflectProperties.lazy { Getter(this) }");
        this.f47234l = b12;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c());
        this.f47235m = b11;
    }

    @Override // n00.m
    /* renamed from: M */
    public a<V> getGetter() {
        a<V> invoke = this.f47234l.invoke();
        kotlin.jvm.internal.s.f(invoke, "_getter()");
        return invoke;
    }

    @Override // n00.n
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // n00.n
    public Object getDelegate() {
        return this.f47235m.getValue();
    }

    @Override // h00.a
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        vz.k<Object> b11;
        kotlin.jvm.internal.s.g(container, "container");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signature, "signature");
        d0.b<a<V>> b12 = d0.b(new b());
        kotlin.jvm.internal.s.f(b12, "ReflectProperties.lazy { Getter(this) }");
        this.f47234l = b12;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new c());
        this.f47235m = b11;
    }
}
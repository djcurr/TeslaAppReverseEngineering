package g1;

import g1.t;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d<K, V> extends wz.d<K, V> implements e1.f<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f27313c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final d f27314d = new d(t.f27337e.a(), 0);

    /* renamed from: a  reason: collision with root package name */
    private final t<K, V> f27315a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27316b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> d<K, V> a() {
            return d.f27314d;
        }
    }

    public d(t<K, V> node, int i11) {
        kotlin.jvm.internal.s.g(node, "node");
        this.f27315a = node;
        this.f27316b = i11;
    }

    private final e1.d<Map.Entry<K, V>> n() {
        return new n(this);
    }

    @Override // wz.d
    public final Set<Map.Entry<K, V>> c() {
        return n();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f27315a.k(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    @Override // wz.d
    public int f() {
        return this.f27316b;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f27315a.o(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    @Override // e1.f
    /* renamed from: m */
    public f<K, V> g() {
        return new f<>(this);
    }

    @Override // wz.d
    /* renamed from: o */
    public e1.d<K> e() {
        return new p(this);
    }

    public final t<K, V> p() {
        return this.f27315a;
    }

    @Override // wz.d
    /* renamed from: q */
    public e1.b<V> h() {
        return new r(this);
    }

    public d<K, V> r(K k11, V v11) {
        t.b<K, V> P = this.f27315a.P(k11 == null ? 0 : k11.hashCode(), k11, v11, 0);
        return P == null ? this : new d<>(P.a(), size() + P.b());
    }

    public d<K, V> s(K k11) {
        t<K, V> Q = this.f27315a.Q(k11 == null ? 0 : k11.hashCode(), k11, 0);
        if (this.f27315a == Q) {
            return this;
        }
        if (Q == null) {
            return f27313c.a();
        }
        return new d<>(Q, size() - 1);
    }
}
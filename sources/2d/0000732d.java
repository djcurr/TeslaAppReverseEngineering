package hf;

/* loaded from: classes3.dex */
public interface i<K, V> extends s<K, V>, pd.b {

    /* loaded from: classes3.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f29171a;

        /* renamed from: b  reason: collision with root package name */
        public final qd.a<V> f29172b;

        /* renamed from: c  reason: collision with root package name */
        public int f29173c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f29174d = false;

        /* renamed from: e  reason: collision with root package name */
        public final b<K> f29175e;

        private a(K k11, qd.a<V> aVar, b<K> bVar) {
            this.f29171a = (K) md.k.g(k11);
            this.f29172b = (qd.a) md.k.g(qd.a.m(aVar));
            this.f29175e = bVar;
        }

        public static <K, V> a<K, V> a(K k11, qd.a<V> aVar, b<K> bVar) {
            return new a<>(k11, aVar, bVar);
        }
    }

    /* loaded from: classes3.dex */
    public interface b<K> {
        void a(K k11, boolean z11);
    }

    qd.a<V> d(K k11, qd.a<V> aVar, b<K> bVar);

    qd.a<V> f(K k11);
}
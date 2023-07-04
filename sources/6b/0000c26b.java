package yf;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* loaded from: classes3.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private Map f59481a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f59482b;

        public Map<K, V> a() {
            if (this.f59482b) {
                this.f59482b = false;
                return this.f59481a;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public b<K, V> b(K k11, V v11) {
            if (this.f59482b) {
                this.f59481a.put(k11, v11);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        private b() {
            this.f59481a = c.b();
            this.f59482b = true;
        }
    }

    public static <K, V> b<K, V> a() {
        return new b<>();
    }

    public static <K, V> HashMap<K, V> b() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> c() {
        return b();
    }

    public static <K, V> Map<K, V> d(K k11, V v11) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        return c11;
    }

    public static <K, V> Map<K, V> e(K k11, V v11, K k12, V v12) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        c11.put(k12, v12);
        return c11;
    }

    public static <K, V> Map<K, V> f(K k11, V v11, K k12, V v12, K k13, V v13) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        c11.put(k12, v12);
        c11.put(k13, v13);
        return c11;
    }

    public static <K, V> Map<K, V> g(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        c11.put(k12, v12);
        c11.put(k13, v13);
        c11.put(k14, v14);
        return c11;
    }

    public static <K, V> Map<K, V> h(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        c11.put(k12, v12);
        c11.put(k13, v13);
        c11.put(k14, v14);
        c11.put(k15, v15);
        return c11;
    }

    public static <K, V> Map<K, V> i(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        Map<K, V> c11 = c();
        c11.put(k11, v11);
        c11.put(k12, v12);
        c11.put(k13, v13);
        c11.put(k14, v14);
        c11.put(k15, v15);
        c11.put(k16, v16);
        c11.put(k17, v17);
        return c11;
    }
}
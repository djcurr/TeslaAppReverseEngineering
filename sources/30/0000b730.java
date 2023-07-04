package u5;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import wz.u;

/* loaded from: classes.dex */
public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C1196a<K, V> f53177a = new C1196a<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<K, C1196a<K, V>> f53178b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1196a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private List<V> f53179a;

        /* renamed from: b  reason: collision with root package name */
        private C1196a<K, V> f53180b = this;

        /* renamed from: c  reason: collision with root package name */
        private C1196a<K, V> f53181c = this;

        /* renamed from: d  reason: collision with root package name */
        private final K f53182d;

        public C1196a(K k11) {
            this.f53182d = k11;
        }

        public final void a(V v11) {
            ArrayList arrayList = this.f53179a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f53179a = arrayList;
            }
            arrayList.add(v11);
        }

        public final K b() {
            return this.f53182d;
        }

        public final C1196a<K, V> c() {
            return this.f53181c;
        }

        public final C1196a<K, V> d() {
            return this.f53180b;
        }

        public final int e() {
            List<V> list = this.f53179a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final V f() {
            List<V> list = this.f53179a;
            if (list != null) {
                return (V) u.I(list);
            }
            return null;
        }

        public final void g(C1196a<K, V> c1196a) {
            s.g(c1196a, "<set-?>");
            this.f53181c = c1196a;
        }

        public final void h(C1196a<K, V> c1196a) {
            s.g(c1196a, "<set-?>");
            this.f53180b = c1196a;
        }
    }

    private final <K, V> void a(C1196a<K, V> c1196a) {
        c1196a.c().h(c1196a);
        c1196a.d().g(c1196a);
    }

    private final void b(C1196a<K, V> c1196a) {
        e(c1196a);
        c1196a.h(this.f53177a);
        c1196a.g(this.f53177a.c());
        a(c1196a);
    }

    private final void c(C1196a<K, V> c1196a) {
        e(c1196a);
        c1196a.h(this.f53177a.d());
        c1196a.g(this.f53177a);
        a(c1196a);
    }

    private final <K, V> void e(C1196a<K, V> c1196a) {
        c1196a.d().g(c1196a.c());
        c1196a.c().h(c1196a.d());
    }

    public final void d(K k11, V v11) {
        HashMap<K, C1196a<K, V>> hashMap = this.f53178b;
        C1196a<K, V> c1196a = hashMap.get(k11);
        if (c1196a == null) {
            c1196a = new C1196a<>(k11);
            c(c1196a);
            hashMap.put(k11, c1196a);
        }
        c1196a.a(v11);
    }

    public final V f() {
        for (C1196a<K, V> d11 = this.f53177a.d(); !s.c(d11, this.f53177a); d11 = d11.d()) {
            V f11 = d11.f();
            if (f11 != null) {
                return f11;
            }
            e(d11);
            HashMap<K, C1196a<K, V>> hashMap = this.f53178b;
            K b11 = d11.b();
            Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            r0.d(hashMap).remove(b11);
        }
        return null;
    }

    public final V g(K k11) {
        HashMap<K, C1196a<K, V>> hashMap = this.f53178b;
        C1196a<K, V> c1196a = hashMap.get(k11);
        if (c1196a == null) {
            c1196a = new C1196a<>(k11);
            hashMap.put(k11, c1196a);
        }
        C1196a<K, V> c1196a2 = c1196a;
        b(c1196a2);
        return c1196a2.f();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LinkedMultimap( ");
        C1196a<K, V> c11 = this.f53177a.c();
        while (!s.c(c11, this.f53177a)) {
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(c11.b());
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(c11.e());
            sb2.append(CoreConstants.CURLY_RIGHT);
            c11 = c11.c();
            if (!s.c(c11, this.f53177a)) {
                sb2.append(", ");
            }
        }
        sb2.append(" )");
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
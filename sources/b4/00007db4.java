package ka;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.m;

/* loaded from: classes.dex */
class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f34512a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, a<K, V>> f34513b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f34514a;

        /* renamed from: b  reason: collision with root package name */
        private List<V> f34515b;

        /* renamed from: c  reason: collision with root package name */
        a<K, V> f34516c;

        /* renamed from: d  reason: collision with root package name */
        a<K, V> f34517d;

        a() {
            this(null);
        }

        public void a(V v11) {
            if (this.f34515b == null) {
                this.f34515b = new ArrayList();
            }
            this.f34515b.add(v11);
        }

        public V b() {
            int c11 = c();
            if (c11 > 0) {
                return this.f34515b.remove(c11 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f34515b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k11) {
            this.f34517d = this;
            this.f34516c = this;
            this.f34514a = k11;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f34512a;
        aVar.f34517d = aVar2;
        aVar.f34516c = aVar2.f34516c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f34512a;
        aVar.f34517d = aVar2.f34517d;
        aVar.f34516c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f34517d;
        aVar2.f34516c = aVar.f34516c;
        aVar.f34516c.f34517d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f34516c.f34517d = aVar;
        aVar.f34517d.f34516c = aVar;
    }

    public V a(K k11) {
        a<K, V> aVar = this.f34513b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            this.f34513b.put(k11, aVar);
        } else {
            k11.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k11, V v11) {
        a<K, V> aVar = this.f34513b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            c(aVar);
            this.f34513b.put(k11, aVar);
        } else {
            k11.a();
        }
        aVar.a(v11);
    }

    public V f() {
        for (a aVar = this.f34512a.f34517d; !aVar.equals(this.f34512a); aVar = aVar.f34517d) {
            V v11 = (V) aVar.b();
            if (v11 != null) {
                return v11;
            }
            e(aVar);
            this.f34513b.remove(aVar.f34514a);
            ((m) aVar.f34514a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z11 = false;
        for (a aVar = this.f34512a.f34516c; !aVar.equals(this.f34512a); aVar = aVar.f34516c) {
            z11 = true;
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(aVar.f34514a);
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
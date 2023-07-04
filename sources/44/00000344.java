package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.d0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class b1 implements d0 {

    /* renamed from: t  reason: collision with root package name */
    protected static final Comparator<d0.a<?>> f2273t;

    /* renamed from: u  reason: collision with root package name */
    private static final b1 f2274u;

    /* renamed from: s  reason: collision with root package name */
    protected final TreeMap<d0.a<?>, Map<d0.c, Object>> f2275s;

    static {
        a1 a1Var = new Comparator() { // from class: androidx.camera.core.impl.a1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H;
                H = b1.H((d0.a) obj, (d0.a) obj2);
                return H;
            }
        };
        f2273t = a1Var;
        f2274u = new b1(new TreeMap(a1Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(TreeMap<d0.a<?>, Map<d0.c, Object>> treeMap) {
        this.f2275s = treeMap;
    }

    public static b1 F() {
        return f2274u;
    }

    public static b1 G(d0 d0Var) {
        if (b1.class.equals(d0Var.getClass())) {
            return (b1) d0Var;
        }
        TreeMap treeMap = new TreeMap(f2273t);
        for (d0.a<?> aVar : d0Var.e()) {
            Set<d0.c> f11 = d0Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (d0.c cVar : f11) {
                arrayMap.put(cVar, d0Var.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new b1(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int H(d0.a aVar, d0.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override // androidx.camera.core.impl.d0
    public <ValueT> ValueT a(d0.a<ValueT> aVar) {
        Map<d0.c, Object> map = this.f2275s.get(aVar);
        if (map != null) {
            return (ValueT) map.get((d0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.d0
    public boolean b(d0.a<?> aVar) {
        return this.f2275s.containsKey(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // androidx.camera.core.impl.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.lang.String r4, androidx.camera.core.impl.d0.b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.impl.d0$a r0 = androidx.camera.core.impl.d0.a.a(r4, r0)
            java.util.TreeMap<androidx.camera.core.impl.d0$a<?>, java.util.Map<androidx.camera.core.impl.d0$c, java.lang.Object>> r1 = r3.f2275s
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.impl.d0$a r2 = (androidx.camera.core.impl.d0.a) r2
            java.lang.String r2 = r2.c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L31
            goto L3d
        L31:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.impl.d0$a r1 = (androidx.camera.core.impl.d0.a) r1
            boolean r1 = r5.a(r1)
            if (r1 != 0) goto L14
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.b1.c(java.lang.String, androidx.camera.core.impl.d0$b):void");
    }

    @Override // androidx.camera.core.impl.d0
    public <ValueT> ValueT d(d0.a<ValueT> aVar, d0.c cVar) {
        Map<d0.c, Object> map = this.f2275s.get(aVar);
        if (map != null) {
            if (map.containsKey(cVar)) {
                return (ValueT) map.get(cVar);
            }
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.d0
    public Set<d0.a<?>> e() {
        return Collections.unmodifiableSet(this.f2275s.keySet());
    }

    @Override // androidx.camera.core.impl.d0
    public Set<d0.c> f(d0.a<?> aVar) {
        Map<d0.c, Object> map = this.f2275s.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.d0
    public <ValueT> ValueT g(d0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.d0
    public d0.c h(d0.a<?> aVar) {
        Map<d0.c, Object> map = this.f2275s.get(aVar);
        if (map != null) {
            return (d0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
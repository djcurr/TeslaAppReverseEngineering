package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.d0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x0 extends b1 implements w0 {

    /* renamed from: v */
    private static final d0.c f2394v = d0.c.OPTIONAL;

    private x0(TreeMap<d0.a<?>, Map<d0.c, Object>> treeMap) {
        super(treeMap);
    }

    public static x0 I() {
        return new x0(new TreeMap(b1.f2273t));
    }

    public static x0 J(d0 d0Var) {
        TreeMap treeMap = new TreeMap(b1.f2273t);
        for (d0.a<?> aVar : d0Var.e()) {
            Set<d0.c> f11 = d0Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (d0.c cVar : f11) {
                arrayMap.put(cVar, d0Var.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new x0(treeMap);
    }

    public <ValueT> ValueT K(d0.a<ValueT> aVar) {
        return (ValueT) this.f2275s.remove(aVar);
    }

    @Override // androidx.camera.core.impl.w0
    public <ValueT> void n(d0.a<ValueT> aVar, d0.c cVar, ValueT valuet) {
        Map<d0.c, Object> map = this.f2275s.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2275s.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        d0.c cVar2 = (d0.c) Collections.min(map.keySet());
        if (!map.get(cVar2).equals(valuet) && d0.u(cVar2, cVar)) {
            throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
        }
        map.put(cVar, valuet);
    }

    @Override // androidx.camera.core.impl.w0
    public <ValueT> void p(d0.a<ValueT> aVar, ValueT valuet) {
        n(aVar, f2394v, valuet);
    }
}
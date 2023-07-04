package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class l implements r {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Throwable, Object> f32320a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final g3 f32321b;

    public l(g3 g3Var) {
        this.f32321b = (g3) rz.j.a(g3Var, "options are required");
    }

    private static List<Throwable> b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static <T> boolean c(Map<T, Object> map, List<T> list) {
        for (T t11 : list) {
            if (map.containsKey(t11)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, t tVar) {
        if (this.f32321b.isEnableDeduplication()) {
            Throwable M = b3Var.M();
            if (M != null) {
                if (!this.f32320a.containsKey(M) && !c(this.f32320a, b(M))) {
                    this.f32320a.put(M, null);
                } else {
                    this.f32321b.getLogger().c(f3.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", b3Var.E());
                    return null;
                }
            }
        } else {
            this.f32321b.getLogger().c(f3.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return b3Var;
    }
}
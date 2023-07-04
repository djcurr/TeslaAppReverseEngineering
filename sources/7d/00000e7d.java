package bv;

import com.tesla.logging.g;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.p;
import vz.v;

/* loaded from: classes6.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8304a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> f8305b = new ConcurrentHashMap<>();

    private a() {
    }

    private final <K, V> ConcurrentHashMap<K, V> d(ConcurrentHashMap<K, V> concurrentHashMap, K k11) {
        s.g(concurrentHashMap, "<this>");
        concurrentHashMap.remove(k11);
        return concurrentHashMap;
    }

    private final <K, V> ConcurrentHashMap<K, V> e(ConcurrentHashMap<K, V> concurrentHashMap) {
        return concurrentHashMap == null ? new ConcurrentHashMap<>() : concurrentHashMap;
    }

    private final <K, V> ConcurrentHashMap<K, V> f(ConcurrentHashMap<K, V> concurrentHashMap, p<? extends K, ? extends V> pVar) {
        s.g(concurrentHashMap, "<this>");
        concurrentHashMap.put(pVar.c(), pVar.d());
        return concurrentHashMap;
    }

    private final void g(String str, c cVar) {
        ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> concurrentHashMap = f8305b;
        concurrentHashMap.put(str, f(e(concurrentHashMap.get(str)), v.a(cVar, Long.valueOf(System.currentTimeMillis()))));
    }

    @Override // bv.b
    public boolean a(String vehicleId, c command) {
        Long l11;
        s.g(vehicleId, "vehicleId");
        s.g(command, "command");
        ConcurrentHashMap<c, Long> concurrentHashMap = f8305b.get(vehicleId);
        Long l12 = 0L;
        if (concurrentHashMap != null && (l11 = concurrentHashMap.get(command)) != null) {
            l12 = l11;
        }
        return System.currentTimeMillis() - l12.longValue() < 3000;
    }

    @Override // bv.b
    public Object b(String str, c cVar, zz.d<? super b0> dVar) {
        if (a(str, cVar)) {
            g a11 = av.a.a();
            String name = cVar.name();
            a11.a("Command: " + name + " for vehicle: " + str + " is still under execution time window, skipped.");
        } else {
            g(str, cVar);
        }
        return b0.f54756a;
    }

    @Override // bv.b
    public void c(String vehicleId, c command) {
        s.g(vehicleId, "vehicleId");
        s.g(command, "command");
        ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> concurrentHashMap = f8305b;
        concurrentHashMap.put(vehicleId, d(e(concurrentHashMap.get(vehicleId)), command));
    }
}
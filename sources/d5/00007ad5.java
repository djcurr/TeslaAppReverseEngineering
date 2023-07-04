package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f32989a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap f32990b;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f32989a = copyOnWriteArrayList;
        f32990b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static c a(String str, boolean z11) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f32990b;
        g gVar = (g) concurrentHashMap.get(str);
        if (gVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new d("No time-zone data files registered");
            }
            throw new d("Unknown time-zone ID: " + str);
        }
        return gVar.b(str, z11);
    }

    public static void d(g gVar) {
        Objects.requireNonNull(gVar, "provider");
        for (String str : gVar.c()) {
            Objects.requireNonNull(str, "zoneId");
            if (((g) ((ConcurrentHashMap) f32990b).putIfAbsent(str, gVar)) != null) {
                throw new d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
            }
        }
        f32989a.add(gVar);
    }

    protected abstract c b(String str, boolean z11);

    protected abstract Set c();
}
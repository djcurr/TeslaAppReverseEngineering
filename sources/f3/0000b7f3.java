package ul;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class s implements pm.d, pm.c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<pm.b<Object>, Executor>> f53595a = new HashMap();

    /* renamed from: b */
    private Queue<pm.a<?>> f53596b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f53597c;

    public s(Executor executor) {
        this.f53597c = executor;
    }

    public static /* synthetic */ void d(Map.Entry entry, pm.a aVar) {
        g(entry, aVar);
    }

    private synchronized Set<Map.Entry<pm.b<Object>, Executor>> f(pm.a<?> aVar) {
        ConcurrentHashMap<pm.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f53595a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public static /* synthetic */ void g(Map.Entry entry, pm.a aVar) {
        ((pm.b) entry.getKey()).a(aVar);
    }

    @Override // pm.d
    public <T> void a(Class<T> cls, pm.b<? super T> bVar) {
        b(cls, this.f53597c, bVar);
    }

    @Override // pm.d
    public synchronized <T> void b(Class<T> cls, Executor executor, pm.b<? super T> bVar) {
        z.b(cls);
        z.b(bVar);
        z.b(executor);
        if (!this.f53595a.containsKey(cls)) {
            this.f53595a.put(cls, new ConcurrentHashMap<>());
        }
        this.f53595a.get(cls).put(bVar, executor);
    }

    @Override // pm.c
    public void c(final pm.a<?> aVar) {
        z.b(aVar);
        synchronized (this) {
            Queue<pm.a<?>> queue = this.f53596b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<pm.b<Object>, Executor> entry : f(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: ul.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.d(entry, aVar);
                    }
                });
            }
        }
    }

    public void e() {
        Queue<pm.a<?>> queue;
        synchronized (this) {
            queue = this.f53596b;
            if (queue != null) {
                this.f53596b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (pm.a<?> aVar : queue) {
                c(aVar);
            }
        }
    }
}
package ul;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u<T> implements sm.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f53602b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<sm.b<T>> f53601a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection<sm.b<T>> collection) {
        this.f53601a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u<?> b(Collection<sm.b<?>> collection) {
        return new u<>((Set) collection);
    }

    private synchronized void d() {
        for (sm.b<T> bVar : this.f53601a) {
            this.f53602b.add(bVar.get());
        }
        this.f53601a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(sm.b<T> bVar) {
        if (this.f53602b == null) {
            this.f53601a.add(bVar);
        } else {
            this.f53602b.add(bVar.get());
        }
    }

    @Override // sm.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f53602b == null) {
            synchronized (this) {
                if (this.f53602b == null) {
                    this.f53602b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f53602b);
    }
}
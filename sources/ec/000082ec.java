package la;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f37124a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f37125b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f37126a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f37127b;

        a() {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<a> f37128a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f37128a) {
                poll = this.f37128a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.f37128a) {
                if (this.f37128a.size() < 10) {
                    this.f37128a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f37124a.get(str);
            if (aVar == null) {
                aVar = this.f37125b.a();
                this.f37124a.put(str, aVar);
            }
            aVar.f37127b++;
        }
        aVar.f37126a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) bb.j.d(this.f37124a.get(str));
            int i11 = aVar.f37127b;
            if (i11 >= 1) {
                int i12 = i11 - 1;
                aVar.f37127b = i12;
                if (i12 == 0) {
                    a remove = this.f37124a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f37125b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f37127b);
            }
        }
        aVar.f37126a.unlock();
    }
}
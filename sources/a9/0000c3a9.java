package yy;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class h {
    public static void a(b80.b<?> bVar, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            bVar2.e(bVar);
        }
    }

    public static void b(b80.b<?> bVar, Throwable th2, AtomicInteger atomicInteger, b bVar2) {
        if (bVar2.c(th2) && atomicInteger.getAndIncrement() == 0) {
            bVar2.e(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean c(b80.b<? super T> bVar, T t11, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.b(t11);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            bVar2.e(bVar);
        }
        return false;
    }
}
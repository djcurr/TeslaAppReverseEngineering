package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
final class n0 extends h {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f35490a = new n0();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f35491b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, h00.l<Throwable, Throwable>> f35492c = new WeakHashMap<>();

    private n0() {
    }

    @Override // kotlinx.coroutines.internal.h
    public h00.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        h00.l<Throwable, Throwable> b11;
        ReentrantReadWriteLock reentrantReadWriteLock = f35491b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            h00.l<Throwable, Throwable> lVar = f35492c.get(cls);
            if (lVar == null) {
                readLock = reentrantReadWriteLock.readLock();
                int i11 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i12 = 0;
                while (i12 < readHoldCount) {
                    i12++;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap<Class<? extends Throwable>, h00.l<Throwable, Throwable>> weakHashMap = f35492c;
                    h00.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                    if (lVar2 == null) {
                        b11 = k.b(cls);
                        weakHashMap.put(cls, b11);
                        return b11;
                    }
                    while (i11 < readHoldCount) {
                        i11++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return lVar2;
                } finally {
                    while (i11 < readHoldCount) {
                        i11++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return lVar;
        } finally {
            readLock.unlock();
        }
    }
}
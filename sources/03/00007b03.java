package j20;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public class d implements k {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f33121b;

    public d(Lock lock) {
        s.g(lock, "lock");
        this.f33121b = lock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Lock a() {
        return this.f33121b;
    }

    @Override // j20.k
    public void lock() {
        this.f33121b.lock();
    }

    @Override // j20.k
    public void unlock() {
        this.f33121b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
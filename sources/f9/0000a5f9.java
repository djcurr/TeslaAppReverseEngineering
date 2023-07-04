package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if (decrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean safeRetain() {
        int i11 = this.refCount.get();
        while (i11 != 0) {
            if (this.refCount.weakCompareAndSet(i11, i11 + 1)) {
                return true;
            }
            i11 = this.refCount.get();
        }
        return false;
    }
}
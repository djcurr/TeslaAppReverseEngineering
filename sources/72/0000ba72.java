package vy;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class l extends a implements Callable<Void> {
    public l(Runnable runnable, boolean z11) {
        super(runnable, z11);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: c */
    public Void call() {
        this.f54652c = Thread.currentThread();
        try {
            this.f54650a.run();
            lazySet(a.f54648d);
            this.f54652c = null;
            return null;
        } catch (Throwable th2) {
            az.a.r(th2);
            throw th2;
        }
    }
}
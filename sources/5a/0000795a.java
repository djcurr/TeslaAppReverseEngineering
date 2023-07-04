package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes5.dex */
final class f1 implements g0 {

    /* renamed from: a */
    private static final f1 f32258a = new f1();

    private f1() {
    }

    public static /* synthetic */ Object c() {
        return f();
    }

    public static /* synthetic */ Object d() {
        return g();
    }

    public static g0 e() {
        return f32258a;
    }

    public static /* synthetic */ Object f() {
        return null;
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    @Override // io.sentry.g0
    public void a(long j11) {
    }

    @Override // io.sentry.g0
    public Future<?> b(Runnable runnable, long j11) {
        return new FutureTask(new Callable() { // from class: io.sentry.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f1.c();
            }
        });
    }

    @Override // io.sentry.g0
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f1.d();
            }
        });
    }
}
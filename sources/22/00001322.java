package com.adyen.checkout.core.api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class c<T> extends FutureTask<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f9577b = o7.a.c();

    /* renamed from: a  reason: collision with root package name */
    private final long f9578a;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(b<T> bVar) {
        this(bVar, 0L);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        String str = f9577b;
        o7.b.a(str, "cancel - " + z11);
        return super.cancel(z11);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        if (this.f9578a > 0) {
            String str = f9577b;
            o7.b.a(str, "run with timeout - " + this.f9578a);
        }
        super.run();
        long j11 = this.f9578a;
        if (j11 > 0) {
            try {
                get(j11, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                o7.b.b(f9577b, "InterruptedException", e11);
            } catch (ExecutionException e12) {
                o7.b.b(f9577b, "ExecutionException", e12);
            } catch (TimeoutException unused) {
                String str2 = f9577b;
                o7.b.c(str2, "Task timed out after " + this.f9578a + " milliseconds.");
                cancel(true);
            }
        }
    }

    protected c(b<T> bVar, long j11) {
        super(bVar);
        this.f9578a = j11;
    }
}
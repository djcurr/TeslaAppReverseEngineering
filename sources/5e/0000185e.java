package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f11817a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private T f11818b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f11819c;

    private void b() {
        if (this.f11817a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public T c() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        throw new UnsupportedOperationException();
    }

    public void d(T t11) {
        b();
        this.f11818b = t11;
        this.f11817a.countDown();
    }

    public void e(Exception exc) {
        b();
        this.f11819c = exc;
        this.f11817a.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get() {
        this.f11817a.await();
        if (this.f11819c == null) {
            return this.f11818b;
        }
        throw new ExecutionException(this.f11819c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11817a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get(long j11, TimeUnit timeUnit) {
        if (this.f11817a.await(j11, timeUnit)) {
            if (this.f11819c == null) {
                return this.f11818b;
            }
            throw new ExecutionException(this.f11819c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
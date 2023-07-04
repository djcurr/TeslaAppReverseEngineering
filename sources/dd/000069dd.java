package expo.modules.imageloader;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public class SimpleSettableFuture<T> implements Future<T> {
    private Exception mException;
    private final CountDownLatch mReadyLatch = new CountDownLatch(1);
    private T mResult;

    private void checkNotSet() {
        if (this.mReadyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() {
        this.mReadyLatch.await();
        if (this.mException == null) {
            return this.mResult;
        }
        throw new ExecutionException(this.mException);
    }

    public T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mReadyLatch.getCount() == 0;
    }

    public void set(T t11) {
        checkNotSet();
        this.mResult = t11;
        this.mReadyLatch.countDown();
    }

    public void setException(Exception exc) {
        checkNotSet();
        this.mException = exc;
        this.mReadyLatch.countDown();
    }

    public T getOrThrow(long j11, TimeUnit timeUnit) {
        try {
            return get(j11, timeUnit);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j11, TimeUnit timeUnit) {
        if (this.mReadyLatch.await(j11, timeUnit)) {
            if (this.mException == null) {
                return this.mResult;
            }
            throw new ExecutionException(this.mException);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
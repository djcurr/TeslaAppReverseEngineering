package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ThreadUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.ThreadUtils$1CaughtException  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class C1CaughtException {

        /* renamed from: e  reason: collision with root package name */
        Exception f43895e;

        C1CaughtException() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.ThreadUtils$1Result  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class C1Result {
        public V value;

        C1Result() {
        }
    }

    /* loaded from: classes4.dex */
    public interface BlockingOperation {
        void run();
    }

    /* loaded from: classes4.dex */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z11 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e12) {
                    c1CaughtException.f43895e = e12;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.f43895e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.f43895e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f43895e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        long j12 = j11;
        while (j12 > 0) {
            try {
                thread.join(j12);
                break;
            } catch (InterruptedException unused) {
                j12 = j11 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        long j12 = j11;
        boolean z12 = false;
        do {
            try {
                z11 = countDownLatch.await(j12, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                z12 = true;
                j12 = j11 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j12 <= 0) {
                }
            }
        } while (j12 <= 0);
        if (z12) {
            Thread.currentThread().interrupt();
        }
        return z11;
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
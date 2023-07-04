package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import vz.b0;
import wz.e0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\rJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!R*\u0010#\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R \u00107\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u00109\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0013\u0010\"\u001a\u00020\u001f8G@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006>"}, d2 = {"Lokhttp3/Dispatcher;", "", "", "host", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "findExistingCallWithHost", "", "promoteAndExecute", "T", "Ljava/util/Deque;", "calls", "call", "Lvz/b0;", "finished", "(Ljava/util/Deque;Ljava/lang/Object;)V", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)V", "executed", "finished$okhttp", "", "Lokhttp3/Call;", "queuedCalls", "runningCalls", "", "queuedCallsCount", "runningCallsCount", "Ljava/util/concurrent/ExecutorService;", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "runningSyncCalls", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next = it2.next();
            if (s.c(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it3 = this.readyAsyncCalls.iterator();
        while (it3.hasNext()) {
            RealCall.AsyncCall next2 = it3.next();
            if (s.c(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t11) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t11)) {
                runnable = this.idleCallback;
                b0 b0Var = b0.f54756a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i11;
        boolean z11;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            s.f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
            s.f(it2, "readyAsyncCalls.iterator()");
            while (it2.hasNext()) {
                RealCall.AsyncCall asyncCall = it2.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                } else if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it2.remove();
                    asyncCall.getCallsPerHost().incrementAndGet();
                    s.f(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.runningAsyncCalls.add(asyncCall);
                }
            }
            z11 = runningCallsCount() > 0;
            b0 b0Var = b0.f54756a;
        }
        int size = arrayList.size();
        for (i11 = 0; i11 < size; i11++) {
            ((RealCall.AsyncCall) arrayList.get(i11)).executeOn(executorService());
        }
        return z11;
    }

    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m855deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it3 = this.runningAsyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().getCall().cancel();
        }
        Iterator<RealCall> it4 = this.runningSyncCalls.iterator();
        while (it4.hasNext()) {
            it4.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        RealCall.AsyncCall findExistingCallWithHost;
        s.g(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            b0 b0Var = b0.f54756a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall call) {
        s.g(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        s.e(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        s.g(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        int t11;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        t11 = x.t(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (RealCall.AsyncCall asyncCall : arrayDeque) {
            arrayList.add(asyncCall.getCall());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        s.f(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        int t11;
        List y02;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        t11 = x.t(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (RealCall.AsyncCall asyncCall : arrayDeque2) {
            arrayList.add(asyncCall.getCall());
        }
        y02 = e0.y0(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(y02);
        s.f(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i11) {
        if (i11 >= 1) {
            synchronized (this) {
                this.maxRequests = i11;
                b0 b0Var = b0.f54756a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i11).toString());
    }

    public final void setMaxRequestsPerHost(int i11) {
        if (i11 >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = i11;
                b0 b0Var = b0.f54756a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i11).toString());
    }

    public final void finished$okhttp(RealCall call) {
        s.g(call, "call");
        finished(this.runningSyncCalls, call);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        s.g(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
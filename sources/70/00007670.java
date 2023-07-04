package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h1 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    private static final ReferenceQueue<h1> f30972c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<a, a> f30973d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f30974e = Logger.getLogger(h1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final a f30975b;

    /* loaded from: classes5.dex */
    static final class a extends WeakReference<h1> {

        /* renamed from: f  reason: collision with root package name */
        private static final boolean f30976f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g  reason: collision with root package name */
        private static final RuntimeException f30977g = e();

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<h1> f30978a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<a, a> f30979b;

        /* renamed from: c  reason: collision with root package name */
        private final String f30980c;

        /* renamed from: d  reason: collision with root package name */
        private final Reference<RuntimeException> f30981d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicBoolean f30982e;

        a(h1 h1Var, io.grpc.p0 p0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(h1Var, referenceQueue);
            RuntimeException runtimeException;
            this.f30982e = new AtomicBoolean();
            if (f30976f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f30977g;
            }
            this.f30981d = new SoftReference(runtimeException);
            this.f30980c = p0Var.toString();
            this.f30978a = referenceQueue;
            this.f30979b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue<h1> referenceQueue) {
            int i11 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i11;
                }
                RuntimeException runtimeException = aVar.f30981d.get();
                aVar.c();
                if (!aVar.f30982e.get()) {
                    i11++;
                    Level level = Level.SEVERE;
                    if (h1.f30974e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(h1.f30974e.getName());
                        logRecord.setParameters(new Object[]{aVar.f30980c});
                        logRecord.setThrown(runtimeException);
                        h1.f30974e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f30979b.remove(this);
            this.f30981d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f30982e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f30978a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(io.grpc.p0 p0Var) {
        this(p0Var, f30972c, f30973d);
    }

    @Override // io.grpc.internal.l0, io.grpc.p0
    public io.grpc.p0 i() {
        this.f30975b.d();
        return super.i();
    }

    h1(io.grpc.p0 p0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(p0Var);
        this.f30975b = new a(this, p0Var, referenceQueue, concurrentMap);
    }
}
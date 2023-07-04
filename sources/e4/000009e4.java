package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.c<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f6652d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f6653e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    static final b f6654f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f6655g;

    /* renamed from: a  reason: collision with root package name */
    volatile Object f6656a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f6657b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f6658c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f6659c;

        /* renamed from: d  reason: collision with root package name */
        static final c f6660d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f6661a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f6662b;

        static {
            if (a.f6652d) {
                f6660d = null;
                f6659c = null;
                return;
            }
            f6660d = new c(false, null);
            f6659c = new c(true, null);
        }

        c(boolean z11, Throwable th2) {
            this.f6661a = z11;
            this.f6662b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f6663b = new d(new C0119a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f6664a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0119a extends Throwable {
            C0119a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f6664a = (Throwable) a.e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f6665d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f6666a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f6667b;

        /* renamed from: c  reason: collision with root package name */
        e f6668c;

        e(Runnable runnable, Executor executor) {
            this.f6666a = runnable;
            this.f6667b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f6669a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f6670b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f6671c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f6672d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f6673e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6669a = atomicReferenceFieldUpdater;
            this.f6670b = atomicReferenceFieldUpdater2;
            this.f6671c = atomicReferenceFieldUpdater3;
            this.f6672d = atomicReferenceFieldUpdater4;
            this.f6673e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f6672d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f6673e.compareAndSet(aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.f6671c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f6670b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f6669a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f6674a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.c<? extends V> f6675b;

        g(a<V> aVar, com.google.common.util.concurrent.c<? extends V> cVar) {
            this.f6674a = aVar;
            this.f6675b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6674a.f6656a != this) {
                return;
            }
            if (a.f6654f.b(this.f6674a, this, a.j(this.f6675b))) {
                a.g(this.f6674a);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f6657b == eVar) {
                    aVar.f6657b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f6656a == obj) {
                    aVar.f6656a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f6658c == iVar) {
                    aVar.f6658c = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f6678b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f6677a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f6676c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f6677a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f6678b;

        i(boolean z11) {
        }

        void a(i iVar) {
            a.f6654f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f6677a;
            if (thread != null) {
                this.f6677a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f6654f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, cg.c.f9084i), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f6654f = hVar;
        if (th != null) {
            f6653e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6655g = new Object();
    }

    private void b(StringBuilder sb2) {
        try {
            Object k11 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k11));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T e(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6657b;
        } while (!f6654f.a(this, eVar2, e.f6665d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6668c;
            eVar4.f6668c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f11 = aVar.f(eVar);
            while (f11 != null) {
                eVar = f11.f6668c;
                Runnable runnable = f11.f6666a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f6674a;
                    if (aVar.f6656a == gVar) {
                        if (f6654f.b(aVar, gVar, j(gVar.f6675b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f11.f6667b);
                }
                f11 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            Logger logger = f6653e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f6655g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f6664a);
        }
        throw d("Task was cancelled.", ((c) obj).f6662b);
    }

    static Object j(com.google.common.util.concurrent.c<?> cVar) {
        if (cVar instanceof a) {
            Object obj = ((a) cVar).f6656a;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                return cVar2.f6661a ? cVar2.f6662b != null ? new c(false, cVar2.f6662b) : c.f6660d : obj;
            }
            return obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f6652d) & isCancelled) {
            return c.f6660d;
        }
        try {
            Object k11 = k(cVar);
            return k11 == null ? f6655g : k11;
        } catch (CancellationException e11) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e11));
            }
            return new c(false, e11);
        } catch (ExecutionException e12) {
            return new d(e12.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V k(Future<V> future) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f6658c;
        } while (!f6654f.c(this, iVar, i.f6676c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f6678b;
        }
    }

    private void o(i iVar) {
        iVar.f6677a = null;
        while (true) {
            i iVar2 = this.f6658c;
            if (iVar2 == i.f6676c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f6678b;
                if (iVar2.f6677a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f6678b = iVar4;
                    if (iVar3.f6677a == null) {
                        break;
                    }
                } else if (!f6654f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.c
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f6657b;
        if (eVar != e.f6665d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6668c = eVar;
                if (f6654f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f6657b;
            } while (eVar != e.f6665d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        c cVar;
        Object obj = this.f6656a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f6652d) {
            cVar = new c(z11, new CancellationException("Future.cancel() was called."));
        } else if (z11) {
            cVar = c.f6659c;
        } else {
            cVar = c.f6660d;
        }
        a<V> aVar = this;
        boolean z12 = false;
        while (true) {
            if (f6654f.b(aVar, obj, cVar)) {
                if (z11) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.c<? extends V> cVar2 = ((g) obj).f6675b;
                if (cVar2 instanceof a) {
                    aVar = (a) cVar2;
                    obj = aVar.f6656a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z12 = true;
                } else {
                    cVar2.cancel(z11);
                    return true;
                }
            } else {
                obj = aVar.f6656a;
                if (!(obj instanceof g)) {
                    return z12;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j11, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f6656a;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f6658c;
                if (iVar != i.f6676c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f6654f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6656a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f6658c;
                        }
                    } while (iVar != i.f6676c);
                    return i(this.f6656a);
                }
                return i(this.f6656a);
            }
            while (nanos > 0) {
                Object obj3 = this.f6656a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                int i11 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z11 = i11 == 0 || nanos2 > 1000;
                if (i11 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z11) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z11) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6656a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f6656a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f6656a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f6675b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v11) {
        if (v11 == null) {
            v11 = (V) f6655g;
        }
        if (f6654f.b(this, null, v11)) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th2) {
        if (f6654f.b(this, null, new d((Throwable) e(th2)))) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(com.google.common.util.concurrent.c<? extends V> cVar) {
        d dVar;
        e(cVar);
        Object obj = this.f6656a;
        if (obj == null) {
            if (cVar.isDone()) {
                if (f6654f.b(this, null, j(cVar))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, cVar);
            if (f6654f.b(this, null, gVar)) {
                try {
                    cVar.a(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f6663b;
                    }
                    f6654f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f6656a;
        }
        if (obj instanceof c) {
            cVar.cancel(((c) obj).f6661a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6656a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f6658c;
            if (iVar != i.f6676c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f6654f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6656a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f6658c;
                } while (iVar != i.f6676c);
                return i(this.f6656a);
            }
            return i(this.f6656a);
        }
        throw new InterruptedException();
    }
}
package com.google.common.util.concurrent;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.common.base.b0;
import com.google.common.base.u;
import com.google.common.base.z;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class a<V> extends gl.a implements com.google.common.util.concurrent.c<V> {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f16179d;

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f16180e;

    /* renamed from: f  reason: collision with root package name */
    private static final b f16181f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f16182g;

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f16183a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f16184b;

    /* renamed from: c  reason: collision with root package name */
    private volatile k f16185c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, k kVar, k kVar2);

        abstract void d(k kVar, k kVar2);

        abstract void e(k kVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f16186c;

        /* renamed from: d  reason: collision with root package name */
        static final c f16187d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f16188a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f16189b;

        static {
            if (a.f16179d) {
                f16187d = null;
                f16186c = null;
                return;
            }
            f16187d = new c(false, null);
            f16186c = new c(true, null);
        }

        c(boolean z11, Throwable th2) {
            this.f16188a = z11;
            this.f16189b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Throwable f16190a;

        /* renamed from: com.google.common.util.concurrent.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0296a extends Throwable {
            C0296a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0296a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th2) {
            this.f16190a = (Throwable) u.o(th2);
        }
    }

    /* loaded from: classes3.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f16195a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f16196b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, k> f16197c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f16198d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f16199e;

        f(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f16195a = atomicReferenceFieldUpdater;
            this.f16196b = atomicReferenceFieldUpdater2;
            this.f16197c = atomicReferenceFieldUpdater3;
            this.f16198d = atomicReferenceFieldUpdater4;
            this.f16199e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f16198d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f16199e.compareAndSet(aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, k kVar, k kVar2) {
            return this.f16197c.compareAndSet(aVar, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(k kVar, k kVar2) {
            this.f16196b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(k kVar, Thread thread) {
            this.f16195a.lazySet(kVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f16200a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.c<? extends V> f16201b;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f16200a).f16183a != this) {
                return;
            }
            if (a.f16181f.b(this.f16200a, this, a.w(this.f16201b))) {
                a.t(this.f16200a);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f16184b == eVar) {
                    ((a) aVar).f16184b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f16183a == obj) {
                    ((a) aVar).f16183a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                if (((a) aVar).f16185c == kVar) {
                    ((a) aVar).f16185c = kVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(k kVar, k kVar2) {
            kVar.f16210b = kVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(k kVar, Thread thread) {
            kVar.f16209a = thread;
        }
    }

    /* loaded from: classes3.dex */
    static abstract class i<V> extends a<V> {
    }

    /* loaded from: classes3.dex */
    private static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f16202a;

        /* renamed from: b  reason: collision with root package name */
        static final long f16203b;

        /* renamed from: c  reason: collision with root package name */
        static final long f16204c;

        /* renamed from: d  reason: collision with root package name */
        static final long f16205d;

        /* renamed from: e  reason: collision with root package name */
        static final long f16206e;

        /* renamed from: f  reason: collision with root package name */
        static final long f16207f;

        /* renamed from: com.google.common.util.concurrent.a$j$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0297a implements PrivilegedExceptionAction<Unsafe> {
            C0297a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0297a());
                }
                try {
                    f16204c = unsafe.objectFieldOffset(a.class.getDeclaredField(cg.c.f9084i));
                    f16203b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f16205d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f16206e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                    f16207f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                    f16202a = unsafe;
                } catch (Exception e11) {
                    b0.f(e11);
                    throw new RuntimeException(e11);
                }
            } catch (PrivilegedActionException e12) {
                throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
            }
        }

        private j() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return f16202a.compareAndSwapObject(aVar, f16203b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return f16202a.compareAndSwapObject(aVar, f16205d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, k kVar, k kVar2) {
            return f16202a.compareAndSwapObject(aVar, f16204c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(k kVar, k kVar2) {
            f16202a.putObject(kVar, f16207f, kVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(k kVar, Thread thread) {
            f16202a.putObject(kVar, f16206e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class k {

        /* renamed from: c  reason: collision with root package name */
        static final k f16208c = new k(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f16209a;

        /* renamed from: b  reason: collision with root package name */
        volatile k f16210b;

        k(boolean z11) {
        }

        void a(k kVar) {
            a.f16181f.d(this, kVar);
        }

        void b() {
            Thread thread = this.f16209a;
            if (thread != null) {
                this.f16209a = null;
                LockSupport.unpark(thread);
            }
        }

        k() {
            a.f16181f.e(this, Thread.currentThread());
        }
    }

    static {
        boolean z11;
        b hVar;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f16179d = z11;
        f16180e = Logger.getLogger(a.class.getName());
        Throwable th2 = null;
        try {
            hVar = new j();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, cg.c.f9084i), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Throwable th4) {
                hVar = new h();
                th2 = th4;
            }
        }
        f16181f = hVar;
        if (th2 != null) {
            Logger logger = f16180e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f16182g = new Object();
    }

    private void A() {
        k kVar;
        do {
            kVar = this.f16185c;
        } while (!f16181f.c(this, kVar, k.f16208c));
        while (kVar != null) {
            kVar.b();
            kVar = kVar.f16210b;
        }
    }

    private void B(k kVar) {
        kVar.f16209a = null;
        while (true) {
            k kVar2 = this.f16185c;
            if (kVar2 == k.f16208c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f16210b;
                if (kVar2.f16209a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f16210b = kVar4;
                    if (kVar3.f16209a == null) {
                        break;
                    }
                } else if (!f16181f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    private void m(StringBuilder sb2) {
        try {
            Object x11 = x(this);
            sb2.append("SUCCESS, result=[");
            p(sb2, x11);
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

    private void n(StringBuilder sb2) {
        String sb3;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f16183a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            q(sb2, ((g) obj).f16201b);
            sb2.append("]");
        } else {
            try {
                sb3 = z.a(z());
            } catch (RuntimeException | StackOverflowError e11) {
                String valueOf = String.valueOf(e11.getClass());
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                sb4.append("Exception thrown from implementation: ");
                sb4.append(valueOf);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                sb2.append(", info=[");
                sb2.append(sb3);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m(sb2);
        }
    }

    private void p(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void q(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e11) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e11.getClass());
        }
    }

    private static CancellationException r(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e s(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f16184b;
        } while (!f16181f.a(this, eVar2, e.f16191d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f16194c;
            eVar4.f16194c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.common.util.concurrent.a, com.google.common.util.concurrent.a<V>] */
    public static void t(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.A();
            aVar.o();
            e s11 = aVar.s(eVar);
            while (s11 != null) {
                eVar = s11.f16194c;
                Runnable runnable = s11.f16192a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f16200a;
                    if (((a) aVar).f16183a == gVar) {
                        if (f16181f.b(aVar, gVar, w(gVar.f16201b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = s11.f16193b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                s11 = eVar;
            }
            return;
        }
    }

    private static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            Logger logger = f16180e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V v(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f16190a);
            }
            return obj == f16182g ? (V) com.google.common.util.concurrent.e.a() : obj;
        }
        throw r("Task was cancelled.", ((c) obj).f16189b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object w(com.google.common.util.concurrent.c<?> cVar) {
        Throwable a11;
        if ((cVar instanceof gl.a) && (a11 = gl.b.a((gl.a) cVar)) != null) {
            return new d(a11);
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f16179d) & isCancelled) {
            c cVar2 = c.f16187d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object x11 = x(cVar);
            if (!isCancelled) {
                return x11 == null ? f16182g : x11;
            }
            String valueOf = String.valueOf(cVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(valueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e11) {
            if (!isCancelled) {
                String valueOf2 = String.valueOf(cVar);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf2);
                return new d(new IllegalArgumentException(sb3.toString(), e11));
            }
            return new c(false, e11);
        } catch (ExecutionException e12) {
            if (isCancelled) {
                String valueOf3 = String.valueOf(cVar);
                StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
                sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb4.append(valueOf3);
                return new c(false, new IllegalArgumentException(sb4.toString(), e12));
            }
            return new d(e12.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V x(Future<V> future) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C(V v11) {
        if (v11 == null) {
            v11 = (V) f16182g;
        }
        if (f16181f.b(this, null, v11)) {
            t(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean D(Throwable th2) {
        if (f16181f.b(this, null, new d((Throwable) u.o(th2)))) {
            t(this);
            return true;
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        u.p(runnable, "Runnable was null.");
        u.p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f16184b) != e.f16191d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f16194c = eVar;
                if (f16181f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f16184b;
            } while (eVar != e.f16191d);
            u(runnable, executor);
        }
        u(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gl.a
    public final Throwable b() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        c cVar;
        Object obj = this.f16183a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f16179d) {
            cVar = new c(z11, new CancellationException("Future.cancel() was called."));
        } else {
            if (z11) {
                cVar = c.f16186c;
            } else {
                cVar = c.f16187d;
            }
            Objects.requireNonNull(cVar);
        }
        while (!f16181f.b(this, obj, cVar)) {
            obj = this.f16183a;
            if (!(obj instanceof g)) {
                return false;
            }
        }
        if (z11) {
            y();
        }
        t(this);
        if (obj instanceof g) {
            ((g) obj).f16201b.cancel(z11);
            return true;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f16183a;
            if ((obj != null) & (!(obj instanceof g))) {
                return v(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k kVar = this.f16185c;
                if (kVar != k.f16208c) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (f16181f.c(this, kVar, kVar2)) {
                            do {
                                com.google.common.util.concurrent.f.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f16183a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return v(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    B(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            B(kVar2);
                        } else {
                            kVar = this.f16185c;
                        }
                    } while (kVar != k.f16208c);
                    Object obj3 = this.f16183a;
                    Objects.requireNonNull(obj3);
                    return v(obj3);
                }
                Object obj32 = this.f16183a;
                Objects.requireNonNull(obj32);
                return v(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f16183a;
                if ((obj4 != null) & (!(obj4 instanceof g))) {
                    return v(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb2.append("Waited ");
            sb2.append(j11);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb3).concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                int i11 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z11 = i11 == 0 || nanos2 > 1000;
                if (i11 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z11) {
                        sb5 = String.valueOf(sb5).concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z11) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(aVar).length());
            sb7.append(sb3);
            sb7.append(" for ");
            sb7.append(aVar);
            throw new TimeoutException(sb7.toString());
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f16183a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f16183a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void o() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m(sb2);
        } else {
            n(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void y() {
    }

    protected String z() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("remaining delay=[");
            sb2.append(delay);
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f16191d = new e();

        /* renamed from: a  reason: collision with root package name */
        final Runnable f16192a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f16193b;

        /* renamed from: c  reason: collision with root package name */
        e f16194c;

        e(Runnable runnable, Executor executor) {
            this.f16192a = runnable;
            this.f16193b = executor;
        }

        e() {
            this.f16192a = null;
            this.f16193b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16183a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            k kVar = this.f16185c;
            if (kVar != k.f16208c) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f16181f.c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16183a;
                            } else {
                                B(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    kVar = this.f16185c;
                } while (kVar != k.f16208c);
                Object obj3 = this.f16183a;
                Objects.requireNonNull(obj3);
                return v(obj3);
            }
            Object obj32 = this.f16183a;
            Objects.requireNonNull(obj32);
            return v(obj32);
        }
        throw new InterruptedException();
    }
}
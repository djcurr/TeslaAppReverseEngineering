package n5;

import bolts.ExecutorException;
import bolts.UnobservedTaskException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class e<TResult> {

    /* renamed from: l  reason: collision with root package name */
    private static volatile d f40505l;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40510b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40511c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f40512d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f40513e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40514f;

    /* renamed from: g  reason: collision with root package name */
    private g f40515g;

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f40502i = n5.b.a();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f40503j = n5.b.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f40504k = n5.a.c();

    /* renamed from: m  reason: collision with root package name */
    private static e<?> f40506m = new e<>((Object) null);

    /* renamed from: n  reason: collision with root package name */
    private static e<Boolean> f40507n = new e<>(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    private static e<Boolean> f40508o = new e<>(Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final Object f40509a = new Object();

    /* renamed from: h  reason: collision with root package name */
    private List<n5.d<TResult, Void>> f40516h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements n5.d<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f40517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n5.d f40518b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f40519c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n5.c f40520d;

        a(e eVar, f fVar, n5.d dVar, Executor executor, n5.c cVar) {
            this.f40517a = fVar;
            this.f40518b = dVar;
            this.f40519c = executor;
        }

        @Override // n5.d
        /* renamed from: b */
        public Void a(e<TResult> eVar) {
            e.d(this.f40517a, this.f40518b, eVar, this.f40519c, this.f40520d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f40521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n5.d f40522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f40523c;

        b(n5.c cVar, f fVar, n5.d dVar, e eVar) {
            this.f40521a = fVar;
            this.f40522b = dVar;
            this.f40523c = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f40521a.d(this.f40522b.a(this.f40523c));
            } catch (CancellationException unused) {
                this.f40521a.b();
            } catch (Exception e11) {
                this.f40521a.c(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f40524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f40525b;

        c(n5.c cVar, f fVar, Callable callable) {
            this.f40524a = fVar;
            this.f40525b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f40524a.d(this.f40525b.call());
            } catch (CancellationException unused) {
                this.f40524a.b();
            } catch (Exception e11) {
                this.f40524a.c(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(e<?> eVar, UnobservedTaskException unobservedTaskException);
    }

    static {
        new e(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
    }

    public static <TResult> e<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> e<TResult> c(Callable<TResult> callable, Executor executor, n5.c cVar) {
        f fVar = new f();
        try {
            executor.execute(new c(cVar, fVar, callable));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
        return fVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(f<TContinuationResult> fVar, n5.d<TResult, TContinuationResult> dVar, e<TResult> eVar, Executor executor, n5.c cVar) {
        try {
            executor.execute(new b(cVar, fVar, dVar, eVar));
        } catch (Exception e11) {
            fVar.c(new ExecutorException(e11));
        }
    }

    public static <TResult> e<TResult> g(Exception exc) {
        f fVar = new f();
        fVar.c(exc);
        return fVar.a();
    }

    public static <TResult> e<TResult> h(TResult tresult) {
        if (tresult == null) {
            return (e<TResult>) f40506m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (e<TResult>) f40507n : (e<TResult>) f40508o;
        }
        f fVar = new f();
        fVar.d(tresult);
        return fVar.a();
    }

    public static d k() {
        return f40505l;
    }

    private void o() {
        synchronized (this.f40509a) {
            for (n5.d<TResult, Void> dVar : this.f40516h) {
                try {
                    dVar.a(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f40516h = null;
        }
    }

    public <TContinuationResult> e<TContinuationResult> e(n5.d<TResult, TContinuationResult> dVar) {
        return f(dVar, f40503j, null);
    }

    public <TContinuationResult> e<TContinuationResult> f(n5.d<TResult, TContinuationResult> dVar, Executor executor, n5.c cVar) {
        boolean m11;
        f fVar = new f();
        synchronized (this.f40509a) {
            m11 = m();
            if (!m11) {
                this.f40516h.add(new a(this, fVar, dVar, executor, cVar));
            }
        }
        if (m11) {
            d(fVar, dVar, this, executor, cVar);
        }
        return fVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f40509a) {
            if (this.f40513e != null) {
                this.f40514f = true;
                g gVar = this.f40515g;
                if (gVar != null) {
                    gVar.a();
                    this.f40515g = null;
                }
            }
            exc = this.f40513e;
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.f40509a) {
            tresult = this.f40512d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z11;
        synchronized (this.f40509a) {
            z11 = this.f40511c;
        }
        return z11;
    }

    public boolean m() {
        boolean z11;
        synchronized (this.f40509a) {
            z11 = this.f40510b;
        }
        return z11;
    }

    public boolean n() {
        boolean z11;
        synchronized (this.f40509a) {
            z11 = i() != null;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        synchronized (this.f40509a) {
            if (this.f40510b) {
                return false;
            }
            this.f40510b = true;
            this.f40511c = true;
            this.f40509a.notifyAll();
            o();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(Exception exc) {
        synchronized (this.f40509a) {
            if (this.f40510b) {
                return false;
            }
            this.f40510b = true;
            this.f40513e = exc;
            this.f40514f = false;
            this.f40509a.notifyAll();
            o();
            if (!this.f40514f && k() != null) {
                this.f40515g = new g(this);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(TResult tresult) {
        synchronized (this.f40509a) {
            if (this.f40510b) {
                return false;
            }
            this.f40510b = true;
            this.f40512d = tresult;
            this.f40509a.notifyAll();
            o();
            return true;
        }
    }

    private e(TResult tresult) {
        r(tresult);
    }

    private e(boolean z11) {
        if (z11) {
            p();
        } else {
            r(null);
        }
    }
}
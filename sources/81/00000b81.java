package az;

import hy.b;
import hy.e;
import hy.g;
import hy.i;
import hy.k;
import hy.l;
import hy.m;
import hy.o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.Objects;
import ky.c;
import ky.f;
import ky.h;
import ky.j;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a */
    static volatile f<? super Throwable> f7126a;

    /* renamed from: b */
    static volatile h<? super Runnable, ? extends Runnable> f7127b;

    /* renamed from: c */
    static volatile h<? super j<l>, ? extends l> f7128c;

    /* renamed from: d */
    static volatile h<? super j<l>, ? extends l> f7129d;

    /* renamed from: e */
    static volatile h<? super j<l>, ? extends l> f7130e;

    /* renamed from: f */
    static volatile h<? super j<l>, ? extends l> f7131f;

    /* renamed from: g */
    static volatile h<? super l, ? extends l> f7132g;

    /* renamed from: h */
    static volatile h<? super l, ? extends l> f7133h;

    /* renamed from: i */
    static volatile h<? super l, ? extends l> f7134i;

    /* renamed from: j */
    static volatile h<? super e, ? extends e> f7135j;

    /* renamed from: k */
    static volatile h<? super i, ? extends i> f7136k;

    /* renamed from: l */
    static volatile h<? super g, ? extends g> f7137l;

    /* renamed from: m */
    static volatile h<? super m, ? extends m> f7138m;

    /* renamed from: n */
    static volatile h<? super b, ? extends b> f7139n;

    /* renamed from: o */
    static volatile c<? super e, ? super b80.b, ? extends b80.b> f7140o;

    /* renamed from: p */
    static volatile c<? super i, ? super k, ? extends k> f7141p;

    /* renamed from: q */
    static volatile c<? super m, ? super o, ? extends o> f7142q;

    /* renamed from: r */
    static volatile c<? super b, ? super hy.c, ? extends hy.c> f7143r;

    /* renamed from: s */
    static volatile ky.e f7144s;

    /* renamed from: t */
    static volatile boolean f7145t;

    /* renamed from: u */
    static volatile boolean f7146u;

    static void A(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t11, U u11) {
        try {
            return cVar.a(t11, u11);
        } catch (Throwable th2) {
            throw yy.g.h(th2);
        }
    }

    static <T, R> R b(h<T, R> hVar, T t11) {
        try {
            return hVar.apply(t11);
        } catch (Throwable th2) {
            throw yy.g.h(th2);
        }
    }

    static l c(h<? super j<l>, ? extends l> hVar, j<l> jVar) {
        Object b11 = b(hVar, jVar);
        Objects.requireNonNull(b11, "Scheduler Supplier result can't be null");
        return (l) b11;
    }

    static l d(j<l> jVar) {
        try {
            l lVar = jVar.get();
            Objects.requireNonNull(lVar, "Scheduler Supplier result can't be null");
            return lVar;
        } catch (Throwable th2) {
            throw yy.g.h(th2);
        }
    }

    public static l e(j<l> jVar) {
        Objects.requireNonNull(jVar, "Scheduler Supplier can't be null");
        h<? super j<l>, ? extends l> hVar = f7128c;
        if (hVar == null) {
            return d(jVar);
        }
        return c(hVar, jVar);
    }

    public static l f(j<l> jVar) {
        Objects.requireNonNull(jVar, "Scheduler Supplier can't be null");
        h<? super j<l>, ? extends l> hVar = f7130e;
        if (hVar == null) {
            return d(jVar);
        }
        return c(hVar, jVar);
    }

    public static l g(j<l> jVar) {
        Objects.requireNonNull(jVar, "Scheduler Supplier can't be null");
        h<? super j<l>, ? extends l> hVar = f7131f;
        if (hVar == null) {
            return d(jVar);
        }
        return c(hVar, jVar);
    }

    public static l h(j<l> jVar) {
        Objects.requireNonNull(jVar, "Scheduler Supplier can't be null");
        h<? super j<l>, ? extends l> hVar = f7129d;
        if (hVar == null) {
            return d(jVar);
        }
        return c(hVar, jVar);
    }

    static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f7146u;
    }

    public static b k(b bVar) {
        h<? super b, ? extends b> hVar = f7139n;
        return hVar != null ? (b) b(hVar, bVar) : bVar;
    }

    public static <T> e<T> l(e<T> eVar) {
        h<? super e, ? extends e> hVar = f7135j;
        return hVar != null ? (e) b(hVar, eVar) : eVar;
    }

    public static <T> g<T> m(g<T> gVar) {
        h<? super g, ? extends g> hVar = f7137l;
        return hVar != null ? (g) b(hVar, gVar) : gVar;
    }

    public static <T> i<T> n(i<T> iVar) {
        h<? super i, ? extends i> hVar = f7136k;
        return hVar != null ? (i) b(hVar, iVar) : iVar;
    }

    public static <T> m<T> o(m<T> mVar) {
        h<? super m, ? extends m> hVar = f7138m;
        return hVar != null ? (m) b(hVar, mVar) : mVar;
    }

    public static boolean p() {
        ky.e eVar = f7144s;
        if (eVar != null) {
            try {
                return eVar.a();
            } catch (Throwable th2) {
                throw yy.g.h(th2);
            }
        }
        return false;
    }

    public static l q(l lVar) {
        h<? super l, ? extends l> hVar = f7132g;
        return hVar == null ? lVar : (l) b(hVar, lVar);
    }

    public static void r(Throwable th2) {
        f<? super Throwable> fVar = f7126a;
        if (th2 == null) {
            th2 = yy.g.b("onError called with a null Throwable.");
        } else if (!i(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (fVar != null) {
            try {
                fVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                A(th3);
            }
        }
        th2.printStackTrace();
        A(th2);
    }

    public static l s(l lVar) {
        h<? super l, ? extends l> hVar = f7134i;
        return hVar == null ? lVar : (l) b(hVar, lVar);
    }

    public static Runnable t(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        h<? super Runnable, ? extends Runnable> hVar = f7127b;
        return hVar == null ? runnable : (Runnable) b(hVar, runnable);
    }

    public static l u(l lVar) {
        h<? super l, ? extends l> hVar = f7133h;
        return hVar == null ? lVar : (l) b(hVar, lVar);
    }

    public static <T> b80.b<? super T> v(e<T> eVar, b80.b<? super T> bVar) {
        c<? super e, ? super b80.b, ? extends b80.b> cVar = f7140o;
        return cVar != null ? (b80.b) a(cVar, eVar, bVar) : bVar;
    }

    public static hy.c w(b bVar, hy.c cVar) {
        c<? super b, ? super hy.c, ? extends hy.c> cVar2 = f7143r;
        return cVar2 != null ? (hy.c) a(cVar2, bVar, cVar) : cVar;
    }

    public static <T> k<? super T> x(i<T> iVar, k<? super T> kVar) {
        c<? super i, ? super k, ? extends k> cVar = f7141p;
        return cVar != null ? (k) a(cVar, iVar, kVar) : kVar;
    }

    public static <T> o<? super T> y(m<T> mVar, o<? super T> oVar) {
        c<? super m, ? super o, ? extends o> cVar = f7142q;
        return cVar != null ? (o) a(cVar, mVar, oVar) : oVar;
    }

    public static void z(f<? super Throwable> fVar) {
        if (!f7145t) {
            f7126a = fVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
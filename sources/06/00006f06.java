package fy;

import hy.l;
import java.util.Objects;
import java.util.concurrent.Callable;
import ky.h;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile h<Callable<l>, l> f27037a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile h<l, l> f27038b;

    static <T, R> R a(h<T, R> hVar, T t11) {
        try {
            return hVar.apply(t11);
        } catch (Throwable th2) {
            throw jy.a.a(th2);
        }
    }

    static l b(h<Callable<l>, l> hVar, Callable<l> callable) {
        l lVar = (l) a(hVar, callable);
        Objects.requireNonNull(lVar, "Scheduler Callable returned null");
        return lVar;
    }

    static l c(Callable<l> callable) {
        try {
            l call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw jy.a.a(th2);
        }
    }

    public static l d(Callable<l> callable) {
        Objects.requireNonNull(callable, "scheduler == null");
        h<Callable<l>, l> hVar = f27037a;
        if (hVar == null) {
            return c(callable);
        }
        return b(hVar, callable);
    }

    public static l e(l lVar) {
        Objects.requireNonNull(lVar, "scheduler == null");
        h<l, l> hVar = f27038b;
        return hVar == null ? lVar : (l) a(hVar, lVar);
    }
}
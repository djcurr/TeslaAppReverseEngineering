package u9;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import t9.e;
import t9.m;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f53384a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f53385b = Executors.newFixedThreadPool(16);

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC1197a<T, R> {
        R a(T t11);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Pair<Boolean, ?> b(int i11, TimeUnit timeUnit, long j11) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f53384a;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i11));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l11 = (Long) pair.first;
        Object obj = pair.second;
        if (l11 != null && SystemClock.elapsedRealtime() - l11.longValue() <= TimeUnit.MILLISECONDS.convert(j11, timeUnit)) {
            return new Pair<>(Boolean.TRUE, obj);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static <T> T c(int i11, long j11, TimeUnit timeUnit, InterfaceC1197a<Object, Boolean> interfaceC1197a, Callable<T> callable, boolean z11, long j12, TimeUnit timeUnit2, r9.a aVar, boolean z12) {
        T call;
        try {
            Pair<Boolean, ?> b11 = b(i11, timeUnit, j11);
            if (((Boolean) b11.first).booleanValue() && interfaceC1197a.a(b11.second).booleanValue()) {
                e.h("getC", i11 + " got " + b11.second);
                return (T) b11.second;
            }
            if (z12 && m.Z()) {
                c9.a.h(aVar, "biz", "ch_get_main", "" + i11);
                e.h("getC", i11 + " skip");
                call = null;
            } else {
                if (z11) {
                    call = f53385b.submit(callable).get(j12, timeUnit2);
                } else {
                    call = callable.call();
                }
                d(i11, call);
            }
            e.h("getC", i11 + " new " + call);
            return call;
        } catch (Throwable th2) {
            e.c("CDT", "ch_get_e|" + i11, th2);
            c9.a.d(aVar, "biz", "ch_get_e|" + i11, th2);
            e.h("getC", i11 + " err");
            return null;
        }
    }

    public static synchronized void d(int i11, Object obj) {
        synchronized (a.class) {
            if (f53384a == null) {
                f53384a = new ConcurrentHashMap<>();
            }
            f53384a.put(Integer.valueOf(i11), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        }
    }
}
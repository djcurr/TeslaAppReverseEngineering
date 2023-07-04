package net.time4j.android.spi;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m30.e;
import net.time4j.base.c;

/* loaded from: classes5.dex */
class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class[] f40812a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f40813b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f40814c;

    static {
        Class[] clsArr = new Class[0];
        f40812a = clsArr;
        Object[] objArr = new Object[0];
        f40813b = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f40814c = method;
    }

    @Override // m30.e
    public String a() {
        return "Dalvik";
    }

    @Override // m30.e
    public long getNanos() {
        Method method = f40814c;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f40813b)).longValue();
            } catch (IllegalAccessException e11) {
                e11.printStackTrace(System.err);
            } catch (InvocationTargetException e12) {
                e12.printStackTrace(System.err);
            }
        }
        return c.i(SystemClock.elapsedRealtime(), 1000000L);
    }
}
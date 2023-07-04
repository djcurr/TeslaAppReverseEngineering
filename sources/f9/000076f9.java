package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class w1 implements d1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f31259b = Logger.getLogger(w1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f31260c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f31261d;

    /* renamed from: e  reason: collision with root package name */
    private static final RuntimeException f31262e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f31263f;

    /* renamed from: a  reason: collision with root package name */
    private final Object f31264a;

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        try {
            cls.getMethod("sum", new Class[0]);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i11];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i11++;
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            f31259b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            if (th != null) {
            }
            f31260c = null;
            f31261d = null;
            f31262e = new RuntimeException(th);
            f31263f = new Object[]{1L};
        }
        if (th != null && constructor != null) {
            f31260c = constructor;
            f31261d = method;
            f31262e = null;
        } else {
            f31260c = null;
            f31261d = null;
            f31262e = new RuntimeException(th);
        }
        f31263f = new Object[]{1L};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1() {
        RuntimeException runtimeException = f31262e;
        if (runtimeException == null) {
            try {
                this.f31264a = f31260c.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        }
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return f31262e == null;
    }

    @Override // io.grpc.internal.d1
    public void a(long j11) {
        try {
            f31261d.invoke(this.f31264a, j11 == 1 ? f31263f : new Object[]{Long.valueOf(j11)});
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
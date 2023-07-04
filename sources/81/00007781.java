package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f31545a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31546b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f31547c;

    public g(Class<?> cls, String str, Class... clsArr) {
        this.f31545a = cls;
        this.f31546b = str;
        this.f31547c = clsArr;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f31546b;
        if (str != null) {
            Method b11 = b(cls, str, this.f31547c);
            if (b11 == null || (cls2 = this.f31545a) == null || cls2.isAssignableFrom(b11.getReturnType())) {
                return b11;
            }
            return null;
        }
        return null;
    }

    private static Method b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(T t11, Object... objArr) {
        Method a11 = a(t11.getClass());
        if (a11 != null) {
            try {
                return a11.invoke(t11, objArr);
            } catch (IllegalAccessException e11) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a11);
                assertionError.initCause(e11);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.f31546b + " not supported for object " + t11);
    }

    public Object d(T t11, Object... objArr) {
        Method a11 = a(t11.getClass());
        if (a11 == null) {
            return null;
        }
        try {
            return a11.invoke(t11, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t11, Object... objArr) {
        try {
            return d(t11, objArr);
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t11, Object... objArr) {
        try {
            return c(t11, objArr);
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t11) {
        return a(t11.getClass()) != null;
    }
}
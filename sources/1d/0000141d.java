package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Object> f10142a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f10143b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public byte f10144c = 0;

    /* renamed from: d  reason: collision with root package name */
    public AtomicInteger f10145d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    public x f10146e;

    public z(x xVar) {
        this.f10146e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z11 = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f10142a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f10143b;
        threadLocal2.set(null);
        if (operationType != null) {
            String value = operationType.value();
            int incrementAndGet = this.f10145d.incrementAndGet();
            try {
                if (this.f10144c == 0) {
                    com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(incrementAndGet, value, objArr);
                    if (threadLocal2.get() != null) {
                        eVar.a(threadLocal2.get());
                    }
                    byte[] a11 = eVar.a();
                    threadLocal2.set(null);
                    Object a12 = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, (byte[]) new j(this.f10146e.a(), method, incrementAndGet, value, a11, z11).a()).a();
                    if (genericReturnType != Void.TYPE) {
                        threadLocal.set(a12);
                    }
                }
                return threadLocal.get();
            } catch (RpcException e11) {
                e11.setOperationType(value);
                throw e11;
            }
        }
        throw new IllegalStateException("OperationType must be set.");
    }
}
package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import z9.d;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f17843d;

    /* renamed from: e  reason: collision with root package name */
    private static Class<?> f17844e;

    /* renamed from: f  reason: collision with root package name */
    private static Class<?> f17845f;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f17846a;

    /* renamed from: b  reason: collision with root package name */
    private Object f17847b;

    /* renamed from: c  reason: collision with root package name */
    private Object f17848c;

    /* loaded from: classes2.dex */
    private class b implements InvocationHandler {
        private b() {
        }

        public void a() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void b(int i11) {
            if (i11 != 0) {
                if (i11 == 1) {
                    Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
                    return;
                } else if (i11 != 2) {
                    return;
                } else {
                    Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
                    return;
                }
            }
            try {
                Log.d("InstallReferrerState", "OK");
                Object invoke = c.f17843d.getMethod("getInstallReferrer", new Class[0]).invoke(c.this.f17847b, new Object[0]);
                SharedPreferences.Editor edit = c.this.f17846a.edit();
                edit.putString("installReferrer", (String) c.f17845f.getMethod("getInstallReferrer", new Class[0]).invoke(invoke, new Object[0]));
                edit.apply();
                c.f17843d.getMethod("endConnection", new Class[0]).invoke(c.this.f17847b, new Object[0]);
            } catch (Exception e11) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e11.getMessage());
                e11.printStackTrace(System.err);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null && (objArr[0] instanceof Integer)) {
                    b(((Integer) objArr[0]).intValue());
                    return null;
                } else if (name.equals("onInstallReferrerServiceDisconnected")) {
                    a();
                    return null;
                } else {
                    return null;
                }
            } catch (Exception e11) {
                throw new RuntimeException("unexpected invocation exception: " + e11.getMessage());
            }
        }
    }

    static {
        try {
            f17843d = z9.a.class;
            f17844e = z9.c.class;
            f17845f = d.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f17846a = context.getSharedPreferences("react-native-device-info", 0);
        Class<?> cls = f17843d;
        if (cls == null || f17844e == null || f17845f == null) {
            return;
        }
        try {
            Object invoke = cls.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f17847b = invoke.getClass().getMethod("build", new Class[0]).invoke(invoke, new Object[0]);
            this.f17848c = Proxy.newProxyInstance(f17844e.getClassLoader(), new Class[]{f17844e}, new b());
            f17843d.getMethod("startConnection", f17844e).invoke(this.f17847b, this.f17848c);
        } catch (Exception e11) {
            PrintStream printStream = System.err;
            printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e11.getMessage());
            e11.printStackTrace(System.err);
        }
    }
}
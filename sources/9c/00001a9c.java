package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f12799a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Method f12800b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12801c = false;

    public static void a(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 21) {
            return;
        }
        if (i11 >= 29) {
            if (z11) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        b();
        if (z11) {
            try {
                Method method2 = f12799a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z11 || (method = f12800b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    private static void b() {
        Method method;
        if (f12801c) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                f12799a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                f12800b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
            } else {
                f12799a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f12800b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            method = f12799a;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && f12800b != null) {
            method.setAccessible(true);
            f12800b.setAccessible(true);
            f12801c = true;
        }
    }
}
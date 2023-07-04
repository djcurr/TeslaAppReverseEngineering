package t1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f51515a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static Method f51516b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f51517c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f51518d;

    private x() {
    }

    public final void a(Canvas canvas, boolean z11) {
        Method method;
        kotlin.jvm.internal.s.g(canvas, "canvas");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            y.f51519a.a(canvas, z11);
            return;
        }
        if (!f51518d) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f51516b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f51517c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f51516b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f51517c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f51516b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f51517c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f51518d = true;
        }
        if (z11) {
            try {
                Method method4 = f51516b;
                if (method4 != null) {
                    kotlin.jvm.internal.s.e(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z11 || (method = f51517c) == null) {
            return;
        }
        kotlin.jvm.internal.s.e(method);
        method.invoke(canvas, new Object[0]);
    }
}
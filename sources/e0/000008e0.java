package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f6053a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f6054b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 21) {
            return;
        }
        if (i11 >= 29) {
            if (z11) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i11 != 28) {
            if (!f6055c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f6053a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f6054b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f6055c = true;
            }
            if (z11) {
                try {
                    Method method2 = f6053a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11.getCause());
                }
            }
            if (z11 || (method = f6054b) == null) {
                return;
            }
            method.invoke(canvas, new Object[0]);
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1709a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1709a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1709a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1709a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e11) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e11);
            }
        }
    }

    public static boolean b(View view) {
        return androidx.core.view.a0.F(view) == 1;
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e12) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e12);
            }
        }
    }
}
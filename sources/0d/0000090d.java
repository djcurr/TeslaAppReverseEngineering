package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6172a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Method f6173b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6174c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ViewGroup viewGroup, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i11);
        }
        if (!f6174c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f6173b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6174c = true;
        }
        Method method = f6173b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i11))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new i0(viewGroup);
        }
        return h0.g(viewGroup);
    }

    private static void c(ViewGroup viewGroup, boolean z11) {
        if (f6172a) {
            try {
                viewGroup.suppressLayout(z11);
            } catch (NoSuchMethodError unused) {
                f6172a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ViewGroup viewGroup, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            viewGroup.suppressLayout(z11);
        } else if (i11 >= 18) {
            c(viewGroup, z11);
        } else {
            l0.b(viewGroup, z11);
        }
    }
}
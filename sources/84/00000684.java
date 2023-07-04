package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.a0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static Method f4649a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f4650b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f4651c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f4652d;

    /* loaded from: classes.dex */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
            popupWindow.showAsDropDown(view, i11, i12, i13);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z11) {
            popupWindow.setOverlapAnchor(z11);
        }

        static void d(PopupWindow popupWindow, int i11) {
            popupWindow.setWindowLayoutType(i11);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            b.c(popupWindow, z11);
        } else if (i11 >= 21) {
            if (!f4652d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f4651c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e11);
                }
                f4652d = true;
            }
            Field field = f4651c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z11));
                } catch (IllegalAccessException e12) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e12);
                }
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i11);
            return;
        }
        if (!f4650b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f4649a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f4650b = true;
        }
        Method method = f4649a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i11));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(popupWindow, view, i11, i12, i13);
            return;
        }
        if ((androidx.core.view.e.b(i13, a0.F(view)) & 7) == 5) {
            i11 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i11, i12);
    }
}
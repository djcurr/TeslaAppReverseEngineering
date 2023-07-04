package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class k implements i {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f6165b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6166c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f6167d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6168e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f6169f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f6170g;

    /* renamed from: a  reason: collision with root package name */
    private final View f6171a;

    private k(View view) {
        this.f6171a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f6167d;
        if (method != null) {
            try {
                return new k((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (f6168e) {
            return;
        }
        try {
            d();
            Method declaredMethod = f6165b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f6167d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e11);
        }
        f6168e = true;
    }

    private static void d() {
        if (f6166c) {
            return;
        }
        try {
            f6165b = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e11) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e11);
        }
        f6166c = true;
    }

    private static void e() {
        if (f6170g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f6165b.getDeclaredMethod("removeGhost", View.class);
            f6169f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e11);
        }
        f6170g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view) {
        e();
        Method method = f6169f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    @Override // androidx.transition.i
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.i
    public void setVisibility(int i11) {
        this.f6171a.setVisibility(i11);
    }
}
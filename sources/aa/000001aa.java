package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements s {

    /* renamed from: b  reason: collision with root package name */
    private static int f1015b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f1016c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f1017d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f1018e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f1019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f1019a = activity;
    }

    private static void a() {
        try {
            f1015b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1017d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1018e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1016c = declaredField3;
            declaredField3.setAccessible(true);
            f1015b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        if (bVar != p.b.ON_DESTROY) {
            return;
        }
        if (f1015b == 0) {
            a();
        }
        if (f1015b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1019a.getSystemService("input_method");
            try {
                Object obj = f1016c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1017d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1018e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
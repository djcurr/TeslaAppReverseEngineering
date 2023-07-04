package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    private static class a {
        static m0 a(Window window) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                return m0.b(insetsController);
            }
            return null;
        }
    }

    public static m0 a(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(window);
        }
        return new m0(window, view);
    }
}
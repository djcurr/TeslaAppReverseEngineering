package wk;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return b();
            }
            return new e();
        }
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f c() {
        return new f();
    }

    public static void d(View view, float f11) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).X(f11);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.Q()) {
            gVar.b0(com.google.android.material.internal.l.c(view));
        }
    }
}
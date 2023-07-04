package t1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import t1.i0;

/* loaded from: classes.dex */
public final class f {
    public static final h0 a(int i11, int i12, int i13, boolean z11, u1.c colorSpace) {
        Bitmap createBitmap;
        kotlin.jvm.internal.s.g(colorSpace, "colorSpace");
        Bitmap.Config d11 = d(i13);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = o.f51469a.a(i11, i12, i13, z11, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, d11);
            kotlin.jvm.internal.s.f(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z11);
        }
        return new e(createBitmap);
    }

    public static final Bitmap b(h0 h0Var) {
        kotlin.jvm.internal.s.g(h0Var, "<this>");
        if (h0Var instanceof e) {
            return ((e) h0Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final h0 c(Bitmap bitmap) {
        kotlin.jvm.internal.s.g(bitmap, "<this>");
        return new e(bitmap);
    }

    public static final Bitmap.Config d(int i11) {
        i0.a aVar = i0.f51451b;
        if (i0.i(i11, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i0.i(i11, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i0.i(i11, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && i0.i(i11, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i12 >= 26 && i0.i(i11, aVar.d())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        kotlin.jvm.internal.s.g(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return i0.f51451b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return i0.f51451b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return i0.f51451b.b();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && config == Bitmap.Config.RGBA_F16) {
            return i0.f51451b.c();
        }
        if (i11 >= 26 && config == Bitmap.Config.HARDWARE) {
            return i0.f51451b.d();
        }
        return i0.f51451b.b();
    }
}
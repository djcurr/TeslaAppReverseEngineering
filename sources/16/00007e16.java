package kk;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import tk.b;

/* loaded from: classes3.dex */
public class a {
    public static int a(int i11, int i12) {
        return m3.a.k(i11, (Color.alpha(i11) * i12) / 255);
    }

    public static int b(Context context, int i11, int i12) {
        TypedValue a11 = b.a(context, i11);
        return a11 != null ? a11.data : i12;
    }

    public static int c(Context context, int i11, String str) {
        return b.d(context, i11, str);
    }

    public static int d(View view, int i11) {
        return b.e(view, i11);
    }

    public static int e(View view, int i11, int i12) {
        return b(view.getContext(), i11, i12);
    }

    public static boolean f(int i11) {
        return i11 != 0 && m3.a.d(i11) > 0.5d;
    }

    public static int g(int i11, int i12) {
        return m3.a.g(i12, i11);
    }

    public static int h(int i11, int i12, float f11) {
        return g(i11, m3.a.k(i12, Math.round(Color.alpha(i12) * f11)));
    }

    public static int i(View view, int i11, int i12, float f11) {
        return h(d(view, i11), d(view, i12), f11);
    }
}
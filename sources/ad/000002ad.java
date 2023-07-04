package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1906a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1907b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1908c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1909d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1910e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1911f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f1912g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.j.f27280u0);
        try {
            if (!obtainStyledAttributes.hasValue(g.j.f27305z0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i11) {
        ColorStateList e11 = e(context, i11);
        if (e11 != null && e11.isStateful()) {
            return e11.getColorForState(f1907b, e11.getDefaultColor());
        }
        TypedValue f11 = f();
        context.getTheme().resolveAttribute(16842803, f11, true);
        return d(context, i11, f11.getFloat());
    }

    public static int c(Context context, int i11) {
        int[] iArr = f1912g;
        iArr[0] = i11;
        u0 u11 = u0.u(context, null, iArr);
        try {
            return u11.b(0, 0);
        } finally {
            u11.w();
        }
    }

    static int d(Context context, int i11, float f11) {
        int c11 = c(context, i11);
        return m3.a.k(c11, Math.round(Color.alpha(c11) * f11));
    }

    public static ColorStateList e(Context context, int i11) {
        int[] iArr = f1912g;
        iArr[0] = i11;
        u0 u11 = u0.u(context, null, iArr);
        try {
            return u11.c(0);
        } finally {
            u11.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f1906a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
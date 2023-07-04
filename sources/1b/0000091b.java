package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final v0 f6195a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f6196b;

    /* loaded from: classes.dex */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(p0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            p0.h(view, f11.floatValue());
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return androidx.core.view.a0.x(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            androidx.core.view.a0.C0(view, rect);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f6195a = new u0();
        } else if (i11 >= 23) {
            f6195a = new t0();
        } else if (i11 >= 22) {
            f6195a = new s0();
        } else if (i11 >= 21) {
            f6195a = new r0();
        } else if (i11 >= 19) {
            f6195a = new q0();
        } else {
            f6195a = new v0();
        }
        f6196b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f6195a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new n0(view);
        }
        return m0.e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f6195a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a1 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new z0(view);
        }
        return new y0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f6195a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, Matrix matrix) {
        f6195a.e(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, int i11, int i12, int i13, int i14) {
        f6195a.f(view, i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, float f11) {
        f6195a.g(view, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, int i11) {
        f6195a.h(view, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        f6195a.i(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(View view, Matrix matrix) {
        f6195a.j(view, matrix);
    }
}
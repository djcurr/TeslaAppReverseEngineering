package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.k0;
import androidx.core.content.b;
import java.util.WeakHashMap;
import l3.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f28528a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0549a>> f28529b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f28530c = new Object();

    /* renamed from: h.a$a */
    /* loaded from: classes.dex */
    public static class C0549a {

        /* renamed from: a */
        final ColorStateList f28531a;

        /* renamed from: b */
        final Configuration f28532b;

        C0549a(ColorStateList colorStateList, Configuration configuration) {
            this.f28531a = colorStateList;
            this.f28532b = configuration;
        }
    }

    private static void a(Context context, int i11, ColorStateList colorStateList) {
        synchronized (f28530c) {
            WeakHashMap<Context, SparseArray<C0549a>> weakHashMap = f28529b;
            SparseArray<C0549a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i11, new C0549a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i11) {
        C0549a c0549a;
        synchronized (f28530c) {
            SparseArray<C0549a> sparseArray = f28529b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0549a = sparseArray.get(i11)) != null) {
                if (c0549a.f28532b.equals(context.getResources().getConfiguration())) {
                    return c0549a.f28531a;
                }
                sparseArray.remove(i11);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i11);
        }
        ColorStateList b11 = b(context, i11);
        if (b11 != null) {
            return b11;
        }
        ColorStateList f11 = f(context, i11);
        if (f11 != null) {
            a(context, i11, f11);
            return f11;
        }
        return b.getColorStateList(context, i11);
    }

    public static Drawable d(Context context, int i11) {
        return k0.h().j(context, i11);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f28528a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList f(Context context, int i11) {
        if (g(context, i11)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i11), context.getTheme());
        } catch (Exception e11) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            return null;
        }
    }

    private static boolean g(Context context, int i11) {
        Resources resources = context.getResources();
        TypedValue e11 = e();
        resources.getValue(i11, e11, true);
        int i12 = e11.type;
        return i12 >= 28 && i12 <= 31;
    }
}
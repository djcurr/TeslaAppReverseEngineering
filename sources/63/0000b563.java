package tk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.u0;

/* loaded from: classes3.dex */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i11) {
        int color;
        int resourceId;
        ColorStateList c11;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (c11 = h.a.c(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i11, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i11);
        }
        return c11;
    }

    public static ColorStateList b(Context context, u0 u0Var, int i11) {
        int b11;
        int n11;
        ColorStateList c11;
        if (!u0Var.s(i11) || (n11 = u0Var.n(i11, 0)) == 0 || (c11 = h.a.c(context, n11)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (b11 = u0Var.b(i11, -1)) != -1) {
                return ColorStateList.valueOf(b11);
            }
            return u0Var.c(i11);
        }
        return c11;
    }

    public static int c(Context context, TypedArray typedArray, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i12);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i11, i12);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        Drawable d11;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (d11 = h.a.d(context, resourceId)) == null) ? typedArray.getDrawable(i11) : d11;
    }

    public static int e(TypedArray typedArray, int i11, int i12) {
        return typedArray.hasValue(i11) ? i11 : i12;
    }

    public static d f(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
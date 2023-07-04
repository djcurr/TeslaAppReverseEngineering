package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* loaded from: classes3.dex */
public final class d {
    private static ColorStateList a(Context context, int i11) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i11});
            ColorStateList colorStateList = typedArray.getColorStateList(0);
            typedArray.recycle();
            return colorStateList;
        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }
    }

    public static ColorStateList b(Context context) {
        return a(context, 16842904);
    }

    public static int c(Context context) {
        return a(context, 16842905).getDefaultColor();
    }

    public static ColorStateList d(Context context) {
        return a(context, 16842906);
    }
}
package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.u0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f15462a = {fk.b.f26376l};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f15463b = {fk.b.f26377m};

    public static void a(Context context) {
        e(context, f15462a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.k.O4, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(fk.k.Q4, false);
        obtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(fk.b.f26384t, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f15463b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        boolean z11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.k.O4, i11, i12);
        if (!obtainStyledAttributes.getBoolean(fk.k.R4, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z11 = f(context, attributeSet, iArr, i11, i12, iArr2);
        } else {
            z11 = obtainStyledAttributes.getResourceId(fk.k.P4, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z11) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        for (int i13 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i13, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!obtainStyledAttributes.hasValue(i11)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static u0 i(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        b(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return u0.v(context, attributeSet, iArr, i11, i12);
    }
}
package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import fk.k;
import tk.b;
import tk.c;
import yk.a;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i11, k.C2);
        int readFirstAvailableDimension = readFirstAvailableDimension(getContext(), obtainStyledAttributes, k.E2, k.F2);
        obtainStyledAttributes.recycle();
        if (readFirstAvailableDimension >= 0) {
            setLineHeight(readFirstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return b.b(context, fk.b.N, true);
    }

    private static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.G2, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(k.H2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int readFirstAvailableDimension(Context context, TypedArray typedArray, int... iArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < iArr.length && i11 < 0; i12++) {
            i11 = c.c(context, typedArray, iArr[i12], -1);
        }
        return i11;
    }

    private static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.G2, i11, i12);
        int readFirstAvailableDimension = readFirstAvailableDimension(context, obtainStyledAttributes, k.I2, k.J2);
        obtainStyledAttributes.recycle();
        return readFirstAvailableDimension != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i11);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(a.c(context, attributeSet, i11, i12), attributeSet, i11);
        int findViewAppearanceResourceId;
        Context context2 = getContext();
        if (canApplyTextAppearanceLineHeight(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (viewAttrsHasLineHeight(context2, theme, attributeSet, i11, i12) || (findViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i11, i12)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, findViewAppearanceResourceId);
        }
    }
}
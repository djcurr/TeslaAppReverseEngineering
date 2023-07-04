package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public class ThreeDS2TextView extends MaterialTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ThreeDS2TextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public void setText(String str, LabelCustomization labelCustomization) {
        String textFontName;
        String textColor;
        setText(str);
        if (labelCustomization != null && (textColor = labelCustomization.getTextColor()) != null) {
            setTextColor(Color.parseColor(textColor));
        }
        if (labelCustomization != null) {
            Integer valueOf = Integer.valueOf(labelCustomization.getTextFontSize());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
        }
        if (labelCustomization == null || (textFontName = labelCustomization.getTextFontName()) == null) {
            return;
        }
        setTypeface(Typeface.create(textFontName, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
    }
}
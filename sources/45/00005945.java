package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.stripe.android.stripe3ds2.views.ThreeDS2TextView
    public void setText(String str, LabelCustomization labelCustomization) {
        setText(str);
        if (labelCustomization != null) {
            String headingTextColor = labelCustomization.getHeadingTextColor();
            if (headingTextColor != null) {
                setTextColor(Color.parseColor(headingTextColor));
            }
            Integer valueOf = Integer.valueOf(labelCustomization.getHeadingTextFontSize());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
            String headingTextFontName = labelCustomization.getHeadingTextFontName();
            if (headingTextFontName == null) {
                return;
            }
            setTypeface(Typeface.create(headingTextFontName, 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
    }
}
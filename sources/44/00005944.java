package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public class ThreeDS2Button extends MaterialButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ThreeDS2Button(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final int parseColor$3ds2sdk_release(String hexColor) {
        s.g(hexColor, "hexColor");
        return Color.parseColor(hexColor);
    }

    public final void setButtonCustomization(ButtonCustomization buttonCustomization) {
        Integer num;
        if (buttonCustomization == null) {
            return;
        }
        String textColor = buttonCustomization.getTextColor();
        if (textColor != null) {
            setTextColor(parseColor$3ds2sdk_release(textColor));
        }
        String backgroundColor = buttonCustomization.getBackgroundColor();
        if (backgroundColor != null) {
            setBackgroundTintList(ColorStateList.valueOf(parseColor$3ds2sdk_release(backgroundColor)));
        }
        Integer valueOf = Integer.valueOf(buttonCustomization.getCornerRadius());
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            setCornerRadius(valueOf.intValue());
        }
        Integer valueOf2 = Integer.valueOf(buttonCustomization.getTextFontSize());
        if ((valueOf2.intValue() > 0 ? valueOf2 : null) != null) {
            setTextSize(2, num.intValue());
        }
        String textFontName = buttonCustomization.getTextFontName();
        if (textFontName == null) {
            return;
        }
        setTypeface(Typeface.create(textFontName, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
    }
}
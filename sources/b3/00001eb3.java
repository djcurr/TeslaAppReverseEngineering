package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
import n3.a;

/* loaded from: classes3.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return i14;
                }
                throw new IllegalStateException("Unknown color scheme: " + i11);
            }
            return i13;
        }
        return i12;
    }

    public final void zaa(Resources resources, int i11, int i12) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i13 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i13);
        setMinWidth(i13);
        int i14 = R.drawable.common_google_signin_btn_icon_dark;
        int i15 = R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i12, i14, i15, i15);
        int i16 = R.drawable.common_google_signin_btn_text_dark;
        int i17 = R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i12, i16, i17, i17);
        if (i11 == 0 || i11 == 1) {
            zab = zab2;
        } else if (i11 != 2) {
            throw new IllegalStateException("Unknown button size: " + i11);
        }
        Drawable r11 = a.r(resources.getDrawable(zab));
        a.o(r11, resources.getColorStateList(R.color.common_google_signin_btn_tint));
        a.p(r11, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r11);
        int i18 = R.color.common_google_signin_btn_text_dark;
        int i19 = R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i12, i18, i19, i19))));
        if (i11 == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i11 == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i11 == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i11);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
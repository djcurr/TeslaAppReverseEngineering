package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes3.dex */
public class b implements LineHeightSpan, m {

    /* renamed from: a  reason: collision with root package name */
    private final int f12605a;

    public b(float f11) {
        this.f12605a = (int) Math.ceil(f11);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        int i15 = fontMetricsInt.descent;
        int i16 = this.f12605a;
        if (i15 > i16) {
            int min = Math.min(i16, i15);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i17 = fontMetricsInt.ascent;
        if ((-i17) + i15 > i16) {
            fontMetricsInt.bottom = i15;
            int i18 = (-i16) + i15;
            fontMetricsInt.ascent = i18;
            fontMetricsInt.top = i18;
            return;
        }
        int i19 = fontMetricsInt.bottom;
        if ((-i17) + i19 > i16) {
            fontMetricsInt.top = i17;
            fontMetricsInt.bottom = i17 + i16;
            return;
        }
        int i21 = fontMetricsInt.top;
        if ((-i21) + i19 > i16) {
            fontMetricsInt.top = i19 - i16;
            return;
        }
        double d11 = i21;
        double d12 = (i16 - ((-i21) + i19)) / 2.0f;
        fontMetricsInt.top = (int) (d11 - Math.ceil(d12));
        int floor = (int) (fontMetricsInt.bottom + Math.floor(d12));
        fontMetricsInt.bottom = floor;
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = floor;
    }
}
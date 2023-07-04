package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public class a extends MetricAffectingSpan implements m {

    /* renamed from: a  reason: collision with root package name */
    private final float f12604a;

    public a(float f11) {
        this.f12604a = f11;
    }

    private void a(TextPaint textPaint) {
        if (Float.isNaN(this.f12604a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f12604a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
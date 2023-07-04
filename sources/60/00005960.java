package com.stripe.android.ui.core;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CustomTypefaceSpan extends MetricAffectingSpan {
    public static final Companion Companion = new Companion(null);
    private final Typeface typeface;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomTypeFace(Paint paint, Typeface typeface) {
            paint.setTypeface(typeface);
        }
    }

    public CustomTypefaceSpan(Typeface typeface) {
        s.g(typeface, "typeface");
        this.typeface = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        s.g(ds2, "ds");
        Companion.applyCustomTypeFace(ds2, this.typeface);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        s.g(paint, "paint");
        Companion.applyCustomTypeFace(paint, this.typeface);
    }
}
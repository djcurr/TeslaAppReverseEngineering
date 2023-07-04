package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public class x extends CharacterStyle implements m {

    /* renamed from: a  reason: collision with root package name */
    private final float f12679a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12680b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12681c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12682d;

    public x(float f11, float f12, float f13, int i11) {
        this.f12679a = f11;
        this.f12680b = f12;
        this.f12681c = f13;
        this.f12682d = i11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f12681c, this.f12679a, this.f12680b, this.f12682d);
    }
}
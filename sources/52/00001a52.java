package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes3.dex */
public class b0 extends ReplacementSpan implements m {

    /* renamed from: a  reason: collision with root package name */
    private int f12606a;

    /* renamed from: b  reason: collision with root package name */
    private int f12607b;

    /* renamed from: c  reason: collision with root package name */
    private int f12608c;

    public b0(int i11, int i12, int i13) {
        this.f12606a = i11;
        this.f12607b = i12;
        this.f12608c = i13;
    }

    public int a() {
        return this.f12608c;
    }

    public int b() {
        return this.f12606a;
    }

    public int c() {
        return this.f12607b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i13 = -this.f12608c;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return this.f12607b;
    }
}
package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public class c extends MetricAffectingSpan implements m {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f12609a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12610b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12611c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12612d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12613e;

    public c(int i11, int i12, String str, String str2, AssetManager assetManager) {
        this.f12610b = i11;
        this.f12611c = i12;
        this.f12612d = str;
        this.f12613e = str2;
        this.f12609a = assetManager;
    }

    private static void a(Paint paint, int i11, int i12, String str, String str2, AssetManager assetManager) {
        Typeface a11 = u.a(paint.getTypeface(), i11, i12, str2, assetManager);
        paint.setFontFeatureSettings(str);
        paint.setTypeface(a11);
        paint.setSubpixelText(true);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f12610b, this.f12611c, this.f12612d, this.f12613e, this.f12609a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f12610b, this.f12611c, this.f12612d, this.f12613e, this.f12609a);
    }
}
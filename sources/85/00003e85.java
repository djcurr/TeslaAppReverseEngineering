package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
class d0 extends l {

    /* renamed from: c  reason: collision with root package name */
    private float f17568c;

    /* renamed from: d  reason: collision with root package name */
    private float f17569d;

    /* renamed from: e  reason: collision with root package name */
    private float f17570e;

    /* renamed from: f  reason: collision with root package name */
    private float f17571f;

    /* renamed from: g  reason: collision with root package name */
    private String f17572g;

    /* renamed from: h  reason: collision with root package name */
    private int f17573h;

    public d0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        saveDefinition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Canvas canvas, Paint paint, float f11, float f12, float f13) {
        if (this.f17572g != null) {
            float f14 = this.f17568c;
            float f15 = this.mScale;
            float f16 = this.f17569d;
            canvas.concat(t0.a(new RectF(f14 * f15, f16 * f15, (f14 + this.f17570e) * f15, (f16 + this.f17571f) * f15), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, f13), this.f17572g, this.f17573h));
            super.draw(canvas, paint, f11);
        }
    }

    @ng.a(name = "align")
    public void setAlign(String str) {
        this.f17572g = str;
        invalidate();
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i11) {
        this.f17573h = i11;
        invalidate();
    }

    @ng.a(name = "minX")
    public void setMinX(float f11) {
        this.f17568c = f11;
        invalidate();
    }

    @ng.a(name = "minY")
    public void setMinY(float f11) {
        this.f17569d = f11;
        invalidate();
    }

    @ng.a(name = "vbHeight")
    public void setVbHeight(float f11) {
        this.f17571f = f11;
        invalidate();
    }

    @ng.a(name = "vbWidth")
    public void setVbWidth(float f11) {
        this.f17570e = f11;
        invalidate();
    }
}
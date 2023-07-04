package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f0 extends r0 {

    /* renamed from: n  reason: collision with root package name */
    private String f17583n;

    /* renamed from: o  reason: collision with root package name */
    private p0 f17584o;

    /* renamed from: p  reason: collision with root package name */
    private o0 f17585p;

    /* renamed from: q  reason: collision with root package name */
    private SVGLength f17586q;

    public f0(ReactContext reactContext) {
        super(reactContext);
        n0 n0Var = n0.align;
        q0 q0Var = q0.exact;
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        c(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return o(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void i() {
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.l
    void j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 s() {
        return this.f17585p;
    }

    @ng.a(name = "href")
    public void setHref(String str) {
        this.f17583n = str;
        invalidate();
    }

    @Override // com.horcrux.svg.r0
    @ng.a(name = "method")
    public void setMethod(String str) {
        n0.valueOf(str);
        invalidate();
    }

    @ng.a(name = "midLine")
    public void setSharp(String str) {
        this.f17585p = o0.valueOf(str);
        invalidate();
    }

    @ng.a(name = "side")
    public void setSide(String str) {
        this.f17584o = p0.valueOf(str);
        invalidate();
    }

    @ng.a(name = "spacing")
    public void setSpacing(String str) {
        q0.valueOf(str);
        invalidate();
    }

    @ng.a(name = "startOffset")
    public void setStartOffset(Dynamic dynamic) {
        this.f17586q = SVGLength.b(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0 t() {
        return this.f17584o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength u() {
        return this.f17586q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path v(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17583n);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }
}
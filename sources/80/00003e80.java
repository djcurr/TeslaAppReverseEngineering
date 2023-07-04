package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17556a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17557b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17558c;

    public b(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addCircle((float) relativeOnWidth(this.f17556a), (float) relativeOnHeight(this.f17557b), (float) relativeOnOther(this.f17558c), Path.Direction.CW);
        return path;
    }

    @ng.a(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.f17556a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.f17557b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "r")
    public void setR(Dynamic dynamic) {
        this.f17558c = SVGLength.b(dynamic);
        invalidate();
    }
}